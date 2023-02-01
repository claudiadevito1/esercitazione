package esercizio2;

import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.List;

public class Esercizio2 {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6};
		List<Integer> l2 = getNumeriPrimi(array);
		System.out.println(l2);
		
		
	}

	public static List <Integer> getNumeriPrimi (int [] arrayOfPositiveNumbers){
		
		List <Integer> l1 = new ArrayList <>();
			
		for (int i=0; i<Array.getLength(arrayOfPositiveNumbers);i++) {
				if(arrayOfPositiveNumbers[i]>=2) {
					if(arrayOfPositiveNumbers[i] ==2 || arrayOfPositiveNumbers[i] ==3)
						l1.add(arrayOfPositiveNumbers[i]);
					if(arrayOfPositiveNumbers[i]%2 == 0 ||arrayOfPositiveNumbers[i]%3 ==0) {
						int c=5;
						double lim = Math.sqrt(arrayOfPositiveNumbers[i]);
						while (c<=lim) {
							if(arrayOfPositiveNumbers[i]%c != 0)
								c=c+2
						}
						
					}
		}
		
		return l1;
	}
}
