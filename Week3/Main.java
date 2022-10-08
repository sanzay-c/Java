import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Finisher");
        skills.add("Dribbler");
        skills.add("Poacher");
        skills.add("Header");
        Player ronaldo = new Player("Cristiano Ronaldo", 37, 182, 78, "Striker", skills, 320000);
        skills.clear();
        skills.add("Finisher");
        skills.add("Dribber");
        skills.add("Play Maker");
        Player messi = new Player("Lionel Messi", 35, 162, 68, "Right Winger", skills, 420000);

        
        skills.clear();
        skills.add("Finisher");
        skills.add("Header");
        Player benzema = new Player("Karim Benzema", 35, 162, 68, "Forward", skills, 420000);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(benzema);
        players.add(ronaldo);

        Team realMadrid = new Team("Real Madrid", "1890", players);
        realMadrid.display();
        players.clear();
        players.add(messi);
        Team barcelona = new Team("Barcelona", "2000", players);
        barcelona.display();
        
    }
}