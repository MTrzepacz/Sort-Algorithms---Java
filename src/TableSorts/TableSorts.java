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
	  testTab.bubbleSort();
	  for( int i = 0 ; i < testTab.tab.length ; i++)
	  {
		  System.out.print(testTab.tab[i] + " ");
	  }
	
}
}
