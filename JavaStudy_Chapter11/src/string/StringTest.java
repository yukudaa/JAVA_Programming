package string;

public class StringTest {

	public static void main(String[]  args) {

		String str1 = new String("java");
		String str2 = new String("andriod");
		
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2);
		
		System.out.println(str1);	//str1�� str2�� �ٴ°� �ƴ϶� ���� �������
		System.out.println(System.identityHashCode(str1));	//�׷��� �ٸ�
	}

}
