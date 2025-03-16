import java.util.Random;

public class UsualPlayer extends Player {

    public UsualPlayer(String name) {
        super(name);
    }

    @Override
    public int generateNumber() {
        Random random = new Random();
        this.number = random.nextInt(0, 80);
        return this.number;
    }
}
