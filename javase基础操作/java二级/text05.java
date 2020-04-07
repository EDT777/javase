package java二级;

public class text05  extends Thread{//考
    private String sThreadName; 
    public static void main(String argv[]){
    	text05 first = new text05("first");
        //*********Found**********
        first.start();//考
        text05 second = new text05("second");
        //*********Found**********
        second.start();
    }
    
    //*********Found**********
    public text05 (String s){//考
        sThreadName = s;
    }
    
    public String getThreadName(){
        return sThreadName;
    }

    public void run(){
        for(int i = 0; i < 4; i ++){
            //*********Found**********
            System.out.println(getThreadName()+i);
            try{
                 Thread.sleep(100);
            } catch(InterruptedException e){
            	System.out.println(e.getMessage());
            }
        }
    }
}