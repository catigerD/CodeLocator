package com.bytedance.tools.codelocator.lancet.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.bytedance.tools.codelocator.CodeLocator;
import com.knightboost.lancet.api.Origin;
import com.knightboost.lancet.api.Scope;
import com.knightboost.lancet.api.annotations.Proxy;
import com.knightboost.lancet.api.annotations.TargetClass;
import com.knightboost.lancet.api.annotations.TargetMethod;
import com.knightboost.lancet.api.annotations.Weaver;

@Weaver
public class ActivityLancet {

    @TargetClass(value = "android.content.Context", scope = Scope.ALL)
    @TargetMethod(methodName = "startActivity")
    @Proxy
    public void startActivity(Intent intent) {
        CodeLocator.notifyStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.content.Context", scope = Scope.ALL)
    @TargetMethod(methodName = "startActivity")
    @Proxy
    public void startActivity(Intent intent, @Nullable Bundle options) {
        CodeLocator.notifyStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.content.Context", scope = Scope.SELF)
    @TargetMethod(methodName = "startActivity")
    @Proxy
    public void startActivitySelf(Intent intent) {
        CodeLocator.notifyStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.content.Context", scope = Scope.SELF)
    @TargetMethod(methodName = "startActivity")
    @Proxy
    public void startActivitySelf(Intent intent, @Nullable Bundle options) {
        CodeLocator.notifyStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.app.Activity", scope = Scope.ALL)
    @TargetMethod(methodName = "startActivityForResult")
    @Proxy
    public void startActivityForResult(Intent intent, int requestCode) {
        CodeLocator.notifyStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.app.Activity", scope = Scope.ALL)
    @TargetMethod(methodName = "startActivityForResult")
    @Proxy
    public void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options) {
        CodeLocator.notifyStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }
}
