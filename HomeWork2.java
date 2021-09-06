package HomeWork2;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    private static NumberFormatException numberFormatException;
    private static NumberFormatException exception;

    public static class MyArraySizeException extends Exception{};

    public static void main(String[] args) {

        String[][] arrayWork2 = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayWork2[i][j] = Integer.toString(random.nextInt(15));
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("array[" + i + "][" + j + "] = " + arrayWork2[i][j]);
            }
        }

        try {
            checkArraySize(arrayWork2);
            makeSum(arrayWork2);
            System.out.println("заменить значение [0][0] на:");
            arrayWork2[0][0] = scanner.next();
            makeSum(arrayWork2);

        }catch (MyArraySizeException e) {
            System.out.println("Array length is not 4");
        } catch (NumberFormatException e) {
            numberFormatException = e;
            exception = e;
            System.out.println("NumberFormatException: " + e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Unknown exception");
        }

    }

    public static void checkArraySize(String[][] arrayWork2) throws MyArraySizeException {
        if(arrayWork2.length != 4)
            throw new MyArraySizeException();
    }

    public static void makeSum (String[][] homeWork2){

        int sum=0;
        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){

                try{ sum = sum + Integer.parseInt(homeWork2[i][j]);

                } catch (NumberFormatException e){
                    e.getMessage();
                    System.out.println ("Error in element ["+i+"]["+j+"]");
                }
            }
        }
        System.out.println("sum = "+sum);
    }
}
