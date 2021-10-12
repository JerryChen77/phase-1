import java.util.Scanner;
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = sc.nextInt();
        int s = score/10 ;
        switch (s) {
            case 10: {
                if (score == 100) {
                    System.out.println("成绩：" + score + ",满分");
                    break;
                }
            }
            case 9: {
                    System.out.println("成绩：" + score +",优秀");
                    break;
                }
            case 8:
            case 7: {
                    System.out.println("成绩：" + score +",一般");
                    break;
                }
            case 6: {
                    System.out.println("成绩：" + score +",及格");
                    break;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                    System.out.println("成绩：" + score +",不及格");
                    break;
                }
                default:
                System.out.println("输入有误");
                break;
            }
        }
    }
