package 第二阶段.day01;



public class Student{
    public static void main(String[] args) {
        Student zhang = new Student("张三",18,"男",90,135,105);
        Student li = new Student("李四",20,"女",130,100,125);

    }
    private    String name;
    private    int age;
    private   String gender;
    private   int enScore;
    private   int mathScore;
    private   int cnScore;

    public Student(String name, int age, String gender, int enScore, int mathScore, int cnScore) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.enScore = enScore;
        this.mathScore = mathScore;
        this.cnScore = cnScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEnScore() {
        return enScore;
    }

    public void setEnScore(int enScore) {
        this.enScore = enScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getCnScore() {
        return cnScore;
    }

    public void setCnScore(int cnScore) {
        this.cnScore = cnScore;
    }
}