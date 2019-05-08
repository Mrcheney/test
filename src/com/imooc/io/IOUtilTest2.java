package com.imooc.io;

import java.io.File;
import java.io.IOException;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/5/8 下午5:45
 */
public class IOUtilTest2 {
    public static void main(String[] args) {
        try {
            IOUtil.copyFileByBuffer(new File("/Users/cheney/cheney-workspace/JavaFirst/src/TestString.java")
                     ,new File("/Users/cheney/cheney-workspace/JavaFirst/src/Testaaa.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
