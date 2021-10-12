import java.util.Scanner;
class  Test06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ÄãÓÐ¶àÉÙÇ®£¿");
		int m = sc.nextInt();
		if(m>=200){
			System.out.println("»Æ»¨Óã");
		}else if(m>=100 && m<200){
			System.out.println("¿¾Ñ¼");	
		}else if(m>=60 && m<100){
			System.out.println("ºìÉÕÈâ");	
		}else if(m>=40 && m<60){
			System.out.println("Ð¡³´Èâ");	
		}else if(m>=10 && m<40){
			System.out.println("°×Ë®¶¹¸¯");	
		}else if(m>=0 && m<10){
			System.out.println("Çî±Æ");
		}else{
			System.out.println("ÊäÈëÓÐÎó");
		}
	}
}
