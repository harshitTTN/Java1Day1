public class questionEight {
    public static void main(String[] args){
        String s = "Harshit Abrol";
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        str.delete(4,10);
        System.out.print(str);
    }
}
