package prefixSuffix;

public class Main {
    static int find(String string){
        String prefix = "";
        int prefixCount = 0;

        for (int i = 0 ; i < string.length()/2; i++){
            prefix += string.charAt(i);
            if (string.endsWith(prefix)){
                prefixCount = prefix.length();
            }
        }   


        return prefixCount;
    }
    public static void main(String[] args){
        System.out.println(find("aaaaa"));
    }
}
