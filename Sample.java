import java.lang.String.*;

class Sample 
{
	public static void main(String[] args) 
	{
		String a="TOPPLE";
		String b="CRIPPLE";
		String c=" ";
		for(int i=0;i<a.length();i++)
		{
			for( int j=0;j<b.length();j++)
			{
                if(a.charAt(i)==b.charAt(j))
				{
					c+=a.charAt(i);
					break;
				}
			}
		}
		System.out.println("common is: "+c);
	}
}
