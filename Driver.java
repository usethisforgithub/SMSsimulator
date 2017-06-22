import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Driver {
public static void main(String[] args)
{
	//stuff for the dialog box
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
    
    int result = JOptionPane.showConfirmDialog(null, myPanel, 
             " Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
    if (result == JOptionPane.OK_OPTION) {
    }
    
    String temp1 = aField.getText();
    String temp2 = bField.getText();
    String temp3 = cField.getText();
    String temp4 = dField.getText();
    
    
   if(temp1 != "" && temp2 != "" && temp3 != "" && temp4 != ""){
	int r = Integer.parseInt(temp1);
	int c = Integer.parseInt(temp2);
	int d = Integer.parseInt(temp3);
	double a = Double.parseDouble(temp4);
	ScreenWindow window = new ScreenWindow(r,c,d,a);
	new Thread(window).start();
   }else{
	   System.out.println("One or more fields was left empty, so launch was aborted");
   }
   
	
}
}
