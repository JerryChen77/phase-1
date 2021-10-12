class Demo03 {
	public static void main(String[] args) {
		/*
			1 === true
			0 === false
			  0000 1010
			| 0000 1111
			===========
			  0000 1111
		*/
		System.out.println(10 | 15);

		/*
			1 === true
			0 === false

			  0000 1010
			& 0000 1111
			===========
			  0000 1010 == 10
		*/
		System.out.println(10 & 15);

		/*
			Òì»ò
			1 === true
			0 === false

			  0000 1010
			^ 0000 1111
			===========
			  0000 0101 == 5
		*/
		System.out.println(10 ^ 15);

		System.out.println(10 >> 1);

		System.out.println(10 << 1);
		
	}
}
