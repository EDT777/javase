package IO流;
import java.io.*;
public class copy02 {
		public static void main(String[] args) throws Exception {
			FileReader fr = new FileReader("copy02.java");
			FileWriter fw = new FileWriter("c:/copy02.java");
			char[] chars = new char[512];
			int temp =0 ;
			while((temp=fr.read())!=-1) {
				fw.write(chars,0,temp);
			}
			
			fw.flush();
			fr.close();
			fw.close();
		}
}
