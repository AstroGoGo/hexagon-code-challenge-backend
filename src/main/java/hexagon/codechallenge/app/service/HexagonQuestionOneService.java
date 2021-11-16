package hexagon.codechallenge.app.service;

import org.springframework.stereotype.Service;

@Service
public class HexagonQuestionOneService {
	
	//Do 'The Sieve of Eratosthenes' calculations
	public String getEratosthenesCalculation(int inputValue )
	{			

		//A little validation first.		
		if ((inputValue < 2) || (inputValue > 10000)) return "";
				
		//First, generate an array of booleans from our inputValue value.
		//The key I noticed for this whole thing was to add one-more
		//to the array than the input value so you don't confuse the crap
		//out of yourself when debugging. It also helps when doing the Sieve calculations  
		//against the manipulation of the array.
        boolean primeNumbers[] = new boolean[inputValue + 1];
        for(int i = 0; i <= inputValue ; i++)
        {
        	primeNumbers[i] = true;
        }
		
		//Second, cross out every 2nd number in the list by counting up 
		//in multiples of 2 (and then so-on-and-so-on).
        
		//Also, check if the numbers not crossed out at this point in the list are all prime numbers.
		//Because i × i is greater than the inputValue value, we need to go no further.         
        for (int i = 2; i * i <= inputValue; i++)
        {
            if(primeNumbers[i] == true)
            {
                for(int j = i * i; j <= inputValue; j += i)
                {
                	primeNumbers[j] = false;
                }
            }
        }
        
		//Create a print return with columns.
		StringBuilder _StringBuilder = new StringBuilder(100);
		for (int i = 2; i < primeNumbers.length; i++) 
		{
			if(primeNumbers[i] == true) 
			{
				_StringBuilder.append(i + " " );
			}
		}
		  
		return _StringBuilder.toString(); 
	}	
}

