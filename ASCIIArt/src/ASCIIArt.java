
public class ASCIIArt {

	public static void main(String[] args) {
		//Spotted cat code:
		catTail();
		catBody();
		animalLegs();
		spotted();
		System.out.println("cat.");
		deadFish();
		deadFish();
		System.out.println();
		//Spotted dog code:
		dogBody();
		animalLegs();
		spotted();
		System.out.println("dog.");
		bone();
		bone();
	}
	
	public static void catBody() {
		System.out.println("  ) )  _' ' ' ' ' -_ /^______^\\   _____________");
		System.out.println("  ( ( /    O    O  \\|   o  o  |  |             |");
		System.out.println("  \\ \\/      O       \\  >  ^ < / <    \"MEOW\"    |");
		System.out.println("   \\ \\ O           \\/  +…………+    |_____________|");
		System.out.println("    \\   | ____O    |");
	}
	
	public static void catTail() {
		System.out.println("  _");
		System.out.println(" ( \\");
		System.out.println("  ) )");
		System.out.println(" ( (");
	}
	
	public static void animalLegs() {
		System.out.println(("    / / /     / / /"));
		System.out.println(("   / /_/_    / /_/_"));
		System.out.println(("  (_____))  (_____))"));
	}
	
	public static void dogBody() {
		System.out.println("                      _____         ___________");
		System.out.println("    /_' ' ' ' ' ' '  / / o \\____   |           |");
		System.out.println(" / /  O       O     /_/         \\ <    \"WOOF\"  |");
		System.out.println("/ /\\    \\ O         \\   ______\\_/  |___________|");
		System.out.println("    \\  O |____    O |");
	}
	
	public static void spotted() {
		System.out.println();
		System.out.print("A spotted ");
	}
	
	public static void deadFish() {
		System.out.print("><))))x> ");
	}

	public static void bone() {
		System.out.print(">-----< ");
	}
}
