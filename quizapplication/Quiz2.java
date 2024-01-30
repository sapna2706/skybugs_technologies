package quizapplication;
import java.lang.String;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Override;
import javax.swing.*;
public class Quiz2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	
	String q[] [] = new String [10][5];
	String uans [][] = new String [10][1];
	String ans [][] = new String [10][2];
	
	JLabel qno,qs;
	JRadioButton op1,op2,op3,op4;
	ButtonGroup grp;
	JButton next ,submit;
	public static int timer = 15,score = 0,ans_no = 0,count = 0;
	
	
	Quiz2(){
		setSize(1240,700);
		setLocation(50,0);
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setLayout(null);
		
		
		qno = new JLabel();
		qno.setBounds(50,59,50,30);
		qno.setFont(new Font("new3",Font.PLAIN,24));
		add(qno);
		
		
		qs= new JLabel();
		qs.setBounds(100, 59, 1100, 30);
		qs.setFont(new Font("new3",Font.PLAIN,24));
		add(qs);
		
		
		q[0][0] = "Which is object oriented programming language?";
		q[0][1] = "Java";
		q[0][2] = "Html";
		q[0][3] = "Css";
		q[0][4] = "C";
		
		
		q[1][0] = "Who developed Java?";
		q[1][1] = "Dennis Ritche";
		q[1][2] = "James Gosling";
		q[1][3] = "Guido Van Rossom";
		q[1][4] = "Newton";
		
		q[2][0] = "Which is oops concept";
		q[2][1] = "Static";
		q[2][2] = "Inheritance";
		q[2][3] = "Variable";
		q[2][4] = "Main";
		
		q[3][0] = "Which is oops concept";
		q[3][1] = "Static";
		q[3][2] = "Inheritance";
		q[3][3] = "Variable";
		q[3][4] = "Main";
		
		q[4][0] = "Which is oops concept";
		q[4][1] = "Static";
		q[4][2] = "Inheritance";
		q[4][3] = "Variable";
		q[4][4] = "Main";
		
		q[5][0] = "Which is oops concept";
		q[5][1] = "Static";
		q[5][2] = "Inheritance";
		q[5][3] = "Variable";
		q[5][4] = "Main";
		
		q[6][0] = "Which is oops concept";
		q[6][1] = "Static";
		q[6][2] = "Inheritance";
		q[6][3] = "Variable";
		q[6][4] = "Main";
		
		q[7][0] = "Which is oops concept";
		q[7][1] = "Static";
		q[7][2] = "Inheritance";
		q[7][3] = "Variable";
		q[7][4] = "Main";
		
		q[8][0] = "Which is oops concept";
		q[8][1] = "Static";
		q[8][2] = "Inheritance";
		q[8][3] = "Variable";
		q[8][4] = "Main";
		
		q[9][0] = "Which is oops concept";
		q[9][1] = "Static";
		q[9][2] = "Inheritance";
		q[9][3] = "Variable";
		q[9][4] = "Main";
		
		ans[0][1] = "Java";
		ans[1][1] = "Dennis Ritche";
		ans[2][1] = "Inheritance";
		ans[3][1] = "Inheritance";
		ans[4][1] = "Inheritance";
		ans[5][1] = "Inheritance";
		ans[6][1] = "Inheritance";
		ans[7][1] = "Inheritance";
		ans[8][1] = "Inheritance";
		ans[9][1] = "Inheritance";
		
		op1= new JRadioButton();
		op1.setBounds(170,320,700,30);
		op1.setBackground(Color.white);
		op1.setFont(new Font("Dialog",Font.PLAIN,20));
		add(op1);
		
		op2= new JRadioButton();
		op2.setBounds(170,360,700,30);
		op2.setBackground(Color.white);
		op2.setFont(new Font("Dialog",Font.PLAIN,20));
		add(op2);
		
		op3= new JRadioButton();
		op3.setBounds(170,400,700,30);
		op3.setBackground(Color.white);
		op3.setFont(new Font("Dialog",Font.PLAIN,20));
		add(op3);
		
		op4= new JRadioButton();
		op4.setBounds(170,440,700,30);
		op4.setBackground(Color.white);
		op4.setFont(new Font("Dialog",Font.PLAIN,20));
		add(op4);
		
		grp = new ButtonGroup();
		grp.add(op1);
		grp.add(op2);
		grp.add(op3);
		grp.add(op4);
		
		next = new JButton("Next");
		next.setBounds(300,550,200,30);
		next.setBackground(new Color(22,99,54));
		next.setForeground(Color.WHITE);
		add(next);
		
		next.addActionListener(this);
		submit = new JButton("Submit");
		submit.setBounds(550, 550, 200, 30);
		submit.setBackground(new Color(255,219,0));
		submit.setForeground(Color.BLACK);
		add(submit);
		submit.addActionListener(this);
		start(count);
		
		
	}

