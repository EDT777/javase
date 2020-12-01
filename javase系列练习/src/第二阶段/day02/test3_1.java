package 第二阶段.day02;
//定义一个网络用户类（User），包含用户ID(id)、用户密码（password）、email地址（emailAdrr）三个私有化成员变量，
//
//请定义一个**含有用户ID(id)、用户密码（password）两个参数的构造器**，完成三个实例成员变量的初始化，其中**email地址（emailAdrr）是用户ID加上字符串“@gameschool.com”**。
//
//  请利用上述构造器，在main方法中实例化网络用户类对象并打印对象信息
public class test3_1 {
    public static void main(String[] args) {
        User u = new User(77, "12580");
        User u2 = new User(1, "123456");
        User u3 = new User(2, "111111");
        u.setEmail();
        u2.setEmail();
        u3.setEmail();
        System.out.println(u);
        System.out.println(u2);
        System.out.println(u3);
    }
}

class User {
    private int id;
    private String password;
    private String email;

    User() {

    }

    User(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = id + "@gameschool.com";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
