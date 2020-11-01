package hotelparaiso.entity;

public class Trabajador {
	private int idpersona;
    private double sueldo;
    private String acceso;
    private String login;
    private String password;
    private String estado;
	public Trabajador() {
		
	}
	public Trabajador(int idpersona, double sueldo, String acceso, String login, String password, String estado) {
		
		this.idpersona = idpersona;
		this.sueldo = sueldo;
		this.acceso = acceso;
		this.login = login;
		this.password = password;
		this.estado = estado;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getAcceso() {
		return acceso;
	}
	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    
}
