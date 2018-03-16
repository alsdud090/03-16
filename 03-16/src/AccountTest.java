import java.util.*;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		Account obj = new Account();
		System.out.println("잔액을 입력해주세요.");
		a = scan.nextInt();
		obj.setName("tom");
		obj.setBalance(a);
		if (obj.getBalance() <= 0)
			System.out.println("오류");
		else
		System.out.println("이름은 " + obj.getName() + "통장 잔고는 " + obj.getBalance() + "입니다.");
	}

}
