package Entity;

public class PartageCollection {
    private int id;
    private int idCollection;
    private int idUser;
    private String droit;

    public PartageCollection(int idCollection, int idUser, String droit) {
        this.idCollection = idCollection;
        this.idUser = idUser;
        this.droit = droit;
    }

    public int getId() { return id; }
    public int getIdCollection() { return idCollection; }
    public int getIdUser() { return idUser; }
    public String getDroit() { return droit; }
}
