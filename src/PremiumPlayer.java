import java.util.Random;

public class PremiumPlayer extends Player {

    public PremiumPlayer(String name) {
        super(name);
    }

    @Override
    public int generateNumber() {
        Random random = new Random();
        this.number = random.nextInt(0, 100);
        return this.number;
    }
}
