package quizapplication;
import java.lang.String;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Override;
import javax.swing.*;
public class Quiz3 extends JFrame{
	private static final long serialVersionUID = 1L;
	Quiz3(int scr){
		setSize(550,550);
		setLocation(400,150);
		setUndecorated(true);
		setVisible(true);
		setLayout(null);
		getContentPane ().setBackground(Color.BLACK);
		JLabel head = new JLabel ("Thank you");
		head.setBounds(150, 100, 500, 30);
		head.setFont(new Font ("new4",Font.BOLD,40));
		head.setForeground(Color.WHITE);
		add(head);
		JLabel s = new JLabel("Your score is :\n"+scr);
		s.setBounds(100,300,500,40);
		s.setForeground(Color.LIGHT_GRAY);
		s.setFont(new Font("new4",Font.BOLD,50));
		add(s);
		JButton ex = new JButton ("Exit");
		ex.setBounds(200, 450, 120, 30);
		ex.setBackground(new Color(0,2,2));
		ex.setForeground(Color.white);
		add(ex);
		ex.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
	
	public static void main(String [] args) {
		new Quiz3(0);
	}
	

}
