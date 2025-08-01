package sortArrayOfNumbers;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sort {
    public static String[] getFile(){
        String txt = "";
        
        try {
            File numbers = new File("numbers.txt");
            Scanner reader = new Scanner(numbers);

            while(reader.hasNextLine()){
                txt += reader.nextLine();
            }
            reader.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error; File not found");
        }
        
        return txt.split(" ");
    }
    public static int[] sortArray(String[] array){
        int[] list = new int[array.length];
        for (int i=0; i < array.length; i++){
            list[i]=Integer.parseInt(array[i]);
        }
        for (int pos = list.length - 1; pos > 0; pos--) {
            for(int j = pos;j >= 0;j--){
                if(list[j] > list[pos]){
                    int placeholder = list[pos];
                    list[pos] = list[j];
                    list[j] = placeholder;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(list));
        
        return list;
    }
    public static void main(String[] args){
        sortArray(getFile());
    }

}
