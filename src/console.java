import java.util.Scanner;

public class console {
	private static Scanner teclado = new Scanner(System.in);

	public static void println(Object mensagem) {
		System.out.println(mensagem.toString());
	}

	public static void print(Object mensagem) {
		System.out.print(mensagem.toString());
	}

	public static String readString() {
		print(">");
		return teclado.nextLine();
	}

	public static int readInt() {
		print(">");
		return teclado.nextInt();
	}

}
