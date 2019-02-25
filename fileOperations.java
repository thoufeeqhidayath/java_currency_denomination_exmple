import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class fileOperations extends Mode {
	Mode mode=new Mode();
	String currencyFilelocation="/Users/Mubarak/Documents/workspace/CURRENCYDENOMINATION/src/currecyfile.txt";
	private ArrayList<String> checkList;
	private ArrayList<Integer> checkList2;
	
	
	public void enterIntofile() throws IOException
	{checkList = new ArrayList<>();
	checkList=readToArray();
	
		int currencyInput=readIn();
		String check=Integer.toString(currencyInput);
		if(checkList.contains(check))
		{
			printOut("already contains");
		}
		else
		{
		FileWriter intoFile=new FileWriter(currencyFilelocation,true);
		BufferedWriter writes=new BufferedWriter(intoFile);
		writes.write("\n"+currencyInput);
		writes.close();
		printOut("currency Entered");
		checkList=readToArray();
		//sortFile(checkList);
		}
		Mode.selectModeOption();
		
		
	}
	public void deleteFromFile() throws IOException
	{
		checkList = new ArrayList<>();
		checkList=readToArray();
		int currencyInput=readIn();
		String check=Integer.toString(currencyInput);
		if(checkList.contains(check))
		{int index=checkList.indexOf(check);
		   checkList.remove(index);
		   writetoFile(checkList);
		   printOut("currency deleted");
		   checkList=readToArray();
			//sortFile(checkList);
		}
		else
		{
			printOut("not contains that currency");
		}
		Mode.selectModeOption();
	}
	 public void writetoFile(ArrayList<String> arrays) throws IOException
	 {  FileWriter fw=new FileWriter(currencyFilelocation);
		BufferedWriter br=new BufferedWriter(fw);
		int sizeofArray=arrays.size();
		for(int i=0;i<sizeofArray;i++)
		{
			br.write(arrays.get(i)+"\n");
		}
		br.close();
	 }
	 
	public void readfromFile() throws FileNotFoundException
	{   
		ArrayList<String> currencyList=new ArrayList<>();
		Scanner inputScan = new Scanner(new File(currencyFilelocation));
	inputScan.useDelimiter(" |\n");
		while(inputScan.hasNext())
		{
			
	     currencyList.add(inputScan.next());
		
		}
		inputScan.close();
		
	}
	
	public ArrayList<String> readToArray() throws FileNotFoundException
	{   
		ArrayList<String> currencyList=new ArrayList<>();
		Scanner inputScan = new Scanner(new File(currencyFilelocation));
	inputScan.useDelimiter(" |\n");
		while(inputScan.hasNext())
		{
			
	     currencyList.add(inputScan.next());
		
		}
		inputScan.close();
		return currencyList;
		}
	
	
	public void ViewavailableCurrency() throws FileNotFoundException
	{
		checkList = new ArrayList<>();
		checkList=readToArray();
		printArray(checkList);
		
	}
	
	public void printArray(ArrayList<String> arrays)
	{
		int sizeofArray=arrays.size();
		for(int i=0;i<sizeofArray;i++)
	{
		printOut(arrays.get(i)+"\n");
	}
	
		
	}

}
