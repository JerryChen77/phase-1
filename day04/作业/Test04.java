import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入季节（1-4）");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("春天 春暖花开");
        } else if (num == 2) {
            System.out.println("夏天 夏天打盹");
        } else if (num == 3) {
            System.out.println("秋天 秋高气爽 ");
        } else if (num == 4) {
            System.out.println("冬天 冬眠");
        } else {
            System.out.println("输入有误");
        }
            System.out.println("=======================");
            System.out.println("请输入季节（1-4）");
            int n = sc.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("春天 春暖花开");
                    break;
                }
                case 2: {
                    System.out.println("夏天 夏天打盹 ");
                    break;
                }
                case 3: {
                    System.out.println("秋天 秋高气爽 ");
                    break;
                }
                case 4: {
                    System.out.println("冬天 冬眠");
                    break;
                }
                default :
                    System.out.println("输入有误");
                    break;
            }
        }
    }
