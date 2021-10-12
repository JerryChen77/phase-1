import java.util.Scanner;
class Test01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		int num = sc.nextInt();
		System.out.println("请输入性别(男生1，女生0)");
		int sex = sc.nextInt();
		if (num > 90)
		{
			if(sex ==1){
				System.out.println("送你一个新垣结衣");
			}else if(sex == 0){
				System.out.println("送你一个吴彦祖");
			}else{
				System.out.println("性别错误");
			}
		}else{
			System.out.println("成绩太差！");
	         }
     }
}
