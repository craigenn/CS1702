package uk.ac.brunel.cs1702;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	private Player player1;
	private Player player2;

	@BeforeEach
	public void setUp() {
		player1 = new Player("Steffi Graf");
		player2 = new Player("Arancha Sanchez");
	}
	
	@Test
	public void canCreateNewPlayers() {
		assertNotNull(player1);
		assertNotNull(player2);
	}
	
	@Test
	public void canGetPlayerNames(){
		assertEquals("Steffi Graf", player1.getName());
		assertEquals("Arancha Sanchez", player2.getName());		
	}
	
	@Test
	public void canUpdateAndRetrievePlayerPoints(){		
		assertEquals(0, player1.getScore().getPoints());
		assertEquals(0, player2.getScore().getPoints());
		
		player1.winPoints();
		player1.winPoints();
		player2.winPoints();
		
		assertEquals("Thirty", player1.getScore().toString());
		assertEquals("Fifteen", player2.getScore().toString());				
	} 


}