public void actionPerformed(ActionEvent e) {
	  if(e.getSource() == next) {
		  repaint();
		  op1.setEnabled(true);
		  op2.setEnabled(true);
		  op3.setEnabled(true);
		  op4.setEnabled(true);
		  ans_no = 1;
		  if(grp.getSelection()== null) {
			  uans[count][0] = "";
		  }
		  else {
			  uans[count][0] = grp.getSelection().getActionCommand();
			  
		  }
		  
		  if(count == 8) {
			  next.setEnabled(false);
			  submit.setEnabled(true);
		  }
		  count ++;
		  start(count);
	  }else if (e.getSource() == submit) {
		  ans_no = 1;
		  if(grp.getSelection() == null) {
			  uans [count][0] = "";
			  
		  }else {
			  uans[count][0] = grp.getSelection().getActionCommand();
			  
		  }
		  for(int i = 0;i <uans.length;i++) {
			  if(uans[i][0].equals(ans[i][1])) {
				  score +=1;
			  }
			  else {
				  score +=0;
			  }
		  }
		  setVisible(false);
		  new Quiz3(score);
		  
	  }
}
  public void paint(Graphics g) {
	  super.paint(g);
	  String time = "Time left - "+timer+ "seconds";
	  g.setColor(Color.blue);
	  g.setFont(new Font ("new3",Font.BOLD,25));
	  if(timer>0) {
		  g.drawString (time,800,500);
		  
	  }
	  else {
		  g.drawString("Times up",1100,500);
	  }
	  timer --;
	  try {
		   Thread.sleep(1000);
		   repaint();
		   
		   
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  if(ans_no ==1) {
		  ans_no=0;
		  timer = 15;
		  start(count);
	  }else if (timer < 0) {
		  timer = 15;
		  op1.setEnabled(true);
		  op2.setEnabled(true);
		  op3.setEnabled(true);
		  op4.setEnabled(true);
		  
		  if(count == 8) {
			  next.setEnabled(false);
			  submit.setEnabled(true);
		  }
		  
		  if(count == 0) {
			  if(grp.getSelection() == null) {
				  uans[count] [0] ="";
				  
			  }
			  else {
				  uans[count][0] = grp.getSelection().getActionCommand();
			  }
			  for(int i = 0;i<uans.length;i++)
			  {
				  if(uans[i][0].equals(ans[i][1])) {
					  score +=1;
					  
				  }else {
					  score +=0;
				  }
			  }
			  setVisible(false);
			  new Quiz3(score);
		  }else {
			  uans [count][0] = grp.getSelection().getActionCommand();
			  
		  }
		  count ++;
		  start(count);
	  }
  }

private void start(int count) {
	qno.setText(""+(count +1)+".");
	qs.setText(q[count][0]);
	op1.setText(q[count][1]);
	op1.setActionCommand(q[count][1]);
	op2.setText(q[count][2]);
	op2.setActionCommand(q[count][2]);
	op3.setText(q[count][3]);
	op3.setActionCommand(q[count][3]);
	op4.setText(q[count][4]);
	op4.setActionCommand(q[count][4]);
	
	grp.clearSelection();
	
	
}
public static void main(String [] args) {
	new Quiz2();
}
	
}

