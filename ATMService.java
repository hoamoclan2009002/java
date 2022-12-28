// This program run an ATM machine that performs basic banking service for customers
import java.util.Scanner;

public class ATMService{
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   
// Create object - An account
//   Accounts acct1 = new Accounts();
   
   

/* Set up account info
acct1.setID("a001");

System.out.print(" Enter the customer name for this account : ");
acct1.setName(input.next());
System.out.print(" Enter the start checking balance for this account: $");
acct1.setChecking(input.nextDouble());
System.out.print(" Enter the start saving balance for this accounnt :$ ");
acct1.setSavings(input.nextDouble());*/
// Create an array of objects for Accounts that holds 10 elements
  Accounts[] accts = new Accounts[10];
  



// Create to object and assign them to the first 3 elements in this array
 accts[0] = new  Accounts("c001","Andy",700,1000);
accts[1] = new Accounts(" c002","Bailey",500,600);
accts[2] = new Accounts("c003","Caroline",850,1500);

// pointer variable
 int p =3;
 int svc;
 double amt;
 boolean flag =true;
 int i;
 
// Prompt to user for account ID, user enters an ID
do{
 System.out.println(" Please enter your account ID: ");
 String id= input.next();
 i = search (accts,id,p);
 if (i== -1);
  System.out.print(" Invalid account ID .Please enter again");
  }
  while( i== -1);
 // Call a search method to see if you can find this ID
  
      do {
      // Welcome message and print the service menu
System.out.printf("Hello,%s!Welcome to ABC Bank. How can we serve you today?\n",acct[i].getName());


//wrap the following actions in a loop, controlled by a boolean value

do{

//Display service menu
System.out.println("1.Deposit to Checking.");
System.out.println("2.Deposit to Saving.");
System.out.println("3. Withdraw from Checking.");
System.out.println("4. Withdraw from Saving.");
System.out.println("5.Tranfer from Checking to Saving.");
System.out.println("6.Tranfer from Saving to Checking.");
System.out.println("7.End the service.");



// Prompt and invite user to select a service number
System.out.println("Please enter the service number(e.g,1,2,etc.):");
int svc =input.nextInt();
// Prompt and take user input of transaction amount 

System.out.print("Please enter the transaction amount :.$");
 double  amt=input.nextDouble();
 
 

// Use a Switch to perform the selected service
switch(svc){
   case 1 :do{
           
            accts[i].creditChecking(amt);break;
            }
   case 2 : do{
    accts[i].creditSavings(amt);break;
    double  amt=input.nextDouble();
            if( amt <0)
               System.out.println("Invalid transaction amount. Please enter again.");
               } while (amt <0);

    case 3:  do {
    double  amt=input.nextDouble();
            if( amt <0)
               System.out.println("Invalid transaction amount. Please enter again.");
               } while (amt <0);

       accts[i].debitChecking(amt); break;
    case 4:  accts[i].debitSavings(amt); break;
     case 5:  acct[i].debitChecking(amt);
         acct1.creditSavings(amt);break;
      case 6: acct[i].debitSavings(amt);
         acct1.creditChecking(amt);break;
      case 7: flag = false; break;
      default:System.out.println("Incorrect service selection.Please select again.");         
}

//Display the receipt

acct[i].printReceipt();


}



   
    // If not found , error message, and loop back to allow another ID entry, else move on to the welcom
public static int search(Accounts[] a, String id,int p){
         for(int i = 0; i < p; i++){
            if(a[i].getID().equals(id))
            return i;
            
          
      }
      return -1;
      }

   while(string i, setID.equals(i); i++);







  } 
   
   
 
