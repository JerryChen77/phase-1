class Demo02 {
	public static void main(String[] args) {
		/*
			��Ԫ�����
				�������ʽ ? ���1 : ���2;

				����������ʽ�Ľ����true
					�õ����ǽ��1
				����������ʽ�Ľ����false
					�õ����ǽ��2
				���ʽ����ֵ�����ͺͽ���������
				��������ͱ����Ǽ��ݵ�
				
		*/
		int a = 33;
		int b = 55;
		int max = a>b ? a:b;
		System.out.println("max = " + max);

		String result = a > b ? "a��" : b;
		System.out.println(result);

	}
}
