package entities;

public class estudante {
	private String nome;
	private String email;
	private int room;
	public estudante(String nome, String email, int room) {
		super();
		this.room = room;
		this.nome = nome;
		this.email = email;

	}

//	@Override
//	public String toString() {
//		return "Name: " + nome + "\n" + "Email: " + email;
//	}

	public String getNome() {
		return nome;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
