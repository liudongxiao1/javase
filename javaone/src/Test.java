
public class Test
{
    //ѧ������
	private String name;
	//ѧ������
	private int age;
	//ѧ�����ڳ���
	static String cityname;
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String  getName()
	{
		return name;
	} 
	public void setAge(int age)
	{
		if(age>0&&age<=150) 
		{
			this.age=age;
		}
		else
		{
		     System.out.println("������䲻�Ϸ�");
		}
		
	}
	public int  getAge()
	{
		if(this.age>0&&this.age<=150)
		{
			return age;
		}
		else
		{
			return 0;
		}
		
	} 
	public static void main(String[] args)
	{
		
	}
}
