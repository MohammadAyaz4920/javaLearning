package Programs;

import java.util.Scanner;

public class SortNamesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			String temp;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of names:");
			n=sc.nextInt();
			String[] names=new String[n];
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the names:");
			for(int i=0;i<n;i++)
			{
				names[i]=sc2.nextLine();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(names[i].compareTo(names[j])<0)
					{
						temp=names[i];
						names[i]=names[j];
						names[j]=temp;
					}
				}
			}
			for(String name:names)
			{
				System.out.println(name);
			}
	}

}
