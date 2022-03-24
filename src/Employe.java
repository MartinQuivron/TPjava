class Employe extends Personne {
  int salaire;
  boolean enService = false;

  // Constructeur par défaut
  Employe(){
    super();
    this.salaire = -1;
  }

  // Constructeur
  Employe(String nom, String prenom, int salaire){
    super();
    this.nom = nom;
    this.prenom = prenom;
    this.salaire = salaire;
  }

  int getSalaire(){
    return this.salaire;
  }

  void setSalaire(int salaire){
    this.salaire = salaire;
  }
}
