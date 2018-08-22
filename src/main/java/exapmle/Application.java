package exapmle;

import java.util.Collections;
import java.util.Scanner;

public class Application {
    private final int startNumber;
    private final int endNumber;

    public Application(int startNumber, int endNumber) {
        if (startNumber <= 0 || startNumber == endNumber || startNumber > endNumber) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public String getSingleLine(int arg1, long arg2) {
        String str1 = String.join("", Collections.nCopies(String.valueOf(startNumber).length() - String.valueOf(arg1).length(), " "));
        String str2 = String.join("", Collections.nCopies(String.valueOf(endNumber).length() - String.valueOf(arg2).length(), " "));
        String str3 = String.join("", Collections.nCopies(String.valueOf(startNumber).length() + String.valueOf(endNumber).length() - String.valueOf(arg1 * arg2).length(), " "));
        String result = arg1 + str1 + " * " + arg2 + str2 +  " = " + arg1 * arg2 + str3 + " ";
        return result;
    }

    public String generateMultiplicationTable () {
        StringBuilder result = new StringBuilder();
        for (int j = startNumber; j <= endNumber ; j++) {
            for (int i = startNumber; i <= j ; i++) {
                result.append(getSingleLine(i, j));
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        Application a = new Application(firstNum, secondNum);
        String result = a.generateMultiplicationTable();
        System.out.println(result);
    }
}

