package Service;

import Entity.PartageCollection;
import Utils.DataaSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServicePartage {
    private Connection con = DataaSource.getInstance().getCon();

    public void partagerCollection(int idCollection, int idUser, String droit) throws SQLException {
        String query = "INSERT INTO partage_collections (idCollection, idUser, droit) VALUES (?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, idCollection);
            pst.setInt(2, idUser);
            pst.setString(3, droit);
            pst.executeUpdate();
        }
    }

    public List<PartageCollection> getPartagesParUtilisateur(int idUser) throws SQLException {
        List<PartageCollection> partages = new ArrayList<>();
        String query = "SELECT * FROM partage_collections WHERE idUser = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, idUser);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                partages.add(new PartageCollection(rs.getInt("idCollection"), rs.getInt("idUser"), rs.getString("droit")));
            }
        }
        return partages;
    }
}
