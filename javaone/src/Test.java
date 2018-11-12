public class Test
{
	// 学生姓名
	private String name;
	// 学生年龄
	private int age;
	// 学生所在城市
	static String cityname;

	// 封装姓名的方法
	public void setName(String name)
	{
		this.name = name;

	}

	// 得到名字的方法
	public String getName()
	{
		return name;
	}

	// 封装年龄 的方法
	public void setAge(int age)
	{
		if (age > 0 && age <= 150)
		{
			this.age = age;
		} else
		{
			System.out.println("你的年龄不合法");
		}

	}

	// 得到年龄的方法
	public int getAge()
	{
		if (this.age > 0 && this.age <= 150)
		{
			return age;
		} else
		{
			return 0;
		}

	}

	public static void main(String[] args)
	{

	}
}
