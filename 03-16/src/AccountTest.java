import java.util.*;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		Account obj = new Account();
		System.out.println("�ܾ��� �Է����ּ���.");
		a = scan.nextInt();
		obj.setName("tom");
		obj.setBalance(a);
		if (obj.getBalance() <= 0)
			System.out.println("����");
		else
		System.out.println("�̸��� " + obj.getName() + "���� �ܰ�� " + obj.getBalance() + "�Դϴ�.");
	}

}
