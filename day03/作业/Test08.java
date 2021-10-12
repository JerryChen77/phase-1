import java.util.Scanner;
public class Test08 {
    public static void main(String args[]){
            System.out.println("请输入华氏温度");
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            double c = 5 / 9.0 * (t - 32);
            System.out.println("华氏温度=" + t + "\t摄氏温度=" + c);
    }
}

