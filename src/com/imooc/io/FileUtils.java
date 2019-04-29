package com.imooc.io;

import java.io.File;
import java.io.IOException;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/4/18 下午3:35
 *
 * 列出File的一些常用操作，比如过滤，遍历
 */
public class FileUtils {


    /**
     * 列出指定目录下的所有文件（包括子目录）
     *
     * @param dir
     * @throws IOException
     */
    public static void listDirectory(File dir) throws IOException {
        if (!dir.exists()) {
            throw new IllegalArgumentException("目录:" + dir + " 不存在！");
        }
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir + "不是目录");
        }

        /**  1. 遍历指定目录的所有文件
         String[] filenames = dir.list(); // 不包含子目录以下的文件
         for (String str : filenames) {
         System.out.println(dir + "/" + str);
         } */

        /**
         *
         *  2.实现遍历指定目录及以下子目录所有文件，递归方式
         */
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            System.out.println("文件长度：" + files.length);
            for (File file : files) {
                if (file.isDirectory()) {
                    // 递归
                  listDirectory(file);

                } else {
                    System.out.println(file);
                }

            }
        }
    }
}
