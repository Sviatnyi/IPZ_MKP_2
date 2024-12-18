import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.getName() + " додано на арену!");
        notifyObservers("Новий персонаж " + character.getName() + " з'явився на арені!");
    }

    public void coordinateAttack(Character attacker, Character target) {
        if (characters.contains(attacker) && characters.contains(target)) {
            attacker.attack(target);
            if (target.getHealth() <= 0) {
                System.out.println(target.getName() + " переможений!");
            }
        } else {
            System.out.println("Один із персонажів не знаходиться на арені!");
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
