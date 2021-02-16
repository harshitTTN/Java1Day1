public class questionTen {
  static int add(int a,int b){
      return a+b;
  }
   static double add(double a, double b){
      return a + b;
  }
  static int multiply(int x,int y){
      return x*y;
  }
  static float multiply(float x,float y){
           return x*y;
  }
  static String  concatenate( String s1 ,String s2){
      String res = s1.concat(s2);
      return res;

  }
  static String concatenate(String s1,String s2,String s3){
     String res1 = s1.concat(s2).concat(s3);
      return res1;
  }

  public static void main(String[] args){
      questionTen q10 = new questionTen();
      q10.add(5,4);
      q10.add(10.01,10.30);
      q10.multiply((float) 506.12789, 101.1234567f);

  }
}

