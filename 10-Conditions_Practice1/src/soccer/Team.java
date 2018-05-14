package soccer;

/**
 * @author rivenatti
 */

public class Team {

    // STORE THE NUMBER OF POINTS SCORED IN THE LEAGUE
    private int pointsTotal;
    
    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
    private String teamName;
    private Player[] playerArray;
//------------------------------------------------------------------------------      
// DEFAULT TEAM CONSTRUCTOR
    public Team () { }
//------------------------------------------------------------------------------      
// FIRST TEAM PARAMTER CONSTRUCTOR
    public Team (String teamName) {
        this.teamName = teamName;
    }
//------------------------------------------------------------------------------      
// SECOND TEAM PARAMTER CONSTRUCTOR
    public Team (String teamName, Player[] players) {
        this.teamName = teamName;
        this.playerArray = players;
    }
//------------------------------------------------------------------------------   
// INCREMENT THE POINTS METHOD
    public void incPointsTotal (int pointsTotal) {
        this.pointsTotal += pointsTotal;
    }
//------------------------------------------------------------------------------   
    /**
     * @return the pointsTotal
     */
    public int getPointsTotal() {
        return pointsTotal;
    }

    /**
     * @param pointsTotal the pointsTotal to set
     */
    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }
}
