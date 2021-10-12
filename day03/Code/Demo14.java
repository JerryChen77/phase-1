class Demo14 {
	public static void main(String[] args) {
		int a = 33;
		int b = 55;
		String c = "33";
		System.out.println("a > b ? " + (a > b));
		System.out.println("a >= b ? " + (a >= b));

		System.out.println("a < b ? " + (a < b));
		System.out.println("a <= b ? " + (a <= b));

		System.out.println("a == b ? " + (a == b));
		System.out.println("a != b ? " + (a != b));

		// 不可比较的类型:
		// System.out.println("a == c ? " + (a == c));
	}
}
