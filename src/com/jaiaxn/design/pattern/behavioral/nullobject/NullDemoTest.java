package com.jaiaxn.design.pattern.behavioral.nullobject;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 空对象模式
 **/
public class NullDemoTest {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("YaSuo");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Jie");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Liqing");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("AKaLi");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
    // YaSuo
    // Jie
    // Liqing
    // Not Available in Customer Database
}
