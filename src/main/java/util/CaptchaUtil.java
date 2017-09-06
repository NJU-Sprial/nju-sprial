package util;

import java.util.Random;

/**
 * Created by Water on 2017/9/6.
 */
public class CaptchaUtil {
    private static Random random;

    private static String stringBase;

    static {
        random = new Random();
        stringBase = "1234567890qwertyuiopasdfghjklzxcbnmQWERTYUIOPASDFGHJKLZXCVBNM0987654321";
    }
    /**
     * 生成验证码
     * @param n
     * @return
     */
    public static String generator(int n) {
        StringBuffer strBf = new StringBuffer("");
        int len = stringBase.length();
        int index;
        for(int i = 0; i < n; i++) {
            index = random.nextInt(len);
            strBf.append(stringBase.charAt(index));
        }
        return strBf.toString();
    }
}
