package soccer;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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


//------------------------------------------------------------------------------
// NO PARAMETER PLAY GAME METHOD
    public void playGame() {
        
        ArrayList<Goal> eventList = new ArrayList();
        Goal currEvent;
        
        for (int i = 1; i <= 90; i++){
            if (Math.random() > 0.95){
                System.out.println(i);
                currEvent = new Goal();
                currEvent.setTheTeam(Math.random() > 0.5?homeTeam:awayTeam);
                currEvent.setThePlayer(currEvent.getTheTeam().
                        getPlayerArray()[(int) (Math.random()*
                                currEvent.getTheTeam().getPlayerArray().length)]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);
            } //END IF
        } // END FOR
        
        this.goals = new Goal[eventList.size()];
        eventList.toArray(goals);
    }// END PLAYGAME METHOD

//------------------------------------------------------------------------------  
    // GET DESCRIPTION METHOD
    public String getDescription() {
       
        // VARIABLES TO HOLD THE NUMBER OF GOALS
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        
       // CREATE STRINGBUILDER
       StringBuilder returnString = new StringBuilder();
       
       // PRINT OUT THE SCOPE OF THE GAME
       for (Goal currGoal: this.getGoals()){
           
           // DETERMINE WHICH TEAM SCORED EACH GOAL
           if(currGoal.getTheTeam() == homeTeam){
               homeTeamGoals ++;
           } else {
               awayTeamGoals ++;
           }
           
           // PREPARE DESCRIPTION
           returnString.append ("Goal scored after " +
                   currGoal.getTheTime() + " mins by " +
                   currGoal.getThePlayer().getPlayerName() + " of " +
                   currGoal.getTheTeam().getTeamName() + "\n");
       } // END FOR LOOP
        
       if (homeTeamGoals == awayTeamGoals){
           returnString.append("It's a draw!");
           homeTeam.incPointsTotal(1);
           awayTeam.incPointsTotal(1);
       } else if (homeTeamGoals > awayTeamGoals){
           returnString.append(returnString.append(homeTeam.getTeamName() + " win!"));
           homeTeam.incPointsTotal(2);
                   
       } else {
           returnString.append(returnString.append(awayTeam.getTeamName() + " win!"));
           awayTeam.incPointsTotal(2);
       }
       
       // PRINT THE SCORE
       returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") \n");
       
       // PRINT WHICH TEAMS ARE PLAYING
       returnString.append(homeTeam.getTeamName() + " vs. " 
               + awayTeam.getTeamName() + "\n" +
               "Date " + 
               this.theDateTime.format (DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
       
       // RETURN STRING
       return returnString.toString();
    }
    
//------------------------------------------------------------------------------
    // DEFAULT CONSTRUCTOR
    public Game () { }
    
    // FIRST CONSTRUCTOR WITH PARAMETERS
    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
//------------------------------------------------------------------------------
// LOCAL DATE TIME
    private LocalDateTime theDateTime;

    /**
     * @return the theDateTime
     */
    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    /**
     * @param theDateTime the theDateTime to set
     */
    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }
//------------------------------------------------------------------------------
// THIRD CONSTRUCTOR
    public Game(Team homeTeam, Team awayTeam,
            LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }
} // END CLASS
