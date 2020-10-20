package com.anthouse.common.util;

public class StringUtil {
    private StringUtil() {
    }

    /**
     * 字符串是否为空
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * 字符串是否为空，适配前端
     */
    public static boolean isEmptyWeb(String str) {
        return str == null || str.isEmpty() || str.equals("null") || str.equals("undefined");
    }

    /**
     * 字符串是不是以某个字符开始
     */
    public static boolean isFirstChar(String str, char ch) {
        return !isEmpty(str) && str.charAt(0) == ch;
    }

    /**
     * 字符串是不是以某个字符结束
     */
    public static boolean isLastChar(String str, char ch) {
        return !isEmpty(str) && str.charAt(str.length() - 1) == ch;
    }

    /**
     * 某个字符在字符串中出现了几次
     */
    public static int countChar(String str, char ch) {
        if (isEmpty(str)) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    /**
     * 某个字串在字符串中出现了几次
     */
    public static int countSubString(String str, String subStr) {
        if (isEmpty(str) || isEmpty(subStr)) {
            return 0;
        }

        if (subStr.length() == 1) {
            return countChar(str, subStr.charAt(0));
        }

        int count = 0;

        for (int i = 0; i <= str.length() - subStr.length(); ) {
            if (str.charAt(i) == subStr.charAt(0)) {
                boolean equals = true;
                for (int j = 1; j < subStr.length(); j++) {
                    if (str.charAt(i + j) != subStr.charAt(j)) {
                        equals = false;
                        break;
                    }
                }
                if (equals) {
                    count++;
                }
                i += subStr.length();
            } else {
                i++;
            }
        }

        return count;
    }


}
