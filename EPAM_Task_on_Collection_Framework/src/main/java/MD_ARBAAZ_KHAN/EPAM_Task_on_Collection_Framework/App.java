package MD_ARBAAZ_KHAN.EPAM_Task_on_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class App 
{
	
	
    public static void main( String[] args )
    {
    	
    	Scanner sc = new Scanner(System.in);
    	custom_collection ob = new custom_collection();
    	

    	int choice;
    	do {
    		
    
    	System.out.println("Enter your choice :");
    	System.out.println(" 1.Add Element \n 2.Remove Element \n 3.Fetch Element \n 4.Print Element \n 5.exit ");
    	System.out.println();
    	choice = sc.nextInt();
    	
    	switch(choice)
    	{
    	case 1: 
    		ob.add_element();
    		break;
    	case 2:
    		ob.remove_element();
    		break;
    	case 3:
    		ob.fetch_element();
    		break;
    	case 4: 
    		ob.print_element();
    		break;
    	case 5:
    		exit(1);
    		break;
    	default :
    		System.out.println("Invalid Choice");
    	}
    	
    	}while(choice!=5);

    }

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

	
}
