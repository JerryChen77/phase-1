import java.util.Scanner;
class RunNian{
public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入年份");
       int n = sc.nextInt();
                if(n%4==0){
                      System.out.println("该年是闰年");
                }else{
                      System.out.println("该年不是闰年");
                }
       }
}