package fr.eni.encheres.bo;

public class Categorie {
	
	private Long idCategorie;
	private String libelle;
	
	public Categorie(Long idCategorie, String libelle) {
		super();
		this.idCategorie = idCategorie;
		this.libelle = libelle;
	}	

	public Categorie() {
		super();
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return String.format("Categories [idCategorie=%s, libelle=%s]", idCategorie, libelle);
	}
	
	

}
