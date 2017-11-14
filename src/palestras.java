
public class palestras {
	private static String palestrante;
	private static String titulo;
	private static String descricao;
	private static String sala;

	public palestras(String titulo, String descricao, String palestrante, String sala) {
		super();
		this.palestrante = palestrante;
		this.titulo = titulo;
		this.descricao = descricao;
		this.sala = sala;
	}

	public static String getPalestrante() {
		return palestrante;
	}

	public static String getTitulo() {
		return titulo;
	}

	public static String getDescricao() {
		return descricao;
	}

	public static String getSala() {
		return sala;
	}

}
