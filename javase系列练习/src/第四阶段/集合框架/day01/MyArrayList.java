package 第四阶段.集合框架.day01;

import java.util.Arrays;

//需求：模拟ArrayList类，要求能够操作**任何类型的对象**
public class MyArrayList {
    public static void main(String[] args) throws Exception {
        AkaArrayList list = new AkaArrayList();
        list.add(22);
        list.add(11);
        list.add(33);
        list.add(25);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(23);
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2, 1111);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}

class AkaArrayList {

    private Object[] ob;

    private int size = 0;

    AkaArrayList(int a) {
        if (a < 0) {
            throw new RuntimeException("初始容量不能为负数");
        }
        ob = new Object[a];
    }

    AkaArrayList() {
        this(10);
    }

    void add(Object o) throws Exception {
        if (size == ob.length) {
            ob = Arrays.copyOf(ob, ob.length * 2);
        }
        ob[size] = o;
        size++;
    }

    Object get(int index) {
        if (index < 0 || index > ob.length - 1) {
            throw new RuntimeException("索引越界");
        }
        return ob[index];
    }

    void set(int index, Object o) {
        if (index < 0 || index > ob.length - 1) {
            throw new RuntimeException("索引越界");
        }
        ob[index] = o;
    }

    void remove(int index) {
        if (index < 0 || index > ob.length - 1) {
            throw new RuntimeException("索引越界");
        }
        for (int i = index; i < ob.length - 1; i++) {
            ob[i] = ob[i + 1];
        }
        ob[ob.length - 1] = null;
        size--;
    }

    public String toString() {
        if (ob == null) {
            return "null";
        }
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= ob.length - 1; i++) {
            sb.append(ob[i]);
            if (i != ob.length - 1) {
                sb.append(",");
            } else {
                sb.append("]");
            }
        }
        return sb.toString();
    }

}