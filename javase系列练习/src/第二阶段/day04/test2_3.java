package 第二阶段.day04;

public class test2_3 {
    public static void main(String[] args) {
        User u1 = new User(1,"123456");
        u1.setEmailAdrr(u1.getUsername()+"@gameschool.com");
        User u2 =new User(2,"321456");
        u2.setEmailAdrr(u2.getUsername()+"@gameschool.com");
        User u3 = new User(3,"74185296");
        u3.setEmailAdrr(u3.getUsername()+"@gameschool.com");
        System.out.println("总用户数为:"+u2.getTotalUser());
    }
}

class User{
    private int id;
    private String username;
    private String password;
    private String emailAdrr;
    private static int totalUser;
    {
        totalUser=totalUser+1;
    }
    User(){

    }
    User(int id,String password){
        this.id=id;
        this.password=password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAdrr() {
        return emailAdrr;
    }

    public void setEmailAdrr(String emailAdrr) {
        this.emailAdrr = emailAdrr;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

}
