package com.example.a16478076_;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText username = null;
    EditText password = null;
    Button register = null;
    TextView show = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.signUp_username);
        password = findViewById(R.id.signUp_password);
        register = findViewById(R.id.signUp);
        show = findViewById(R.id.msg_show);

        //按钮绑定事件
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tUsername = username.getText().toString();
                String tPassword = password.getText().toString();

                if (TextUtils.isEmpty(tUsername)){
                    Toast.makeText(MainActivity.this,"用户名不能为空！",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(tPassword)){
                    Toast.makeText(MainActivity.this,"密码不能为空！",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                show.setText("用户名："+tUsername+("\n"));
                show.append("密码："+tPassword+("\n"));
                //页面跳转
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });
    }
}
