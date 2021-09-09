package HomeWork3;

import java.util.ArrayList;

public class HomeWork3 {

    public static void changeElements(int[] arrayWork3){
        int temp=arrayWork3[0];
        arrayWork3[0]=arrayWork3[3];
        arrayWork3[3] = temp;
    }

    public static void main(String[] args) {
        System.out.println(" Задание1 ");
        int[] arrayWork3 = new int[4];
        for (int i = 0; i <4; i++) {
            arrayWork3[i]= i;
            System.out.println("Array["+i+"] = "+arrayWork3[i]);
        }
        System.out.println();
        changeElements(arrayWork3);
        for (int i = 0; i < arrayWork3.length; i++) {
            System.out.println("Array["+i+"] = "+arrayWork3[i]);
        }

        System.out.println();
        System.out.println(" Задание2 ");
        Fruit fr1 = new Apple("a1", 1);
        Fruit fr2 = new Orange( "o1", 1.5);

        Box<Fruit> boxApple = new Box<Fruit>(fr1);
        Box<Fruit> boxOrange = new Box<Fruit>(fr2);
        Box<Fruit> boxMove = new Box<Fruit>(fr2);

        ArrayList<Box> listA = new ArrayList<>();
        ArrayList<Box> listO = new ArrayList<>();
        ArrayList<Box> listM = new ArrayList<>();

        for (int i = 0; i <4; i++) {
            listA.add(i,boxApple);
        }

        for (int i = 0; i <9; i++) {
            listO.add(i,boxOrange);
        }

        for (int i = 0; i <7; i++) {
            listM.add(i,boxOrange);
        }

        // определение веса коробки
        Double boxAppleWeight = 0.0;
        Double boxOrangeWeight = 0.0;

        for(int i = 0; i< listA.size(); i++) {
            boxAppleWeight = boxAppleWeight +listA.get(i).getWeightBox();
        }

        for(int i = 0; i< listO.size(); i++) {
            boxOrangeWeight = boxOrangeWeight +listO.get(i).getWeightBox();
        }

        System.out.println("Вес коробки с яблоками - "+boxAppleWeight+
                " ,количество яблок "+listA.size());
        System.out.println("Вес коробки с апельсинами - "+boxOrangeWeight+
                " ,количество апельсин "+listO.size());

        System.out.println();
        // сравнение коробок
        if (boxApple.compare(boxOrange)){
            System.out.println("Коробки равны");
        }else{
        System.out.println("Коробки НЕ равны");
        }

        System.out.println();
        //перемещение фруктов между коробками
        if (boxMove.compare(boxOrange)){
            System.out.println("В коробках одинаковые фрукты, => объединяем коробки");
            boxAppleWeight = 0.0;
            for(int i = 0; i<listM.size(); i++) {
                boxAppleWeight = boxAppleWeight +listM.get(i).getWeightBox();
            }
            System.out.println("Вес коробки BoxM - "+boxAppleWeight);

            boxAppleWeight = 0.0;
            for(int i = 0; i<listO.size(); i++) {
                boxAppleWeight = boxAppleWeight +listO.get(i).getWeightBox();
            }
            System.out.println("Вес коробки BoxO - "+boxAppleWeight);

            listM.addAll(listO);
            listO.clear();

            boxAppleWeight = 0.0;
            for(int i = 0; i<listM.size(); i++) {
                boxAppleWeight = boxAppleWeight +listM.get(i).getWeightBox();
            }
            System.out.println("Вес коробки BoxM стал - "+boxAppleWeight);
            System.out.println("Вес коробки BoxO стал - "+listO.size());
        }else{
            System.out.println("НЕ смешиваем Apple и Orange");
        }
    }
}
