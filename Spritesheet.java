package ProjetoZeldaM;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	public static BufferedImage spritesheet;
	
	public static BufferedImage[] player_front;
	public static BufferedImage[] inimigo_front;
	public static BufferedImage tileWall;
	
	public Spritesheet() {
		
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
		player_front = new BufferedImage[2];
		inimigo_front = new BufferedImage[2];
		
		player_front[0] = Spritesheet.getSprite(0, 11, 16, 16);
		player_front[1] = Spritesheet.getSprite(16, 11, 16, 16);
		
		inimigo_front[0] = Spritesheet.getSprite(0, 11, 16, 16);
		inimigo_front[1] = Spritesheet.getSprite(16, 11, 16, 16);
		
		tileWall = Spritesheet.getSprite(242,242, 10, 10);
	}	
	public static BufferedImage getSprite(int x, int y, int height, int width) {
		return spritesheet.getSubimage(x, y, width, width);
	}
}
