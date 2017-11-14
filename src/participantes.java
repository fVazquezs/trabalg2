
public class participantes {
	private static String nome;
	private static String email;
	private static String inscricao;

	public participantes(String nome, String email, String inscricao) {
		super();
		this.nome = nome;
		this.email = email;
		this.inscricao = inscricao;
	}

	public static String getNome() {
		return nome;
	}
	public static String getEmail() {
		return email;
	}
	public static String getInscricao() {
		return inscricao;
	}

}
