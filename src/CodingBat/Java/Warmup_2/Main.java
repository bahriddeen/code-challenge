package CodingBat.Java.Warmup_2;

public class Main {

    /**
     * <b>stringTimes</b>
     * <a href="https://codingbat.com/prob/p142270">Link to problem</a>
     * <p>Given a string and a non-negative int n, return a larger string that is n copies of the original string.</p>
     */
    public String stringTimes(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += str;
        }
        return s;
    }

    /**
     * <b>frontTimes</b>
     * <a href="https://codingbat.com/prob/p101475">Link to problem</a>
     * <p>Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3. Return n copies of the front.</p>
     */
    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

    /**
     * <b>countXX</b>
     * <a href="https://codingbat.com/prob/p194667">Link to problem</a>
     * <p>Count the number of "xx" in the given string.
     * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".</p>
     */
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    /**
     * <b>doubleX</b>
     * <a href="https://codingbat.com/prob/p186759">Link to problem</a>
     * <p>Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".</p>
     */
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) {
            return false;
        }
        if (i + 1 >= str.length()) {
            return false;
        }
        return str.substring(i + 1, i + 2).equals("x");
    }

    /**
     * <b>stringBits</b>
     * <a href="https://codingbat.com/prob/p165666">Link to problem</a>
     * <p>Given a string, return a new string made of every other char starting with the first,
     * so "Hello" yields "Hlo".</p>
     */
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            int end = i + 1;
            if (end > str.length()) {
                end = str.length();
            }
            result += str.substring(i, end);
        }
        return result;
    }

    /**
     * <b>stringSplosion</b>
     * <a href="https://codingbat.com/prob/p117334">Link to problem</a>
     * <p>Given a non-empty string like "Code" return a string like "CCoCodCode".</p>
     */
    public String stringSplosion(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s += str.substring(0, i);
        }
        return s + str;
    }

    /**
     * <b>last2</b>
     * <a href="https://codingbat.com/prob/p178318">Link to problem</a>
     * <p>Given a string, return the count of the number of times that a substring length 2 appears in the string
     * and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).</p>
     */
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String e = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(e)) {
                count++;
            }
        }
        return count;
    }

    /**
     * <b>arrayCount9</b>
     * <a href="https://codingbat.com/prob/p184031">Link to problem</a>
     * <p>Given an array of ints, return the number of 9's in the array.</p>
     */
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 9) {
                count++;
            }
        }
        return count;
    }

    /**
     * <b>arrayFront9</b>
     * <a href="https://codingbat.com/prob/p186031">Link to problem</a>
     * <p>Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.</p>
     */
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) {
            end = 4;
        }
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    /**
     * <b>array123</b>
     * <a href="https://codingbat.com/prob/p136041">Link to problem</a>
     * <p>Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.</p>
     */
    public boolean array123(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * <b>stringMatch</b>
     * <a href="https://codingbat.com/prob/p198640">Link to problem</a>
     * <p>Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
     * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.</p>
     */
    public int stringMatch(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < min - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }
        return count;
    }

    /**
     * <b>stringX</b>
     * <a href="https://codingbat.com/prob/p171260">Link to problem</a>
     * <p>Given a string, return a version where all the "x" have been removed.
     * Except an "x" at the very start or end should not be removed.</p>
     */
    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;
    }

    /**
     * <b>altPairs</b>
     * <a href="https://codingbat.com/prob/p121596">Link to problem</a>
     * <p>Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
     * so "kittens" yields "kien".</p>
     */
    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }

    /**
     * <b>stringYak</b>
     * <a href="https://codingbat.com/prob/p126212">Link to problem</a>
     * <p>Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
     * but the "a" can be any char. The "yak" strings will not overlap.</p>
     */
    public String stringYak(String a) {
        String target = a.replaceAll("yak", "");
        return target;
    }

    /**
     * <b>array667</b>
     * <a href="https://codingbat.com/prob/p110019">Link to problem</a>
     * <p>Given an array of ints, return the number of times that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.</p>
     */
    public int array667(int[] nums) {
        int count = 0;
        for (int x = 0; x < nums.length - 1; x++) {
            if (nums[x] == 6 && (nums[x + 1] == 6 || nums[x + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    /**
     * <b>noTriples</b>
     * <a href="https://codingbat.com/prob/p170221">Link to problem</a>
     * <p>Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
     * Return true if the array does not contain any triples.</p>
     */
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            if (nums[i + 1] == first && nums[i + 2] == first) {
                return false;
            }
        }
        return true;
    }
}
