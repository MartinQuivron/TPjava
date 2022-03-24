class Table {
  private int id;
  private int places;
  private Serveur serveur = null;
  private boolean occupee = false;

  // Constructeur par défaut
  Table(){
    this.id = -1;
    this.places = 0;
  }

  // Constructeur
  Table(int id, int places){
    this.id = id;
    this.places = places;
  }

  int getId(){
    return this.id;
  }
  int getPlaces(){
    return this.places;
  }
  Serveur getServeur(){
    return this.serveur;
  }
  boolean GetOccupation(){
    return this.occupee;
  }

  void setId(int id){
    this.id = id;
  }
  void setPlaces(int places){
    this.places = places;
  }
  void setServeur(Serveur serveur){
    this.serveur = serveur;
  }
  void setOccupation(boolean occupee){
    this.occupee = occupee;
  }
}
