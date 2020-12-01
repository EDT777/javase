package 第二阶段.day04;

public class test2_2 {
    public static void main(String[] args) {
        Student s1 = new Student("小A",1,95.4);
        Student s2 = new Student("小B",2,91.4);
        Student s3 = new Student("小C",3,25.4);
        Student s4 = new Student("小D",4,45.4);
        Student s5 = new Student("小E",5,85.4);
        Student[] ss = {s1,s2,s3,s4,s5};
        double totalScore = Student.getAvg(ss);
        System.out.println("学生们的平均成绩是:"+totalScore);
    }
}

class Student{
    private int no;
    private String name;
    private double score;

    public Student(String name,int no,  double score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    //需要使用到数组中的学生对象,所以将数组作为参数传递进来
    public static double getAvg(Student[] ss){
        double totalScore = 0.0;
        for(Student s : ss){
            totalScore += s.getScore();
        }
        return totalScore / ss.length;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

