package com.example.a16478076_;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    CheckBox cb_1, cb_2, cb_3, cb_4, cb_5, cb_6;
    FoodList food_1 = new FoodList();
    FoodList food_2 = new FoodList();
    FoodList food_3 = new FoodList();
    FoodList food_4 = new FoodList();
    FoodList food_5 = new FoodList();
    FoodList food_6 = new FoodList();
    RadioGroup yhq;
    EditText number;
    Button bt_submit;
    double totalPrice;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        cb_1 = findViewById(R.id.cb_1);
        cb_2 = findViewById(R.id.cb_2);
        cb_3 = findViewById(R.id.cb_3);
        cb_4 = findViewById(R.id.cb_4);
        cb_5 = findViewById(R.id.cb_5);
        cb_6 = findViewById(R.id.cb_6);
        bt_submit = findViewById(R.id.submit);
        yhq = findViewById(R.id.yhq);
        number = findViewById(R.id.et_number);
        initValue();
        initEvent_submit();
        initEvent_yhq();
    }

    private void initEvent_yhq() {
        yhq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //无效
                if (findViewById(R.id.yhq).equals(findViewById(R.id.yes))) {
                    number.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    private void initEvent_submit() {

        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb_1.isChecked())
                    totalPrice+=food_1.getFoodPrice();
                if (cb_2.isChecked())
                    totalPrice+=food_2.getFoodPrice();
                if (cb_3.isChecked())
                    totalPrice+=food_3.getFoodPrice();
                if (cb_4.isChecked())
                    totalPrice+=food_4.getFoodPrice();
                if (cb_5.isChecked())
                    totalPrice+=food_5.getFoodPrice();
                if (cb_6.isChecked())
                    totalPrice+=food_6.getFoodPrice();

//                Toast.makeText(OrderActivity.this, (int)totalPrice, Toast.LENGTH_SHORT).show();
                Log.d("总价：", String.valueOf(totalPrice));
                totalPrice = 0;
            }
        });
    }

    private void initValue() {
        food_1.setFoodName("辣椒炒鸡蛋");
        food_1.setFoodPrice(13);
        food_2.setFoodName("腐竹炒肉");
        food_2.setFoodPrice(12);
        food_3.setFoodName("木耳炒鸡肉");
        food_3.setFoodPrice(14);
        food_4.setFoodName("养生乌鸡汤");
        food_4.setFoodPrice(18);
        food_5.setFoodName("干锅牛蛙");
        food_5.setFoodPrice(24);
        food_6.setFoodName("鸡蛋饼");
        food_6.setFoodPrice(10);

        cb_1.setText(food_1.getFoodName());
        cb_2.setText(food_2.getFoodName());
        cb_3.setText(food_3.getFoodName());
        cb_4.setText(food_4.getFoodName());
        cb_5.setText(food_5.getFoodName());
        cb_6.setText(food_6.getFoodName());
    }
}
