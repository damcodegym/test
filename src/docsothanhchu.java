import java.util.Scanner;

public class NumberToWords {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String readNumber(int num) {
        if (num == 0) {
            return "zero";
        } else if (num < 10) {
            return ones[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else {
            String result = tens[num / 10];
            if (num % 10 != 0) {
                result += " " + ones[num % 10];
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên không âm có tối đa 3 chữ số: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
            return;
        }

        int hundreds = number / 100;
        int tensAndOnes = number % 100;

        String result = "";
        if (hundreds > 0) {
            result += ones[hundreds] + " hundred";
            if (tensAndOnes > 0) {
                result += " and ";
            }
        }
        result += readNumber(tensAndOnes);

        System.out.println("Cách đọc của số " + number + " là: " + result);
    }
}
