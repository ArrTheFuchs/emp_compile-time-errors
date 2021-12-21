public class SearchDriver{
 //done

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

  //conduct both a linSearch and binSearch trial, and keep on doing this until binSearch becomes significant
  public static double[] linBinTrial( Integer[] dataset, Integer target){
    double[] result = new double[2]; //index 0 is lin trial result, index 1 is bin trial result
    int iterations = 0;
    double binTrialSum = 0.0;

    while( binTrialSum == 0 ){
      binTrialSum += binTrial(dataset, target);
      iterations++;
    }

    result[0] = linTrial(dataset, target) * iterations;
    result[1] = binTrialSum;

    return result;
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
    int trialNum = 10; //easily modified

    /*
    DataSet 0
    Name: mkamela
    Size: 1,000,000
    */
    Integer[] mkamela = makeArray(1_000_000);
    double[] linData0 = new double[trialNum], binData0 = new double[trialNum];

    for( int i = 0; i < trialNum; i++){
      //generate target
      Integer target = (int) (Math.random() * mkamela.length);

      //Conduct Trial
      double[] trialResult = linBinTrial(mkamela, target);

      //Linear Search
      linData0[i] = trialResult[0];

      //Binary Search
      binData0[i] = trialResult[1];
    }

    /*
    DataSet 1
    Name: srijal
    Size: 10,000,000
    */
    Integer[] srijal = makeArray(10_000_000);
    double[] linData1 = new double[trialNum], binData1 = new double[trialNum];

    for( int i = 0; i < trialNum; i++){
      //generate target
      Integer target = (int) (Math.random() * srijal.length);

      //Conduct Trial
      double[] trialResult = linBinTrial(srijal, target);

      //Linear Search
      linData1[i] = trialResult[0];

      //Binary Search
      binData1[i] = trialResult[1];
    }

    /*
    DataSet 2
    Name: afuchs
    Size: 50,000,000
    */
    Integer[] afuchs = makeArray(50_000_000);
    double[] linData2 = new double[trialNum], binData2 = new double[trialNum];

    for( int i = 0; i < trialNum; i++){
      //generate target
      Integer target = (int) (Math.random() * afuchs.length);

      //Conduct Trial
      double[] trialResult = linBinTrial(afuchs, target);

      //Linear Search
      linData2[i] = trialResult[0];

      //Binary Search
      binData2[i] = trialResult[1];
    }


    //Printing of the Results
    String sep = "-------------------------------------------";
    System.out.println();

    //mkamela results
    System.out.println("Results for mkamela (1,000,000): \n");
    System.out.println("Linear Search: \n");
    printTrials( linData0 );
    System.out.println("Binary Search: \n");
    printTrials( binData0 );
    System.out.println(sep);
    //srijal results
    System.out.println("Results for srijal (10,000,000): \n");
    System.out.println("Linear Search: \n");
    printTrials( linData1 );
    System.out.println("Binary Search: \n");
    printTrials( binData1 );
    System.out.println(sep);

    //afuchs results
    System.out.println("Results for afuchs (50,000,000): \n");
    System.out.println("Linear Search: \n");
    printTrials( linData2 );
    System.out.println("Binary Search: \n");
    printTrials( binData2 );
    System.out.println(sep);
  }
}
