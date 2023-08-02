package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         if (Integer.valueOf(str) > 0) {
             return true;
         }
         else {
             return false;
         }
    }
}
