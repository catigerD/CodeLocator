package com.bytedance.tools.codelocator.lancet.popup;

import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;

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
public class PopupLancet {

    @Proxy()
    @TargetMethod(methodName = "showAsDropDown")
    @TargetClass(value = "android.widget.PopupWindow", scope = Scope.SELF)
    public void showAsDropDownSelf(View anchor) {
        try {
            final PopupWindow popupWindow = (PopupWindow) This.get();
            final View view = popupWindow.getContentView();
            String keyword = ViewUtils.getKeyword(view);
            CodeLocator.notifyShowPopup(Thread.currentThread().getStackTrace(), keyword);
        } catch (Throwable t) {
            Log.d(CodeLocator.TAG, "getToast info Error " + Log.getStackTraceString(t));
        }
        Origin.callVoid();
    }

    @Proxy()
    @TargetMethod(methodName = "showAsDropDown")
    @TargetClass(value = "android.widget.PopupWindow", scope = Scope.SELF)
    public void showAsDropDownSelf(View anchor, int xoff, int yoff) {
        try {
            final PopupWindow popupWindow = (PopupWindow) This.get();
            final View view = popupWindow.getContentView();
            String keyword = ViewUtils.getKeyword(view);
            CodeLocator.notifyShowPopup(Thread.currentThread().getStackTrace(), keyword);
        } catch (Throwable t) {
            Log.d(CodeLocator.TAG, "getToast info Error " + Log.getStackTraceString(t));
        }
        Origin.callVoid();
    }

    @Proxy()
    @TargetMethod(methodName = "showAsDropDown")
    @TargetClass(value = "android.widget.PopupWindow", scope = Scope.SELF)
    public void showAsDropDownSelf(View anchor, int xoff, int yoff, int gravity) {
        try {
            final PopupWindow popupWindow = (PopupWindow) This.get();
            final View view = popupWindow.getContentView();
            String keyword = ViewUtils.getKeyword(view);
            CodeLocator.notifyShowPopup(Thread.currentThread().getStackTrace(), keyword);
        } catch (Throwable t) {
            Log.d(CodeLocator.TAG, "getToast info Error " + Log.getStackTraceString(t));
        }
        Origin.callVoid();
    }

    @Proxy()
    @TargetMethod(methodName = "showAsDropDown")
    @TargetClass(value = "android.widget.PopupWindow", scope = Scope.ALL)
    public void showAsDropDownAll(View anchor) {
        try {
            final PopupWindow popupWindow = (PopupWindow) This.get();
            final View view = popupWindow.getContentView();
            String keyword = ViewUtils.getKeyword(view);
            CodeLocator.notifyShowPopup(Thread.currentThread().getStackTrace(), keyword);
        } catch (Throwable t) {
            Log.d(CodeLocator.TAG, "getToast info Error " + Log.getStackTraceString(t));
        }
        Origin.callVoid();
    }

    @Proxy()
    @TargetMethod(methodName = "showAsDropDown")
    @TargetClass(value = "android.widget.PopupWindow", scope = Scope.ALL)
    public void showAsDropDownAll(View anchor, int xoff, int yoff) {
        try {
            final PopupWindow popupWindow = (PopupWindow) This.get();
            final View view = popupWindow.getContentView();
            String keyword = ViewUtils.getKeyword(view);
            CodeLocator.notifyShowPopup(Thread.currentThread().getStackTrace(), keyword);
        } catch (Throwable t) {
            Log.d(CodeLocator.TAG, "getToast info Error " + Log.getStackTraceString(t));
        }
        Origin.callVoid();
    }

    @Proxy()
    @TargetMethod(methodName = "showAsDropDown")
    @TargetClass(value = "android.widget.PopupWindow", scope = Scope.ALL)
    public void showAsDropDownAll(View anchor, int xoff, int yoff, int gravity) {
        try {
            final PopupWindow popupWindow = (PopupWindow) This.get();
            final View view = popupWindow.getContentView();
            String keyword = ViewUtils.getKeyword(view);
            CodeLocator.notifyShowPopup(Thread.currentThread().getStackTrace(), keyword);
        } catch (Throwable t) {
            Log.d(CodeLocator.TAG, "getToast info Error " + Log.getStackTraceString(t));
        }
        Origin.callVoid();
    }
}
