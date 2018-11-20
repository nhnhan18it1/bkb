package itface;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

public class jkkkkkk extends Frame implements MouseInputListener{
public jkkkkkk() {
	this.setSize(600, 600);
	this.show();
	this.addMouseListener(this);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new jkkkkkk();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("4");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("5");
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("6");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("7");	
	}

}
