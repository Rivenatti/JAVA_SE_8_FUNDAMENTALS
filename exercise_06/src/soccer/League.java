package soccer;

public class League {
    
    public static void main(String[] args) {
       
    // TEAM ONE
        
        // Players
        Player playerOne = new Player();
        playerOne.playerName = "John Smith";
        
        Player playerTwo = new Player();
        playerTwo.playerName = "Carl Johnson";
        
        Player playerThree = new Player();
        playerThree.playerName = "Jeffrey Smoke";
        
        Player[] thePlayers = {playerOne, playerTwo, playerThree};
        
        // Team
        Team teamOne = new Team();
        teamOne.teamName = "Eagles";
        teamOne.playerArray = thePlayers;
        
        /*
        // Show players:
        System.out.println("*** Team One: ***");
        for(Player thePlayer: teamOne.playerArray){
            System.out.println(thePlayer.playerName);
        }
        */
        
    // TEAM TWO
    
        // Team
        Team teamTwo = new Team();
        teamTwo.teamName = "Beagles";
        
        // Players
        teamTwo.playerArray = new Player[3];
        teamTwo.playerArray[0] = new Player();
        teamTwo.playerArray[0].playerName = "Robert Greene";
        
        teamTwo.playerArray[1] = new Player();
        teamTwo.playerArray[1].playerName = "George New";
        
        teamTwo.playerArray[2] = new Player();
        teamTwo.playerArray[2].playerName = "Peter Bloom";
        
        /*
        // Show players:
        System.out.println("\n*** Team Two: ***");
        for(Player thePlayer: teamTwo.playerArray){
            System.out.println(thePlayer.playerName);
        }
        */
        
    // GAME
    
        // Current Game:
        Game currentGame = new Game();
        currentGame.homeTeam = teamOne;
        currentGame.awayTeam = teamTwo;
        
        // Goal One:
        Goal goalOne = new Goal();
        goalOne.thePlayer = currentGame.homeTeam.playerArray[2];
        goalOne.theTeam = currentGame.homeTeam;
        goalOne.theTime = 55;
        
        Goal[] theGoals = {goalOne};
        currentGame.goals = theGoals;
        
        System.out.println("Goal scored after " + 
                currentGame.goals[0].theTime + " mins by " +
                currentGame.goals[0].thePlayer.playerName + " of "+
                currentGame.goals[0].theTeam.teamName);
    }
}
