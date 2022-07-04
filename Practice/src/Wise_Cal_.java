import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Junrunshin
 *
 */



public class Wise_Cal_ {

	private JFrame frame;
	private JTextField textBox_Result;
	private static JTextField comment_Field;
	
	
	
	Double firstNum;
	Double secondNum;
	Double result;
	String opPreformed = "";
	
	
	
	int operationPressCount = 0;
	static int commentsMade = 0;
	
	static boolean isOperationPreformed = false;
	static boolean nOprationStart = true;

	
	
	
	
	
    static String  [] greetings = new String [] {"Glad your giving me a shot",
    											"Back again huh?",
    											"Never gonna give you up!",
    											"Never gonna let you down!",
    					  						"Do you really need my help again?",
    					  						"Lets go"};
    
    
    static String  [] resultComments = new String [] {"That was way to easy!",
													"Come on you can do better than that.",
													"Times like this makes me wish I was a web browser....",
													"Are you impresses yet?",
													"So this...this is my primary function?",
													"Im gonna take a quick nap...BRB"};
    
     
    //-----------------------------------------------------------------------------------------------------------------------------------[Vars]
    
    //---------------------------------------------------------------------------------------------------------------------------------|--[Methods]---|---
    
    
    private JTextField textField_2;
    
    
	static Random rand = new Random();
	static int randomIterator = 6;
	static int r = rand.nextInt(randomIterator); 
	
    
    
	 
		public static void nMessageBox() {
			
			//JFrame greetingBox = new JFrame();
			
			
			
			
			   //Shows a random message at App start up.
			for(int i =0; i < greetings.length;) {
				
				JOptionPane.showMessageDialog(null,greetings[r += i]);
			      break;
				}	 
		}
		
		
		
			
		//----------------------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------
	/**
	 *---------------------------------------------------------- Launch the application.
	 */
	public static void main(String[] args) {
		
		
		//---------------------------------First messageBox Pop-up
						nMessageBox();	
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wise_Cal_ window = new Wise_Cal_(); 
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *---------------------------------------------------------------- Create the application.
	 */
	public Wise_Cal_() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	private void initialize() {
		
		
		
		
		frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setFont(new Font("Arial", Font.BOLD, 20));
		frame.setType(Type.POPUP);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		textBox_Result = new JTextField();
		textBox_Result.setHorizontalAlignment(SwingConstants.RIGHT);
		textBox_Result.setFont(new Font("Impact", Font.BOLD, 50));
		textBox_Result.setText("0");
		textBox_Result.setForeground(Color.WHITE);
		textBox_Result.setBackground(Color.BLACK);
		textBox_Result.setBounds(49, 149, 556, 99);
		frame.getContentPane().add(textBox_Result);
		textBox_Result.setColumns(10);
		
		
	
		
		
		
		
		
		
		
		
		
		
		JButton bnt_7 = new JButton("7");
		bnt_7.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textBox_Result.getText()+bnt_7.getText();
				textBox_Result.setText(number);
				
			}
		});
		bnt_7.setBounds(65, 260, 89, 86);
		frame.getContentPane().add(bnt_7);
		
		JButton bnt_6 = new JButton("6");
		bnt_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_6.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_6.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_6.setBounds(65, 375, 89, 86);
		frame.getContentPane().add(bnt_6);
		
		
		
		JButton bnt_1 = new JButton("1");
		bnt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText() + bnt_1.getText();
				textBox_Result.setText(number);
				
				if(textBox_Result.getText() +bnt_1.getText()== "0") {
					textBox_Result.setText(number);
				}
			}
		});
		
		
		bnt_1.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_1.setBounds(65, 485, 89, 86);
		frame.getContentPane().add(bnt_1);
		
		
		
		
		
		JButton bnt_2 = new JButton("2");
		bnt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_2.getText();
				textBox_Result.setText(number);
			
		
			}
		});
		
		
		
		
		
		bnt_2.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_2.setBounds(166, 485, 89, 86);
		frame.getContentPane().add(bnt_2);
		
		JButton bnt_5 = new JButton("5");
		bnt_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textBox_Result.getText()+bnt_5.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_5.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_5.setBounds(166, 375, 89, 86);
		frame.getContentPane().add(bnt_5);
		
		JButton bnt_8 = new JButton("8");
		bnt_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_8.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_8.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_8.setBounds(166, 260, 89, 86);
		frame.getContentPane().add(bnt_8);
		
		JButton bnt_9 = new JButton("9");
		bnt_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textBox_Result.getText()+bnt_9.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_9.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_9.setBounds(267, 260, 89, 86);
		frame.getContentPane().add(bnt_9);
		
		
		JButton bnt_4 = new JButton("4");
		bnt_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_4.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_4.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_4.setBounds(267, 375, 89, 86);
		frame.getContentPane().add(bnt_4);
		
		
		
		JButton bnt_3 = new JButton("3");
		bnt_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textBox_Result.getText()+bnt_3.getText();
				textBox_Result.setText(number);
			}
		});
		
		
		bnt_3.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_3.setBounds(267, 485, 89, 86);
		frame.getContentPane().add(bnt_3);
		
		
		
		
		JButton bnt_Mult = new JButton("*");
		bnt_Mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textBox_Result.getText());
				textBox_Result.setText("");
				opPreformed = "*";
				
			}
		});
		bnt_Mult.setForeground(Color.WHITE);
		bnt_Mult.setBackground(SystemColor.textHighlight);
		bnt_Mult.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Mult.setBounds(379, 391, 69, 70);
		frame.getContentPane().add(bnt_Mult);
		
		
		
		
		JButton bnt_Sub = new JButton("-");
		bnt_Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textBox_Result.getText());
				textBox_Result.setText("");
				opPreformed = "-";
				
			}
		});
		bnt_Sub.setForeground(Color.WHITE);
		bnt_Sub.setBackground(SystemColor.textHighlight);
		bnt_Sub.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Sub.setBounds(381, 501, 69, 70);
		frame.getContentPane().add(bnt_Sub);
		
		
		
		
		
		
		
		
		//------------------------------------------------------------------------------------------------------
		
		JButton bnt_Equals = new JButton("=");
		bnt_Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
						
						isOperationPreformed = true;
					
						String nResult;
						secondNum = Double.parseDouble(textBox_Result.getText());
						
						switch(opPreformed) {
						
						case "+":
							result = firstNum+secondNum;
							nResult = String.format("%.2f",result);
							textBox_Result.setText(nResult);
							
							
							break;
							
						case "-":
							result = firstNum-secondNum;
							nResult = String.format("%.2f",result);
							textBox_Result.setText(nResult);
							break;
							
							
						case "*":
							result = firstNum*secondNum;
							nResult = String.format("%.2f",result);
							textBox_Result.setText(nResult);
							break;
							
							
						case "/":
							result = firstNum/secondNum;
							nResult = String.format("%.2f",result);
							textBox_Result.setText(nResult);
							break;
						}
						
						
						
						
								
								if(isOperationPreformed == true) {
									if(comment_Field.getText().equals(null)) {
										for (int i = 0; i < resultComments.length;) {
											
											comment_Field.setText(resultComments[r += i]);
											
													if(commentsMade < r || commentsMade <=4) {
														
														comment_Field.setText("");
														commentsMade = 0;
														
													}
											break;
										}
									}else comment_Field.setText(resultComments[r++]); commentsMade++ ;
									
									
									if(r >= randomIterator) {
										r = 0;
									}
									
									
									
									
									
									
								}
						
						
								isOperationPreformed = false;
								
								System.out.println(isOperationPreformed + "" + opPreformed +"" + "" + commentsMade);
						
						
						}
				});
		
		
		
		
		
		//------------------------------------------------------------------------------------------------------------------------------
		
		
		bnt_Equals.setForeground(Color.ORANGE);
		bnt_Equals.setBackground(Color.GRAY);
		bnt_Equals.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Equals.setBounds(480, 485, 141, 195);
		frame.getContentPane().add(bnt_Equals);
		
		JButton bnt_Div = new JButton("/");
		bnt_Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textBox_Result.getText());
				textBox_Result.setText("");
				opPreformed = "/";
				
			}
		});
		bnt_Div.setForeground(Color.WHITE);
		bnt_Div.setBackground(SystemColor.textHighlight);
		bnt_Div.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Div.setBounds(379, 276, 69, 70);
		frame.getContentPane().add(bnt_Div);
		
		JButton bnt_0 = new JButton("0");
		bnt_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_0.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_0.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_0.setBounds(36, 594, 219, 86);
		frame.getContentPane().add(bnt_0);
		
		JButton bnt_Dot = new JButton(".");
		bnt_Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_Dot.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_Dot.setForeground(Color.ORANGE);
		bnt_Dot.setBackground(Color.GRAY);
		bnt_Dot.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Dot.setBounds(267, 594, 89, 86);
		frame.getContentPane().add(bnt_Dot);
		
		JButton bnt_Plus = new JButton("+");
		bnt_Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textBox_Result.getText());
				textBox_Result.setText("");
				opPreformed = "+";
				
			}
		});
		
		
		
		
		bnt_Plus.setForeground(Color.WHITE);
		bnt_Plus.setBackground(SystemColor.textHighlight);
		bnt_Plus.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Plus.setBounds(379, 594, 89, 86);
		frame.getContentPane().add(bnt_Plus);
		
		
		
		
		JButton bnt_Clear_All = new JButton("C");
		bnt_Clear_All.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textBox_Result.setText(null);
				
				
			}
		});
		bnt_Clear_All.setForeground(Color.WHITE);
		bnt_Clear_All.setBackground(SystemColor.textHighlight);
		bnt_Clear_All.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Clear_All.setBounds(480, 391, 69, 70);
		frame.getContentPane().add(bnt_Clear_All);
		
		
		
		JButton bnt_Clear = new JButton("CE");
		bnt_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace=null;
				if(textBox_Result.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textBox_Result.getText());
					str.deleteCharAt(textBox_Result.getText().length()-1);
					backSpace = str.toString();
					textBox_Result.setText(backSpace);
					
				}
				
				
			}
		});
		bnt_Clear.setForeground(Color.WHITE);
		bnt_Clear.setBackground(SystemColor.textHighlight);
		bnt_Clear.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Clear.setBounds(478, 276, 69, 70);
		frame.getContentPane().add(bnt_Clear);
		
		comment_Field = new JTextField();
		comment_Field.setToolTipText("Cal will out put comments here");
		comment_Field.setForeground(Color.CYAN);
		comment_Field.setFont(new Font("Impact", Font.ITALIC, 25));
		comment_Field.setBackground(Color.GRAY);
		comment_Field.setColumns(10);
		comment_Field.setBounds(36, 6, 585, 79);
		frame.getContentPane().add(comment_Field);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setBackground(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBounds(78, 109, 471, 28);
		frame.getContentPane().add(textField_2);
		frame.setBounds(100, 100, 660, 745);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
