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
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 * @author Junrunshin
 *
 */



public class Wise_Cal_ {
	
	
	 //-----------------------------------------------------------------------------------------------------------------------------------[Vars]
	private JFrame frmWisecal;
	private JTextField textBox_Result;
	private static JTextField comment_Field;
	private static JTextField current_Op_Field;
	
	
	
	
	Double firstNum;
	Double secondNum;
	Double result;
	String opPreformed = "";
	
	
	
	int operationsCount = 0;
	static int commentsMade = 0;
	static int commentsDownTime = 7;
	
	static boolean isOperationPreformed = false;
	static boolean nOprationStart = true;
	
	
	
	static Random rand = new Random();
	static int randomIterator = 7;
	static int r = rand.nextInt(randomIterator);
	//static int nR = rand.nextInt();
	
	
	
	
	
	static Timer timer = new Timer();
	static TimerTask task = new TimerTask() {
		@Override
		public void run() {
			JOptionPane.showMessageDialog(null,"Hanging in there?");
			
		}
	};
	
	
	
    static String  [] greetings = new String [] {"Glad your giving me a shot",
    											"Back again huh?",
    											"Never gonna give you up!",
    											"Never gonna let you down!",
    					  						"Do you really need my help again?",
    					  						"Lets go",
    					  						"AYYYYEEE  YOOO"};

    static String  [] resultComments = new String [] {"That was way to easy!",
													"Come on you can do better than that.",
													"Times like this makes me wish I was a web browser....",
													"Are you impressed yet?",
													"So this...this is my primary function?",
													"Im gonna take a quick nap...BRB",
													"Go touch some grass"};
    
    static String  [] largeResultComments = new String [] {"Woah...what do you even need that number for?!",
														"heh p.....piece of cake...",
														"Ok take it easy...",
														"I'm not a scintific calculator you know....",
														"HHHHHMMMMMMMMM",
														"404 not found",
														"I bet you wish your bank account looked like that heh "};
    
    
    static String  [] closingBoxComments= new String [] {"Wait I was just warming up",
														"Tell you friends about me",
														"Glad you gave me a try",
														"Did you find the number you were looking for?",
														"Bye see you soon!",
														"404 not found",
														"Hehe you love me don't lie"};
    
  /**
   * ---------------------------------------------------------------------------------------------------------------|--[Methods]---|------------
   *   */
		public static void nMessageBox() {
			
			   //Shows a random message at App start up.
			for(int i =0; i < greetings.length;) {
				JOptionPane.showMessageDialog(null,greetings[r += i], "--Cal--",JOptionPane.INFORMATION_MESSAGE);
			      break;
				}	 
		}
		
		
		
