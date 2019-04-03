import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
	  char UserName = 'a';
	  char PassWord = 'b';
	  Scanner sacnner = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String inputU = sacnner.next();
		System.out.print("请输入密码：");
		String inputP = sacnner.next();
		char c1 = inputU.charAt(0);
		char c2 = inputP.charAt(0);
		if(c1 == 'a'&& c2 == 'b'){
			System.out.print("登陆成功");
		}
	}
	




}