package Driver;
import java.util.Scanner;
import java.util.*;

public class CurrencyDenomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		CurrencyDenomination denomination = new CurrencyDenomination();
		System.out.println("Enter the size of currency denominations ");
		int numDenomination = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] denominationArray = new int[numDenomination];
		int i;
		for (i=0; i<numDenomination; i++ ) {
			denominationArray[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		denomination.getPaymentApproach(denominationArray, numDenomination, amount);
		
	}
	
	public void getPaymentApproach(int denominationArray[], int size, int amount ) {
		CurrencyDenomination deno = new CurrencyDenomination();
		deno.sort(denominationArray);
        int[] noteCounter = new int[size];
      
        for (int i = 0; i < size; i++) {
            if (amount >= denominationArray[i]) {
                noteCounter[i] = amount / denominationArray[i];
                amount = amount - noteCounter[i] * denominationArray[i];
            }
        }

        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = 0; i < size; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(denominationArray[i] + " : "
                    + noteCounter[i]);
            }
        }
	}
	
	void sort(int arr[])
    {
		int temp;
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
    }

}
