class Demo09 {
	public static void main(String[] args) {
		byte b = 110;	// b��������byte���ռ���1�ֽ�
		int i = b;		// ��b����i�Ŀռ䣬��1�ֽڵ����ݷ���4�ֽڣ���ȫ
		System.out.println("int i = " + i);

		float f = i;	// �����ͱ�ʾ������Ҫ����int
		System.out.println("float f = " + f);

		int j = (int)f;		// С��ȡ��������С������,����������ʧ
		// ָ¹Ϊ��
		System.out.println("int j = " + j);

		int x = 1234;
		byte b00 = (byte)x;
		System.out.println("byte b00 = " + b00);
	}
}
