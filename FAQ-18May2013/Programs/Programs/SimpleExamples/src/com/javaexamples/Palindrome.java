package com.javaexamples;
public class Palindrome {
    public static boolean isPalindrome(String stringToTest) {
        String workingCopy = removeJunk(stringToTest);
        String reversedCopy = reverse(workingCopy);

        return reversedCopy.equalsIgnoreCase(workingCopy);
    }

    protected static String removeJunk(String string) {
        int i, len = string.length();
        //int b = 10;
        StringBuffer dest = new StringBuffer(len);
       /*// String s = new String(a);
        System.out.println(s);
        StringBuffer a = new StringBuffer(b);
        System.out.println(a+"----------");*/
        char c;
        System.out.println(dest);
        System.out.println(len);
        for (i = (len - 1); i >= 0; i--) {
            c = string.charAt(i);
            if (Character.isLetterOrDigit(c)) {
            	System.out.println(dest);
                dest.append(c);
            }
        }

        return dest.toString();
    }

    protected static String reverse(String string) {
        StringBuffer sb = new StringBuffer(string);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String string = "Madam, I'm Adam.";

        System.out.println();
        System.out.println("Testing whether the following "
                           + "string is a palindrome:");
        System.out.println("    " + string);
        System.out.println();

        if (isPalindrome(string)) {
            System.out.println("It IS a palindrome!");
        } else {
            System.out.println("It is NOT a palindrome!");
        }
        System.out.println();
    }
}

