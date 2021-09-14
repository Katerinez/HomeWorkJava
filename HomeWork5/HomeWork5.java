package HomeWork5;
import java.io.*;
import java.util.ArrayList;

public class HomeWork5 {

    public static void main(String[] args) throws IOException {
        //Задание 1. Реализовать сохранение данных в csv файл;
        File file1 = new File("file.csv");
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(file1));
        //System.out.println(file1.exists() ? "File exists": "File not found");
        try{
            bWriter.write("height;width;length\n");
            bWriter.write("\n");
            bWriter.write("100;200;123\n");
            bWriter.write("300;400;500\n");
            bWriter.write("600;700;456\n");
            bWriter.write("800;900;1000\n");
            bWriter.write("1100;1200;789\n");
            System.out.println("Данные записаны.");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            bWriter.close();
        }
        System.out.println();


        //Задание 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
        ArrayList<AppData> box1 = new ArrayList<>();

        System.out.println(file1.exists() ? "File exists": "File not found");

        try (BufferedReader in = new BufferedReader(new FileReader(file1))){
            String result = null;
            String[] header = in.readLine().split(";");
            System.out.println(header[0]+" "+header[1]+" "+header[2]);
            in.readLine();
            while((result = in.readLine()) != null){
                String [] data = result.split(";");
                box1.add(new AppData(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2])));
            }
        }catch(IOException e){
            e.getMessage();
        }

        for (AppData cat: box1){
            System.out.println(cat.getHeight()+" "+cat.getWidth()+" "+cat.getLength());
        }

    }
}
