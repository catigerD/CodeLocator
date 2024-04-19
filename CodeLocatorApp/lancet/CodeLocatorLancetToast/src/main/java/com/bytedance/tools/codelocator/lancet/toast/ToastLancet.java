package com.bytedance.tools.codelocator.lancet.toast;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bytedance.tools.codelocator.CodeLocator;
import com.bytedance.tools.codelocator.utils.ViewUtils;
import com.knightboost.lancet.api.Origin;
import com.knightboost.lancet.api.Scope;
import com.knightboost.lancet.api.This;
import com.knightboost.lancet.api.annotations.Proxy;
import com.knightboost.lancet.api.annotations.TargetClass;
import com.knightboost.lancet.api.annotations.TargetMethod;
import com.knightboost.lancet.api.annotations.Weaver;

@Weaver
public class ToastLancet {

    @Proxy()
    @TargetMethod(methodName = "show")
    @TargetClass(value = "android.widget.Toast", scope = Scope.SELF)
    public void showSelf() {
        try {
            final Toast toast = (Toast) This.get();
            final View view = toast.getView();
            String keyword = ViewUtils.getKeyword(view);
            final String appName = ViewUtils.getAppName(view.getContext());
            if (keyword != null && appName != null && keyword.startsWith(appName + "：")) {
                keyword = keyword.substring((appName + "：").length());
            }
            CodeLocator.notifyShowToast(Thread.currentThread().getStackTrace(), keyword);
        } catch (Throwable t) {
            Log.e(CodeLocator.TAG, "getToast info Error " + Log.getStackTraceString(t));
        }
        Origin.callVoid();
    }


    @Proxy()
    @TargetMethod(methodName = "show")
    @TargetClass(value = "android.widget.Toast", scope = Scope.ALL)
    public void showAll() {
        try {
            final Toast toast = (Toast) This.get();
            final View view = toast.getView();
            String keyword = ViewUtils.getKeyword(view);
            final String appName = ViewUtils.getAppName(view.getContext());
            if (keyword != null && appName != null && keyword.startsWith(appName + "：")) {
                keyword = keyword.substring((appName + "：").length());
            }
            CodeLocator.notifyShowToast(Thread.currentThread().getStackTrace(), keyword);
        } catch (Throwable t) {
            Log.e(CodeLocator.TAG, "getToast info Error " + Log.getStackTraceString(t));
        }
        Origin.callVoid();
    }
}
