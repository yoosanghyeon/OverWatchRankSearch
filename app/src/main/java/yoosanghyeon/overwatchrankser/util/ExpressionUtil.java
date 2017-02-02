package yoosanghyeon.overwatchrankser.util;

import java.util.regex.Pattern;

/**
 * Created by Arous on 2017-02-01.
 */

public class ExpressionUtil {

    private static ExpressionUtil util;

    private ExpressionUtil() {
    }

    public static ExpressionUtil getInstance(){
        if (util == null){
            util = new ExpressionUtil();
            return util;
        }
        return util;
    }

    public boolean isBattleTagCheck(String tag) {
        if (tag==null) return false;
        boolean b = Pattern.matches("^[\\w\\~\\-\\.]+#[0-9]*$",tag.trim());
        return b;
    }

    public String patternTextChance(String tag){
        return tag.replace("#", "-");

    }
}
