import javax.swing.JOptionPane;
public class GetInputFromArgument
{
	public static void main(String[] args)
	{
		String msg = "Hello " + args[0] + " " + args[3] + "!";
		JOptionPane.showMessageDialog(null, msg);
	}
}
