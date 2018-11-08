
public class Stuone
{
	//学生姓名
	String name;
	//学生年龄
	byte age;
	//学生的数量
	static int count;
	//学校名称
	static String shcoolname;
	public static void main(String[] args)
	{   
		shcoolname="南京科技职业学院";
		//创建实例对象
		Stuone s1=new Stuone();
		s1.name="余豪";
		s1.age=19;
		Stuone s2=new Stuone();
		s2.name="王安乐";
		s2.age=19;
		
		System.out.println(s1.name+"-->"+shcoolname);
		s1.shcoolname="南京科技大学";
		System.out.println(s2.name+"-->"+shcoolname);	
		
	}

}
