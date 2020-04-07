package IO流;
import java.io.*; 

public class fileinputstream1  {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis =null;
		/*升级循环
		String filepath ="F:\\练习JAVA\\javase\\自学成才";
		fis = new FileInputStream(filepath);
		int temp =0
		while(temp=fis.read !=-1){
			System.out.print(temp);
		};\
		*/
try {
		//1.要读某文件，先与这个文件创建一个“输入流”
		//文件路径

	String filepath ="fuzhu";
	fis = new FileInputStream(filepath);
	//2.开始读
	int i1=fis.read();
	int i2=fis.read();
	int i3=fis.read();
	int i4=fis.read();
	int i5=fis.read();
	System.out.println(i1);//97
	System.out.println(i2);//98
	System.out.println(i3);//99
	System.out.println(i4);//100
	System.out.println(i5);//-1 读到文件末尾就会返回-1
	
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e1) {
		e1.printStackTrace();
	}finally{
		//为了保证流一定会释放，所以在finally语句块中执行
		if(fis!=null) {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	}
	
	
}

