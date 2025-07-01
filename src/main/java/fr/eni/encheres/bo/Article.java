package fr.eni.encheres.bo;

import java.time.LocalDateTime;

public class Article {
	
	
	    private Long idArticle;
	    private String nomArticle;
	    private String description;
	    private LocalDateTime dateDebutEncheres;
	    private LocalDateTime dateFinEncheres;
	    private int miseAPrix;
	    private int prixVente;
	    private String etatVente;

	    private Categorie categorie;
	    private Utilisateur vendeur;
	    private Retrait lieuRetrait;
	    
		public Article(Long idArticle, String nomArticle, String description, LocalDateTime dateDebutEncheres,
				LocalDateTime dateFinEncheres, int miseAPrix, int prixVente, String etatVente, Categorie categorie,
				Utilisateur vendeur, Retrait lieuRetrait) {
			super();
			this.idArticle = idArticle;
			this.nomArticle = nomArticle;
			this.description = description;
			this.dateDebutEncheres = dateDebutEncheres;
			this.dateFinEncheres = dateFinEncheres;
			this.miseAPrix = miseAPrix;
			this.prixVente = prixVente;
			this.etatVente = etatVente;
			this.categorie = categorie;
			this.vendeur = vendeur;
			this.lieuRetrait = lieuRetrait;
		}

		public Article() {
			super();
		}

		public Long getIdArticle() {
			return idArticle;
		}

		public void setIdArticle(Long idArticle) {
			this.idArticle = idArticle;
		}

		public String getNomArticle() {
			return nomArticle;
		}

		public void setNomArticle(String nomArticle) {
			this.nomArticle = nomArticle;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public LocalDateTime getDateDebutEncheres() {
			return dateDebutEncheres;
		}

		public void setDateDebutEncheres(LocalDateTime dateDebutEncheres) {
			this.dateDebutEncheres = dateDebutEncheres;
		}

		public LocalDateTime getDateFinEncheres() {
			return dateFinEncheres;
		}

		public void setDateFinEncheres(LocalDateTime dateFinEncheres) {
			this.dateFinEncheres = dateFinEncheres;
		}

		public int getMiseAPrix() {
			return miseAPrix;
		}

		public void setMiseAPrix(int miseAPrix) {
			this.miseAPrix = miseAPrix;
		}

		public int getPrixVente() {
			return prixVente;
		}

		public void setPrixVente(int prixVente) {
			this.prixVente = prixVente;
		}

		public String getEtatVente() {
			return etatVente;
		}

		public void setEtatVente(String etatVente) {
			this.etatVente = etatVente;
		}

		public Categorie getCategorie() {
			return categorie;
		}

		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}

		public Utilisateur getVendeur() {
			return vendeur;
		}

		public void setVendeur(Utilisateur vendeur) {
			this.vendeur = vendeur;
		}

		public Retrait getLieuRetrait() {
			return lieuRetrait;
		}

		public void setLieuRetrait(Retrait lieuRetrait) {
			this.lieuRetrait = lieuRetrait;
		}

		@Override
		public String toString() {
			return String.format(
					"articleVendu [idArticle=%s, nomArticle=%s, description=%s, dateDebutEncheres=%s, dateFinEncheres=%s, miseAPrix=%s, prixVente=%s, etatVente=%s, categorie=%s, vendeur=%s, lieuRetrait=%s]",
					idArticle, nomArticle, description, dateDebutEncheres, dateFinEncheres, miseAPrix, prixVente,
					etatVente, categorie, vendeur, lieuRetrait);
		}
	    
	    
	}


