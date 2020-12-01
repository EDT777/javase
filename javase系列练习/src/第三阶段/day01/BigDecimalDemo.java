package 第三阶段.day01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("10.5");
        BigDecimal b2 = new BigDecimal("2.5");
        System.out.println(b.add(b2));
        System.out.println(b.subtract(b2));
        System.out.println(b.multiply(b2).setScale(2, RoundingMode.HALF_UP));
        System.out.println(b.divide(b2,2,RoundingMode.HALF_UP));

    }
}
