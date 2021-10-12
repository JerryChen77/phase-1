class Demo02 {
	public static void main(String[] args) {
		/*
			三元运算符
				布尔表达式 ? 结果1 : 结果2;

				如果布尔表达式的结果是true
					得到的是结果1
				如果布尔表达式的结果是false
					得到的是结果2
				表达式返回值的类型和结果类型相关
				结果的类型必须是兼容的
				
		*/
		int a = 33;
		int b = 55;
		int max = a>b ? a:b;
		System.out.println("max = " + max);

		String result = a > b ? "a大" : b;
		System.out.println(result);

	}
}
