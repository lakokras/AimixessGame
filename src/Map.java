import java.util.Random;

class Map {

    private String name;
    public int length;

    public Map(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public static boolean isSkipMove() {
        Random random = new Random();
        int num = random.nextInt(0, 11);
        if (num > 9) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}