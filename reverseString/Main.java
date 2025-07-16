package reverseString;

public class Main {
    static String reverse(String string){
        String newString = "";
        
        for (int i = string.length()-1; i >= 0; i--){
            newString += string.charAt(i);
        }


        
        return newString;
    }
    public static void main(String[] args){
        System.out.println(reverse("hello"));
    }
}