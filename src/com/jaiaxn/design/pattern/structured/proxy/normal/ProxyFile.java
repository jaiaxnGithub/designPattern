package com.jaiaxn.design.pattern.structured.proxy.normal;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月26日
 * @description:
 **/
public class ProxyFile implements IFile {

    private RealFile realFile;
    private String fileName;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void loadFile() {
        if (null == realFile) {
            realFile = new RealFile(fileName);
        }
        realFile.loadFile();
    }
}
