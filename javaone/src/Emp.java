
public class Emp
{
	//Ա������
	String name;
	//Ա������
	float salary;
	void addsa()
	{
		int addsalary=500;
		salary=salary+addsalary;
		System.out.println("Ա������:"+name+","+"�ӵĹ���"+addsalary+","+"���ڵĹ���"+ salary);
	}
  public static void main(String[] args)
{
	Emp e1 =new Emp();
	e1.name="����Т";
	e1.salary=8000;
	e1.addsa();
}
}
