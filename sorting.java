import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class sorting {
	public int[] sortArrayInDescending(int s[]) throws FileNotFoundException
	{
	
		int n=Array.getLength(s);
		 int i=0;
	        for ( i = 0; i < n; i++) 
	        { 
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (s[i] < s[j]) 
	                {
	               int temp = s[i];
	                    s[i] = s[j];
	                    s[j] = temp;
	                   
	                }
	            }
	        }
			return s;

	}

}
