import java.util.Scanner;
class Demo17 {
	public static void main(String[] args) {
		// 键盘录风扇档位,输出转速

		/*
			1、导包
			2、创建对象
			3、提示输入
			4、获取数据
			5、判断输出
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入风扇的档位(0--3):");
		int level = sc.nextInt();

		switch(level){
			case 0:
				// level==0
				System.out.println("现在的档位是0,风扇处于停止状态...");
				break;

			case 1:	// 等同于if(level==1)
				// level==1
				System.out.println("现在的档位是1,风扇转速较慢...");
				break;

			case 2:
				// level==2
				System.out.println("现在的档位是2,风扇转速适中...");
				break;
			
			case 3:
				// level==3
				System.out.println("现在的档位是3,风扇转速很快...");
				break;
			
			default:
				// level没有和以上任意case匹配到
				System.out.println("档位不存在");
				break;
		}
	}
}
