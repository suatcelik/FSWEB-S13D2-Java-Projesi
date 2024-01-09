public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));


    }

    public static boolean isPalindrome(int number) {
        if (number<0) {
            number= -number;
        }
        int temp =number;
        int rev=0;
        while (number > 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        return temp == rev;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;


    }

}