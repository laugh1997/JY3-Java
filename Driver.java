import java.util.*;
public class Driver
{
	public static void main(String[] args)
	{
		String str = "692116851128";
		int oddNum = 0;
		for(int i=0;i<str.length();i+=2)//+=2�ӵ�һ������0����0��ʼȡ����λ
		{
		char c = str.charAt(i);//ȡÿ��ѭ����ֵ ���ַ�����
		oddNum=oddNum+(int)c-48;//���ÿ��ѭ����ֵ
		}
		 System.out.print(oddNum);
	}
}