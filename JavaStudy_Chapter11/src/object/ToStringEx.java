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

		Book book = new Book("�����ڹ�", "������"); // ���� toString()�� ������ object.Book@7d6f77cc �̷��� ����
		System.out.println(book);

		String str = new String("test");
		System.out.println(str); // StringŬ������ �̹� toString�� ���ǵǾ� �־
	} // �ڱ� ���ڿ��� ����ϵ���

}
