
public class Stuone
{
	//ѧ������
	String name;
	//ѧ������
	byte age;
	//ѧ��������
	static int count;
	//ѧУ����
	static String shcoolname;
	public static void main(String[] args)
	{   
		shcoolname="�Ͼ��Ƽ�ְҵѧԺ";
		//����ʵ������
		Stuone s1=new Stuone();
		s1.name="���";
		s1.age=19;
		Stuone s2=new Stuone();
		s2.name="������";
		s2.age=19;
		
		System.out.println(s1.name+"-->"+shcoolname);
		s1.shcoolname="�Ͼ��Ƽ���ѧ";
		System.out.println(s2.name+"-->"+shcoolname);	
		
	}

}
