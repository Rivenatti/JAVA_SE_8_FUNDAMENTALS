package soccer;

import utility.GameUtils;

/**
 * @author rivenatti
 */

public class Game {

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    
    // PLAY GAME METHOD
    public void playGame(int maxGoals) {
        
       // CREATE RANDOM NUMBER OF GOALS <0, 6>
       int numberOfGoals = (int)(Math.random() * (maxGoals + 1));
       
       // CREATE GOAL ARRAY
       Goal[] theGoals = new Goal[numberOfGoals];
       
       // ASSIGN GOALS ARRAY TO THE GAME
       this.setGoals(theGoals);
       
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
       for (Goal currGoal: this.getGoals()){
           returnString.append ("Goal scored after " +
                   currGoal.getTheTime() + " mins by " +
                   currGoal.getThePlayer().getPlayerName() + " of " +
                   currGoal.getTheTeam().getTeamName() + "\n");
    }
       // RETURN STRING
       return returnString.toString();
    }
} // END CLASS
