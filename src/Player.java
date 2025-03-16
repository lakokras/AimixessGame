public abstract class Player {

    private String name;
    public int position = 0;
    protected int number;

    public Player(String name){

        this.name=name;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int generateNumber();

}