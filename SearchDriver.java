public class SearchDriver{
  public static int multiplier = -1;
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
    double end = 0;
    multiplier = 1;
    while( end-start < 1 ){
      BinSearch.binSearch(dataset, target);
      end = System.currentTimeMillis();
      multiplier++;
    }
    return (end-start);
  }

  //conduct a linSearch trial and return time taken
  public static double linTrial( Integer[] dataset, Integer target){
    double start = System.currentTimeMillis();
    LinSearch.linSearch(dataset, target);
    double end = System.currentTimeMillis();
    return (end-start);
  }

  //helper method for printing trials
  public static double[] printTrial( Integer[] dataset, Integer target ){
    double binTrial = binTrial(dataset, target);
    double linTrial = linTrial(dataset, target) * multiplier;
    System.out.println("\t" + binTrial + "\t" + linTrial + "\t\t" + target );

    return new double[]{linTrial, binTrial}; //0: lintrial, 1: bintrial
  }

  public static double average( double[] data ){
    double sum = 0;
    for( double val: data){
      sum += val;
    }
    return sum/data.length;
  }

  public static void main(String[] args) {
    int trialNum = 10; //10 trials for now but can be changed
    double[] linData = new double[trialNum], binData = new double[trialNum];

    //RANDOM FIRST TEST TO COUNTERACT FIRST TEST MESS UP
    Integer[] random = makeArray(100000);
    BinSearch.binSearch(random, 420);
    LinSearch.linSearch(random, 420);

    /*
    DataSet 0
    Name: mkamela
    Size: 1,000,000
    */
    System.out.println("\n1,000,000 DATA:\n");
    Integer[] mkamela = makeArray(1_000_000);

    //header
    System.out.println("Trial:\tBin:\tLin:\t\tTarget:");
    for( int i = 0; i < trialNum; i++){
      //generate target
      Integer target = (int) (Math.random() * mkamela.length);
      //conduct and print trial
      System.out.print(i);
      double result[] = printTrial(mkamela, target);
      linData[i] = result[0];
      binData[i] = result[1];
    }
    //worst case
    System.out.print("WORST");
    printTrial(mkamela, mkamela.length-1);
    //average
    System.out.print("AVG");
    System.out.println("\t" + average(binData) + "\t" + average(linData) + "\t\tN/A");

    /*
    DataSet 1
    Name: srijal
    Size: 10,000,000
    */
    System.out.println("\n10,000,000 DATA:\n");
    Integer[] srijal = makeArray(10_000_000);

    //header
    System.out.println("Trial:\tBin:\tLin:\t\tTarget:");
    for( int i = 0; i < trialNum; i++){
      //generate target
      Integer target = (int) (Math.random() * srijal.length);
      //conduct and print trial
      System.out.print(i);
      double result[] = printTrial(srijal, target);
      linData[i] = result[0];
      binData[i] = result[1];
    }
    //worst case
    System.out.print("WORST");
    printTrial(srijal, srijal.length-1);
    //average
    System.out.print("AVG");
    System.out.println("\t" + average(binData) + "\t" + average(linData) + "\t\tN/A");

    /*
    DataSet 2
    Name: afuchs
    Size: 50,000,000
    */
    System.out.println("\n50,000,000 DATA:\n");
    Integer[] afuchs = makeArray(50_000_000);
    
    //header
    System.out.println("Trial:\tBin:\tLin:\t\tTarget:");
    for( int i = 0; i < trialNum; i++){
      //generate target
      Integer target = (int) (Math.random() * afuchs.length);
      //conduct and print trial
      System.out.print(i);
      double result[] = printTrial(afuchs, target);
      linData[i] = result[0];
      binData[i] = result[1];
    }
    //worst case
    System.out.print("WORST");
    printTrial(afuchs, afuchs.length-1);
    //average
    System.out.print("AVG");
    System.out.println("\t" + average(binData) + "\t" + average(linData) + "\t\tN/A");
  }
}   
