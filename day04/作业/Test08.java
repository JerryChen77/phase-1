import java.util.Scanner;
public class Test08 {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("���������(m)");
            double h = sc.nextDouble();
            System.out.println("����������(kg)");
            double w = sc.nextDouble();
            double BMI = w/(h*h);
            if(BMI>=20 && BMI <= 25){
                System.out.println("����,BMI="+BMI);
            }else{
                System.out.println("�쳣");
            }
        }
    }

