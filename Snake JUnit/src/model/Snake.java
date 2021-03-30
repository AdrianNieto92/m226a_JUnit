package model;

/**
 * 
 * @author Adrian Nieto - EDU
 *
 */


public class Snake {

	 private int xPos;
	 private int yPos;
	 private int laenge = 1;
	
	 /**
	  * Konstruktor
	  * 
	  */
	
	public Snake ( int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	/**
	 * Definiert die Bewegung f�r Unten
	 */
	
	public void moveDown (int yPos) {
		if (yPos > 0) {
			this.yPos = this.yPos+ yPos;
		}
	}
	
	/**
	 * Definiert die Bewegung f�r Oben
	 */
	
	public void moveUp (int yPos) {
		if (yPos > 0) {
			this.yPos = this.yPos - yPos;
		}
	}
	
	/**
	 * Definiert die Bewegung f�r Rechts
	 * 
	 */
	
	public void moveRight (int xPos) {
		if (xPos > 0) {
			this.xPos= this.xPos + xPos;
		}
	}
	
	/**
	 * Definiert die Bewegung f�r Links
	 * 
	 */
	
	public void moveLeft (int xPos) {
		if (xPos > 0) {
			this.xPos = this.xPos - xPos;
		}
	}
	/**
	 * Getters
	 */
	
	public int getXpos() {
		return xPos;
		
	}
	public int getYpos() {
		return yPos;
	}
	
	
	
	
}
