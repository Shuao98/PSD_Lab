import java.util.HashMap;

public class java_exer1_task6 {
    public static boolean checkCardNumber(String cardNumber) {

        int len = cardNumber.length();
        System.out.println(len);

        HashMap<Character, Integer> score = new HashMap<Character, Integer>();

        // Add keys and values (Country, City)
        score.put('1', 1);
        score.put('2', 2);
        score.put('3', 3);
        score.put('4', 4);
        score.put('5', 5);
        score.put('6', 6);
        score.put('7', 7);
        score.put('8', 8);
        score.put('9', 9);
        score.put('0', 0);

        char[] arr = cardNumber.toCharArray();
        char firstChar = arr[0];
        char secondChar = arr[1];
        if (firstChar == '4') {
            System.out.println("This is a Visa Card");

        } else if ((firstChar == '3') & (secondChar == '4' | secondChar == '7')) {
            System.out.println("This is American Express");
        } else if ((firstChar == '5') & (secondChar == '1' | secondChar == '2'
                | secondChar == '3' | secondChar == '4' | secondChar == '5')) {
            System.out.println("This is AMasterCard card");
        } else {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += score.get(arr[i]);
            } else {
                int n = score.get(arr[i]) * 2;
                if (n > 9) {
                    n = n - 9;
                }
                sum += n;
            }

        }
        System.out.println(sum);
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // public void calc(String cardNumber){
    // HashMap<Character, Integer> score = new HashMap<Character, Integer>();

    // // Add keys and values (Country, City)
    // score.put('1', 1);
    // score.put('2', 2);
    // score.put('3', 3);
    // score.put('4', 4);
    // score.put('5', 5);
    // score.put('6', 6);
    // score.put('7', 7);
    // score.put('8', 8);
    // score.put('9', 9);
    // score.put('0', 0);

    // char[] arr = cardNumber.toCharArray();
    // }
    public static void main(String[] args) {
        System.out.println(checkCardNumber("79927398713"));
        System.out.println(checkCardNumber("7992739871334"));
        System.out.println(checkCardNumber("4542939891534"));
    }
}
