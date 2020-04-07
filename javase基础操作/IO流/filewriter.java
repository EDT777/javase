package IO流;
import java.io.*;
public class filewriter {
		public static void main(String[] args) throws Exception {
			FileWriter fw = new FileWriter("fuzhu3",true);
			
			fw.write("666");
			char[] chars = {'我','爱','你'};
			fw.write(chars);
			fw.flush();
			
			fw.close();
		}
		
}
