package com.jaiaxn.design.pattern.behavioral.command;


/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
