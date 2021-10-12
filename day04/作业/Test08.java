import java.util.Scanner;
public class Test08 {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入身高(m)");
            double h = sc.nextDouble();
            System.out.println("请输入体重(kg)");
            double w = sc.nextDouble();
            double BMI = w/(h*h);
            if(BMI>=20 && BMI <= 25){
                System.out.println("健康,BMI="+BMI);
            }else{
                System.out.println("异常");
            }
        }
    }

