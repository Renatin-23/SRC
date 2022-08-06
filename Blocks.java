package ProjetoZeldaM;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Blocks  extends Rectangle{

	public Blocks(int x, int y) {
			super(x, y, 40, 40);
	}
	public void render(Graphics g) {
                 g.drawImage(Spritesheet.tileWall, x, y, 40, 40, null);
	}
}
