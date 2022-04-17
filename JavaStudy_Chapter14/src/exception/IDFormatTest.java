package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDformatException{
		
		if(userID == null) {
			throw new IDformatException("���̵�� null �� �� �����ϴ�.");
		}
		else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDformatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch (IDformatException e) {
			System.out.println(e);
		}
		userID = "1234567";
		
		try {
			idTest.setUserID(userID);
		} catch (IDformatException e) {
			System.out.println(e);
		}
	}

}
