package Day07.Ex02_Encapsulation;

public class Bank {
	
	public static void main(String[] args) {
		Encapsulation ec = new Encapsulation(0, "국민은행", " 1234-04-1234", "정민규");
		ec.setDeposit(1000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
		
	}

}
