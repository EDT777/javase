package 第四阶段.异常处理机制;

public class RegisterDemo {
    public static void main(String[] args) {
        String s ="aaa";
        if(s=="aaa"){
            throw new Aka("没错，aaa出现了！");
        }
    }
}

class Aka extends RuntimeException{
    Aka(){

    }
    Aka(String msg){
        super(msg);
    }
}
