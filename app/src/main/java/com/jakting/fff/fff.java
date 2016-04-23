package com.jakting.fff;

import android.graphics.Paint;
import android.widget.TextView;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;

public class fff implements IXposedHookZygoteInit {

    // Hodor
    private static final String HODOR = "FFF";
    private static final String HODOR_HODOR = "\\w+";
    private static final String HODOR_HODOR_HODOR = "setText";
    private static final String HODOR_HODOR_HODOR_HODOR = "android.view.GLES20Canvas";
    private static final String HODOR_HODOR_HODOR_HODOR_HODOR = "drawText";
    private static final String HODOR_HODOR_HODOR_HOOODOOOOOR = "setHint";
    private static final int HOOODOOOR = 0;

    @Override
    public void initZygote(StartupParam hodorHodorHodorHodor) throws Throwable {
        XC_MethodHook hodorHodor = new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam hodorHodorHODOR) throws Throwable {
                CharSequence hodorHodorHodor = (CharSequence) hodorHodorHODOR.args[HOOODOOOR];
                if (hodorHodorHodor != null) {
                    String hodor = hodorHodorHodor.toString().replaceAll(HODOR_HODOR, HODOR);
                    hodorHodorHODOR.args[HOOODOOOR] = hodor;
                }
            }
        };

        findAndHookMethod(TextView.class, HODOR_HODOR_HODOR, CharSequence.class, TextView.BufferType.class,
                          boolean.class, int.class, hodorHodor);
        findAndHookMethod(TextView.class, HODOR_HODOR_HODOR_HOOODOOOOOR , CharSequence.class, hodorHodor);
        findAndHookMethod(HODOR_HODOR_HODOR_HODOR, null, HODOR_HODOR_HODOR_HODOR_HODOR, String.class, float.class,
                          float.class, Paint.class, hodorHodor);
    }

}
