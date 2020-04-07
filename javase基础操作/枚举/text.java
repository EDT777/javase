package 枚举;

public class text {

	public static void main(String[] args) {

			int a = 10;
			int b = 0;
			ee e1 = divide(a,b);
			if(e1==ee.SUCCESS) {
				System.out.println("成功1");
			}
			else if (e1==ee.FALL) {
				System.out.println("失败");
			}
	}

	public static ee divide(int a,int b) {
		try {
			int c =a/b;
			return ee.SUCCESS;
		}catch(Exception e) {
			return ee.FALL;
		}
	}
	//创建枚举类型
	//规范要大写
	enum ee {
		SUCCESS,FALL//有限的
	}
}
