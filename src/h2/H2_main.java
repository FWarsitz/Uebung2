package h2;

public class H2_main {

	public static void main(String[] args) {
		int i, j, k, min, max;

		i = 5;
		j = 18;
		k = 4;
		min = 1;
		max = 1;
		
		//min
		if (i<j && i<k) {
			min = i;
		}
		else if( j<i && j<k) {
			min = j;
		}
		else {
			min = k;
		}
		
		//max
		if ( i>j && i>k)
		{
			max = i; 
		}
		else if(j >i && j>k) {
			max = j; 
		}
		else
		{
			max = k; 
		}
		
		System.out.println(min + "," + max);

	}

}
