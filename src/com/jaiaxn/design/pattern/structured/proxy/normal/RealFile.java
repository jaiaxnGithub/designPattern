package com.jaiaxn.design.pattern.structured.proxy.normal;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class RealFile implements IFile {

    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void loadFile() {
        System.out.println("loading file --- " + fileName);
    }
}
