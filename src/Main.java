public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));


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

}