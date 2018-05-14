package soccer;

/**
 * @author rivenatti
 */

public class League {
    public static void main(String[] args){
        
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
        
        // CREATE GAME
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        
        // CREATE GOAL OBJECT
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        
        // ASSIGN GOAL OBJECT TO ARRAY
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        // PRINT OUT THE SCOPE OF THE GAME
        System.out.println("Goal scored after " +
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);
        
        
        /*
        // PLAYER WHO PLAY FOR TEAM2
        for (Player thePlayer: team2.playerArray){
            if(thePlayer.playerName.matches(".*Sab.*")){
            System.out.println("Found " + thePlayer.playerName);
            System.out.println("Last name is " + thePlayer.playerName.split(" ")[1]);
            }
        }
        */
        
        
        // DISPLAY PLAYERS IN FORMAT LASTNAME, FIRSTNAME
            
            // CREATE STRINGBUILDER
            StringBuilder familyNameFirst = new StringBuilder();

            for(Player thePlayer: team2.playerArray){
                // SPLIT NAME
                String name[] = thePlayer.playerName.split(" ");

                // APPEND STRINGBUILDER
                familyNameFirst.append(name[1]);
                familyNameFirst.append(", ");
                familyNameFirst.append(name[0]);

                // PRINT PLAYERS
                System.out.println(familyNameFirst);

                // EMPTY STRINGBUILDER
                familyNameFirst.delete(0, familyNameFirst.length());
            }
    } // END MAIN
    
} // END CLASS
