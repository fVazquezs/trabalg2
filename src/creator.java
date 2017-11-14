import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class creator {

	public static void organizador() {
		console.println("=====================================");
		Scanner org;
		try {
			org = new Scanner(new File("data/organizadores.csv"));
			org.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			console.println("Arquivo não encontrado.");
			return;
		}
		
		while (org.hasNext()) {
			evento.organizador = new organizadores(org.next(), org.next());
			console.print("Nome: "+evento.organizador.getNome()+" - Email: "+evento.organizador.getEmail()+"\n");
		}
		
		org.close();
	}

	

	public static void palestrante() {
		console.println("=====================================");
		Scanner pal;
		try {
			pal = new Scanner(new File("data/palestrantes.csv"));
			pal.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			console.println("Arquivo não encontrado.");
			return;
		}
		
		while (pal.hasNext()) {
			evento.palestrante = new palestrantes(pal.next(), pal.next());
			console.print("Nome: "+evento.palestrante.getNome()+" - Profissão: "+evento.palestrante.getArea());
		}
		
		pal.close();
	}

	public static void participante() {
		console.println("=====================================");
		Scanner part;
		try {
			part = new Scanner(new File("data/participantes.csv"));
			part.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			console.println("Arquivo não encontrado.");
			return;
		}
		
		while (part.hasNext()) {
			evento.participante = new participantes(part.next(),part.next(), part.next());
			console.print("Nome: "+evento.participante.getNome()+" - Email: "+evento.participante.getEmail()+" Inscrição: "+evento.participante.getInscricao());
		}
		
		part.close();
	}

	public static void sala() {
		console.println("=====================================");
		Scanner room;
		try {
			room = new Scanner(new File("data/salas.csv"));
			room.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			console.println("Arquivo não encontrado.");
			return;
		}
		
		while (room.hasNext()) {
			evento.sala = new salas(room.next());
			console.print("Sala: "+evento.sala.getNumero());
		}
		console.println("");
		room.close();
	}

	public static void palestra() {
		console.println("=====================================");
		Scanner pale;
		try {
			pale = new Scanner(new File("data/palestras.csv"));
			pale.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			console.println("Arquivo não encontrado.");
			return;
		}
		
		while (pale.hasNext()) {
			evento.palestra = new palestras(pale.next(),pale.next(),pale.next(), pale.next());
			console.print("Título: "+evento.palestra.getTitulo()+"\nDescrição: "+evento.palestra.getDescricao()+"\nPalestrante: "+evento.palestra.getPalestrante()+" - Sala: "+evento.palestra.getSala());
			if (pale.hasNext()) {
				console.println("----");
			} else {
				console.println("");
			}
		}
		
		pale.close();
	}
}
