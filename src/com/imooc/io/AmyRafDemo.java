package com.imooc.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.RandomAccess;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/4/18 下午5:07
 */
public class AmyRafDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo");
        if(!file.exists()){
            file.mkdir();
        }
        File file1 = new File(file,"raf.dat");
        if(!file1.exists()){
            file1.createNewFile();
        }

        /**
         * 读写操作
         */
        RandomAccessFile raf = new RandomAccessFile(file1,"rw");
        // 指针位置
        System.out.println("输出此文件中的当前偏移量："+ raf.getFilePointer());
        // RamdomAccessFile.write() 方法 写入字节、字节数组
        raf.write('A');
        raf.write('B');
        System.out.println("输出此文件中的当前偏移量："+ raf.getFilePointer());
        // raf.write(22);
        // System.out.println("输出此文件中的当前偏移量："+ raf.getFilePointer());
        raf.writeInt(123456789);
        System.out.println("输出此文件中的当前偏移量："+ raf.getFilePointer());
        // 将一个字符串作为字符序列写入文件。
        // raf.writeChars("Hello World.");
        // System.out.println("输出此文件中的当前偏移量："+ raf.getFilePointer());

        /**
         * 读文件，指针移到文件开始位置。
         */
        raf.seek(0);
        // 一次性读取 文件内容读取到字节数组中
        byte[] byfile = new byte[(int) raf.length()];
         raf.read(byfile);
        System.out.println("字节数组长度：" + byfile.length + '\n' + "输出字节数组:" + Arrays.toString(byfile));
        String string = new String(byfile,"utf-8");
        System.out.println("转化为字符：" + string);
        String s = "中";
        s.getBytes("gbk");
        raf.write(byfile);
        System.out.println("文件字节长度：" + raf.length());
        raf.close();
    }
}
