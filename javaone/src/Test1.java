
public class Test1
{
	public static void main(String[] args)
	{
		//����ʵ������t1
		//ʹ�÷�װ����
		
		Test t1=new Test();
		t1.setName("���");
		t1.setAge(200);
		//�޸�����ֵ
		Test.cityname="�żҸ�";
		//���ֵ
		System.out.println("������"+t1.getName()+","+"���䣺"+t1.getAge()+","+"�������ƣ�"+t1.cityname);
	}

}
