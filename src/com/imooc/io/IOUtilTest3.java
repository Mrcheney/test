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
            Long start = System.currentTimeMillis();
            IOUtil.copyFile(new File("/Users/cheney/save_img/1.jpg")
                       ,new File("/Users/cheney/save_img/copy_2.jpg"));
            // 6毫秒 批量读取字节流数据是比较快的选择
            Long end = System.currentTimeMillis();
            System.out.println(end- start);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
