package FlowControl;

public class SwitchCase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char c = 'd';
		
		switch(c)
		{
			case 'a':
				System.out.println("Not the correct character");
				break;
			case 'q':
				System.out.println(c);
				break;
			default:
				System.out.println("Not the correct character");
				break;
		}

	}

}
