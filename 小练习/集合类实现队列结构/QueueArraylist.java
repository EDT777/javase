package 集合类实现队列结构;
import java.util.ArrayList;
public class QueueArraylist implements Queue {
	private ArrayList<Object> list = new ArrayList<>();

	@Override
	public Object pop() {
		if(list.size()>0) {
			//移除第一个元素，保持最先添加的元素最先被移除
			return list.remove(0);
		}else
		return null;
	}

	@Override
	public void push(Object t) {
		list.add(t);
		//天假到最后
	}


	}
	


