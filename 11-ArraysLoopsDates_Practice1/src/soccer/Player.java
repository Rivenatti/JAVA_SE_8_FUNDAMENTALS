package soccer;

/**
 * @author rivenatti
 */

public class Player {

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    private String playerName;
    
    // PLAYER DEFAULT CONSTRUCTOR
    public Player() { }
    
    // PLAYER PARAMETER CONSTRUCTOR
    public Player(String playerName) {
        this.playerName = playerName;
    }
}
