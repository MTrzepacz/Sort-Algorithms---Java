package TableSorts;

public class Table {

	int [] tab;
	
	public Table(int [] table)
	{
		this.tab = table;
	}
	//set table
	public void setTable(int [] table)
	{
		this.tab = table;
	}
	//get table
	public int [] getTable()
	{
		return tab;
	}
	//print table
	public void printTable()
	{
		  for( int i = 0 ; i < this.tab.length ; i++)
		  {
			  System.out.print(this.tab[i] + " ");
		  }
		  //newline
		  System.out.print("\n");
	}
	// BubbleSort - zlozonosc O(n^2)
	public void bubbleSort()
	{
    for ( int j  = 0 ; j  < this.tab.length - 1; j++ ) 
    {
    	//flaga zmiany
    	boolean swap = false;  
			for( int i = 0 ; i < this.tab.length - 1; i++)
			{
				swap = false;
				if(this.tab[i] > this.tab[i+1])
				{
					//zamiana miejscem
			 		int tmp = this.tab[i+1];
			        this.tab[i+1] = this.tab[i];
			        this.tab[i] = tmp;
			        swap = true;
				}
			}
			// jesli nie bylo zmiany to znaczy, ze tablica jest posortowana
			if(swap = false)
				break;
    }
	}
	//Insert Sort
	public void insertSort()
	{
		for( int j = 2 ;  j < this.tab.length ; j++)
		{
			int key = this.tab[j];
			int i = j - 1;
			while ( i >= 0 && this.tab[i] > key)
			{
				this.tab[i+1] = this.tab[i];
				i = i -1;
				this.tab[i+1] = key;
			}			
		}
	}
	//Selection Sort
	public void selectionSort()
	{
	for( int i = 0 ; i <  this.tab.length - 1 ; i++)
	{
		int ind = i;
		for(int j = i + 1 ; j < this.tab.length; j++)
		{
			if(this.tab[j] < this.tab[ind])
			{
				ind = j;
			}			
		}
		int temp = this.tab[ind];
		this.tab[ind] = this.tab[i];
		this.tab[i]= temp;
	}
	}
    //quicksort
	public void quicksort(int left, int right)
	{
		int i,j,pivot;
		i = (left + right)/2;
		pivot = this.tab[i];
		this.tab[i] = this.tab[right];
		for(j = i = left ; i < right ; i++)
		{
			if(this.tab[i] < pivot)
			{
				int tmp = this.tab[i];
				this.tab[i] = this.tab[j];
				this.tab[j] = tmp;
				j++;		      
			}			
		}
		this.tab[right] = this.tab[j];
		this.tab[j] = pivot;
		if(left < j - 1)
			quicksort(left, j -1);
		if(j+1 < right)
			quicksort(j+1, right);			
	}
	
	 
	 
	 
	
	
}	
	

