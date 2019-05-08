package com.imooc.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/5/8 下午5:04
 */
public class AmyOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("demo/raf.dat");
        out.write('A');
        out.write('B');
        int a = 10;
        out.write(a >>> 24);
        out.write(a >>> 16);
        out.write(a >>> 8);
        out.write(a);
        byte[] gbk = "中国".getBytes("gbk");
        out.write(gbk);
        out.close();
        IOUtil.printHex("demo/out.dat");


    }
}
