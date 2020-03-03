package MD_ARBAAZ_KHAN.EPAM_Task_on_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;



public class custom_collection {

	Scanner sc = new Scanner(System.in);
	@SuppressWarnings("rawtypes")
	List list = new ArrayList();


	void add_element()
	{
		System.out.println("Enter the element you want to insert");
		String str = sc.nextLine();
		list.add(str);
	}
	

	void remove_element()
	{
		System.out.println("Enter the index of the element you want to remove");
		int r = sc.nextInt();
		list.remove(r);
	}
	

	void fetch_element()
	{
		System.out.println("Enter the element you want to fetch");
		int f = sc.nextInt();
		System.out.println(list.get(f));
	}
	
	

	void print_element()
	{
		System.out.println("The elements in the list are :");
		System.out.println();
		
		for(Object s : list)
    	{
    		System.out.println(s);
    	}
   	}
	
	
	
}
