import javax.swing.JOptionPane;

/**
 * Clase de estructuras de control.
 *
 * @author Jhoan Munoz
 */
public class Control
{
	public void testForArray()
	{
		int myArray[] = {1, 2, 3, 4, 5};
		
		for (int number : myArray)
		{
			JOptionPane.showMessageDialog(null, number);
		}
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