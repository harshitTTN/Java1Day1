import java.util.Scanner;

public class questionOne {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        System.out.println("Enter the SubString to be replaced");
        String repStr = s.nextLine();
        System.out.println("Enter the String by which to be replace");
        String newStr = s.nextLine();

        String newString = str.replace(repStr,newStr);
        System.out.println(newString);

    }
}
