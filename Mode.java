import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mode {
  
	public static void main(String[] args) throws IOException
	{
		selectModeOption();
	}
	public static void selectModeOption() throws IOException
      {
	   printOut("Enter the option\n");
		printOut("1.currencyDenomination    2-EDIT THE DENOMINATION");
		
		int option=readIn();
		selectMode(option);
	  }
   
   
    public static void printOut(String out)
	{
		System.out.println(out);
		
	}
    
    
	public static int readIn() throws IOException
	{int out = 0;
		
	    try{
		
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
	    out=Integer.parseInt(read.readLine());
	
	       
	    
	    }
	catch(NumberFormatException e)
	{
		printOut("Enter a valid option in numbers");
	}
	return out;
    }
	
	public static void selectMode(int option) throws IOException
	{currencyDenomination currencyDenomination=new currencyDenomination();
	 editMode editMode=new editMode();
		switch(option)
		{
		case 1:currencyDenomination.readCurrency();
		       break;
		case 2:editMode.readOption();
		       break;
		default:printOut("Enter a valid Option");
		   break;
		
		}
		
	}

}
