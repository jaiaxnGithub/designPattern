package com.jaiaxn.design.pattern.structured.flyweight;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: 享元模式
 **/
public class FlyweightDemoTest {
    private static final String[] shoesName = {"忍者足具", "水银之靴", "明朗之靴", "疾行之靴", "法师之靴", "轻灵之靴"};

    private static String getRandomShoe(){
        return shoesName[(int)(Math.random() * shoesName.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10;i++){
            IShoe shoe = ShoeFactory.getShoe(getRandomShoe());
            shoe.printShoeName();
        }
    }
    // 明朗之靴
    // 水银之靴
    // 明朗之靴
    // 明朗之靴
    // 法师之靴
    // 忍者足具
    // 疾行之靴
    // 轻灵之靴
    // 忍者足具
    // 疾行之靴
}
