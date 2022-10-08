import java.util.ArrayList;

public class Team {
    public String name;
    public String establishedDate;
    public ArrayList<Player> players;

    // Default constructor
    // Team()

    // Parametarized constructor
    public Team(String name, String establishedDate, ArrayList<Player> players) {

        this.name = name;
        this.establishedDate = establishedDate;
        this.players = players;
    }


    public void display() {
        System.out.println("The name of the team is "+name);
        System.out.println("The team was established in "+establishedDate);
        // for (String skill: skills)
        // for (datatype variablename: collectionName)
        for (Player player: players) {
            player.display();
        }
    }
}