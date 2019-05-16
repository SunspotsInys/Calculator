package top.sunspotsinys.calculator;

import java.math.BigInteger;

/**
 * @author SunspotsInys
 * @date 2019/5/16
 */
public class Multiplication {

    public static String Res(String mul1, String mul2) {
        BigInteger int1 = new BigInteger(mul1);
        BigInteger int2 = new BigInteger(mul2);
        return int1.multiply(int2).toString();
    }

}
