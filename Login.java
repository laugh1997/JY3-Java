import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
	  char UserName = 'a';
	  char PassWord = 'b';
	  Scanner sacnner = new Scanner(System.in);
		System.out.print("�������û�����");
		String inputU = sacnner.next();
		System.out.print("���������룺");
		String inputP = sacnner.next();
		char c1 = inputU.charAt(0);
		char c2 = inputP.charAt(0);
		if(c1 == 'a'&& c2 == 'b'){
			System.out.print("��½�ɹ�");
		}
	}
	




}