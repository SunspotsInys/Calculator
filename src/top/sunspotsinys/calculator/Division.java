package top.sunspotsinys.calculator;

import java.math.BigInteger;

/**
 * @author SunspotsInys
 * @date 2019/5/16
 */
public class Division {

    public static String Res(String div1, String div2) {
        BigInteger int1 = new BigInteger(div1);
        BigInteger int2 = new BigInteger(div2);
        return int1.divide(int2).toString();

    }
}
