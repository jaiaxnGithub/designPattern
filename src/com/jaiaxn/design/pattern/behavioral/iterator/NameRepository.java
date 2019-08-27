package com.jaiaxn.design.pattern.behavioral.iterator;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月27日
 * @description:
 **/
public class NameRepository implements Container {

    public String[] names = {"YaSuo", "Jie", "AKaLi", "TaiLong"};

    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }
}
