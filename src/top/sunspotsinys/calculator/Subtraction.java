package top.sunspotsinys.calculator;

import java.math.BigInteger;

/**
 * @author SunspotsInys
 * @date 2019/5/16
 */
public class Subtraction {

    public static String Res(String sub1, String sub2) {
        BigInteger int1 = new BigInteger(sub1);
        BigInteger int2 = new BigInteger(sub2);
        BigInteger res = int1.subtract(int2);
        return res.toString();

    }

}
