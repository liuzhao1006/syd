package com.sydauto.util;


import com.sydauto.support.json.JSONObject;

import java.util.List;

/**
 * @author 刘朝
 * @since 2019/9/20
 */
public class Utils {

    public static String createCommentString(JSONObject json, List<String> filedList) {
        StringBuilder sb = new StringBuilder();
        sb.append("/** \n");
        for (int i = 0; i < filedList.size(); i++) {
            String key = filedList.get(i);
            sb.append("* ").append(key).append(" : ");
            sb.append(json.get(key).toString().replaceAll("\r", "")
                    .replaceAll("\t ", "").replaceAll("\f", ""));
            sb.append("\n");
        }
        sb.append("*/ \n");
        return sb.toString();
    }
}
