package com.sydauto.util;

import com.sydauto.action.Constant;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 刘朝
 * @since 2019/9/20
 */
public class FieldHelper {

    public static String generateLuckyFieldName(String name) {

        if (name == null) {
            return Constant.DEFAULT_PREFIX + new Random().nextInt(333);
        }
        Matcher matcher = Pattern.compile("(\\w+)").matcher(name);
        StringBuilder sb = new StringBuilder("_$");
        while (matcher.find()) {
            sb.append(StringUtils.captureName(matcher.group(1)));
        }
        return sb.append(new Random().nextInt(333)).toString();
    }
}
