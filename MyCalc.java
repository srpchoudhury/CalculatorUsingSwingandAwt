import javax.swing.*;
import java.awt.*;
class MyCalc{
	JFrame f;
	 MyCalc() {
		f=new JFrame("My Calculator");
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(20,30,300,350);
		f.setResizable(false);
		Font fo=new Font("Arial",Font.BOLD,20);
		
	}
	public static void main(String[] args) {
		
		new MyCalc();
	}
}