package com.imooc.io;

import java.io.IOException;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/5/8 上午11:47
 */
public class IOUtilTest1 {
    public static void main(String[] args) {
        try {
            IOUtil.printHex("/Users/cheney/cheney-workspace/JavaFirst/src/TestString.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
