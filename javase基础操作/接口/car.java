package 接口;
//生产汽车
public class car {
Engine e;

car(Engine e){
	this.e=e;	
}

public void testEngine() {
	e.start();
}
}
