package soccer;

import utility.GameUtils;

/**
 * @author rivenatti
 */

public class League {
    public static void main(String[] args){
        
        // CREATE TEAMS
        Team[] theTeams = createTeams();
        
        // CREATE GAMES
        Game[] theGames = createGames(theTeams);
        Game currGame = theGames[0];
        
        // CURRENT GAME
        currGame.playGame();
        
        // PRINT GAME SCOPE
        
        System.out.println(currGame.getDescription());
        
    } // END MAIN
    
//------------------------------- METHODS --------------------------------------
// CREATE TEAMS METHOD
    public static Team[] createTeams() {
        // PLAYERS
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        
        // PLAYER ARRAY
        Player[] thePlayers = {player1, player2, player3};
        
        // CREATE TEAM ONE
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;

        // CREATE TEAM TWO
        Team team2 = new Team();
        team2.teamName = "The Reds";
        
        // CREATE PLAYER ARRAY
        team2.playerArray = new Player[3];
        
        // ADD PLAYERS TO ARRAY
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        // CREATE TEAMS ARRAY        
        Team[] theTeams = {team1, team2};
        
        // RETURN TEAMS ARRAY
        return theTeams;
    }
//------------------------------------------------------------------------------
// CREATE GAMES METHOD
    public static Game[] createGames(Team[] theTeams) {
        
        // CREATE GAME
        Game theGame = new Game();
        
        // ASSING TEAMS TO GAME
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        
        // CREATE GAMES ARRAY
        Game[] theGames = {theGame};
        
        // RETURN GAMES ARRAY
        return theGames;
    }
    
    
} // END CLASS
