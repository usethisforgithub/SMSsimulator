import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Driver {
public static void main(String[] args)
{
	
	JTextField aField = new JTextField(5);
    JTextField bField = new JTextField(5);
    JTextField cField = new JTextField(5);
    JTextField dField = new JTextField(5);
    
    JPanel myPanel = new JPanel();
    myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
    
    myPanel.add(new JLabel("Enter # of rows:"));
    myPanel.add(aField);
    
    myPanel.add(Box.createVerticalStrut(15));
    
    myPanel.add(new JLabel("Enter # of columns:"));
    myPanel.add(bField);

    myPanel.add(Box.createVerticalStrut(15));
    
    myPanel.add(new JLabel("Enter direction of first trajectory (-1, 1):"));
    myPanel.add(cField);

    myPanel.add(Box.createVerticalStrut(15));
    
    myPanel.add(new JLabel("Angle of first drone:"));
    myPanel.add(dField);
    
    int result = JOptionPane.showConfirmDialog(null, myPanel, 
             "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
    if (result == JOptionPane.OK_OPTION) {
    }
    
	int r = Integer.parseInt(aField.getText());
	int c = Integer.parseInt(bField.getText());
	int d = Integer.parseInt(cField.getText());
	double a = Double.parseDouble(dField.getText());

	ScreenWindow window = new ScreenWindow(r,c,d,a);
	new Thread(window).start();
}
}
