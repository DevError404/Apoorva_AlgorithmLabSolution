package Driver;
import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		PayMoney pm = new PayMoney();
		System.out.println("Enter the size of transaction array");
		int numTransaction = sc.nextInt();
		System.out.println("Enter the values of array");
		int[] transactionArray = new int[numTransaction];
		int i;
		for (i=0; i<numTransaction; i++ ) {
			transactionArray[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numTarget = sc.nextInt();
		int l;
		for (l=1; l<=numTarget; l++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			pm.getTargetAchieve(transactionArray,numTransaction, target);
		}
	}
	
	public void getTargetAchieve(int arr[], int size,  int num) {
		int i;
		int comp = arr[0];
		int count = 1;
		for(i=1;i<size; i++) {
			//System.out.println(comp + " " + count + " " + num);
			if(num <= comp) {
				System.out.println("Target achieved after " + count + " transactions ");
				break;
			}
			else {
				count ++;
				comp = comp + arr[i];
			}
		}
		if(i == size) {
			System.out.println("Given target is not achieved.");
		}
			
		
	}

}
