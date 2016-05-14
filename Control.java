import javax.swing.JOptionPane;

public class Control
{
	public void testForArray()
	{
		//int myArray[] = new int[5];
		int myArray[] = {1, 2, 3, 4, 5};
		
		for (int number : myArray)
		{
			JOptionPane.showMessageDialog(null, number);
		}
		
		/*for (int aux = 0; aux < myArray.length; aux++)
		{
			JOptionPane.showMessageDialog(null, myArray[aux]);
		}*/
	}

	public void testFor(int value)
	{
		for (int aux = value; aux > 0; aux--)
		{
			JOptionPane.showMessageDialog(null, "Hi");
		}
	}
	
	public void testWhile(int value)
	{
		int aux = value;
		while(aux > 0)
		{
			JOptionPane.showMessageDialog(null, "Hi");
			aux--;
		}
	}
	
	public void testDoWhile(int value)
	{
		int aux = value;
		do
		{
			JOptionPane.showMessageDialog(null, "Hi");
			aux--;
		}while(aux > 0);
	}
	
	public void testSwitch(String day)
	{
		String message;
		switch(day)
		{
			case "MONDAY":
			case "TUESDAY":
			case "WEDNESDAY":
			case "THURSDAY":
			case "FRIDAY":
				message = "day of the week";
				break;
			
			default:
				message = "it's weekend";
		}
		
		JOptionPane.showMessageDialog(null, message);
	}

	public String  isUnderAge(int age)
	{
		return age >= 18 ? "it's not under age" : "it's under age";
		/*String validation;
		if (age >= 18)
		{
			validation = "it's not under age";
		}
		else
		{
			validation = "it's under age";
		}
		
		return validation;*/
	}

	public void testElseIf(int value)
	{
		if (value < 10)
		{
			JOptionPane.showMessageDialog(null, "It's less than 10");
		}
		else if (value > 100)
		{
			
			JOptionPane.showMessageDialog(null, "It's bigger than 100");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "It's bigger than 10 but less than 100");
		}
	}
}