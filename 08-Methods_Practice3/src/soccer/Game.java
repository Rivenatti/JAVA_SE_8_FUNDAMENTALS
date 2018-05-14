package soccer;

import utility.GameUtils;

/**
 * @author rivenatti
 */

public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    // PLAY GAME METHOD
    public void playGame(int maxGoals) {
        
       // CREATE RANDOM NUMBER OF GOALS <0, 6>
       int numberOfGoals = (int)(Math.random() * (maxGoals + 1));
       
       // CREATE GOAL ARRAY
       Goal[] theGoals = new Goal[numberOfGoals];
       
       // ASSIGN GOALS ARRAY TO THE GAME
       this.goals = theGoals;
       
       // ADD GAME GOALS FROM GAME UTILS
       GameUtils.addGameGoals(this);
    }

//------------------------------------------------------------------------------
// NO PARAMETER PLAY GAME METHOD
    public void playGame() {
        playGame(6);
    }

//------------------------------------------------------------------------------    
    // GET DESCRIPTION METHOD
    public String getDescription() {
       
       // CREATE STRINGBUILDER
       StringBuilder returnString = new StringBuilder();
       
       // PRINT OUT THE SCOPE OF THE GAME
       for (Goal currGoal: this.goals){
           returnString.append ("Goal scored after " +
                currGoal.theTime + " mins by " +
                currGoal.thePlayer.playerName + " of " +
                currGoal.theTeam.teamName + "\n");
    }
       // RETURN STRING
       return returnString.toString();
    }
} // END CLASS
