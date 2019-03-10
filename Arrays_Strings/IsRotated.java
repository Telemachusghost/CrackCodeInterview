/*
s2 will always be a substring of s1 + s1
*/

public class IsRotated {
    public static void main(String args[]) {
        String str1 = "waterbottle";
        String str2 = "ewaterbot";

        System.out.println(isRotated(str1, str2));
    }

    public static boolean isRotated(String str1, String str2) {
        len = str1.length();
        if (str2.length() == len && len > 0) {
            return str2.concat(str2).contains(str1);
        }
        return false;
    }
}