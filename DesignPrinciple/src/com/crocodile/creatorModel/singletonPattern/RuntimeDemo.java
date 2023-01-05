package com.crocodile.creatorModel.singletonPattern;

import java.io.IOException;
import java.io.InputStream;

public class RuntimeDemo {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        //调用runtime的exec方法
        Process process = runtime.exec("ipconfig");

        InputStream inputStream = process.getInputStream();
        byte[] bytes = new byte[1024 * 1024 * 100];
        int len = inputStream.read(bytes);

        System.out.println(new String(bytes,0,len,"GBK"));
    }
}
