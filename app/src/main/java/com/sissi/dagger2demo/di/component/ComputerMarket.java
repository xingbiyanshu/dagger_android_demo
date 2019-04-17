package com.sissi.dagger2demo.di.component;

import com.sissi.dagger2demo.entity.Computer;

import dagger.Component;

@Component // 告知dagger此为一个注射器（将提供者提供的对象注射给需求者），
public interface ComputerMarket {
    // 该接口内的方法表明了该注射器能注射哪些对象
    Computer assemble(); // 组装电脑。dagger将自动生成该接口的实现类，并实现该方法，通过调用Computer的构造创建一个对象返回（Computer的构造已用@Inject标注，所以dagger能找到它）
}
