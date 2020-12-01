package 第三阶段.day02;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        UUID u =UUID.randomUUID();
        String s =u.toString();
        String code = s.substring(0,5);
        System.out.println(code);
    }
}
