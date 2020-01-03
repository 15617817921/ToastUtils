package com.liu.toast;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.RequiresApi;

import com.hjq.xtoast.XToast;
import com.ms.toastlibrary.R;

public class ToastUtils {
    private static XToast xToast;
    private static int LONG=3500;
    private static int SHORT=2000;
    /**
     * 居中显示
     * 短时间时间显示文本
     */
    public static void showShortToast(Context context, String text) {
        cancleToast();
        xToast = new XToast((Activity) context)
                .setDuration(SHORT) //要设置具体时间才消失，不设置不消失
                .setView(R.layout.toast_view)
                .setAnimStyle(android.R.style.Animation_Dialog)
                .setVisibility(R.id.iv_toast, View.GONE)
                .setGravity(Gravity.BOTTOM)
                .setYOffset(50)
                .setText(R.id.tv_toast, text);
        xToast.show();
    }

    /**
     * 长时间显示文本
     */
    public static void showLongToast(Context context, String text) {
        cancleToast();
        xToast = new XToast((Activity) context)
              .setDuration(LONG)//要设置具体时间才消失，不设置不消失
                .setView(R.layout.toast_view)
                .setAnimStyle(android.R.style.Animation_Dialog)
//				.setImageDrawable(R.id.iv_toast, R.drawable.toast_dui)
                .setVisibility(R.id.iv_toast, View.GONE)
                .setGravity(Gravity.BOTTOM)
                .setYOffset(50)//偏移量
                .setText(R.id.tv_toast, text);
        xToast.show();
    }



    /**
     * 底部显示
     * 短时间时间显示文本
     */
    public static void showCenterShortToast(Context context, String text) {
        cancleToast();
        xToast = new XToast((Activity) context)
                .setDuration(SHORT) //要设置具体时间才消失，不设置不消失
                .setView(R.layout.toast_view)
                .setAnimStyle(android.R.style.Animation_Dialog)
                .setVisibility(R.id.iv_toast, View.GONE)
                .setGravity(Gravity.CENTER)
                .setText(R.id.tv_toast, text);
        xToast.show();
    }

    /**
     * 底部显示
     * 长时间显示文本
     */
    public static void showCenterLongToast(Context context, String text) {
        cancleToast();
        xToast = new XToast((Activity) context)
                .setDuration(LONG)//要设置具体时间才消失，不设置不消失
                .setView(R.layout.toast_view)
                .setAnimStyle(android.R.style.Animation_Dialog)
                .setVisibility(R.id.iv_toast, View.GONE)
                .setGravity(Gravity.CENTER)
                .setText(R.id.tv_toast, text);
        xToast.show();
    }

    /**
     * 支付宝样式
     */

    public static void showAliPayStyle(Context context, String text) {
        cancleToast();
        xToast = new XToast((Activity) context)
                .setDuration(LONG)//要设置具体时间才消失，不设置不消失
                .setView(R.layout.toast_view)
                .setBackground(R.id.ll_toast,context.getResources().getDrawable(R.drawable.bg_toast_alipay))
                .setAnimStyle(android.R.style.Animation_Dialog)
//				.setImageDrawable(R.id.iv_toast, R.drawable.toast_dui)
                .setVisibility(R.id.iv_toast, View.GONE)
                .setGravity(Gravity.CENTER)
                .setText(R.id.tv_toast, text);
        xToast.show();
    }

    /**
     * QQ样式
     */

    public static void showQQStyle(Context context, String text) {
        cancleToast();
        xToast = new XToast((Activity) context)
                .setDuration(LONG)//要设置具体时间才消失，不设置不消失
                .setView(R.layout.toast_view)
                .setBackground(R.id.ll_toast,context.getResources().getDrawable(R.drawable.bg_toast_qq))
                .setAnimStyle(android.R.style.Animation_Dialog)
//				.setImageDrawable(R.id.iv_toast, R.drawable.toast_dui)
                .setVisibility(R.id.iv_toast, View.GONE)
                .setGravity(Gravity.CENTER)
                .setText(R.id.tv_toast, text);
        xToast.show();
    }


    private static void cancleToast() {
        if (xToast != null && xToast.isShow()) {
            xToast.cancel();
        }
    }

}
