package top.sunspotsinys.calculator;

import java.math.BigInteger;

/**
 * @author SunspotsInys
 * @date 2019/5/16
 */
public class Addition {

    public static String Res(String add1, String add2) {
        BigInteger int1 = new BigInteger(add1);
        BigInteger int2 = new BigInteger(add2);
        BigInteger res = int1.add(int2);
        return res.toString();
    }

}
