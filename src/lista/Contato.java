package lista;

public class Contato {

	private String name;
	private String email;
	private String celular;

	public Contato() {

	}

	public Contato(String name, String email, String celular) {
		this.name = name;
		this.email = email;
		this.celular = celular;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String toString() {
		return name + ", " + email + ", " + celular;
	}

	
}
