package quizapplication;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
import javax.swing.*;

public  class Quiz1 extends JFrame  implements ActionListener {

	private static final long serialVersionUID  = 1L;
	JButton start,Exit;
	Quiz1(){
		JLabel h = new JLabel("Quiz application");
		h.setBounds(150, 60, 500, 50);
		h.setFont(getFont());
		h.setFont(new Font("new",Font.BOLD,26));
		h.setForeground(new Color(255,165,0));
		
		JLabel r = new JLabel();
		r.setBounds(70, 100, 700, 300);
		r.setFont(getFont());
		r.setFont(new Font("new", Font.PLAIN,20));
		r.setForeground(new Color(170,51,106));
		r.setText(
				
				"<html>"
				 +"#  INSTRUCTIONS # <br>"
					+"1) Options will be provided"
				 +"<br>"
				 +"2) Timer will be of 10 seconds"
				 +"<br>"
				 +"3) You can select only one of the options"
				 +"<html>"
				
				);
		
		setSize(800,600);
		
		Exit = new JButton("Exit");
		Exit.setBounds(450,450,100,30);
		Exit.setBackground(new Color(255,0,0));
		Exit.setForeground(Color.WHITE);
		Exit.addActionListener(this);
		
		
		start = new JButton ("Start");
		start.setBounds (200,450,100,30);
		start.setBackground(new Color(0,0,255));
		start.setForeground(Color.WHITE);
		start.addActionListener (this);
		
		setLocation (350,100);
		setVisible(true);
		setLayout(null);
		add(h);
		add(r);
		add(start);
		add(Exit);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource () == start) {
			setVisible(false);
			new Quiz2();
		}
		else {
			setVisible(false);
		}
	}
	
	public static void main(String [] args) {
		
		new Quiz1();
	}
	
	
	

}
