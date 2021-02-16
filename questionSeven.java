
public class questionSeven {
    static  String fname;
    static int age;
    static String lname;

    static void display() {
        System.out.println("First Name is" + " " + fname);
        System.out.println("Last Name is" + " " + lname);
        System.out.println("Age is" + " " + age);
    }
    static {
        fname = "Harshit";
        lname = "Abrol";
        System.out.println("Static block is called"+" "+fname+" "+lname+" "+" "+22);
    }
    public static void main(String[] args){
        age = 22;
        fname = "Harshit";
        lname = "Abrol";
        display();

    }
}

