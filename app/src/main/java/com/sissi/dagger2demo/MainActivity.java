package com.sissi.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sissi.dagger2demo.di.component.DaggerComputerMarket;
import com.sissi.dagger2demo.entity.Computer;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    @Inject // 告知dagger此处需要被注入一个对象
//    Computer computer;

    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content = findViewById(R.id.main_content);

//        computer =
        /* 使用DaggerComputerMarket生成一个computer对象。
         * NOTE: 此处还不能称之为“注入”，在MainActivity这一层看来此种方式跟直接new没有本质区别。
         * 此处只是展示了DaggerComputerMarket可以创建一个computer对象的能力 */
        Computer computer = DaggerComputerMarket.builder().build().assemble();

        content.setText(computer.toString());
    }
}
