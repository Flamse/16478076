package com.example.a16478076_;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OrderActivity extends AppCompatActivity {

//    CheckBox cb_1, cb_2, cb_3, cb_4, cb_5, cb_6;
    Food food_1 = new Food();
    Food food_2 = new Food();
    Food food_3 = new Food();
    Food food_4 = new Food();
    Food food_5 = new Food();
    Food food_6 = new Food();
//    RadioGroup yhq;
    EditText number;
    Button bt_submit;
    ImageButton imageReduce;
    ImageButton imageAdd;
    TextView textCount;
    double totalPrice;
    ListView lv;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

//        cb_1 = findViewById(R.id.cb_1);
//        cb_2 = findViewById(R.id.cb_2);
//        cb_3 = findViewById(R.id.cb_3);
//        cb_4 = findViewById(R.id.cb_4);
//        cb_5 = findViewById(R.id.cb_5);
//        cb_6 = findViewById(R.id.cb_6);
        bt_submit = findViewById(R.id.submit);
//        yhq = findViewById(R.id.yhq);
//        number = findViewById(R.id.et_number);
        /*定义一个动态数组，ListView中的数据*/
        ArrayList<HashMap<String, Object>> listItem = new ArrayList<>();
        //数据
        initValue(listItem);
        //适配器
        initAdapter(listItem);
//        initEvent_RA();   //有问题
        initEvent_submit();
//        initEvent_yhq();
    }

    private void initEvent_RA() {
        imageAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("aa","d");
            }
        });
    }

    /**
     * ListView数据初始化
     * @param listItem
     */
    private void initValue(ArrayList<HashMap<String, Object>> listItem) {
        /*Item*/
        HashMap<String, Object> map = new HashMap<>();
        map.put("ItemImage", R.drawable.ic_launcher_background);
        map.put("ItemTitle", "辣椒炒鸡蛋");
        map.put("ItemText", "￥10.00");
        listItem.add(map);
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("ItemImage", R.drawable.ic_launcher_background);
        map2.put("ItemTitle", "腐竹炒肉");
        map2.put("ItemText", "￥13.00");
        listItem.add(map2);
        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("ItemImage", R.drawable.ic_launcher_background);
        map3.put("ItemTitle", "木耳炒鸡肉");
        map3.put("ItemText", "￥15.00");
        listItem.add(map3);
        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("ItemImage", R.drawable.ic_launcher_background);
        map4.put("ItemTitle", "养生乌鸡汤");
        map4.put("ItemText", "￥22.00");
        listItem.add(map4);
        HashMap<String, Object> map5 = new HashMap<>();
        map5.put("ItemImage", R.drawable.ic_launcher_background);
        map5.put("ItemTitle", "干锅牛蛙");
        map5.put("ItemText", "￥24.00");
        listItem.add(map5);
        HashMap<String, Object> map6 = new HashMap<>();
        map6.put("ItemImage", R.drawable.ic_launcher_background);
        map6.put("ItemTitle", "鸡蛋饼");
        map6.put("ItemText", "￥10.00");
        listItem.add(map6);
        HashMap<String, Object> map7 = new HashMap<>();
        map7.put("ItemImage", R.drawable.ic_launcher_background);
        map7.put("ItemTitle", "鱼香肉丝");
        map7.put("ItemText", "￥18.00");
        listItem.add(map7);
        HashMap<String, Object> map8 = new HashMap<>();
        map8.put("ItemImage", R.drawable.ic_launcher_background);
        map8.put("ItemTitle", "手撕牛肉");
        map8.put("ItemText", "￥18.00");
        listItem.add(map8);
        /*在数组中存放数据*/
        /*for(int i=0;i<10;i++)
        {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ItemImage", R.drawable.ic_launcher_background);//加入图片
            map.put("ItemTitle", "第"+i+"行");
            map.put("ItemText", "这是第"+i+"行");
            listItem.add(map);
        }*/
    }

    /**
     * adapter适配器初始化
     * @param listItem
     */
    private void initAdapter(ArrayList<HashMap<String, Object>> listItem) {
        lv = findViewById(R.id.lv);
        SimpleAdapter mSimpleAdapter = new SimpleAdapter(
                this,
                listItem,//需要绑定的数据
                R.layout.item,//每一行的布局
                //动态数组中的数据源的键对应到定义布局的View中
                new String[] {"ItemImage","ItemTitle", "ItemText"},
                new int[] {R.id.ItemImage,R.id.ItemTitle,R.id.ItemText});
        lv.setAdapter(mSimpleAdapter);//为ListView绑定适配器


//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
//                setTitle("你点击了第"+arg2+"行");//设置标题栏显示点击的行
//            }
//        });

        /**
         * android.content.Context context,
         * java.util.List<? extends java.util.Map<String, ?>> data,
         * @LayoutRes int resource,
         * String[] from,
         * @IdRes int[] to
         */
    }

//    private void initEvent_yhq() {
//        yhq.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //无效
//                if (findViewById(R.id.yhq).equals(findViewById(R.id.yes))) {
//                    number.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//
//    }

    /**
     * 提交
     */
    private void initEvent_submit() {
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (cb_1.isChecked())
//                    totalPrice+=food_1.getFoodPrice();
//                if (cb_2.isChecked())
//                    totalPrice+=food_2.getFoodPrice();
//                if (cb_3.isChecked())
//                    totalPrice+=food_3.getFoodPrice();
//                if (cb_4.isChecked())
//                    totalPrice+=food_4.getFoodPrice();
//                if (cb_5.isChecked())
//                    totalPrice+=food_5.getFoodPrice();
//                if (cb_6.isChecked())
//                    totalPrice+=food_6.getFoodPrice();

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

//        cb_1.setText(food_1.getFoodName());
//        cb_2.setText(food_2.getFoodName());
//        cb_3.setText(food_3.getFoodName());
//        cb_4.setText(food_4.getFoodName());
//        cb_5.setText(food_5.getFoodName());
//        cb_6.setText(food_6.getFoodName());
    }
}
