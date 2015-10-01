package unit2;

public class Primes {
public  int countPrimes(int n){
	
	for (int i = 2; i <= n; i++){
		
		for(k = 2; k < (i/2); k++){
		
			if(i%k == 0){
				primeTrue = false;
				break;
			}
		}
		if(primeTrue){
			numPrime++;
		}
	}

		return numPrime;
}
private int k;
private int numPrime = 0;
boolean primeTrue;
}
