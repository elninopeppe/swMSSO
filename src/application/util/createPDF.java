package application.util;

import java.time.LocalDate;

public class createPDF {

	private String nome;
	private String indirizzo;
	private String paese;
	private int civico;
	private float costo;
	private LocalDate data;
	private int numeroRicevuta;

	public createPDF() {
		super();
		// TODO Auto-generated constructor stub
	}

	public createPDF(String nome, String indirizzo, String paese, int civico, float costo, LocalDate data,
			int numeroRicevuta) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.paese = paese;
		this.civico = civico;
		this.costo = costo;
		this.data = data;
		this.numeroRicevuta = numeroRicevuta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getPaese() {
		return paese;
	}

	public void setPaese(String paese) {
		this.paese = paese;
	}

	public int getCivico() {
		return civico;
	}

	public void setCivico(int civico) {
		this.civico = civico;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getNumeroRicevuta() {
		return numeroRicevuta;
	}

	public void setNumeroRicevuta(int numeroRicevuta) {
		this.numeroRicevuta = numeroRicevuta;
	}

	}
