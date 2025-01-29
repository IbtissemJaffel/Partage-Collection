package main;

import Entity.User;
import Service.AutherService;
import Service.ServicePartage;

public class main {
    public static void main(String[] args) {
        AutherService.setCurrentUser(new User(1, "JohnDoe", "john@example.com", "password123"));

        ServicePartage servicePartage = new ServicePartage();
        try {
            servicePartage.partagerCollection(2, 3, "lecture");
            System.out.println("Partage ajouté avec succès !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
