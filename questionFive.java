public class questionFive {
    public static void main(String[] args){
        int[] arr1 = {4,6,8 ,9};
        int[] arr2 = {6,5,8,10};
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
