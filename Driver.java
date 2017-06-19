import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Driver {
	public static void main(String[] args) {
		// initialize text boxes
		JTextField aField = new JTextField(5);
		JTextField bField = new JTextField(5);
		JTextField cField = new JTextField(5);
		JTextField dField = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));

		myPanel.add(new JLabel("Enter number of rows:"));
		myPanel.add(aField);

		myPanel.add(Box.createVerticalStrut(15));

		myPanel.add(new JLabel("Enter number of columns:"));
		myPanel.add(bField);

		myPanel.add(Box.createVerticalStrut(15));

		myPanel.add(new JLabel("Enter initial direction of first trajectory"));
		myPanel.add(new JLabel("-1 (clockwise) or 1 (counterclockwise):"));
		myPanel.add(cField);

		myPanel.add(Box.createVerticalStrut(15));

		myPanel.add(new JLabel("Enter initial angle of first drone"));
		myPanel.add(new JLabel("in radians between (0.00 - 6.28):"));
		myPanel.add(dField);

		int result = JOptionPane.showConfirmDialog(null, myPanel, " Start a New SCS Simulation", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			int r = Integer.parseInt(aField.getText());
			int c = Integer.parseInt(bField.getText());
			int d = Integer.parseInt(cField.getText());
			double a = Double.parseDouble(dField.getText());

			ScreenWindow window = new ScreenWindow(r, c, d, a);
			new Thread(window).start();
		}
		
	} // end Main method
} // end Driver class
