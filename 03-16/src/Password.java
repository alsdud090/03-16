import java.util.*;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String id="abcdef";
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		s = scan.next();
		if(s.equalsIgnoreCase(id))
			System.out.println("로그인이 성공하였습니다.");
		else
			System.out.println("로그인이 실패하였습니다.");
	}

}
