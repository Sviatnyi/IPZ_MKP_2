public class Game {
    public static void main(String[] args) {
        // Створення арени та спостерігача
        Arena arena = new Arena();
        ArenaObserver observer = new ArenaObserver();
        arena.addObserver(observer);

        // Створення персонажів через фабрику з іменами
        Character warrior = CharacterFactory.createCharacter("воїн", "Леонід", 0, 0);
        Character mage = CharacterFactory.createCharacter("маг", "Мерлін", 1, 1);
        Character archer = CharacterFactory.createCharacter("лучник", "Робін Гуд", 2, 2);
        Character boss = CharacterFactory.createCharacter("воїн", "Громила", 5, 5);

        // Додавання персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);
        arena.addCharacter(boss);

        // Початок битви
        System.out.println("\n--- Битва починається! ---");
        arena.coordinateAttack(warrior, boss); // Леонід атакує Громилу
        arena.coordinateAttack(mage, boss);    // Мерлін атакує Громилу
        arena.coordinateAttack(archer, boss);  // Робін Гуд атакує Громилу

        // Громила атакує Леоніда
        System.out.println("\n--- Громила відповідає! ---");
        arena.coordinateAttack(boss, warrior);

        // Дві фінальні атаки по Громилі
        System.out.println("\n--- Фінальні удари! ---");
        arena.coordinateAttack(warrior, boss); // Леонід атакує Громилу
        arena.coordinateAttack(mage, boss);    // Мерлін добиває Громилу

        // Перевірка, чи Громила переможений
        if (boss.getHealth() <= 0) {
            System.out.println("\nГромила тікає!");
        } else {
            System.out.println("\nГромила ще тримається!");
        }
    }
}
