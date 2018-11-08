
public class Emp
{
	//员工姓名
	String name;
	//员工工资
	float salary;
	void addsa()
	{
		int addsalary=500;
		salary=salary+addsalary;
		System.out.println("员工姓名:"+name+","+"加的工资"+addsalary+","+"现在的工资"+ salary);
	}
  public static void main(String[] args)
{
	Emp e1 =new Emp();
	e1.name="刘冬孝";
	e1.salary=8000;
	e1.addsa();
}
}
