package string;

public class StringTest {

	public static void main(String[]  args) {

		String str1 = new String("java");
		String str2 = new String("andriod");
		
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2);
		
		System.out.println(str1);	//str1에 str2가 붙는게 아니라 새로 만들어짐
		System.out.println(System.identityHashCode(str1));	//그래서 다름
	}

}

