package com.jaiaxn.design.pattern.structured.proxy.normal;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description: 代理模式
 **/
public class ProxyDemoTest {
    public static void main(String[] args) {
        IFile file = new ProxyFile("文件名.txt");

        file.loadFile();
    }
    // loading file --- 文件名.txt
}
