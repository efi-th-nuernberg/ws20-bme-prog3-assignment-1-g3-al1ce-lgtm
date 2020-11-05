class Zahlenfilter {
  public static void main(String[] args) {

    for (int i = 0; i <= 200; i++){
      if (i % 5 == 0){
        System.out.println(i + " ist durch genau 5 teilbar!" );
      }else{
        if(i % 10 == 9){
          System.out.println(i + " endet tatsächlich auf 9!");
        }else{
          if ((i + i - 1)%3 == 0) {
            System.out.println(i + " und " + (i-1) + "zusammen addiert ergeben" + (i + i - 1) + " und " + (i + i - 1) + " ist durch 3 teilbar!");
        }
        }
      }
    }
  }
}
