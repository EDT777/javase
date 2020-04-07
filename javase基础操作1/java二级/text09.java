package java二级;

public class text09 extends Thread {
    public static void main(String[ ] args) throws Exception{
	
	int i=0;
    //**********found**********
	Thread t = new text09( );
    //**********found**********
	t.start();
	
	while( true){
		System.out.println("Good Morning"+ i++);
		if (i == 2 && t.isAlive()){
		   	System.out.println("Main waiting for Hello!");
                //**********found**********
		        t.join();  //等待线程t运行结束     //考
	        } 
              //**********found**********
		if (i==5) break;//考
	}
	 
    }
    //**********found**********
    public void run(){
   	int i =0;
	while( true){
		System.out.println("Hello"+ i++);
		if (i==5)  break ;
	}
    }
}