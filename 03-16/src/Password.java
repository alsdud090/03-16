import java.util.*;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String id="abcdef";
		Scanner scan = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ��� : ");
		s = scan.next();
		if(s.equalsIgnoreCase(id))
			System.out.println("�α����� �����Ͽ����ϴ�.");
		else
			System.out.println("�α����� �����Ͽ����ϴ�.");
	}

}
