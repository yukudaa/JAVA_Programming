package object;

class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {

		return title + "," + author;
	}

}

public class ToStringEx {

	public static void main(String[] args) {

		Book book = new Book("두잇자바", "은종님"); // 위에 toString()이 없으면 object.Book@7d6f77cc 이렇게 나옴
		System.out.println(book);

		String str = new String("test");
		System.out.println(str); // String클래스에 이미 toString이 정의되어 있어서
	} // 자기 문자열을 출력하도록

}
