package ProjetoZeldaM;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Mundo {
	
	public static List<Blocks> blocos = new ArrayList<Blocks>();
	
	public  Mundo() { 
		for(int xx = 0; xx < 15; xx++) {
			blocos.add(new Blocks(xx*40,0));
		}
		for(int xx = 0; xx < 15; xx++) {
			blocos.add(new Blocks(xx*40,480 - 40));
		}
		for(int yy = 0; yy < 15; yy++) {
			blocos.add(new Blocks(0,yy*40));
		}
		for(int yy = 0; yy < 15; yy++) {
			blocos.add(new Blocks(640 - 40, yy*40));
		}
}		
		public static boolean isFree(int x, int y) {
		
			for(int  i = 0; i < blocos.size(); i++) {
				Blocks blocoAtual = blocos.get(i);
				if(blocoAtual.intersects(new Rectangle(x, y, 32, 32))) {
					return false;
				}
				
		}
			
		return true;
	}
	public void render(Graphics g) {
		for(int  i = 0; i < blocos.size(); i++) {
		blocos.get(i).render(g);
		}
	}
}
