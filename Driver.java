import java.util.*;
public class Driver
{
	public static void main(String[] args)
	{
		String str = "692116851128";
		int oddNum = 0;
		for(int i=0;i<str.length();i+=2)//+=2从第一个数是0，从0开始取奇数位
		{
		char c = str.charAt(i);//取每次循环的值 用字符接收
		oddNum=oddNum+(int)c-48;//输出每次循环的值
		}
		 System.out.print(oddNum);
	}
}