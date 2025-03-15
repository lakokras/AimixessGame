public class Program {

    public static void main(String[] args) {

        Player usualPlayer = new UsualPlayer();
        Player premiumPlayer = new PremiumPlayer();

        usualPlayer.generateNumber();
        premiumPlayer.generateNumber();

//        if (usualPlayer.getNumber() < premiumPlayer.getNumber()) {
//            return;
//        }
//        if (usualPlayer.getNumber() > premiumPlayer.getNumber()) {
//            System.out.println("ya v shoke");
//        }

        System.out.println("Ход обычного игрока " + usualPlayer.getNumber());
        System.out.println("Ход премиум игрока " + premiumPlayer.getNumber());
    }
}
