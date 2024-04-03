import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên không âm (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        if (number >= 0 && number <1000) {
            String result = convertToWords(number);
            System.out.println(" bạn đã nhập số hợp lệ: " + result);
        } else {
            System.out.println("Số không hợp lệ. Vui lòng nhập lại số nguyên dương có tối đa 3 chữ số.");
        }

        scanner.close();
    }

    // Hàm chuyển số thành chữ
    public static String convertToWords(int num) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (num == 0) {
            return "zero";
        } else if (num >= 1 && num <= 9) {
            return ones[num];
        } else if (num >= 11 && num <= 19) {
            return teens[num - 10];
        } else if (num >= 10 && num <= 99) {
            return tens[num / 10] + " " + ones[num % 10];
        } else if (num >= 100 && num <= 999) {
            return ones[num / 100] + " hundred and " + convertToWords(num % 100);
        } else {
            return "out of range";
        }
    }
}
