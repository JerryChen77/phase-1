import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����뼾�ڣ�1-4��");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("���� ��ů����");
        } else if (num == 2) {
            System.out.println("���� �������");
        } else if (num == 3) {
            System.out.println("���� �����ˬ ");
        } else if (num == 4) {
            System.out.println("���� ����");
        } else {
            System.out.println("��������");
        }
            System.out.println("=======================");
            System.out.println("�����뼾�ڣ�1-4��");
            int n = sc.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("���� ��ů����");
                    break;
                }
                case 2: {
                    System.out.println("���� ������� ");
                    break;
                }
                case 3: {
                    System.out.println("���� �����ˬ ");
                    break;
                }
                case 4: {
                    System.out.println("���� ����");
                    break;
                }
                default :
                    System.out.println("��������");
                    break;
            }
        }
    }
