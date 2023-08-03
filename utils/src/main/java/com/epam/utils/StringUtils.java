public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        // Magic will happen here using Apache Commons Lang 3.10 library
        // For example:
        return org.apache.commons.lang3.StringUtils.isNumeric(str) && Double.parseDouble(str) > 0;
    }
}
