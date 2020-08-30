import java.util.Scanner;

public class Main { private static final String Text = null;
    public static boolean Symmetry(String Text) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word to check if it is symmetric");
        Text=input.next();
        System.out.println(Text);
        Text = Text.toLowerCase();

        String reverse = new StringBuilder(Text).reverse().toString();
       if( Text.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Symmetry(Text));
    }






}
