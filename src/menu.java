
public class menu {
	public static void excute() {
		int op;
		console.println("=====================================");
		console.println("Menu");
		console.println("1 - Listar Participantes");
		console.println("2 - Listar Palestrantes");
		console.println("3 - Listar Organizadores");
		console.println("4 - Listar Salas");
		console.println("5 - Listar Palestras");
		op = console.readInt();
		if (op == 1) {
			creator.participante();
		}
		if (op == 2) {
			creator.palestrante();
		}
		if (op == 3) {
			creator.organizador();
		}
		if (op == 4) {
			creator.sala();
		}
		if (op == 5) {
			creator.palestra();
		} 
	}
}
