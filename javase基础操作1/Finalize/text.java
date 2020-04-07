package Finalize;
//每个对象都有finalize方法
//不需要程序员去调用，由系统自动调用
//java对象如果没有更多引用指向它，则该java对象成为垃圾数据，等待垃圾回收器的回收
//垃圾回收器在回收这个java对象之前会自动调用该对象的finalize方法.
public class text {

	public static void main(String[] args) {

		person p = new person();
		p=null;//没有引用指向它，等待回收
		//程序员只能“建议”垃圾回收器回收垃圾
		System.gc();
	}

}

class person{
	//重写object中的finalize方法，可以用这个方法进行挽救让引用再次指向该对象
	public void finalize() throws Throwable{
		System.out.println(this+"马上要被回收啦");
	}
}
