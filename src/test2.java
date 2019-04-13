import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {


        test2 hw = new test2();
            hw.getMaxScore();


        }

        //定义方法完成成绩排序并输出前三名的功能

        public void getMaxScore(){
            int[] scores = {89,-23,64,91 , 119 , 52 , 73};
            Arrays.sort(scores);
            for(int i = scores.length ; i >scores.length -3;i--){
                System.out.println(scores[i-1]);
            }
        }
    }
