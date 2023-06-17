package CodingBat.Java.Warmup_1;

public class Main {

    /**
     * <b>sleepIn</b>
     * <a href="https://codingbat.com/prob/p187868">Link to problem</a>
     * <p>
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     *
     * @param weekday  true if it is a weekday, false otherwise
     * @param vacation true if we are on vacation, false otherwise
     * @return true if we can sleep in, false otherwise
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * <b>monkeyTrouble</b>
     * <a href="https://codingbat.com/prob/p181646">Link to problem</a>
     * <p>
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling.
     * Return true if we are in trouble.
     *
     * @param aSmile true if monkey A is smiling, false otherwise
     * @param bSmile true if monkey B is smiling, false otherwise
     * @return true if we are in trouble, false otherwise
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /**
     * <b>sumDouble</b>
     * <a href="https://codingbat.com/prob/p154485">Link to problem</a>
     * <p>
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     *
     * @param a first integer
     * @param b second integer
     * @return sum of the two integers, or double the sum if they are the same
     */
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    /**
     * <b>diff21</b>
     * <a href="https://codingbat.com/prob/p116624">Link to problem</a>
     * <p>
     * Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21.
     *
     * @param n input integer
     * @return absolute difference or double the absolute difference
     */
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        return (n - 21) * 2;
    }

    /**
     * <b>parrotTrouble</b>
     * <a href="https://codingbat.com/prob/p140449">Link to problem</a>
     * <p>
     * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     * Return true if we are in trouble.
     *
     * @param talking true if the parrot is talking, false otherwise
     * @param hour    current hour in the range 0..23
     * @return true if we are in trouble, false otherwise
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return (hour < 7 && talking) || (20 < hour && talking);
    }

    /**
     * <b>makes10</b>
     * <a href="https://codingbat.com/prob/p182873">Link to problem</a>
     * <p>
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
     *
     * @param a first integer
     * @param b second integer
     * @return true if one of them is 10 or if their sum is 10, false otherwise
     */
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);
    }

    /**
     * <b>nearHundred</b>
     * <a href="https://codingbat.com/prob/p184004">Link to problem</a>
     * <p>
     * Given an int n, return true if it is within 10 of 100 or 200.
     *
     * @param n input integer
     * @return true if n is within 10 of 100 or 200, false otherwise
     */
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    /**
     * <b>posNeg</b>
     * <a href="https://codingbat.com/prob/p159227">Link to problem</a>
     * <p>
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are negative.
     *
     * @param a        first integer
     * @param b        second integer
     * @param negative true if the result should be true only if both are negative, false otherwise
     * @return true if one is negative and one is positive, or if both are negative when "negative" is true
     */
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    /**
     * <b>notString</b>
     * <a href="https://codingbat.com/prob/p19">Link to problem</a>">
     * <p>
     * Given a string, return a new string where "not" has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     *
     * @param str input string
     * @return string with "not" added to the front, or the unchanged string if it already begins with "not"
     */
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }


    /**
     * <b>missingChar</b>
     * <a href="https://codingbat.com/prob/p190570">Link to problem</a>
     * <p>
     * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
     * The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
     *
     * @param str input string
     * @param n   index of the character to remove
     * @return string with the character at index n removed
     */
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }

    /**
     * <b>frontBack</b>
     * <a href="https://codingbat.com/prob/p123384">Link to problem</a>
     * <p>
     * Given a string, return a new string where the first and last chars have been exchanged.
     *
     * @param str input string
     * @return string with the first and last characters exchanged
     */
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String middleSubstring = str.substring(1, str.length() - 1);
        return lastChar + middleSubstring + firstChar;
    }

    /**
     * <b>front3</b>
     * <a href="https://codingbat.com/prob/p136351">Link to problem</a>
     * <p>
     * Given a string, return a new string which is 3 copies of the front.
     * If the string length is less than 3, the front is whatever is there.
     *
     * @param str input string
     * @return string with 3 copies of the front
     */
    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }

    /**
     * <b>backAround</b>
     * <a href="https://codingbat.com/prob/p161642">Link to problem</a>
     * <p>
     * Given a string, take the last char and return a new string with the last char added at the front and back.
     * The original string will be length 1 or more.
     *
     * @param str input string
     * @return string with the last character added at the front and back
     */
    public String backAround(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }

    /**
     * <b>or35</b>
     * <a href="https://codingbat.com/prob/p112564">Link to problem</a>
     * <p>
     * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
     *
     * @param n input number
     * @return true if n is a multiple of 3 or a multiple of 5, false otherwise
     */
    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    /**
     * <b>front22</b>
     * <a href="https://codingbat.com/prob/p183592">Link to problem</a>
     * <p>
     * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back.
     * If the string length is less than 2, use whatever chars are there.
     *
     * @param str input string
     * @return string with the first 2 characters added at both the front and back
     */
    public String front22(String str) {
        if (str.length() <= 1) {
            return str + str + str;
        } else {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars + str + firstTwoChars;
        }
    }

    /**
     * <b>startHi</b>
     * <a href="https://codingbat.com/prob/p191022">Link to problem</a>
     * Given a string, return true if the string starts with "hi" and false otherwise.
     *
     * @param str input string
     * @return true if the string starts with "hi", false otherwise
     */

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }

        String firstTwo = str.substring(0, 2);

        return firstTwo.equals("hi");
    }

    /**
     * <b>icyHot</b>
     * <a href="https://codingbat.com/prob/p192082">Link to problem</a>
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     *
     * @param temp1 the first temperature
     * @param temp2 the second temperature
     * @return true if one temperature is less than 0 and the other is greater than 100, false otherwise
     */

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0);
    }

    /**
     * <b>in1020</b>
     * <a href="https://codingbat.com/prob/p144535">Link to problem</a>
     * Given two int values, return true if either of them is in the range 10..20 inclusive.
     *
     * @param a the first int value
     * @param b the second int value
     * @return true if either of the int values is in the range 10..20 inclusive, false otherwise
     */

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    /**
     * <b>hasTeen</b>
     * <a href="https://codingbat.com/prob/p178986">Link to problem</a>
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given three int values, return true if one or more of them are teen.
     *
     * @param a the first int value
     * @param b the second int value
     * @param c the third int value
     * @return true if one or more of the int values are in the range 13..19 inclusive, false otherwise
     */

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    /**
     * <b>loneTeen</b>
     * <a href="https://codingbat.com/prob/p165701">Link to problem</a>
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given two int values, return true if one or the other is teen, but not both.
     *
     * @param a the first int value
     * @param b the second int value
     * @return true if one of the int values is in the range 13..19 inclusive and the other is not, false otherwise
     */

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    /**
     * <b>delDel</b>
     * <a href="https://codingbat.com/prob/p100905">Link to problem</a>
     * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
     * Otherwise, return the string unchanged.
     *
     * @param str the input string
     * @return modified string with "del" deleted if it appears starting at index 1, otherwise the unchanged string
     */

    public String delDel(String str) {
        if (str.length() >= 4 && str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }

    /**
     * <b>mixStart</b>
     * <a href="https://codingbat.com/prob/p151713">Link to problem</a>
     * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
     *
     * @param str the input string
     * @return true if the string begins with "mix", false otherwise
     */

    public boolean mixStart(String str) {
        if (str.length() >= 3) {
            return str.startsWith("ix", 1);
        }
        return false;
    }


    /**
     * <b>startOz</b>
     * <a href="https://codingbat.com/prob/p199720">Link to problem</a>
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if it is 'z',
     * so "ozymandias" yields "oz".
     *
     * @param str the input string
     * @return a string made of the first 2 chars, including 'o' if present and 'z' if present
     */

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    /**
     * <b>intMax</b>
     * <a href="https://codingbat.com/prob/p101887">Link to problem</a>
     * Given three int values, a, b, and c, return the largest.
     *
     * @param a the first int value
     * @param b the second int value
     * @param c the third int value
     * @return the largest of the three int values
     */

    public int intMax(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > b && c > a) {
            max = c;
        }

        return max;
    }

    /**
     * <b>close10</b>
     * <a href="https://codingbat.com/prob/p172021">Link to problem</a>
     * Given two int values, return whichever value is nearest to the value 10,
     * or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
     *
     * @param a the first int value
     * @param b the second int value
     * @return the value nearest to 10, or 0 in the event of a tie
     */

    public int close10(int a, int b) {
        int aa = Math.abs(a - 10);
        int bb = Math.abs(b - 10);
        if (aa < bb) {
            return a;
        }
        if (bb < aa) {
            return b;
        }
        return 0;
    }

    /**
     * <b>in3050</b>
     * <a href="https://codingbat.com/prob/p132134">Link to problem</a>
     * <p>
     * Given two int values, return true if they are both in the range 30..40 inclusive,
     * or they are both in the range 40..50 inclusive.
     *
     * @param a the first int value
     * @param b the second int value
     * @return true if both int values are in the range 30..40 inclusive or 40..50 inclusive, false otherwise
     */

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        }
        return (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
    }

    /**
     * <b>max1020</b>
     * <a href="https://codingbat.com/prob/p177372">Link to problem</a>
     * Given two positive int values, return the larger value that is in the range 10..20 inclusive,
     * or return 0 if neither is in that range.
     *
     * @param a the first positive int value
     * @param b the second positive int value
     * @return the larger value that is in the range 10..20 inclusive, or 0 if neither is in that range
     */

    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) {
            return a;
        }
        if (b >= 10 && b <= 20) {
            return b;
        }
        return 0;
    }
}
