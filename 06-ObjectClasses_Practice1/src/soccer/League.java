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
        
        /* JUST FOR TEST WHAT HAPPENS
        player1.playerName = "Robert Service";
        */
        
        // PLAYERS IN THE TEAM ONE
        System.out.println("The Greens:");
        for(Player thePlayer: team1.playerArray){
            System.out.println("\t" + thePlayer.playerName);
        }
        
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
        
        // PLAYERS IN THE TEAM TWO
        System.out.println("\nThe Reds:");
        for(Player thePlayer: team2.playerArray){
            System.out.println("\t" + thePlayer.playerName);
        }
    }
}
