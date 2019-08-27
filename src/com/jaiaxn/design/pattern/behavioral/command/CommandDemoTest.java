package com.jaiaxn.design.pattern.behavioral.command;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: 命令模式
 **/
public class CommandDemoTest {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
    // Stock [ Name: ABC,Quantity: 10 ] bought
    // Stock [ Name: ABC,Quantity: 10 ] sold
}
