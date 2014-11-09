package dto;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlRootElement(name="log")
public class ItemAuditoriaDTO {

	private AuditoriaDTO auditoria;
	private Calendar fecha;
	private String log;
	private int idModulo;
	

	public AuditoriaDTO getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(AuditoriaDTO auditoria) {
		this.auditoria = auditoria;
	}

	@XmlElement(name = "idModulo")
	public int getIdModulo() {
		return idModulo;
	}
	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}
	@XmlElement(name = "fecha")
	//@XmlJavaTypeAdapter(DateAdapter.class)
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	@XmlElement(name = "mensaje")
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	
	
	
	
	

}