import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class OnlineTest extends JFrame implements ActionListener
 {
	
	private static final long serialVersionUID = 1L;

	JLabel label;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext, btnBookmark;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	// create jFrame with radioButton and JButton
	OnlineTest(String s) 
	{
		super(s);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) 
		{
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}

		btnNext = new JButton("Next");
		btnBookmark = new JButton("Bookmark");
		btnNext.addActionListener(this);
		btnBookmark.addActionListener(this);
		add(btnNext);
		add(btnBookmark);
		set();
		label.setBounds(30, 40, 450, 20);

		//radioButton[0].setBounds(50, 80, 200, 20);
		radioButton[0].setBounds(50, 80, 450, 20);
		radioButton[1].setBounds(50, 110, 200, 20);
		radioButton[2].setBounds(50, 140, 200, 20);
		radioButton[3].setBounds(50, 170, 200, 20);
		btnNext.setBounds(100, 240, 100, 30);
		btnBookmark.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	// handle all actions based on event
	public void actionPerformed(ActionEvent e)
	 {
		if (e.getSource() == btnNext)
		 {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 9) 
			 {
				btnNext.setEnabled(false);
				btnBookmark.setText("Result");
			}
		}
		if (e.getActionCommand().equals("Bookmark"))
		 {
			JButton bk = new JButton("Bookmark" + x);
			bk.setBounds(480, 20 + 30 * x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x] = current;
			x++;
			current++;
			set();
			if (current == 9)
				btnBookmark.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for (int i = 0, y = 1; i < x; i++, y++)
		 {
			if (e.getActionCommand().equals("Bookmark" + y)) 
			{
				if (check())
					count = count + 1;
				now = current;
				current = m[y];
				set();
				((JButton) e.getSource()).setEnabled(false);
				current = now;
			}
		}

		if (e.getActionCommand().equals("Result")) 
		{
			if (check())
				count = count + 1;
			current++;
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
	}

	// SET Questions with options
	void set()
	 {
		radioButton[4].setSelected(true);
		if (current == 0)
		 {
			label.setText("Que1: What is another name for object creation?");
			radioButton[0].setText("instantiation");
			radioButton[1].setText("insubordination");
			radioButton[2].setText("initialization");
			radioButton[3].setText("heredity");
		}
		if (current == 1)
		 {
			label.setText("Que2: How is a GUI Components (like a button) added to a JFrame?");
			radioButton[0].setText("insert(component c)");
			radioButton[1].setText("add(component c)");
			radioButton[2].setText("dra(component c)");
			radioButton[3].setText("put(component c)");
		}
		if (current == 2)
		 {
			label.setText("Que3: What is the Java software that i intended to be repreented like the components of a container");
			radioButton[0].setText("Display Manager");
			radioButton[1].setText("Component Manager");
			radioButton[2].setText("Stage Manager");
			radioButton[3].setText("Layout Manager");
		}
		if (current == 3) 
		{
			label.setText("Que4: Which interface does a class need to implement to become a listener to the ActionEvents of a button?");
			radioButton[0].setText("TextListener");
			radioButton[1].setText("Runnable");
			radioButton[2].setText("ActionListener");
			radioButton[3].setText("ImageCounter");
		}
		if (current == 4)
		 {
			label.setText("Que5: Which method does a button listener have to implement?");
			radioButton[0].setText("buttonAction");
			radioButton[1].setText("actionMethod");
			radioButton[2].setText("eventAction");
			radioButton[3].setText("actionPerformed");
		}
		if (current == 5) 
		{
			label.setText("Que6: Which is the class of swing labels?");
			radioButton[0].setText("JLabel");
			radioButton[1].setText("label");
			radioButton[2].setText("Slabel");
			radioButton[3].setText("JFrame");
		}
		if (current == 6)
		 {
			label.setText("Que7: How should a command string b compared to a string literal?");
			radioButton[0].setText("==");
			radioButton[1].setText("=");
			radioButton[2].setText("equals()");
			radioButton[3].setText("equalsIgnoreCase()");
		}
		if (current == 7)
		 {
			label.setText("Que8: From which direct base class is JTextFieldderived?");
			radioButton[0].setText("JText");
			radioButton[1].setText("JField");
			radioButton[2].setText("JTextComponents");
			radioButton[3].setText("JComponents");
		}
		if (current == 8) 
		{
			label.setText("Que9: Which method i used JTextField to read the text of one?");
			radioButton[0].setText("readText()");
			radioButton[1].setText("getText()");
			radioButton[2].setText("getString()");
			radioButton[3].setText("putText()");
		}
		if (current == 9)
		 {
			label.setText("Que10: Which method change the background color of a content area ?");
			radioButton[0].setText("setColor()");
			radioButton[1].setText("setBackgroundColor()");
			radioButton[2].setText("setBackground()");
			radioButton[3].setText("setForeground()");
		}
		label.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			radioButton[j].setBounds(50, 80 + i, 200, 20);
	}

	// declare right answers.
	boolean check() 
	{
		if (current == 0)
			return (radioButton[0].isSelected());
		if (current == 1)
			return (radioButton[1].isSelected());
		if (current == 2)
			return (radioButton[3].isSelected());
		if (current == 3)
			return (radioButton[2].isSelected());
		if (current == 4)
			return (radioButton[3].isSelected());
		if (current == 5)
			return (radioButton[0].isSelected());
		if (current == 6)
			return (radioButton[2].isSelected());
		if (current == 7)
			return (radioButton[2].isSelected());
		if (current == 8)
			return (radioButton[1].isSelected());
		if (current == 9)
			return (radioButton[2].isSelected());
		return false;
	}

	public static void main(String s[]) 
	{
		new OnlineTest("Online Test App");
	}

}
