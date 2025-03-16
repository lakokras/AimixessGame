public class Program {

    public static void main(String[] args) {

        Player usualPlayer = new UsualPlayer("Лузер");
        Player simplePlayer = new UsualPlayer("ВАНЮХА");
        Player premiumPlayer = new PremiumPlayer("Профик");

        Player[] players = new Player[3];
        players[0] = usualPlayer;
        players[1] = simplePlayer;
        players[2] = premiumPlayer;

        Map map = new Map("YT Shorts", 1000);

        Game game = new Game(players, map);
        game.start();
    }
}