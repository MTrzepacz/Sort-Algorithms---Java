package TableSorts;

public class Table {

	int [] tab;
	
	public Table(int [] table)
	{
		this.tab = table;
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
	
}
