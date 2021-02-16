import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args){
        String string = "Hello my name is harshit abrol and sun is a star";
        int count;


        string = string.toLowerCase();
        String text[] = string.split(" ");

        System.out.println("Duplicate words : ");
        for(int i = 0; i < text.length; i++) {
            count = 1;
            for(int j = i+1; j < text.length; j++) {
                if(text[i].equals(text[j])) {
                    count++;

                    text[j] = "0";
                }
            }
            if(count > 1 && text[i] != "0")
                System.out.println(text[i] + " " + count);
        }
    }
}



