package This;

public class text {

	int age = 10;
	public static void main(String[] args) {
	    text t = new text();
		//编译错误 System.out.println(age);
		//编译错误 System.out.println(this.age);
		System.out.println(t.age);
	}
	
	 
}
