import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void turnCounterDoesntUpdateOnFailure() {
       GameState testGame =new GameState();
       testGame.board.newBoard();
        Turn currentTurn = new Turn(2 , 1, 3, 1, testGame.currentPlayer);
        assertNotEquals(1, testGame.totalTurnCounter);
        
        






    }




}




