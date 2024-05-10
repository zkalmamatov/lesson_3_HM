import java.util.Arrays;


import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        //ДЗ основное

        double[] myArray = new double[15];
        myArray[0] = 1.1;
        myArray[1] = 2.5;
        myArray[2] = -3.2;
        myArray[3] = -4.3;
        myArray[4] = 5.3;
        myArray[5] = 6.5;
        myArray[6] = 7.2;
        myArray[7] = 8.1;
        myArray[8] = -9.5;
        myArray[9] = -10.5;
        myArray[10] = -11.2;
        myArray[11] = -12;
        myArray[12] = -13;
        myArray[13] = -14.2;
        myArray[14] = -15;

        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        for (double number : myArray) {
            if (foundNegative) {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            } else {
                if (number < 0) {
                    foundNegative = true;
                }
            }
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Колличество чисел: " + count);
        System.out.println("Результат: " + sum / count);

        System.out.println("__________________");
        System.out.println("\n");


        // ДЗ дополнительное

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String phraseIn = scanner.nextLine();

        String regex = "[^а-яА-Яa-zA-Z+]";
        Pattern pat = Pattern.compile(regex);
        String cleanStr = phraseIn.replaceAll(regex, "");

        String lowerCase = cleanStr.toLowerCase();
        StringBuilder rev = new StringBuilder(lowerCase);
        rev.reverse();
        String lowerCaseReverse = rev.toString();

        System.out.println("Введенная фраза: " + phraseIn);
        System.out.println("Удаление символов и пробелов: " + cleanStr);
        System.out.println("Фраза в нижнем регистре: " + lowerCase);
        System.out.println("Фраза в реверсе: " + lowerCaseReverse);
        System.out.println("\n");

        if (lowerCaseReverse.equals(lowerCase)) {
            System.out.println("Введенная фраза палиндром");
        } else {
            System.out.println("Введенная фразая не является палиндромом");
        }

    }

}

