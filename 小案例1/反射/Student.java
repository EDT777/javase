package 反射;

public class Student extends Person{
		
	private String studenNo;
	private Integer classNO;
	public Integer schoolNo=800;
	public String getStudenNo() {
		return studenNo;
	}
	public void setStudenNo(String studenNo) {
		this.studenNo = studenNo;
	}
	public Integer getClassNO() {
		return classNO;
	}
	public void setClassNO(Integer classNO) {
		this.classNO = classNO;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [studenNo=" + studenNo + ", classNO=" + classNO + ", getName()=" + getName() + ", getAge()="
				+ getAge() + "]";
	}
	public Student(String name) {
		super(name);
	}
	
	private Student(String studentNo,Integer classNo,String name) {
		
		super(name);
		this.studenNo=studentNo;
		this.classNO=classNo;
	}
	
	public void method1(String subject) {
		System.out.println("call method1 : "+subject);
	}
	
	private void method2(String subject) {
		System.out.println("call method2 : "+subject);
	}
	
	private static void method2() {
		System.out.println("call method3 : ");
	}
}
