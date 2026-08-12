public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(":");
        String message = logLine.substring(index+1).trim();
        return message;
    }

    public static String logLevel(String logLine) {
        int index1 = logLine.indexOf("[");
        int index2 = logLine.indexOf("]");
        String level = logLine.substring(index1+1,index2).toLowerCase();
        return level;
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        String reformat = message+" "+"("+level+")";
        return reformat;
    }
}
