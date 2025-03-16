public class Game {
    private Player[] players;
    private Map map;

    public Game(Player[] players, Map map) {
        this.players = players;
        this.map = map;
    }

    public void start() {
        System.out.println("Добро пожаловать | " + map.getName());
        while (true) {
            for (Player player : players) {

                if (Map.isSkipMove()) {
                    System.out.println("Пропускает ход: " + player.getName());
                    continue;
                }

                int move = player.generateNumber();
                System.out.print("Ходит " + player.getName() + " " + move + " шагов. ");
                player.position += move;
                System.out.println("Текущая позиция: " + player.position);

                if (player.position >= map.length) {
                    System.out.println("Выиграл " + player.getName());
                    return;
                }
            }
        }
    }
}