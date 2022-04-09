package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java"); // 기존방식

		StringConcat concat = (s1,s2)->System.out.println(s1 + " "+  s2);
		concat.makeString("hello", "java"); // 람다방식
		
		StringConcat concat2 = new StringConcat() {	// 익명 방식
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+" "+s2);
		
			}
		};
		concat2.makeString("hello", "java");
	}

}
