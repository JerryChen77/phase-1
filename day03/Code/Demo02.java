class Demo02{
	public static void main(String[] args) {
		// 1、先声明,再赋值
		int result;
		result = 10;
		result = 20;
		System.out.println(result);

		///2、声明的同时赋值
		String info = "静夜思--唐李白--床前明月光，疑是地上霜。";
		System.out.println(info);

		// 同一个方法中不能出现两个名字完全相同的变量
		String Info = "静夜思--唐李白--举头望明月，低头思故乡。";
		System.out.println(Info);

		// 3、一次声明多个变量--类型相同
		int a,b,c;
		a = 20;
		b = 50;
		System.out.println(a);
		System.out.println(b);
		// 方法中的变量使用之前必须赋值
		c = 80;
		System.out.println(c);

		// 4、一次声明多个变量并赋值
		int x,y=15,z=20;
		// System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		String 名字 = "张三";
		System.out.println(名字);
	}
}
