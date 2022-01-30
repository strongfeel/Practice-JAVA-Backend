package chapter;
class SpiderMan {
    int power;
    int level;
    String color;
    String skill;

    void jump() {
        System.out.println("SpiderMan is jumping.");
    }

    void walk() {
        System.out.println("SpiderMan is walking.");
    }

    void shoot() {
        System.out.println("SpiderMan is shooting a cobweb.");
    }

    void come() {
        System.out.println("SpiderMan is being brought face to face with enemy.");
    }

    void fight() {
        System.out.println("SpiderMan is fighting.");
    }

}

public class Ex {

    public static void main (String[] args) {
        SpiderMan sm = new SpiderMan();

        sm.color = "Red and Black";
        sm.level = 20;
        sm.power = 100000;
        sm.skill = "SpiderMan has skills of spider.";

        System.out.println(sm.color);
        System.out.println(sm.level);
        System.out.println(sm.power);
        System.out.println(sm.skill);

        sm.shoot();
        sm.come();
        sm.jump();
        sm.walk();
        sm.fight();
    }

}

