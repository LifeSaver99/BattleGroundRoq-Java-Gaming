import java.util.Random;
import java.util.Scanner;

public class BattleMain {

	public static void main(String[] args) {
		Random battle = new Random();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int hero, match, restart;

		Duel Jacob = new Duel("Jacob", 6, 0, 19);
		Duel Maddy = new Duel("Maddy", 8, 1, 16);
		Duel Floz = new Duel("Floz", 5, 2, 18);

		System.out.println("Choose your HERO");

		System.out.println("Press 1 for the Mage Lord Jacob");
		Jacob.printStats();

		System.out.println("Press 2 for the Warrior Maddy");
		Maddy.printStats();

		System.out.println("Press 3 for the English Prince Floz");
		Floz.printStats();

		hero = input.nextInt();
		if (hero == 1) {
			System.out.println("You have chosen Lord Jacob!");
			while (hero == 1) {
				match = 1 + battle.nextInt(2);
				if (match == 1) {
					System.out.println("Your battle is against Warrior Maddy!");
					Jacob.duel(Jacob, Maddy);
				} else if (match == 2) {
					System.out.println("Your battle is against Prince Floz!");
					Jacob.duel(Jacob, Floz);
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");
				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}

		if (hero == 2) {
			System.out.println("You have chosen Warrior Maddy!");
			while (hero == 2) {
				match = 1 + battle.nextInt(2);
				if (match == 1) {
					System.out.println("Your battle is against Mage Jacob!");
					Maddy.duel(Maddy, Jacob);
				} else if (match == 2) {
					System.out.println("Your battle is against Prince Floz!");
					Maddy.duel(Maddy, Floz);
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");

				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}

		if (hero == 3) {
			System.out.println("You have chosen Prince Floz!");
			while (hero == 3) {
				match = 1 + battle.nextInt(2);
				if (match == 1) {
					System.out.println("Your battle is against Mage Jacob!");
					Floz.duel(Floz, Jacob);
				} else if (match == 2) {
					System.out.println("Your battle is against Warrior Maddy!");
					Floz.duel(Floz, Maddy);
				}
				System.out.println("");
				System.out.println("Fight again?");
				System.out.println("1 for Yes");
				System.out.println("2 for No");
				restart = input.nextInt();
				if (restart == 1) {
					System.out.println("");
				} else if (restart == 2) {
					System.out.println("Thank you for playing!");
					break;
				}

			}
		}
	}
}
