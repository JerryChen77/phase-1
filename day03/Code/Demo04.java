class Demo04 {
	public static void main(String[] args) {
		byte b = 110;
		System.out.println("byte b = " + b);

		short s = 32767;
		System.out.println("short s = " + s);

		int i = 2147483647;
		System.out.println("int i = " + i);

		// java中整数默认的类型是int,在给long类型数据赋值的时候如果数据超出了int的范围，需要加上L
		long l = 21474836470L;
		System.out.println("long l = " + l);
		/*
			1TB = 1000GB 
			= 1000 * 1000MB
			= 1000 * 1000 * 1000KB 
			= 1000 * 1000 * 1000 * 1000B
		*/
	}
}
