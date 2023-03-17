package com.vara.test;

import com.vara.bean.SimpleMath;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLauncher {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
        SimpleMath math = ctx.getBean("simplemath",SimpleMath.class);
        System.out.println(math.getSquare(5));
    }
}
