import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class currencyDenomination extends Mode{
	public void readCurrency() throws IOException
	{
		printOut("Enter the currency in rupees");
		int rupees=readIn();
		convertCurrency(rupees);
	}
	
	public void convertCurrency(int rupees) throws FileNotFoundException
	{   int amount=rupees;
		fileOperations operator=new fileOperations();
		ArrayList<String> copyArray=new ArrayList<String>();
		int a[]=new int[100];
		copyArray=operator.readToArray();
		int size=copyArray.size();
		
		
		for(int i=0;i<size;i++)
		{
		try{
			a[i]=Integer.parseInt(copyArray.get(i));
		}catch(NumberFormatException e)
		{
				
		}}
		sorting sorter=new sorting();
	    int currencyarray[]=sorter.sortArrayInDescending(a);
		size=Array.getLength(currencyarray);
		convertToSeparateList(amount,currencyarray);
		}
		
	public void convertToSeparateList
	(int currency,int availableCurrencyarray[])
	{printOut("Denominations are:\n");
		int amount=currency;
		int size = Array.getLength(availableCurrencyarray);
		for(int i=0;i<size;i++)
		{
			try{
		 
			while(availableCurrencyarray[i]<=amount)
			{
				int count=amount/availableCurrencyarray[i];
				amount=amount%availableCurrencyarray[i];
				printOut(availableCurrencyarray[i]+"x"+count+"\n");
			}}catch(NumberFormatException e)
		{}catch(ArithmeticException e)
		{
			
		}}
				
	}
	

}
