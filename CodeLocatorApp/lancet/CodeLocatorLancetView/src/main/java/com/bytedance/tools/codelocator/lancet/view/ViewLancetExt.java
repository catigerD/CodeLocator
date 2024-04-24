package com.bytedance.tools.codelocator.lancet.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bytedance.tools.codelocator.CodeLocator;
import com.bytedance.tools.codelocator.CodeLocatorExt;
import com.bytedance.tools.codelocator.utils.CodeLocatorConstants;
import com.knightboost.lancet.api.Origin;
import com.knightboost.lancet.api.Scope;
import com.knightboost.lancet.api.This;
import com.knightboost.lancet.api.annotations.Insert;
import com.knightboost.lancet.api.annotations.Proxy;
import com.knightboost.lancet.api.annotations.TargetClass;
import com.knightboost.lancet.api.annotations.TargetMethod;

/**
 * author : chenny
 * date : 2024/4/23
 * description :
 */
//@Weaver
public class ViewLancetExt {

    @TargetClass(value = "android.view.View", scope = Scope.SELF)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setViewOnClickListenerSelf(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.view.ViewGroup", scope = Scope.SELF)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setViewGroupOnClickListenerSelf(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.widget.TextView", scope = Scope.ALL)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setTextViewOnClickListenerAll(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.widget.ImageView", scope = Scope.ALL)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setImageViewOnClickListenerAll(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.widget.FrameLayout", scope = Scope.SELF)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setFrameLayoutOnClickListenerSelf(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.widget.LinearLayout", scope = Scope.SELF)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setLinearLayoutOnClickListenerSelf(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.widget.RelativeLayout", scope = Scope.SELF)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setRelativeLayoutOnClickListenerSelf(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "androidx.constraintlayout.widget.ConstraintLayout", scope = Scope.SELF)
    @TargetMethod(methodName = "setOnClickListener")
    @Proxy
    public void setConstraintLayoutOnClickListenerSelf(View.OnClickListener l) {
        CodeLocator.notifySetOnClickListener((View) This.get(), Thread.currentThread().getStackTrace());
        Origin.callVoid();
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

    @TargetClass(value = "androidx.viewbinding.ViewBindings", scope = Scope.SELF)
    @TargetMethod(methodName = "findChildViewById")
    @Proxy
    public static View findViewByIdSelf(View rootView, int id) {
        final View view = (View) Origin.call();
        if (view != null) {
            CodeLocatorExt.notifyFindViewById(view, Thread.currentThread().getStackTrace());
        }
        return view;
    }
}
