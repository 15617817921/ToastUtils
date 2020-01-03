package com.liu.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt1(View view) {
        ToastUtils.showCenterLongToast(this, "居中显示");
    }

    public void bt2(View view) {
        ToastUtils.showLongToast(this, "底部显示");
    }

    public void bt3(View view) {
        ToastUtils.showAliPayStyle(this,"支付宝样式");

    }

    public void bt4(View view) {
        ToastUtils.showQQStyle(this,"QQ样式");
    }


}
