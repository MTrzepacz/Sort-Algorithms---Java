package TableSorts;

import java.util.Random;

public class TableSorts {

	public static void main(String[] args)
	{
	  int [] test = new int [10];
	  Random gen = new Random();
	  for ( int i = 0 ; i < 10 ; i++)
	  {
		  test[i] = gen.nextInt(100);
	  }
	  Table testTab = new Table(test);
	//  testTab.bubbleSort();	
      testTab.printTable();
	//  testTab.insertSort();
     // testTab.selectionSort();
      testTab.quicksort(0, testTab.tab.length-1);
	  testTab.printTable();
}
}
