class Demo15 {
	public static void main(String[] args) {
		/*
			�߼���	&	&&
				true	&&	true	==��	true
				true	&&	false	==��	false
				fasle	&&	true	==��	false
				false	&&	false	==��	false

				�߼����ж�Ҫ��������������ͬʱ���������������true
				ֻҪ�������ʽ��һ��false���������ʽ�Ľ������false
		*/
		
		int male	= 18;
		int female	= 20;

		// System.out.println("��������˼˼�ܲ��ܰ�֤:" + (����>=22) && (��˼˼>=20));
		System.out.println("��������˼˼�ܲ��ܰ�֤:" + ((male>=22) && (female>=20)));

		/*
			�߼���	|	||
				true	||	true	==>	true
				true	||	false	==>	true
				false	||	true	==>	true
				false	||	false	==>	false
				�������ʽ����һ��true�����ʽ�Ľ����Ϊtrue
		*/

		int a = 10;
		int b = 20;

		System.out.println("���ǵ�����㹻������?" + ((a>=20) || (b>=20)));
		System.out.println(!true);
	}
}
