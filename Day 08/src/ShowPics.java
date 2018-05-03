import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Computer Science Section C
 * @author Ryanna Neuman
 *Feburary 22, 2018
 */
public class ShowPics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Picture pic = new Picture("baby.jpg");
			pic.draw();
			Picture pic2 = new Picture("baby.jpg");
			pic2.translate(480, 360);
			pic2.draw();
			
			Picture pic3 = new Picture("bear.jpg");
			int height=pic2.getHeight();
			int width = pic2.getWidth();
			pic3.translate(width, 0);
			pic3.draw();
			
			Picture pic4 = new Picture("bear.jpg");
			pic4.translate(0, height);
			pic4.draw();
			
					
			
			
			
		
	}

}
