
public class Dog
{   //狗颜色
	String color;
	//构造函数
	public Dog(String color)
	{
		this.color=color;
		System.out.println(color+"小奶狗");
	}
	//重载
	public Dog()
	{
		System.out.println("小狼狗");
	}
	//定义一个吃的类方法
	public static void eat()
	{
		System.out.println("狗都吃骨头");
	}
	
	public static void main(String[] args)
	{
		//创建实例对象
		Dog d1 =new Dog("黄色");
		Dog d2 =new Dog();
	    Dog.eat();
	   
	    
	}

}
