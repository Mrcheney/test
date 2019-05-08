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
            Long start = System.currentTimeMillis();
            IOUtil.copyFileByBuffer(new File("/Users/cheney/save_img/1.jpg")
                     ,new File("/Users/cheney/save_img/copy_1.jpg"));
            // 755毫秒 读取带缓冲的字节流数据（未批量读取）
            Long end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
