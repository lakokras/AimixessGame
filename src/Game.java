public class Game {
    private Player[] players;
    private Map map;

    public Game(Player[] players, Map map) {
        this.players = players;
        this.map = map;
    }

    public void start() {
        for (player : players) {
            int count = player.generateNumber();
            System.out.println("Ходит " + player.getName() + " " + count + " шагов");
            player.position += count;
            if (player.position >= map.length) {
                System.out.println("Выиграл " + player.getName());
                return;
            }
        }
    }
}
