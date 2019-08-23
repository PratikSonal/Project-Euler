/*
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */
public class Problem_6 {

	public static void main(String[] args) {
		
        int a = 0, b = 0;
        for (int i = 1; i <= 100; i++) {   
           
        	a += i;
            b += (i*i);
            
        }
		
        int x = (a*a) - b;
        
        System.out.println(x);

	}

}
