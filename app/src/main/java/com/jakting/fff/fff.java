package com.jakting.fff;

import android.graphics.Paint;
import android.widget.TextView;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XSharedPreferences;

public class fff implements IXposedHookZygoteInit {
    
    /*
    Hook Source Code from GermainZ/Hodor (https://github.com/GermainZ/Hodor)
    Thank kuroyukihime0 for his code https://github.com/kuroyukihime0/THE-PERFECT-INSIDER
     */
    //private static String FFF = "FFF";
    private static final String FFF_FFF = "\\w+";
    private static final String FFF_FFF_FFF = "setText";
    private static final String FFF_FFF_FFF_FFF = "android.view.GLES20Canvas";
    private static final String FFF_FFF_FFF_FFF_FFF = "drawText";
    private static final String FFF_FFF_FFF_FFFFFFF = "setHint";
    private static final int FFFFF = 0;


    @Override
    public void initZygote(StartupParam hodorHodorHodorHodor) throws Throwable {
        XSharedPreferences sharedPreferences = new XSharedPreferences(this.getClass().getPackage().getName(),"pref");
        final String FFF = sharedPreferences.getString("fffcustomText","FFF");
        XC_MethodHook hodorHodor = new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam hodorHodorHODOR) throws Throwable {
                CharSequence hodorHodorHodor = (CharSequence) hodorHodorHODOR.args[FFFFF];
                if (hodorHodorHodor != null) {
                    String hodor = hodorHodorHodor.toString().replaceAll(FFF_FFF, FFF);
                    hodorHodorHODOR.args[FFFFF] = hodor;
                }
            }
        };

        findAndHookMethod(TextView.class, FFF_FFF_FFF, CharSequence.class, TextView.BufferType.class,
                          boolean.class, int.class, hodorHodor);
        findAndHookMethod(TextView.class, FFF_FFF_FFF_FFFFFFF , CharSequence.class, hodorHodor);
        findAndHookMethod(FFF_FFF_FFF_FFF, null, FFF_FFF_FFF_FFF_FFF, String.class, float.class,
                          float.class, Paint.class, hodorHodor);
    }

}
