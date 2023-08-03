import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        // Magic happens here using the StringUtils class from the 'utils' module
        for (String arg : args) {
            if (!StringUtils.isPositiveNumber(arg)) {
                return false;
            }
        }
        return true;
    }
}
