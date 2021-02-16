public class questionSix {
    public static void main(String[] args){
        int ar[] = {5,5,8,9,9,10,10};
        int res = ar[0];
        for (int i = 1; i < ar.length; i++)
            res = res ^ ar[i];

        System.out.println(res);
    }
}
