public class QuotientAndReminder {
    public static void main(String[] args) {
        int num = 7;
        int divisor = 9;
        int quotient = 0;

        while (num >= divisor) {
            num -= divisor;
            quotient++;
        }
        System.out.println(quotient);
        System.out.println(num);

    }
}
