package soccer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.StringTokenizer;
import utility.GameUtils;
import utility.PlayerDatabase;

/**
 * @author rivenatti
 */

public class League {
    public static void main(String[] args){
        
        // INSTANTIATE LEAGUE
        League theLeague = new League();
        
        // CREATE TEAMS
        Team[] theTeams = theLeague.createTeams("The Robins, The Crows, The Swallows", 3);
        
        // CREATE GAMES
        Game[] theGames = theLeague.createGames(theTeams);
        
        // PRINT THE DESCRIPTION
        System.out.println(theLeague.getLeagueAnnouncement(theGames));
        
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
    public Team[] createTeams(String teamNames, int teamSize) {
        // PLAYERS
        Player player1 = new Player("George Eliot");
        
        Player player2 = new Player("Graham Greene");
        
        Player player3 = new Player("Geoffrey Chaucer");
        
        // PLAYER ARRAY
        Player[] thePlayers = {player1, player2, player3};
        
        // INSTANTIATE A NEW PLAYERDATABASE OBJECT
        PlayerDatabase playerDB = new PlayerDatabase();

        // CREATE STRINGTOKENIZER
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        
        // CREATE TEAM ARRAY
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        
        // ITERATE THROUGH THE ARRAY
        for (int i = 0; i < theTeams.length; i++){
            theTeams[i] = new Team(teamNameTokens.nextToken(),
                playerDB.getTeam(teamSize));
        }
        
        // CREATE TEAM ONE
        Team team1 = new Team("The Greens", playerDB.getTeam(3));

        // CREATE TEAM TWO
        Team team2 = new Team("The Reds", playerDB.getTeam(3));
        

                
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
        
        
        // RETURN TEAMS ARRAY
        return theTeams;
    }
//------------------------------------------------------------------------------
// CREATE GAMES METHOD
    public Game[] createGames(Team[] theTeams) {
        
        // ARRAYLIST TO HOLD THE GAMES
        ArrayList<Game> theGames = new ArrayList();
        
        // DAYS BETWEEN GAMES
        int daysBetweenGames = 0;
        
        // ITERATE THROUGH THE TEAMS
        for (Team homeTeam: theTeams) {
            for( Team awayTeam: theTeams) {
                if (homeTeam != awayTeam) {
                    daysBetweenGames += 7;
                    theGames.add(new Game(homeTeam, awayTeam, 
                            LocalDateTime.now().plusDays(daysBetweenGames)));
                }
            }
        }
        
        // RETURN GAMES ARRAY
        return (Game[]) theGames.toArray(new Game[1]);
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
//------------------------------------------------------------------------------
// GET LEAGUE ANNOUNCEMENT METHOD
    public String getLeagueAnnouncement(Game[] theGames) {
        Period thePeriod =
                Period.between(theGames[0].getTheDateTime().toLocalDate(),
                        theGames[theGames.length - 1].getTheDateTime().toLocalDate());
        
        return "The League is scheduled to run for " +
                thePeriod.getMonths() + " month(s), and " +
                thePeriod.getDays() + " day(s)\n";
    }
} // END CLASS
