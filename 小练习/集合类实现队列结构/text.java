package 集合类实现队列结构;
//使用Java集合实现队列结构，和栈不同，队列是先进先出，即最先进入的元素最先出队列。
public class text {
public static void main(String[] args) {
		int len =200000;
		//随机产生100000个字符串
		String[]data = new String[len];
		for(int i =0;i<data.length;i++) {
			data[i]=String.valueOf(Math.random());
		}
		textQueueArrayList(data);
		textQueueLinkedList(data);
}

public static void textQueueArrayList(String[] data) {
	long time1 = System.currentTimeMillis();
	Queue stack = new QueueArraylist();
			for(int i =0;i<data.length;i++) {
				stack.push(data[i]);
			}
			for(int i=0;i<data.length;i++) {
				stack.pop();
			}
			long time2 =System.currentTimeMillis();
			System.out.println("使用Arraylist实现队列操作"+data.length+"个元素时间为："+(time2-time1)+"毫秒");
}

public static void textQueueLinkedList(String[] data) {
	long time1 = System.currentTimeMillis();
	Queue stack = new QueueLinkedList();
			for(int i =0;i<data.length;i++) {
				stack.push(data[i]);
			}
			for(int i=0;i<data.length;i++) {
				stack.pop();
			}
			long time2 =System.currentTimeMillis();
			System.out.println("使用Linklist实现队列操作"+data.length+"个元素时间为："+(time2-time1)+"毫秒");
}
}
