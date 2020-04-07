package 反射;

public class Person {
		private String name;
		private Integer age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		public void superMethd1() {
			System.out.println("call superMethod1");
		}
		
		private void superMethod2() {
			System.out.println("call superMethod2");
		}
		
		public Person() {
			
		}
		
		public Person(String name) {
			this.name=name;
		}
}
