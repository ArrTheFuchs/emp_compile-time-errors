public class SearchDriver{

  //to populate array with Integers 0 tru (size-1)
  public static Integer[] makeArray( int size ){
    Integer[] result = new Integer[size];
    for( int i = 0; i<size; i++){
      result[i] = i;
    }
    return result;
  }

  //conduct a binSearch trial and return time taken
  public static double binTrial( Integer[] dataset, Integer target){
    double start = System.currentTimeMillis();
    BinSearch.binSearch(dataset, target);
    double end = System.currentTimeMillis();
    return end-start;
  }

  //conduct a linSearch trial and return time taken
  public static double linTrial( Integer[] dataset, Integer target){
    double start = System.currentTimeMillis();
    LinSearch.linSearch(dataset, target);
    double end = System.currentTimeMillis();
    return end-start;
  }

  //helper method for printing trials
  public static void printTrials( double[] results ){
    //header
    System.out.println("Trial:  Time(ms):");
    //find average and print results
    double avg = 0;
    for( int i = 0; i < results.length; i++){
      System.out.println(i + ":\t" + results[i]);
      avg += results[i];
    }

    //print average
    avg /= results.length;
    System.out.println("AVG:\t" + avg + "\n");
  }

  public static void main(String[] args) {
    int trialNum = 10; //so we can change if we want
    /*
    DataSet 0
    Name: mkamela
    Size: 1,000,000
    */


    //TO BE ADDED


    /*
    DataSet 1
    Name: srijal
    Size: 10,000,000
    */

    Integer[] srijal = makeArray(10000000);
    double[] linData1 = new double[trialNum], binData1 = new double[trialNum];

    for( int i = 0; i < trialNum; i++){
      //generate target
      Integer target = (int) (Math.random() * srijal.length);

      //Linear Search
      linData1[i] = linTrial(srijal, target);

      //Binary Search
      binData1[i] = binTrial(srijal, target);
    }

    /*
    DataSet 2
    Name: afuchs
    Size: 50,000,000
    */
    

    //TO BE ADDED

    
    //Printing of the Results
    String sep = "-------------------------------------------";
    System.out.println();

    //mkamela results

    //srijal results
    System.out.println("Results for srijal30 (10,000,000): \n");
    System.out.println("Linear Search: \n");
    printTrials( linData1 );
    System.out.println("Binary Search: \n");
    printTrials( binData1 );
    System.out.println(sep);

    //afuchs results

  } 
}