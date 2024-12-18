public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y;

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        this.health -= damage;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void attack(Character target) {
        System.out.println(this.name + " атакує " + target.getName() + " на " + this.attackPower + " урону!");
        target.reduceHealth(this.attackPower);
        System.out.println("Здоров'я " + target.getName() + ": " + target.getHealth());
    }
}
