package main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //A a = (A)context.getBean("objA");
        B b = (B)context.getBean("objB");
        System.out.println("B = "+ b.getNom()+ ", A = " +b.getMyA().getNom());
    }
}
