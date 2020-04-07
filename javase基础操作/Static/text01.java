package Static;

public class text01 {

	public  text01() {
		System.out.println("text01类的缺省构造器执行");
	}
	//实例代码块 在构造方法之前执行，构造方法执行一次，实例代码块对应执行一次
	{
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	{
		System.out.println(3);
	}
	public static void main(String[] args) {
       System.out.println("main begin");
       new text01 ();
       new text01 ();
	}

}


