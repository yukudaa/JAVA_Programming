package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID;	//상담원 연결
	private double saleRatio;	
	
	
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		//System.out.println("VIPCustomer(int, String) 호출(하위 클래스)");
		
	}
	
	//오버라이딩
	public int calcPrice(int price){	
		bonusPoint += price * bonusRatio;	
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
}
