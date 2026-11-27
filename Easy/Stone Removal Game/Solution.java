}
            turnCount++;
            // Increment the turn counter
            stonesPerTurn--;
          
            // Decrease the number of stones required for the next turn
          
            n -= stonesPerTurn;
            // Remove the required stones for this turn
        while (n >= stonesPerTurn) {
        // Continue playing while there are enough stones remaining for the current turn
      
        int turnCount = 0;
        // Counter to track the number of turns played
      
        int stonesPerTurn = 10;
        // Initial number of stones that must be removed in the first turn
    public boolean canAliceWin(int n) {
class Solution {