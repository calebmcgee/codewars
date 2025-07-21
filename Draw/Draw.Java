public class Draw{
    public static void repeatPrint(String value, int times){
        for (int i = 0; i < times; i++){
            System.out.print(value);
        }
    }
    public static void stairs(int levels){
        String head = "  o  "; 
        String body = " /|\\ "; 
        String legs = " / \\ ";
        int start = levels;
        for (int i = levels; i > 0; i--){
            //head
            repeatPrint(" ", 5 * (i - 1));
            System.out.print(head);
            repeatPrint("*", 6);
            repeatPrint(" ", (start - i) * 5);
            System.out.println("*");
            //body
            repeatPrint(" ", 5 * (i - 1));
            System.out.print(body);
            System.out.print("*");
            repeatPrint(" ", 5);
            repeatPrint(" ", (start - i) * 5);
            System.out.println("*");
            //legs
            repeatPrint(" ", 5 * (i - 1));
            System.out.print(legs);
            System.out.print("*");
            repeatPrint(" ", 5);
            repeatPrint(" ", (start - i) * 5);
            System.out.println("*");
        }
        repeatPrint("*", (5 * (start - 1)) + 11);
    }
    public static void main(String[] args){
        stairs(5);
    }
}