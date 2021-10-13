package HomeWork4;

import org.w3c.dom.ls.LSOutput;

import java.util.EmptyStackException;

public class Phonebook {
    public String[][] arrayPhonebook;

    Phonebook(String[][] arrayPhonebook){
        this.arrayPhonebook = arrayPhonebook;
    }

    public void add(String surname, String phoneNumber){
       String [][] arrayPhonebookNew = new String[arrayPhonebook.length+1][2];
        for (int i = 0; i < arrayPhonebook.length; i++) {
            arrayPhonebookNew[i][0] = arrayPhonebook[i][0];
            arrayPhonebookNew[i][1] = arrayPhonebook[i][1];
        }
       arrayPhonebookNew[(arrayPhonebookNew.length-1)][0] = surname;
       arrayPhonebookNew[(arrayPhonebookNew.length-1)][1]= phoneNumber;
       System.out.println("Контакт "+surname+" добавлен!");
       arrayPhonebook = arrayPhonebookNew;
    }

    public void get(String surname){
        int found = 0;
        System.out.println("Поиск контакта "+surname);

        for (int i = 0; i < arrayPhonebook.length; i++) {
            if(arrayPhonebook[i][0].toString().equals(surname)){
                System.out.println("Контакт "+surname+" : "+arrayPhonebook[i][1]);
                found = found+1;
            }
        }
        if (found == 0){
            System.out.println("Контакт "+surname+" не найден.");
        }
    }



}