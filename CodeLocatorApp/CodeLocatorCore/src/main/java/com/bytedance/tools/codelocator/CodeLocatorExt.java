package com.bytedance.tools.codelocator;

import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import com.bytedance.tools.codelocator.CodeLocator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * author : chenny
 * date : 2024/4/23
 * description :
 */
public class CodeLocatorExt {

    private static final String TAG = "CodeLocatorExt";

    private static final List<String> findViewDenyClassList = Arrays.asList(

    );

    public static final List<String> dialogDenyClassList = Arrays.asList(

    );

    private static final List<String> toastDenyFileList = Arrays.asList(

    );

    public static void notifyFindViewById(View view, StackTraceElement[] stackTraceElements) {
        CodeLocator.notifyFindViewById(view, filterElement(stackTraceElements, findViewDenyClassList, true));
    }

    public static void notifyShowDialog(StackTraceElement[] stackTraceElements, @Nullable String keyword) {
        CodeLocator.notifyShowDialog(filterElement(stackTraceElements, dialogDenyClassList, true), keyword);
    }

    public static void notifyShowToast(StackTraceElement[] stackTraceElements, @Nullable String keyword) {
        CodeLocator.notifyShowToast(filterElement(stackTraceElements, toastDenyFileList, false), keyword);
    }

    public static StackTraceElement[] filterElement(StackTraceElement[] stackTraceElements, List<String> denyList, boolean isClassFilter) {
        try {
            List<StackTraceElement> elements = new ArrayList<>(Arrays.asList(stackTraceElements));
            Iterator<StackTraceElement> iterator = elements.iterator();
            while (iterator.hasNext()) {
                StackTraceElement element = iterator.next();
                String filterKey;
                if (isClassFilter) {
                    filterKey = element.getClassName();
                } else {
                    filterKey = element.getFileName();
                }
                if (denyList.contains(filterKey)) {
                    iterator.remove();
                }
            }
            return elements.toArray(new StackTraceElement[elements.size()]);
        } catch (Throwable throwable) {
            Log.e(TAG, Log.getStackTraceString(throwable));
            return stackTraceElements;
        }
    }
}
