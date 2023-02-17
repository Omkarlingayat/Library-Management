package demo;
import java.util.*;

class Lib{
	
	public void book(){
		int n ;
		String books[] = new String[20];
	//	String userBook[] = new String[1];
		books[0]="CPP";
		books[1]="C";
		books[2]="Java";
		books[3]="Web-technology";
		books[4]="DSA";
		books[5]="MIII";
		books[6]="SPOS";
		books[7]="DBMS";
		books[8]="CNS";
		books[9]="TOC";
		books[10]="Computer Graphics";
		n=books.length;
		//System.out.println("n="+n);
	
//	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome!! in Library : ");
		char use;
		do {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1) Show available Books.\n2)Issue Book.\n3)Add Book.\n4)Return Books.\n5)Exit\nEnter your choice :-");
			System.out.println("--------------------------------------------------------------------------");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					// Show available books.
					for(int i=0; i<books.length; i++) {
						System.out.print(i+1);
						System.out.println(") "+books[i]);
					}
					break;
					//return false;
				}
			
				case 2:{
					// Issue books.
					/*System.out.println("How many books do you want to take ?");
					int noOfBook = sc.nextInt();
					
					for(int i=0; i<noOfBook; i++) {
						userBook[i]=sc.next();
					}*/
					System.out.println("\nEnter the name of Books Which you want to take ? ");
					String nameOfBook=sc.next();
					//System.out.println(nameOfBook);
					boolean output=false;
					for(int i=0; i<10; i++) {
						//for(int j=0; j<5; j++)
						if(nameOfBook.equals(books[i])) {
							System.out.println(nameOfBook+" book is available. You can access it.");
							output=true;
							break;
						}
					}
					if(output==false) {
						System.out.println("Sorry!!!   This book is not available.");
					}
					else if(output==true) {
						System.out.print("Write today's data (dd/mm/yyyy) :- ");
						String date=sc.next();
					}
					break;
				}
				
				case 3:{
					// Add book.
					System.out.println("\nHow many books you want to add ?");
					int number = sc.nextInt();
					for(int i=11; i<number+11; i++) {
						System.out.println("Enter the name of the book which you want to add");
						books[i] = sc.next();
					}
					break;
				}
				
				case 4:{
					// Return book.
					System.out.println("Enter the name of the book which you want to return: ");
					String returnBook=sc.next();
					System.out.print("Write today's data (dd/mm/yyyy) :- ");
					String date=sc.next();
				}
				
				case 5:{
					//Exit
					System.out.println("Thank you for visiting our Library.");
					break;
				}
				
				default:{
					System.out.println("You are entering the wrong choice.");
					break;
				}
			}	
			System.out.println("\nYou want to continue this ?\nEnter 'Y' for 'Yes' & 'N' for 'No'. ");
			use = sc.next().charAt(0); 
		}while(use=='Y' || use=='y');
	}
	
}

public class Library {
	public static void main(String[] args) {
		Lib obj = new Lib();
		obj.book();
		//obj.print();
		//System.out.println(obj.n);
	}
}
