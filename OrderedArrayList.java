// Clyde "Thluffy" Sinclair
// APCS pd00
// Lab02 -- utilizing ArrayList, designing and implementing a wrapper class
// 2021-12-13t

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 *
 * typed for Integers
 *
 * ArrayList spec at
 * https://www2.cs.duke.edu/csed/ap/subset/doc/ap/java/util/ArrayList.html
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;


  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }


  //pass-tru functionality
  public String toString()
  {
    return _data.toString();
  }


  //pass-tru functionality
  public Integer remove( int index )
  {
    return _data.remove(index);
  }


  //pass-tru functionality
  public int size()
  {
    return _data.size();
  }


  //pass-tru functionality
  public Integer get( int index )
  {
    return _data.get(index);
  }


  //modified functionality
  //insert at appropriate location to maintain sortedness
  public boolean add( Integer newVal )
  {
    //call exactly 1 of the helper methods below...  your favorite?

    addLinear(newVal);
    //addBinary(newVal);
    return true;
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    for( int p = 0; p < _data.size(); p++ ) {
      if ( newVal.compareTo( _data.get(p) ) < 0 ) {
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
      }
    }
    _data.add( newVal ); //newVal > every item, so add to end
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
    //initialize high, low, midpt indices
    int lo = 0;
    int med = 0;
    int hi = _data.size()-1;

    while ( lo <= hi ) { //running until target is found or bounds cross

      med = (lo + hi) / 2;
      int x = _data.get(med).compareTo( newVal );

      if ( x == 0 ) {
        //equal value found, insert here
        _data.add( med, newVal );
        return;
      }
      else if ( x > 0 )
        //newVal < med, so look at lower half of data
        hi = med - 1;
      else
        //newVal > med, so look at upper half of data
        lo = med + 1;
    }
    // If you made it this far, newVal is not present.
    // So insert at lo.
    _data.add( lo, newVal );
    //Q: How do you know lo is correct insertion index?
  }


  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( franz );

    // testing binary search
    franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( franz );

    /*-----v-------move-me-down-----------------v--------
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
