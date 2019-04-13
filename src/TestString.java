import java.util.Date;

public class TestString {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        TestString  ts = new TestString();
        ts.outPutString();
        long end = System.currentTimeMillis();
        long time = end - begin;
        System.out.println("执行耗时：");
        System.out.println(time);

    }

    // 1.测试String 的性能
    public void outPutString(){
        String s = "abc";
        for(int i = 1 ; i<= 10000;i++){
//        s = s + i;
            s = s.concat(String.valueOf(i));

        }
    }
     // 2.测试StringBuffer 的性能
    public void outPutStringBuffer(){
        String s = "abc";
        for(int i = 1 ; i<= 10000;i++){
//        s = s + i;
            s = s.concat(String.valueOf(i));

        }
    }

    // 3.测试StringBuilder 的性能
    public void outPutStringBuilder(){
        String s = "abc";
        for(int i = 1 ; i<= 10000;i++){
//        s = s + i;
            s = s.concat(String.valueOf(i));

        }
    }
}
