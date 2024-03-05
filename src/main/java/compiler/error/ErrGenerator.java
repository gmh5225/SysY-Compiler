package compiler.error;

public class ErrGenerator {
    private static String[] errInfo = new String[]{
            "",
            "Undeclared variable!", // variable is not declared but used
            "Undefined function!", // function is not declared but called
            "Duplicate variable!", // variable name is the same with another variable or function(global variable)
            "Duplicate function!", // function name is the same with another function, or a global variable
            "Unmathched assign type!", // different type in the left and right of "="
            "Unmatched operand type", // need an int operand, given another type indeed
            "Unmatched return type!", // return type is different from the funtion signature
            "Unmatched argument type!", // argument type is different from the funtion signature
            "Illegal [] operation!", // use "[]" on an int or funtion
            "Illegal () operation!", // use "()" to call function on an int or function
            "Assigning function is illegal!", // the left hand side of an "=" is a function type!
    };

    public static String buildErr(int lineNo, int errType) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error type ").append(errType).append(" at Line ").append(lineNo).append(":").append(errInfo[errType]);
        return sb.toString();
    }
}
