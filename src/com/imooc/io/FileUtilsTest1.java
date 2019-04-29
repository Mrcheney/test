package com.imooc.io;

import java.io.File;
import java.io.IOException;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/4/18 下午4:02
 */
public class FileUtilsTest1 {

    public static void main(String[] args) throws IOException {

             FileUtils.listDirectory(new File("/Users/cheney/我的记录"));
    }

}
