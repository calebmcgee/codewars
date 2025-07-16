package countingCharacters;
public class Main {
    static int count(String string, char character){
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
        count += (string.charAt(i) == character) ? 1 : 0;
    }
        return count;
    }
    public static void main(String[] args){
        System.out.println(count("cammalm", 'm'));
    }
}