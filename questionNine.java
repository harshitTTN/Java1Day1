public class questionNine {
    enum Houseing {
        APARTMENT(1000),BUNGLOW(20000),CABIN(500);
        private int Price;
        public int getPrice() {
            return this.Price;
        }
        Houseing(int Price){
            this.Price = Price;
        }
    }
    public static void main(String[] args){
      System.out.println("Every house");
      for(Houseing h : Houseing.values()) {
          System.out.println(h +" "+ h.getPrice());
      }
    }
}

