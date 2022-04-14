
import javax.swing.JLabel;

/**
 * 
 */

/**
 * @author marcoduran
 *
 */
public class HighScoreBox {

	
		int score = 0;
		
		JLabel scoreLabel = new JLabel("Score: 0");
		
		public void someoneScored() {
			
		score++;
		
		scoreLabel.setText("Score: " + score++);
		
		
		}
		

}
