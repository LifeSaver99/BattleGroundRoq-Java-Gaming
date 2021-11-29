
public class Mage {
	String name;
	int attack;
	int defense;
	int health;

	public Mage(String Name, int Attack, int Defense, int Health) {
		name = Name;
		attack = Attack;
		defense = Defense;
		health = Health;

	}

}

class Duel extends Mage {
	public Duel(String Name, int Attack, int Defense, int Health) {
		super(Name, Attack, Defense, Health);

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAtack(int attack) {
		this.attack = attack;
	}

	public int getAttack() {
		return attack;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getDefense() {
		return defense;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {
		return health > 0;
	}

	public void attack(Duel attacker, Duel defender) {

		int damage = Math.max(0, attacker.getAttack() - defender.getDefense());
		int health = defender.getHealth() - damage;

		System.out.println(attacker.getName() + "'s attack does " + damage + " damage!\n");
		System.out.println(defender.getName() + "'s Health\n" + health);
		defender.setHealth(health);
	}

	void printStats() {
		System.out.println("Attack is " + attack + " Defense is " + defense + " Health is " + health);
	}

	public void duel(Duel attacker, Duel defender) {
		int health1 = attacker.health;
		int health2 = defender.health;

		do {
			attack(attacker, defender);
			attack(defender, attacker);
		} while (attacker.isAlive() && defender.isAlive());
		if (attacker.isAlive()) {
			System.out.println("YOU WIN!!!");
		} else if (defender.isAlive()) {
			System.out.println("You lose!");
		} else {
			System.out.println("Draw!");
		}

		attacker.health = health1;
		defender.health = health2;

	}
}