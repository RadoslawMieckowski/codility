package hackerRank.easy;

public class ConvertingTime {
    public static String timeConversion(String s) {
        int toReplace = Integer.parseInt(s.substring(0, 2));
        if (s.endsWith("PM")) {
            if (toReplace == 12) {
                s = s.substring(0, s.length() - 2);
                return s;
            }
            toReplace += 12;
        } else {
            if (toReplace < 12) {
                s = s.substring(0, s.length() - 2);
                return s;
            }
            toReplace -= 12;
        }
        if (toReplace == 0) {
            s = s.replaceFirst(s.substring(0, 2), "00");
            s = s.substring(0, s.length() - 2);
            return s;
        }
        s = s.replaceFirst(s.substring(0, 2), String.valueOf(toReplace));
        s = s.substring(0, s.length() - 2);
        return s;
    }
}
