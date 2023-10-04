import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа от 1 до 10 через пробел");
        String str1 = scanner.nextLine();
        System.out.println(calc(str1));
    }

    public static String calc(String input) {
        int number1 = 0;
        int number2 = 0;
        String[] strokaIz3 = input.split(" ");
        try {
            if (strokaIz3.length != 3) {
                return "должно быть 2 числа";

            }
            number1 = Integer.parseInt(strokaIz3[0]);
            number2 = Integer.parseInt(strokaIz3[2]);

        } catch (NumberFormatException i) {
            System.out.println("Не допустимый символ \n");
        }
        if (number1 < 1 || number1 > 10 || number2 < 1 || number2 > 10) {
            return "Вводить только от 1 до 10";
        }
        String simbol = strokaIz3[1];
        int result = 0;

        if (simbol.equals("+")) {
            result = number1 + number2;
        } else if (simbol.equals("-")) {
            result = number1 - number2;
        } else if (simbol.equals("*")) {
            result = number1 * number2;
        } else if (simbol.equals("/")) {
            result = number1 / number2;
        }else return "не введен оператор";



        return Integer.toString(result);
    }
}
