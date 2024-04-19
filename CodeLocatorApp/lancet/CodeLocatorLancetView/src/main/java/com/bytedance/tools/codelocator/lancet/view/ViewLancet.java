package com.bytedance.tools.codelocator.lancet.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bytedance.tools.codelocator.CodeLocator;
import com.bytedance.tools.codelocator.utils.CodeLocatorConstants;
import com.knightboost.lancet.api.Origin;
import com.knightboost.lancet.api.Scope;
import com.knightboost.lancet.api.This;
import com.knightboost.lancet.api.annotations.Insert;
import com.knightboost.lancet.api.annotations.Proxy;
import com.knightboost.lancet.api.annotations.TargetClass;
import com.knightboost.lancet.api.annotations.TargetMethod;
import com.knightboost.lancet.api.annotations.Weaver;

@Weaver
public class ViewLancet {

    @TargetClass(value = "android.view.View", scope = Scope.SELF)
    @TargetMethod(methodName = "setOnTouchListener")
    @Proxy
    public void setOnTouchListenerSelf(View.OnTouchListener listener) {
        CodeLocator.notifySetOnTouchListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.View", scope = Scope.ALL)
    @TargetMethod(methodName = "setOnTouchListener")
    @Proxy
    public void setOnTouchListenerAll(View.OnTouchListener l) {
        CodeLocator.notifySetOnTouchListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.View", scope = Scope.SELF)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setOnClickListenerSelf(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.View", scope = Scope.ALL)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setOnClickListenerAll(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.View", scope = Scope.ALL)
    @TargetMethod(methodName = "setClickable")
    @Proxy
    public void setClickableAll(View.OnClickListener l) {
        CodeLocator.notifySetClickable((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.View", scope = Scope.SELF)
    @TargetMethod(methodName = "setClickable")
    @Proxy
    public void setClickableSelf(View.OnClickListener l) {
        CodeLocator.notifySetClickable((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.View", scope = Scope.ALL)
    @TargetMethod(methodName = "findViewById")
    @Proxy
    public View findViewByIdAll(int id) {
        final View view = (View) Origin.call();
        if (view != null) {
            CodeLocator.notifyFindViewById(view, Thread.currentThread().getStackTrace());
        }
        return view;
    }

    @TargetClass(value = "android.view.View", scope = Scope.SELF)
    @TargetMethod(methodName = "findViewById")
    @Proxy
    public View findViewByIdSelf(int id) {
        final View view = (View) Origin.call();
        if (view != null) {
            CodeLocator.notifyFindViewById(view, Thread.currentThread().getStackTrace());
        }
        return view;
    }

    @TargetClass(value = "android.app.Activity", scope = Scope.SELF)
    @TargetMethod(methodName = "findViewById")
    @Proxy
    public View findViewByIdActivitySelf(int id) {
        final View view = (View) Origin.call();
        if (view != null) {
            CodeLocator.notifyFindViewById(view, Thread.currentThread().getStackTrace());
        }
        return view;
    }

    @TargetClass(value = "android.app.Activity", scope = Scope.ALL)
    @TargetMethod(methodName = "findViewById")
    @Proxy
    public View findViewByIdActivityAll(int id) {
        final View view = (View) Origin.call();
        if (view != null) {
            CodeLocator.notifyFindViewById(view, Thread.currentThread().getStackTrace());
        }
        return view;
    }

    @TargetClass(value = "android.view.ViewGroup", scope = Scope.ALL)
    @TargetMethod(methodName = "addView")
    @Proxy
    public void addViewOneAll(View child) {
        if (child != null) {
            CodeLocator.notifyFindViewById(child, Thread.currentThread().getStackTrace());
        }
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.ViewGroup", scope = Scope.SELF)
    @TargetMethod(methodName = "addView")
    @Proxy
    public void addViewOneSelf(View child) {
        if (child != null) {
            CodeLocator.notifyFindViewById(child, Thread.currentThread().getStackTrace());
        }
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.ViewGroup", scope = Scope.ALL)
    @TargetMethod(methodName = "addView")
    @Proxy
    public void addViewTwoAll(View child, ViewGroup.LayoutParams params) {
        if (child != null) {
            CodeLocator.notifyFindViewById(child, Thread.currentThread().getStackTrace());
        }
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.ViewGroup", scope = Scope.SELF)
    @TargetMethod(methodName = "addView")
    @Proxy
    public void addViewTwoSelf(View child, ViewGroup.LayoutParams params) {
        if (child != null) {
            CodeLocator.notifyFindViewById(child, Thread.currentThread().getStackTrace());
        }
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.ViewGroup", scope = Scope.ALL)
    @TargetMethod(methodName = "addView")
    @Proxy
    public void addViewThreeAll(View child, int index, ViewGroup.LayoutParams params) {
        if (child != null) {
            CodeLocator.notifyFindViewById(child, Thread.currentThread().getStackTrace());
        }
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.ViewGroup", scope = Scope.SELF)
    @TargetMethod(methodName = "addView")
    @Proxy
    public void addViewThreeSelf(View child, int index, ViewGroup.LayoutParams params) {
        if (child != null) {
            CodeLocator.notifyFindViewById(child, Thread.currentThread().getStackTrace());
        }
        Origin.callVoid();
    }

    @TargetClass(value = "androidx.recyclerview.widget.RecyclerView$Adapter", scope = Scope.ALL)
    @TargetMethod(methodName = "onCreateViewHolder")
    @Insert
    public RecyclerView.ViewHolder onCreateViewHolderForXAll(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) Origin.call();
        try {
            if (viewHolder != null && viewHolder.itemView != null) {
                viewHolder.itemView.setTag(CodeLocatorConstants.R.id.codeLocator_viewholder_tag_id, viewHolder.getClass().getName());
                viewHolder.itemView.setTag(CodeLocatorConstants.R.id.codeLocator_viewholder_id, viewHolder);
                final Object adapter = This.get();
                if (adapter != null) {
                    viewHolder.itemView.setTag(CodeLocatorConstants.R.id.codeLocator_viewholder_adapter_tag_id, adapter.getClass().getName());
                }
            }
        } catch (Throwable t) {
            Log.d(CodeLocator.TAG, "getHolder Error " + Log.getStackTraceString(t));
        }
        return viewHolder;
    }

    @TargetClass(value = "androidx.recyclerview.widget.RecyclerView$Adapter", scope = Scope.ALL)
    @TargetMethod(methodName = "onCreateViewHolder")
    @Insert
    public RecyclerView.ViewHolder onCreateViewHolderAll(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) Origin.call();
        try {
            if (viewHolder != null && viewHolder.itemView != null) {
                viewHolder.itemView.setTag(CodeLocatorConstants.R.id.codeLocator_viewholder_tag_id, viewHolder.getClass().getName());
                viewHolder.itemView.setTag(CodeLocatorConstants.R.id.codeLocator_viewholder_id, viewHolder);
                final Object adapter = This.get();
                if (adapter != null) {
                    viewHolder.itemView.setTag(CodeLocatorConstants.R.id.codeLocator_viewholder_adapter_tag_id, adapter.getClass().getName());
                }
            }
        } catch (Throwable t) {
            Log.d(CodeLocator.TAG, "getHolder Error " + Log.getStackTraceString(t));
        }
        return viewHolder;
    }

    @TargetClass(value = "android.view.View", scope = Scope.SELF)
    @TargetMethod(methodName = "setBackgroundResource")
    @Proxy
    public void setBackgroundResourceSelf(int resid) {
        CodeLocator.notifySetBackgroundResource((View) This.get(), resid);
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.View", scope = Scope.ALL)
    @TargetMethod(methodName = "setBackgroundResource")
    @Proxy
    public void setBackgroundResourceAll(int resid) {
        CodeLocator.notifySetBackgroundResource((View) This.get(), resid);
        Origin.callVoid();
    }

}