		public static void nClosingBox() {
			for(int c = 0; c < closingBoxComments.length;) {
				JOptionPane.showMessageDialog(null,closingBoxComments[r += c] ,  "--Cal--",JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
		}
		
		/**	
		-------------------------------------------------------------------------------------------------------------------------|--[Methods End]---|--------------->>-
		*/
		
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
					window.frmWisecal.setVisible(true);
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
	 * --------------------Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
			timer.scheduleAtFixedRate(task, 100000, 50000);
		 
		
		
		
		frmWisecal = new JFrame();
		frmWisecal.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC\\Downloads\\cal.ico"));
		frmWisecal.setUndecorated(true);
		frmWisecal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmWisecal.setBackground(Color.LIGHT_GRAY);
		frmWisecal.setTitle("Wise-Cal");
		frmWisecal.setForeground(Color.WHITE);
		frmWisecal.setFont(new Font("Arial", Font.BOLD, 20));
		frmWisecal.getContentPane().setForeground(Color.WHITE);
		frmWisecal.getContentPane().setBackground(new Color(153, 204, 204));
		frmWisecal.getContentPane().setLayout(null);
		
		current_Op_Field = new JTextField();
		current_Op_Field.setForeground(Color.WHITE);
		current_Op_Field.setFont(new Font("Impact", Font.BOLD, 40));
		current_Op_Field.setColumns(10);
		current_Op_Field.setBackground(Color.BLACK);
		current_Op_Field.setBounds(49, 139, 556, 46);
		frmWisecal.getContentPane().add(current_Op_Field);
		
		textBox_Result = new JTextField();
		textBox_Result.setHorizontalAlignment(SwingConstants.RIGHT);
		textBox_Result.setFont(new Font("Impact", Font.BOLD, 50));
		textBox_Result.setText("0");
		textBox_Result.setForeground(Color.WHITE);
		textBox_Result.setBackground(Color.BLACK);
		textBox_Result.setBounds(49, 189, 556, 99);
		frmWisecal.getContentPane().add(textBox_Result);
		textBox_Result.setColumns(10);
		
		
		
	
		
		
		
		
		/**
		 * -------------------------------------------------------------------------------------------------------------------------------------------|Buttons events||-----
		 * ------------------------------------------------------------------>>>>
		 */
		
		
		
		
		
		JButton bnt_7 = new JButton("7");
		bnt_7.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		
		
		
		bnt_7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_7.setOpaque(true);
		bnt_7.setBackground(SystemColor.activeCaptionBorder);
		bnt_7.setFont(new Font("Impact", Font.BOLD, 20));
		
		bnt_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textBox_Result.getText()+bnt_7.getText();
				textBox_Result.setText(number);
				
			}
		});
		bnt_7.setBounds(57, 299, 89, 86);
		frmWisecal.getContentPane().add(bnt_7);
		
		JButton bnt_6 = new JButton("6");
		bnt_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_6.setOpaque(true);
		bnt_6.setBackground(SystemColor.activeCaptionBorder);
		bnt_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_6.getText();
				textBox_Result.setText(number);
				
			}
		});
		bnt_6.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_6.setBounds(57, 414, 89, 86);
		frmWisecal.getContentPane().add(bnt_6);
		
		
		
		JButton bnt_1 = new JButton("1");
		bnt_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_1.setOpaque(true);
		bnt_1.setBackground(SystemColor.activeCaptionBorder);
		
		
		
		
		
		
		
		bnt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText() + bnt_1.getText();
				textBox_Result.setText(number);
				
				if(textBox_Result.getText() +bnt_1.getText()== "0") {
					textBox_Result.setText(number);
				}
				if(textBox_Result.getText() == "0") {
					textBox_Result.setText(number);
				}
			}
		});
		
		
		
		
		
		
		
		bnt_1.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_1.setBounds(57, 524, 89, 86);
		frmWisecal.getContentPane().add(bnt_1);
		
		
		
		
		
		JButton bnt_2 = new JButton("2");
		bnt_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_2.setOpaque(true);
		bnt_2.setBackground(SystemColor.activeCaptionBorder);
		bnt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_2.getText();
				textBox_Result.setText(number);

			}
		});
		
		bnt_2.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_2.setBounds(158, 524, 89, 86);
		frmWisecal.getContentPane().add(bnt_2);
		
		JButton bnt_5 = new JButton("5");
		bnt_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_5.setOpaque(true);
		bnt_5.setBackground(SystemColor.activeCaptionBorder);
		bnt_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textBox_Result.getText()+bnt_5.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_5.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_5.setBounds(158, 414, 89, 86);
		frmWisecal.getContentPane().add(bnt_5);
		
		JButton bnt_8 = new JButton("8");
		bnt_8.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_8.setOpaque(true);
		bnt_8.setBackground(SystemColor.activeCaptionBorder);
		bnt_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_8.getText();
				textBox_Result.setText(number);
				
			}
		});
		bnt_8.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_8.setBounds(158, 299, 89, 86);
		frmWisecal.getContentPane().add(bnt_8);
		
		JButton bnt_9 = new JButton("9");
		bnt_9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_9.setOpaque(true);
		bnt_9.setBackground(SystemColor.activeCaptionBorder);
		bnt_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textBox_Result.getText()+bnt_9.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_9.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_9.setBounds(259, 299, 89, 86);
		frmWisecal.getContentPane().add(bnt_9);
		
		
		JButton bnt_4 = new JButton("4");
		bnt_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_4.setOpaque(true);
		bnt_4.setBackground(SystemColor.activeCaptionBorder);
		bnt_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_4.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_4.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_4.setBounds(259, 414, 89, 86);
		frmWisecal.getContentPane().add(bnt_4);
		
		
		
		JButton bnt_3 = new JButton("3");
		bnt_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_3.setOpaque(true);
		bnt_3.setBackground(SystemColor.activeCaptionBorder);
		bnt_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textBox_Result.getText()+bnt_3.getText();
				textBox_Result.setText(number);
			}
		});
		
		
		bnt_3.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_3.setBounds(259, 524, 89, 86);
		frmWisecal.getContentPane().add(bnt_3);
		
		
		
		
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
		bnt_Mult.setBounds(379, 431, 89, 70);
		frmWisecal.getContentPane().add(bnt_Mult);
		
		
		
		
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
		bnt_Sub.setBounds(381, 541, 87, 70);
		frmWisecal.getContentPane().add(bnt_Sub);
		
		
		
		
		
		/**
		 * ------------------------------------------------------------------------------------------------------------------------------------->>>>>-------|Switch--Equals EventListener (opPreformed)|-----------
		 */
		
		
		JButton bnt_Equals = new JButton("=");
		bnt_Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
						isOperationPreformed = true;
						System.out.println("isOperationPreformed " + " = " + isOperationPreformed);
						
						String nResult = "";
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
						
						
						
						
						
						
						/**
						 * -------------------------------------------------------------------------------------------------------------<|current_Op_Field|>---------
						 */
						
						
								operationsCount++;
								if(isOperationPreformed == true 
										&& operationsCount ==2 
										&& current_Op_Field.getText().equals("")) {
									current_Op_Field.setText(nResult + "" + opPreformed);
								}else current_Op_Field.setText( firstNum +"" + opPreformed + "" +secondNum);
						
							
							/**
							 * ----------------------------------------------------------------------------------------------------------<|current_Op_Field | END |>-------------------
							 */
							
							
							
							
								
								
								
								
								
								
								
						
					/**
					 * ---------------------------------------------------------------------------------------------------------------------------------------------------------->>>>>>>------|Switch--Equals EventListener (opPreformed) END|-----------
					 */
							
							
								
								
								
								
								
								
								
								
								
							
						 //--------------------------------------------------------------------------------------------------------------------------------------------------------||CommentSection||
								
								if(isOperationPreformed) {
									
									
									
									
									
									//-----------------------------------------------------------------------------|Normal Comments|
									if(textBox_Result.getText().length()<7) {
										if(comment_Field.getText().equals(null)) {
											for (int i = 0; i < resultComments.length;) {
												comment_Field.setText(resultComments[r += i]);
												break;
											}
										}else comment_Field.setText(resultComments[r++]); commentsMade++ ;
										
									}
									//-----------------------------------------------------------------------------|Normal Comments|
									//----------------------------------------------------------
									//-----------------------------------------------------------------------------|largeInt Comments|
									
									
									if(textBox_Result.getText().length()>7){
										if(comment_Field.getText().equals(null)) {
											for(int i = 0; i< largeResultComments.length; ) {
												comment_Field.setText(largeResultComments[r += i]);
												break;
											}
										}else comment_Field.setText(largeResultComments[r++]); commentsMade++ ;
									}
									//-----------------------------------------------------------------------------|largeInt Comments|
									
											if( commentsMade >= commentsDownTime|| commentsMade > r) {
												
												comment_Field.setText("");
												commentsMade = 0;
											}
											
											if(operationsCount>=3) operationsCount = 0;
											
											if(r >= randomIterator) r = 0;
												
											
									
									
								}
						
						
								isOperationPreformed = false;
								
								
								
								System.out.println("isOperationPreformed "+ isOperationPreformed  + "-"+ " Opration " + " = " + opPreformed  + " commentsMade(s) "+" = "+ commentsMade );
								System.out.println( "Number result length returned "+ " = " + textBox_Result.getText().length());
						
						}
				});
		
		
		 //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------||CommentSection|END|
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------|Equals EventListener |END|-----------
		
		
		bnt_Equals.setForeground(Color.ORANGE);
		bnt_Equals.setBackground(Color.GRAY);
		bnt_Equals.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Equals.setBounds(480, 525, 125, 195);
		frmWisecal.getContentPane().add(bnt_Equals);
		
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
		bnt_Div.setBounds(379, 316, 87, 70);
		frmWisecal.getContentPane().add(bnt_Div);
		
		JButton bnt_0 = new JButton("0");
		bnt_0.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_0.setOpaque(true);
		bnt_0.setBackground(SystemColor.activeCaptionBorder);
		bnt_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_0.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_0.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_0.setBounds(36, 634, 219, 86);
		frmWisecal.getContentPane().add(bnt_0);
		
		JButton bnt_Dot = new JButton(".");
		bnt_Dot.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		bnt_Dot.setOpaque(true);
		bnt_Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textBox_Result.getText()+bnt_Dot.getText();
				textBox_Result.setText(number);
			}
		});
		bnt_Dot.setForeground(Color.ORANGE);
		bnt_Dot.setBackground(Color.GRAY);
		bnt_Dot.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Dot.setBounds(259, 633, 89, 86);
		frmWisecal.getContentPane().add(bnt_Dot);
		
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
		bnt_Plus.setBounds(379, 634, 89, 86);
		frmWisecal.getContentPane().add(bnt_Plus);
		
		
		
		
		JButton bnt_Clear_All = new JButton("C");
		bnt_Clear_All.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textBox_Result.setText(null);
				
				
			}
		});
		bnt_Clear_All.setForeground(Color.WHITE);
		bnt_Clear_All.setBackground(SystemColor.textHighlight);
		bnt_Clear_All.setFont(new Font("Impact", Font.BOLD, 20));
		bnt_Clear_All.setBounds(503, 430, 72, 70);
		frmWisecal.getContentPane().add(bnt_Clear_All);
		
		
		
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
		bnt_Clear.setBounds(501, 315, 74, 70);
		frmWisecal.getContentPane().add(bnt_Clear);
		
		comment_Field = new JTextField();
		comment_Field.setToolTipText("Cal will out put comments here");
		comment_Field.setForeground(SystemColor.textHighlight);
		comment_Field.setFont(new Font("Impact", Font.ITALIC, 25));
		comment_Field.setBackground(SystemColor.text);
		comment_Field.setColumns(10);
		comment_Field.setBounds(36, 48, 585, 79);
		frmWisecal.getContentPane().add(comment_Field);
		
		
		
		/**
		 * ------------------------------------------------------------------------------------------------------------->>>>
		 * --------------------------------------------------------------------------------------------------------------------------------------------------------|Buttons events|End|-----
		 */
		
		
		
		
		
		
		/**
		 * 
		 * -----------------------------------------------------------|X button|
		 */
		JButton close_app_bnt = new JButton("X");
		close_app_bnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nClosingBox();
				System.exit(0);
				
				
				
			}
		});
		close_app_bnt.setBackground(Color.RED);
		close_app_bnt.setForeground(Color.WHITE);
		close_app_bnt.setFont(new Font("Impact", Font.PLAIN, 20));
		close_app_bnt.setBounds(642, 6, 44, 38);
		frmWisecal.getContentPane().add(close_app_bnt);
		frmWisecal.setBounds(100, 100, 692, 750);
		frmWisecal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		/**
		 * ------------------------------------------------------------------->>>>>-|X button |End|>
		 */
	}
}
