import java.io.FileNotFoundException;
import java.io.IOException;

public class editMode extends Mode {
	
	public static void readOption() throws IOException
	{
		printOut("Enter a option 1.addcurrency 2.deleteCurrency 3.viewAvailableCurrency");
		 int option=readIn();
		 selectMode(option);
	}
	
	
	public static void selectMode(int option) throws IOException
	{
     switch(option)
     {
     case 1:addcurrency();break;
     case 2:deleteCurrency();break;
     case 3:viewAvailableCurrency();break;
     default:printOut("Invalid Option");
             readOption();
     }
	}
	
	public static void addcurrency() throws IOException
	{
		fileOperations fileoperation=new fileOperations();
		printOut("enter the currency to add");
	    fileoperation.enterIntofile();
	}
	
	public static void deleteCurrency() throws IOException
	{
	printOut("enter the currecy to delete");
	fileOperations fileoperation=new fileOperations();
	fileoperation.deleteFromFile();	
	}
	
	public static void viewAvailableCurrency() throws FileNotFoundException
	{
		fileOperations fileoperation=new fileOperations();
		fileoperation.ViewavailableCurrency();
	}

}
