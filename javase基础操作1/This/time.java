package This;

public class time {

	private int nian;
	private int month;
	private int ri;
	public time(int nian,int month,int ri) {
		this.nian=nian;
		this.month =month;
		this.ri=ri;
	}
	//无参数构造方法，默认1998，2,20
    public time() {
    	this(1998,02,20);
    }
    
    public void setnian(int nian) {
    	this.nian=nian;
    }
    public void setmonth(int month) {
    	this.month=month;
    }
    public void seti(int ri) {
    	this.ri=ri;
    }
    
    public int getnian() {
    	return nian;
    }
    public int getmonth() {
    	return month;
    }
    public int getri() {
    	return ri;
    }
    
    public void print() {
    	System.out.println(this.nian+"年"+this.month+"月"+this.ri+"日");
    }
    
}
