package com.aiseminar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.aiseminar.permission.PermissionHelper;
import com.aiseminar.permission.PermissionsManager;
import com.aiseminar.permission.PermissionsResultAction;

public class InitActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PermissionHelper.requestCameraPermission(this, new PermissionsResultAction() {
            @Override
            public void onGranted() {
                Intent intent = new Intent(InitActivity.this, EasyPRActivity.class);
                startActivity(intent);
                InitActivity.this.finish();
            }

            @Override
            public void onDenied(String permission) {
                Toast.makeText(InitActivity.this, "请赋予本程序拍照权限！", Toast.LENGTH_LONG)
                     .show();
                InitActivity.this.finish();
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        PermissionsManager.getInstance()
                          .notifyPermissionsChange(permissions, grantResults);
    }
}
