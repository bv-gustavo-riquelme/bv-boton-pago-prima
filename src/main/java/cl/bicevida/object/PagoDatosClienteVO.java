package cl.bicevida.object;

import java.io.Serializable;
import java.util.Date;

public class PagoDatosClienteVO implements Serializable{

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int rutCliente;
    private String nombreCliente;
    private Date fechaConsulta;
    private Date fechaUF;
    private String direccion;
    private String ciudad;
    private String comuna;
    private String region;
    private String email;
    private String urlPDFs;
    private String[] idsPDFs;
    
	public PagoDatosClienteVO() {
		// TODO Auto-generated constructor stub
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public Date getFechaUF() {
		return fechaUF;
	}

	public void setFechaUF(Date fechaUF) {
		this.fechaUF = fechaUF;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrlPDFs() {
		return urlPDFs;
	}

	public void setUrlPDFs(String urlPDFs) {
		this.urlPDFs = urlPDFs;
	}

	public String[] getIdsPDFs() {
		return idsPDFs;
	}

	public void setIdsPDFs(String[] idsPDFs) {
		this.idsPDFs = idsPDFs;
	}

}
