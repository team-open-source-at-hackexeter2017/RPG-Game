package team_open_source.RPG_Game.graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * GameDisplay is responsible for the game's graphics, and triggering the game's logic from controls.
 * Most things that make this a 'game' are in here somewhere, or referenced in here.
 * @author Peter Maar 
 * @version April 2017
 */
@SuppressWarnings("serial")
public class GameDisplay extends JPanel implements KeyListener  {
	
	public GameDisplay(OptionPanel optionPanel, int sqDim) {
		// TODO Auto-generated constructor stub
	}

	public void startGame() {
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(getClass().getClassLoader().getResource("team_open_source/RPG_Game/resources/images/room.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		add(picLabel);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
