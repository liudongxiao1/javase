
public class Test1
{
	public static void main(String[] args)
	{
		//创建实例对象t1
		//使用封装方法
		
		Test t1=new Test();
		t1.setName("余豪");
		t1.setAge(200);
		//修改属性值
		Test.cityname="张家港";
		//输出值
		System.out.println("姓名："+t1.getName()+","+"年龄："+t1.getAge()+","+"城市名称："+t1.cityname);
	}

}
