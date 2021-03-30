package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Snake;

/**
 * 
 * @author Adrian Nieto - EDU
 *
 */

public class TestSnake {

	/**
	 * testet den Konstruktoraufruf mit den angegebenen Positionen 
	 */
	
	@Test
	public void constructorTest() {
		Snake cobra  = new Snake (50,30);
		assertEquals(50, cobra.getXpos()); // vergleicht die horizontale Position
		assertEquals(30, cobra.getYpos()); // vergleicht die vertikale Postion
	}
	
	/**
	 * testet die Bewegung rechts mit positiven Zahlen
	 */
	
	@Test
	public void testRight(){
		Snake cobra  = new Snake (50,30);
		cobra.moveRight(50); 				// addiert 50 zur xPosition 
		assertEquals(100, cobra.getXpos());
		cobra.moveRight(100); 				// addiert 100 zur xPosition
		assertEquals(200, cobra.getXpos());
		
	}
	
	/**
	 * testet die Bewegung links mit positiven Zahlen
	 */
	
	@Test
	public void testLeft(){
		Snake cobra  = new Snake (200,30);
		cobra.moveLeft(50);					// subtrahiert 50 von der xPosition
		assertEquals(150, cobra.getXpos());
		cobra.moveLeft(100);				// subtrahiert 50 von der xPosition
		assertEquals(50, cobra.getXpos());
	}
	
	/**
	 * testet die Bewegung unten mit positiven Zahlen
	 */
	
	@Test
	public void testDown() {
		Snake cobra  = new Snake (50,30);
		cobra.moveDown(30);					// addiert 30 zur yPosition 
		assertEquals(60, cobra.getYpos());
		cobra.moveDown(40);					// addiert 40 zur yPosition 
		assertEquals(100, cobra.getYpos());
		
	}
	
	/**
	 * testet die Bewegung oben mit positiven Zahlen
	 */
	
	@Test
	public void testUp() {
		Snake cobra  = new Snake (50,100);
		cobra.moveUp(40);					// subtrahiert 40 von der yPosition
		assertEquals(60, cobra.getYpos());
		cobra.moveUp(30);					// subtrahiert 30 von der yPosition
		assertEquals(30, cobra.getYpos());
	}
	
	/**
	 * testet die Bewegung rechts mit negativen Zahlen
	 * 
	 * Notiz: gemäss Aufgabenstellung wäre 0 = false
	 * also soll sich das objekt nicht bewegen bei einer negativen Zahl-Eingabe 
	 * 
	 */
	@Test
	public void testNegativRight(){
		Snake cobra  = new Snake (50,30);
		cobra.moveLeft(-50);				
		assertEquals(50, cobra.getXpos());
		cobra.moveLeft(-100);
		assertEquals(50, cobra.getXpos());
	}
	
	/**
	 * testet die Bewegung links mit negativen Zahlen
	 */
	
	@Test
	public void testNegativLeft() {
		Snake cobra = new Snake (50,30);
		cobra.moveLeft(-50);
		assertEquals(50, cobra.getXpos());
		cobra.moveLeft(-100);
		assertEquals(50, cobra.getXpos());
	}
	
	/**
	 * testet die Bewegung Unten mit negativen Zahlen
	 */
	
	@Test
	public void testNegativDown() {
		Snake cobra = new Snake (50,30);
		cobra.moveDown(-30);
		assertEquals(30, cobra.getYpos());
		cobra.moveDown(-60);
		assertEquals(30, cobra.getYpos());
	}
	
	/**
	 * testet die Bewegung Oben mit negativen Zahlen
	 */
	
	@Test
	public void testNegativUp() {
		Snake cobra = new Snake (50,30);
		cobra.moveDown(-30);
		assertEquals(30, cobra.getYpos());
		cobra.moveDown(-60);
		assertEquals(30, cobra.getYpos());
	}



}
