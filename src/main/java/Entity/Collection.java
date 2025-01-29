package Entity;

public class Collection {
    private int id;
    private String nom;
    private String description;
    private int idUser;

    public Collection(int id, String nom, String description, int idUser) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.idUser = idUser;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getDescription() { return description; }
    public int getIdUser() { return idUser; }
}
