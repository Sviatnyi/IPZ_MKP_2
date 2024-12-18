public class CharacterFactory {
    public static Character createCharacter(String type, String name, int x, int y) {
        switch (type.toLowerCase()) {
            case "воїн":
                return new Warrior(name, x, y);
            case "маг":
                return new Mage(name, x, y);
            case "лучник":
                return new Archer(name, x, y);
            default:
                throw new IllegalArgumentException("Невідомий тип персонажа: " + type);
        }
    }
}
