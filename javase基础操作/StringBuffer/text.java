package StringBuffer;
//1.StringBuffer是什么？
//是一个字符串缓冲区
//2.工作原理
//预先在内存中申请一块空间，以容纳字符序列，如果预留的空间不够用，则进行自动扩容，以容纳更多序列
//3.String和StringBuffer,StringBuilder最大区别是什么？
//String是不可变得字符序列。存储字符串常量池中。
//StringBuffer底层是一个char数组，但该char数组是可变的.并且可以自动扩容
//Stringbuffer和StringBuilder的默认初始化容量是16
//5.如何优化StringBuffer和StringBuilder呢？
//最好在创建StringBuffer之前，预测StringBuffer的存储字符数量，然后再创建，采用指定初始化容量的方式
//创建StringBuffer为了减少底层数组的拷贝.提高效率.
//StringBuffer和StringBuilder的区别？
//StringBuffer是线程安全的（可以在多线程的环境下使用不会出现问题）
//StringBuilder是非线程安全的(在多线程环境下使用可能出现的问题)
public class text {
public static void main(String[] args) {
	//创建字符串缓冲区对象
	StringBuffer s = new StringBuffer();//默认16
	//可以向StringBuffer中追加字符串
	String[]ins = {"体育","音乐","睡觉","美食"};
	for(int i=0;i<ins.length;i++) {
		if(i==ins.length-1) {
			s.append(ins[i]);
		}
		else {
			s.append(ins[i]);
			s.append(",");
		}
	}
	System.out.println(s);
	
}
}
