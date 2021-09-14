package HomeWork4;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork4 {
    public static Random random = new Random();

    public static int randomIntRange(int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }

    public static long randomLongRange(long minL, long maxL) {
        int diff = Integer.parseInt(Long.toString(maxL - minL));
        long value = Integer.toUnsignedLong(random.nextInt(diff + 1));
        return minL + value;
    }

   //поиск уникальных слов в массиве
    public static void wordCounter(String[] arWords){
        System.out.println("Задание1. поиск уникальных слов в массиве и их количество:");
        int counterRepeat=0;
        List<String> list = new ArrayList<>(Arrays.asList(arWords));
        List<String> uniqueWords = list.stream().distinct().collect(Collectors.toList());

        String collectWords = uniqueWords.stream().collect(Collectors.joining(" | "));
        System.out.println("Уникальных слов "+uniqueWords.size()+" :");
        System.out.println(collectWords);


        for(int i=0; i<uniqueWords.size(); i++) {

            for (int j=0; j<arWords.length; j++) {
                if (uniqueWords.get(i).equals(arWords[j].toString())) {
                    counterRepeat = counterRepeat + 1;

                }
            }
            System.out.println(uniqueWords.get(i).toString()
                    +" повторяется "+counterRepeat+" раз");
            counterRepeat = 0;
        }


    }

    public static void main(String[] args) {
        //Задание 1
        String[] arrayWords = new String[15];
        String tmpString = "";

        for (int j = 0; j <15; j++) {
            for (int i = 0; i < 2; i++) {
                int valueAscii = randomIntRange(65, 67);
                char tmpChar = (char)valueAscii;
                tmpString += tmpChar;
            }
            arrayWords[j]= tmpString;
            tmpString = "";
            System.out.println(j+1+". "+arrayWords[j]);
        }

        wordCounter(arrayWords);

        //Задание 2
        System.out.println();
        System.out.println(" Задание 2. \"Телефонный Справочник\": ");
        String[][] arrayPhonebook = new String[10][2];

        for (int i = 0; i <arrayPhonebook.length; i++) {
            for (int j = 0; j < 2; j++) {
                int valueAscii = randomIntRange(65, 66);
                char tmpChar = (char)valueAscii;
                tmpString += tmpChar;
            }
            arrayPhonebook[i][0]= tmpString;
            tmpString = "";
        }

        for (int i = 0; i <arrayPhonebook.length; i++) {
              long valuePhone = randomLongRange(800000000, 899999999);
              tmpString = Long.toString(valuePhone);
              arrayPhonebook[i][1]= tmpString;
              tmpString = "";
        }

        for (int i = 0; i < arrayPhonebook.length; i++) {
            System.out.println((i+1)+". "+ arrayPhonebook[i][0]+": phone: "+ arrayPhonebook[i][1]);
        }

        Phonebook phonebook1 = new Phonebook(arrayPhonebook);
        phonebook1.get("AB");
        phonebook1.add("AB", "811111111");
        phonebook1.get("AB");

    }

}
