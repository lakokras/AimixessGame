public class Program {

    public static void main(String[] args) {

        Player usualPlayer = new UsualPlayer();
        Player premiumPlayer = new PremiumPlayer();
        Map map = new Map();

        Game game = new Game([usualPlayer, premiumPlayer], map);
        game.start();
    }
}
