package compiler.utils;

public class Utils {
    public static boolean isDigit(String s) {
        // 判断给定字符串是否表示十进制数
        return s.matches("[0-9]+");
    }

    public static String toDecimal(String s) {
        // 将八进制或十六进制表示的s转换为十进制
        String res = "";
        if (s.startsWith("0X") || s.startsWith("0x")) {
            // hex
            int decimal = Integer.parseInt(s.substring(2), 16);
            res = decimal + "";
        } else if (!s.equals("0") && s.startsWith("0")) {
            // oct
            int decimal = Integer.parseInt(s.substring(1), 8);
            res = decimal + "";
        }
        return res;
    }
}
