package progetto.model;

import java.util.*;
import javax.persistence.*;

@Entity
@NamedQuery(name= "findAll", query = "SELECT q FROM Quadro q")
public class Quadro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titolo;
	private String tecnica;
	@ManyToOne
	private String autore;
	@Temporal(TemporalType.DATE)
	private Date dataRealizzazione;
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getTecnica() {
		return tecnica;
	}
	
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public Date getDataRealizzazione() {
		return dataRealizzazione;
	}
	
	public void setDataRealizzazione(Date dataRealizzazione) {
		this.dataRealizzazione = dataRealizzazione;
	}
	
	public Long getId() {
		return id;
	}
}
