package com.imooc.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/5/6 下午6:29
 */
public class AmyInputStreamTest {

    public static void main(String[] args) throws  IOException{

        DataInputStream din = new DataInputStream(
                new FileInputStream("./demo/raf.dat"));
        String str = System.getProperty("user.dir");
        System.out.println(str);
    }


}
