class Demo15 {
	public static void main(String[] args) {
		/*
			逻辑与	&	&&
				true	&&	true	==》	true
				true	&&	false	==》	false
				fasle	&&	true	==》	false
				false	&&	false	==》	false

				逻辑与判断要求运算符两侧必须同时成立，结果才能是true
				只要整个表达式有一个false，整个表达式的结果就是false
		*/
		
		int male	= 18;
		int female	= 20;

		// System.out.println("张三和李思思能不能办证:" + (张三>=22) && (李思思>=20));
		System.out.println("张三和李思思能不能办证:" + ((male>=22) && (female>=20)));

		/*
			逻辑或	|	||
				true	||	true	==>	true
				true	||	false	==>	true
				false	||	true	==>	true
				false	||	false	==>	false
				整个表达式中有一个true，表达式的结果就为true
		*/

		int a = 10;
		int b = 20;

		System.out.println("你们的余额足够结账吗?" + ((a>=20) || (b>=20)));
		System.out.println(!true);
	}
}
