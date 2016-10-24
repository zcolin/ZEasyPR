/***********************************************************
 * author   colin
 * company  fosung
 * email    wanglin2046@126.com
 * date     16-7-15 下午4:41
 **********************************************************/

package com.aiseminar.permission;

import android.Manifest;
import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * 申请权限辅助类，有特殊权限直接使用{@link PermissionsManager}
 */
public class PermissionHelper {

    /**
     * 申请写入SD卡权限
     */
    public static void requestWriteSdCardPermission(Activity activity, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(activity,
                                  new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, action);
    }

    /**
     * 申请写入SD卡权限
     */
    public static void requestWriteSdCardPermission(Fragment fragment, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(fragment,
                                  new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, action);
    }

    /**
     * 申请读取SD卡权限
     */
    public static void requestReadSdCardPermission(Activity activity, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(activity,
                                  new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, action);
    }

    /**
     * 申请读取SD卡权限
     */
    public static void requestReadSdCardPermission(Fragment fragment, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(fragment,
                                  new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, action);
    }

    /**
     * 申请读取SD卡权限
     */
    public static void requestReadWriteSdCardPermission(Activity activity, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(activity,
                                  new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, action);
    }

    /**
     * 申请读取SD卡权限
     */
    public static void requestReadWriteSdCardPermission(Fragment fragment, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(fragment,
                                  new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, action);
    }

    /**
     * 申请调用摄像头权限
     */
    public static void requestCameraPermission(Activity activity, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(activity,
                                  new String[]{Manifest.permission.CAMERA}, action);
    }

    /**
     * 申请调用摄像头权限
     */
    public static void requestCameraPermission(Fragment fragment, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(fragment,
                                  new String[]{Manifest.permission.CAMERA}, action);
    }

    /**
     * 申请读取联系人权限
     */
    public static void requestReadContactsPermission(Activity activity, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(activity,
                                  new String[]{Manifest.permission.READ_CONTACTS}, action);
    }

    /**
     * 申请读取联系人权限
     */
    public static void requestReadContactsPermission(Fragment fragment, PermissionsResultAction action) {
        PermissionsManager.getInstance()
                          .requestPermissionsIfNecessaryForResult(fragment,
                                  new String[]{Manifest.permission.READ_CONTACTS}, action);
    }
}
