package progetto.model;

import javax.persistence.*;

import java.util.*;

public class Autore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cogmone;
	private String nazionalita;
	@Temporal(TemporalType.DATE)
	private Date dataNascita;
	@Temporal(TemporalType.DATE)
	private Date dataMorte;
	@OneToMany(mappedBy="autore")
	private List<Quadro> quadriRealizzati = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCogmone() {
		return cogmone;
	}
	
	public void setCogmone(String cogmone) {
		this.cogmone = cogmone;
	}
	
	public String getNazionalita() {
		return nazionalita;
	}
	
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	
	public Date getDataNascita() {
		return dataNascita;
	}
	
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	public Date getDataMorte() {
		return dataMorte;
	}
	
	public void setDataMorte(Date dataMorte) {
		this.dataMorte = dataMorte;
	}
	
	public List<Quadro> getQuadriRealizzati() {
		return quadriRealizzati;
	}
	
	public void setQuadriRealizzati(List<Quadro> quadriRealizzati) {
		this.quadriRealizzati = quadriRealizzati;
	}
	
	public Long getId() {
		return id;
	}
}
