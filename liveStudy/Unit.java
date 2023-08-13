package liveStudy;

public abstract class Unit {

    int hp;
    int attackPoint;

    public Unit(int hp, int attackPoint){   // 해당 생성자가 빌런에서 super(hp, attackPoint )로 호출된다.
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    public abstract  void attack(Unit unit);

    public void attackedBy(Unit unit){
        this.hp -= unit.attackPoint;
    }
}
