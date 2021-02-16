public class questionThree {
    public static void main(String[] args)
    {
        String str = "Hello Friends My name is Harshit and i am a trainee at To the New Private Lmited";
        int count = str.length() - str.replace("e","").length();
        System.out.println("Number of occurance of 'e' in "+""+" = "+count);
    }
}
