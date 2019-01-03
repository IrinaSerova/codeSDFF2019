package Game;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	private int guessCounter = 0;
	public void checkGuess() {
		//declare guessText variable as what has been entered into the txtGuess Text Field
		String guessText = txtGuess.getText();
		//declare text string to tell user if they are high, low, or correct
		String message = "";
		//Check text to see if it is a number and catch if not
		
		try {
		//convert guessText into int to be compared to theNumber
			int guess = Integer.parseInt(guessText);
			//if else statement to change content of message string
			if(guess < theNumber) {
				message = guess + " is too low. Try again.";
			} else if (guess > theNumber) {
				message = guess + " is too high. Try again.";
			} else {
				message = guess + " is correct! You win! That took " + guessCounter + " guesses. Let's Play again!";
				newGame();
			}
		} catch(Exception e) {
			message = "Enter a whole number between 1 and 100";
		} finally {
		//set lblOutput contents equal to message string
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
			guessCounter++;
		}
	}
	public void newGame() {
		//(int) is a type cast that will make the number into an int.
		theNumber = (int)(Math.random()*100+1);
		guessCounter = 0;
	}
	public Game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblAdamsHiloGuessing = new JLabel("Guessing Game");
		lblAdamsHiloGuessing.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblAdamsHiloGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdamsHiloGuessing.setBounds(0, 36, 432, 16);
		getContentPane().add(lblAdamsHiloGuessing);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setBounds(31, 88, 212, 16);
		getContentPane().add(lblGuessANumber);
		
		txtGuess = new JTextField();
		txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGuess.setBounds(255, 85, 32, 22);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		//Action listener to allow user to press enter in addition to pressing "Guess" button
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		//Action listener for user to click "Guess" button
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkGuess();
			}
		});
		btnGuess.setBounds(167, 114, 97, 25);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(0, 201, 432, 16);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		// set new object of GuessingGame
		Game theGame = new Game();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);
	}
}