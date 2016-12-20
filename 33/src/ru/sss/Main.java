package ru.sss;

public class Main {
	public static MainWindow window;

	public static void main(String[] args) {
		window = new MainWindow();
		window.addElement("Hello world ");
		
		window.updateUI();
	}
	
}
