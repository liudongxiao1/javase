
public class Dog
{   //����ɫ
	String color;
	//���캯��
	public Dog(String color)
	{
		this.color=color;
		System.out.println(color+"С�̹�");
	}
	//����
	public Dog()
	{
		System.out.println("С�ǹ�");
	}
	//����һ���Ե��෽��
	public static void eat()
	{
		System.out.println("�����Թ�ͷ");
	}
	
	public static void main(String[] args)
	{
		//����ʵ������
		Dog d1 =new Dog("��ɫ");
		Dog d2 =new Dog();
	    Dog.eat();
	   
	    
	}

}
