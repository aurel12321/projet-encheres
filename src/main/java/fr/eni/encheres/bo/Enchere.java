package fr.eni.encheres.bo;

import java.time.LocalDateTime;

public class Enchere {

	private LocalDateTime dateEnchere;
	private int montantEnchere;

	private Utilisateur utilisateur;
	private Article article;

	public Enchere() {
		super();
	}

	public Enchere(LocalDateTime dateEnchere, int montantEnchere, Utilisateur utilisateur, Article article) {
		super();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
		this.utilisateur = utilisateur;
		this.article = article;
	}

	public LocalDateTime getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(LocalDateTime dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return String.format("Enchere [dateEnchere=%s, montantEnchere=%s, utilisateur=%s, article=%s]", dateEnchere,
				montantEnchere, utilisateur, article);
	}

}
