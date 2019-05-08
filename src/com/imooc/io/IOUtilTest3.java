package com.imooc.io;

import java.io.File;
import java.io.IOException;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/5/8 下午6:12
 */
public class IOUtilTest3 {
    public static void main(String[] args) {
        try {
            IOUtil.copyFile(new File("/Users/cheney/cheney-workspace/JavaFirst/src/TestString.java")
                       ,new File("/Users/cheney/cheney-workspace/JavaFirst/src/Testbbbb.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
