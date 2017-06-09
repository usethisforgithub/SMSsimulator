import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ScreenWindow extends Frame implements WindowListener, Runnable, KeyListener, MouseListener{

	//public static final Dimension SIZE = new Dimension(1100,748);
	//private Frame frame;
	//public static String TITLE = "New Window";
	private boolean isRunning,isDone;
	private Image imgBuffer;
	private ArrayList<Trajectory> listTraj = new ArrayList<Trajectory>();
	private ArrayList<Robot> listBot = new ArrayList<Robot>();
	
	
	
	private int numRows;
	private int numCol;
	private double ang;
	private int tempDir;
	private int colDir;
	
	
	public ScreenWindow(int r, int c, int d, double a){
		super();
		numRows = r;
		numCol = c;
		ang = a;
		tempDir = d;
		double tempAng = ang;
		
		
		
		//makes list of trajectories
		for(int i = 1; i <= numRows; i++){

			if(i %2 ==0){
				if(d == 1){
					tempDir = -1;
				}else{
					tempDir=1;
				}
				tempAng = ang + Math.PI;;
			}else{
				tempDir = d;
				tempAng = ang;
			}
			colDir = tempDir;
			for(int j = 1; j <= numCol; j++ ){
				
				if(j%2 == 0){
				if(tempDir == -1){
					tempDir = 1;
				}else{
					tempDir = -1;
				}
				}else{
					tempDir = colDir;
				}
				Trajectory temp = new Trajectory(new Coordinate(j*200,i*200),tempDir, 200);
				listTraj.add(temp);
				listBot.add(new Robot(tempDir,temp, tempAng));
				
				
			}
		}
		
		//makes list of robots
		
		
		this.addWindowListener(this);
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.setSize(1100,748);
		this.setTitle("SCS");
		isRunning = true;
		isDone = false;
		this.setVisible(true);
		imgBuffer = this.createImage(1100, 748);
		this.setMinimumSize(new Dimension(500,500));
		this.setResizable(false);
	}
	
	public void run(){
		while(isRunning){
			
			
			
			
			draw();
			try{
				Thread.sleep(10);
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
		}
		isDone = true;
	}
	
	
	public void draw(){
		imgBuffer = this.createImage(this.getWidth(), this.getHeight());
		Graphics2D g2 = (Graphics2D)imgBuffer.getGraphics();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//background color
		g2.setColor(Color.white);
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
				
			//g2.setColor(Color.black);
			//Font font = new Font("Callibri", Font.PLAIN, (int)((3.0/44.0)*(double)this.getWidth()));
			//g2.setFont(font);
			//g2.drawString("SCS", (int)((this.getWidth() - font.getStringBounds("SCS", g2.getFontRenderContext()).getWidth())/2), 125 + font.getSize()-75);
			
			for(int i = 0; i < listTraj.size(); i++)
			{
				listTraj.get(i).draw(g2);
			}
			for(int i = 0; i < listBot.size(); i++){
				listBot.get(i).draw(g2);
			}
			
			
			
		
		g2 = (Graphics2D)this.getGraphics();
		g2.drawImage(imgBuffer, 0, 0, this.getWidth(), this.getHeight(), 0, 0, this.getWidth(), this.getHeight(), null);
		g2.dispose();
	}
	
	
	

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		while(true){
			if(isDone){
				System.exit(0);
			}try{
				Thread.sleep(100);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		isRunning = false;
		this.dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		
		
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}