package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		JOptionPane.showMessageDialog(null, "Hello, World");
		String name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null, "Hi " + name + "!");
	}
}
