package com.usedemo;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.widget.Toast;

public class InitActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 100);
        } else {
            permissionGranted();
        }
    }

    private void permissionGranted() {
        Intent intent = new Intent(InitActivity.this, EasyPRActivity.class);
        startActivity(intent);
        InitActivity.this.finish();
    }

    private void permissionDenied() {
        Toast.makeText(InitActivity.this, "请赋予本程序拍照权限！", Toast.LENGTH_LONG)
             .show();
        InitActivity.this.finish();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == 100 && permissions != null && grantResults != null && permissions.length > 0 && grantResults.length > 0) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                permissionGranted();
            } else {
                permissionDenied();
            }
        }
    }
}
