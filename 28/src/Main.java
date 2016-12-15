import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;


public class Main {


	private static MainWinsow window;
	private static BufferedImage image;
	
	public static void main(String[] args) {	
		setWindow(new MainWinsow(648, 480));
		
	}
	
	public static void setImage(URL url){
		try {
			ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void setImage(File file){
		try {
			ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void saveImage(File file, String format){
		try {
			ImageIO.write(image, format, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static MainWinsow getWindow() {
		return window;
	}

	public static void setWindow(MainWinsow window) {
		Main.window = window;
	}

	public static BufferedImage getImage() {
		return image;
	}

	public static void setImage(BufferedImage image) {
		Main.image = image;
	}

}
