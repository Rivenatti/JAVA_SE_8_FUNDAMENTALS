package soccer;

import utility.GameUtils;

/**
 * @author rivenatti
 */

public class League {
    public static void main(String[] args){
        
        // INSTANTIATE LEAGUE
        League theLeague = new League();
        
        // CREATE TEAMS
        Team[] theTeams = theLeague.createTeams();
        
        // CREATE GAMES
        Game[] theGames = theLeague.createGames(theTeams);
        
        // CURRENT GAME
        for(Game currGame: theGames){
            currGame.playGame();
                // PRINT GAME SCOPE
                System.out.println(currGame.getDescription());
        }
        
        // SHOW BEST TEAM
        theLeague.showBestTeam(theTeams);
        
    } // END MAIN
    
//------------------------------- METHODS --------------------------------------
// CREATE TEAMS METHOD
    public Team[] createTeams() {
        // PLAYERS
        Player player1 = new Player("George Eliot");
        
        Player player2 = new Player("Graham Greene");
        
        Player player3 = new Player("Geoffrey Chaucer");
        
        // PLAYER ARRAY
        Player[] thePlayers = {player1, player2, player3};
        
        // CREATE TEAM ONE
        Team team1 = new Team("The Greens", thePlayers);

        // CREATE TEAM TWO
        Team team2 = new Team();
        team2.setTeamName("The Reds");
        
        // CREATE PLAYER ARRAY
        team2.setPlayerArray(new Player[3]);
        
        // ADD PLAYERS TO ARRAY
        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setPlayerName("Robert Service");
        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Robbie Burns");
        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Rafael Sabatini");
        
        // CREATE TEAMS ARRAY        
        Team[] theTeams = {team1, team2};
        
        // RETURN TEAMS ARRAY
        return theTeams;
    }
//------------------------------------------------------------------------------
// CREATE GAMES METHOD
    public Game[] createGames(Team[] theTeams) {
        
        // CREATE GAMES
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        
        // CREATE GAMES ARRAY
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};
        
        // RETURN GAMES ARRAY
        return theGames;
    }
//------------------------------------------------------------------------------
// SHOW BEST TEAM METHOD
    public void showBestTeam(Team[] theTeams){
        
        //WHICH TEAM WON THE LEAGUE
        Team currBestTeam = theTeams[0];
        
        System.out.println("\nTeam Points");
        
        // PRINT THE NUMBER OF GOALS THAT EACH TEAM SCORES
        for (Team currTeam: theTeams){
            System.out.println("\t" + currTeam.getTeamName() + ":" +
                    currTeam.getPointsTotal());
            
                // CHECK WHETHER CURRENT TEAM HAS MORE POINTS THAN CURRENT BEST TEAM
                currBestTeam = currTeam.getPointsTotal() >
                        currBestTeam.getPointsTotal() ? currTeam:currBestTeam;
        }
        
        System.out.println("The winner of the league is: " + currBestTeam.getTeamName());
        
    }// END METHOD
    
} // END CLASS
