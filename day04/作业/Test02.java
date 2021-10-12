import java.util.Scanner;
class Test02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("是否遇到卖西瓜的？（遇到1，没遇到0）");
		int num = sc.nextInt();
		if (num ==1){
			System.out.println("买一个西瓜");
		}else if(num == 0){
			System.out.println("没遇到卖西瓜的");
	    }else{
			System.out.println("输入有误");
		}
     }
}
