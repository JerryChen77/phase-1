import java.util.Scanner;
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ɼ�");
        int score = sc.nextInt();
        int s = score/10 ;
        switch (s) {
            case 10: {
                if (score == 100) {
                    System.out.println("�ɼ���" + score + ",����");
                    break;
                }
            }
            case 9: {
                    System.out.println("�ɼ���" + score +",����");
                    break;
                }
            case 8:
            case 7: {
                    System.out.println("�ɼ���" + score +",һ��");
                    break;
                }
            case 6: {
                    System.out.println("�ɼ���" + score +",����");
                    break;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                    System.out.println("�ɼ���" + score +",������");
                    break;
                }
                default:
                System.out.println("��������");
                break;
            }
        }
    }
