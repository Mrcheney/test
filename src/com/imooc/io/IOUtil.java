package com.imooc.io;

import java.io.*;

/**
 * @author Cheney <chendong992@gmail.com>
 * @date 2019/5/8 上午11:20
 */
public class IOUtil {
    /**
     * 读取指定文件内容，按照16进制输出到控制台
     * 并且每输出10个byte换行
     *
     * @param filename
     */
    public static void printHex(String filename) throws IOException {
        FileInputStream in = new FileInputStream(filename);
        System.out.println("测试toHexString()方法：" + Integer.toHexString(10));
        int b;
        int i = 1;
        while ((b = in.read()) != -1) {
            System.out.println(Integer.toHexString(b) + " ");// 将整型b转换为16进制标表示的字符串
            if(i++%100==0){
                System.out.println();
            }

        }
        in.close();

    }

    /**
     * 进行文件的拷贝
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    public static void copyFile(File srcFile,File destFile) throws IOException{
        if(!srcFile.exists()){
            throw new IllegalArgumentException("文件：" + srcFile + "不存在");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile + "不是文件");
        }

        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(destFile);
        byte[] buf = new byte[8*1024];
        int b;
        while ((b = in.read(buf,0,buf.length))!= -1){
            out.write(buf,0,b);
            out.flush();
        }
        in.close();
        out.close();
    }

    /**
     * 进行文件的拷贝，利用带缓冲的字节流
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    public static void copyFileByBuffer(File srcFile,File destFile) throws  IOException{
        if(!srcFile.exists()){
            throw new IllegalArgumentException("文件：" + srcFile + "不存在");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile + "不是文件");

        }
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destFile));
        int c;
        while ((c = bis.read())!=-1){
            bos.write(c);
            bos.flush(); //刷新缓冲区

        }
        bis.close();
        bos.close();
    }


}
