import javax.swing.JOptionPane;

/**
 * Clase de estructuras de control.
 *
 * @author Jhoan Munoz
 *Descargado por Johan Córdoba 
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