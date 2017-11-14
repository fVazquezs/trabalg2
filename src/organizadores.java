
public class organizadores {
	private static String nome;
	private static String email;

	public organizadores(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public static String getNome() {
		return nome;
	}
	public static String getEmail() {
		return email;
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
}
