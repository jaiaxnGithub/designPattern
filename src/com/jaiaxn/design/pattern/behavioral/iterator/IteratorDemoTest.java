package com.jaiaxn.design.pattern.behavioral.iterator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description: 迭代器模式
 **/
public class IteratorDemoTest {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
    // Name : YaSuo
    // Name : Jie
    // Name : AKaLi
    // Name : TaiLong
}
