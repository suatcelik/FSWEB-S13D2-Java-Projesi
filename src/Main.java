public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));


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

    public static String numberToWords(int writing) {
        String words = "";
        String[] ones = {"Sıfır", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz"};
        String[] tens = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan"};
        String[] hundreds = {"", "Yüz", "İki Yüz", "Üç Yüz", "Dört Yüz", "Beş Yüz", "Altı Yüz", "Yedi Yüz", "Sekiz Yüz", "Dokuz Yüz"};
        String[] thousands = {"", "Bin", "İki Bin", "Üç Bin", "Dört Bin", "Beş Bin", "Altı Bin", "Yedi Bin", "Sekiz Bin", "Dokuz Bin"};

        if (writing < 0) {
            words += "Eksi ";
            writing = Math.abs(writing);
        }

        int len = String.valueOf(writing).length();
        if (len == 0) {
            return "Sıfır";
        }

        if (len > 4) {
            return "Verilen sayı 4 basamaktan fazla";
        }

        for (int i = 0; i < len; i++) {
            int digit = writing % 10;
            if (i == 0) {
                words = ones[digit] + words;
            } else if (i == 1) {
                words = tens[digit] + " " + words;
            } else if (i == 2) {
                words = hundreds[digit] + " " + words;
            } else if (i == 3) {
                words = thousands[digit] + " " + words;
            }

            writing /= 10;
        }

        return words;
    }


}