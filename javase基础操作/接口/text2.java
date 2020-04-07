package 接口;

public class text2 {

	public static void main(String[] args) {
  
		EDT t = new EDT();
		car c= new car(t);
		c.testEngine();
		//换YQL
		c.e =new YQL();
		c.testEngine();

		
	}

}
