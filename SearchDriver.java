import java.util.Arrays;

public class SearchDriver{

  public static void main(String[] args) {

      Integer[] mic = arrayMaker(100); //one hundred
      Integer[] sal = arrayMaker(100000); //one hundred thousand
      Integer[] arr = arrayMaker(1000000); //one million

      //test for mic
      int trialCount = 10;
      double[] dataB = new double[trialCount];
      double[] dataL = new double[trialCount];
      
      for (int i=0; i<trialCount; i++){
      	//generate number to search
	Integer target = 1 + (int) (Math.random() * mic.length);
        
	///BINARY
	//find start time
	double startTime = System.currentTimeMillis();
	
	//conduct search
	BinSearch.binSearch(mic, target, 0, mic.length-1);
	
	//find end time
	double endTime = System.currentTimeMillis();
	
	//add the difference to data
	dataB[i] = endTime - startTime;
	
	//LINEAR
	//find start time
	startTime = System.currentTimeMillis();
	
	//conduct search
	LinSearch.linSearch(mic, target);

	//find end time
	endTime = System.currentTimeMillis();

	//find the difference in data
	dataL[i] = endTime - startTIme;
      }

      String result = "Results for mic (one hundred):\n";

      System.out.print

      //test for sal
      int trialCount = 10;




      System.out.println( Arrays.toString(mic) );
  }

  public static int[] arrayMaker(int array_size){
    Integer[] testArray = new Integer[array_size];
    for (int i = 0; i<array_size; i++){
      testArray[i]=i+1;
    }
    return testArray;
  }

  public static double[] trial( Comparable[] a, Comparable target){
    //0: Binary Result, 1: Linear Result
    double startTime, endTime;

    //BINARY
    //find start time
    startTime = System.currentTimeMillis();

    //conduct search
    BinSearch.binSearch(a, target, 0, a.length-1);

    //find end time

  } 


}
