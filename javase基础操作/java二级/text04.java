package java二级;

import java.io.*;

public class text04 {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try { 
            File f = new File("Person.dat");
            //*********Found**********
            oos = new ObjectOutputStream(new FileOutputStream(f));//考
            oos.writeObject(new Person("小王"));
            oos.close();
            ois = new ObjectInputStream(new FileInputStream(f));
            //*********Found**********
            Person d = (Person) ois.readObject();//考
            System.out.println(d);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//*********Found**********
class Person implements Serializable {//考
    String name = null;
    public Person(String s) {
        name = s;
    }
    //*********Found**********
    public String toString() {//考
        return name;
    }
}