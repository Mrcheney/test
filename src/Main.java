import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入考试成绩记录：");
        int score = input.nextInt();
        int count = 0;
        System.out.println("加分前的成绩：" + score);
        while (score <60){
            score++;
            count++;
        }
        System.out.println("加分后的成绩：" + score);
        System.out.println("加分次数：" + count);
        System.out.println();
    }
}
