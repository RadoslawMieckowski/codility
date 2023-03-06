package leetCode.easy;

public class AddBinarySolution {
    public static void main(String[] args) {
        String x =  "11";
        String y =  "1";
        System.out.println(addBinary(x, y));
    }

        public static String addBinary(String a, String b) {    //ok, ale nie przechodzi testów dla bardzo dużych liczb
            return Integer.toBinaryString(toInt(a) + toInt(b));
        }
        public static int toInt(String number) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += (Character.getNumericValue(number.charAt(number.length() - 1 - i))  * (int) Math.pow(2, i));
                System.out.println(sum);
            }
            return sum;
        }

}
