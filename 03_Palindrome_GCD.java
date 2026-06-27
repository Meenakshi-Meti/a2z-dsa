Problem 5 : Check if a Number is Palindrome
Brute Force Approach : 
public class PalindromeBrute {

    static boolean isPalindrome(int n) {

        String str = String.valueOf(n);

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 121;

        System.out.println(isPalindrome(n));
    }
}

Better Approach :
public class PalindromeBetter {

    static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int n = 121;

        System.out.println(isPalindrome(n));
    }
}

Problem 6 : Find GCD (Greatest Common Divisor)
Brute Force Approach : 
public class GCDBrute {

    static int gcd(int a, int b) {

        int ans = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        System.out.println(gcd(a, b));
    }
}

Better Approach : 
public class GCDBetter {

    static int gcd(int a, int b) {

        int min = Math.min(a, b);

        for (int i = min; i >= 1; i--) {

            if (a % i == 0 && b % i == 0)
                return i;
        }

        return 1;
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        System.out.println(gcd(a, b));
    }
}

Optimal Approach : 
public class GCDOptimal {

    static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        System.out.println(gcd(a, b));
    }
}

