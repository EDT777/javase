package 集合类实现队列结构;

import java.util.ArrayList;
import java.util.LinkedList;

public class QueueLinkedList implements Queue {
	private LinkedList list = new LinkedList();
	@Override
	public Object pop() {
		if(list.size()>0) {
			return list.removeLast();
		}else
		return null;
	}

	@Override
	public void push(Object t) {
		list.add(t);
	}

}
