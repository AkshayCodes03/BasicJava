package FlowControl;

public class SumOfDigit 
{
	public static void main(String args [])
	{
		int value = 1234;
		int sumOfDigits = 0;
		
		while(true)
		{
			sumOfDigits += value % 10;
			value = value/10;
			if(value < 10)
			{
				break;
			}
		}
		
		System.out.println(sumOfDigits);
	}

}
