package 基本HashMap用法;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//输入5个学生信息并使用HashMap存储，然后输出
public class text {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		Map<String,String> students = new LinkedHashMap<>();
		for(int i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"个学员的学号");
			String stuNo =scn.next();
			//学号不能重复
			while(students.containsKey(stuNo)) {
				System.out.println("请重新输入第"+(i+1)+"个学员的学号");
				stuNo=scn.next();
				
			}
			System.out.println("请输入第"+(i+1)+"个学员的姓名");
			String stuName=scn.next();
			students.put(stuNo, stuName);
	}
		//输出信息
		for(String no :students.keySet()) {
			System.out.println("学号："+no+",姓名："+students.get(no));
		}
		scn.close();
		
		}
}
