package com.kh.typetrans;

public class TestTypeTransTwo {
	public static void main(String [] args) {
		int num = 2147483647; // 2147483648 ����� ����
		int result = num + 1;
		System.out.println(result);
		//�����÷ο찡 �Ͼ�鼭 -2147483648���� ��µȴ�
		//int�� �ִ񰪿��� 1�� ���ϸ� ��ȣ��Ʈ�� 1�̵ǰ� ������ 0�� �Ǽ� -2147483648��� 
		long resultTwo = (long)num+1;
		System.out.println(resultTwo);
		//���� ������Ÿ�Կ��� ū ������Ÿ������ ����ȯ�ؼ� �����ͼս� x
	}

}
