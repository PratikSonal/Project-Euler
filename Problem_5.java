/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */
public class Problem_5 {

	public static void main(String[] args) {
		
		    int min = 11;
			int max = 20;
			long num = 2520;
			int i = 11;
			
			while (i <= 20) {
			    
			    for (i = min; i <= max; i++) {
					if ((num % i) != 0) {
						num = num+1;
						break;}
						
			    }
			    
			}
			
			System.out.println(num);

	}

}
