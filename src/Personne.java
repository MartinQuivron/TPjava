abstract class Personne {
  String nom = "unknown";
  String prenom = "unknown";

  // Constructeur par défaut
  Personne(){}

  // Constructeur
  Personne(String nom, String prenom){
    this.nom = nom;
    this.prenom = prenom;
  }

  String getNom(){
    return nom;
  }
  String getPrenom(){
    return prenom;
  }

  void setNom(String nom){
    this.nom = nom;
  }
  void setPrenom(String prenom){
    this.prenom = prenom;
  }
}
