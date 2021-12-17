import java.util.Arrays;

public class SearchDriver{

  public static void main(String[] args) {

      long[] mic = arrayMaker(1000);
      long[] arr = arrayMaker(1000000000);
      long[] sal = arrayMaker(1000000);

      System.out.println( Arrays.toString(mic) );


  }

  public static long[] arrayMaker(long array_size){
    long[] testArray = new long[array_size];
    for (long i = 0; i<array_size; i++){
      testArray[(int)i]=i+1;
    }
    return testArray;
  }

/*
  public static void DRIVE(String[] args){
    System.out.println(testArray);
  }
*/
}
