package com.aiseminar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fosung.libeasypr.view.EasyPRPreSurfaceView;
import com.fosung.libeasypr.view.EasyPRPreView;
import com.fosung.platerecognizer.R;

/**
 * 车牌识别页面
 */
public class EasyPRActivity extends Activity {
    private EasyPRPreView easyPRPreView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initData();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (easyPRPreView != null) {
            easyPRPreView.onStart();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (easyPRPreView != null) {
            easyPRPreView.onStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (easyPRPreView != null) {
            easyPRPreView.onDestroy();
        }
    }

    private void initData() {
        easyPRPreView = (EasyPRPreView) findViewById(R.id.preSurfaceView);
        final Button btnCamera = (Button) findViewById(R.id.btnShutter);
        final TextView tvRecogResult = (TextView) findViewById(R.id.lblRecogResult);
        final ImageView iv = (ImageView) findViewById(R.id.iv);

        easyPRPreView
                .setRecognizedListener(new EasyPRPreSurfaceView.OnRecognizedListener() {
                    @Override
                    public void onRecognized(String text) {
                        if (text == null || text.equals("0")) {
                            Toast.makeText(EasyPRActivity.this, "换个姿势试试", Toast.LENGTH_SHORT)
                                 .show();
                        } else {
                            tvRecogResult.setText(text);
                        }
                    }
                })
                .setPictureTakenListener(new EasyPRPreSurfaceView.OnPictureTakenListener() {
                    @Override
                    public void onPictureTaken(String[] files) {
                        //                              Bitmap map = BitmapUtil.decodeBitmap(path);
                        //                              iv.setImageBitmap(map);
                    }
                });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                easyPRPreView.recognize();
            }
        });
    }
}
