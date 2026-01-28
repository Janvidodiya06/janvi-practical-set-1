import java.util.Scanner;

class AddOneToDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;
        int carry = 0;

        while (num > 0) {
            int digit = num % 10;
            int sum = digit + 1 + carry;

            carry = sum / 10;      
            int newDigit = sum % 10;

            result += newDigit * place;
            place *= 10;
            num /= 10;
        }

  
        if (carry > 0) {
            result += carry * place;
        }

        System.out.println("New number after adding 1 to each digit: " + result);

        sc.close();
    }
}
