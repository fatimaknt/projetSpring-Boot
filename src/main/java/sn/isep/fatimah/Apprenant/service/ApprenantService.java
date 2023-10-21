package sn.isep.fatimah.Apprenant.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import sn.isep.fatimah.Apprenant.Apprenant.ApprenantModel;

//declarer que c'est un service
@Service
public class ApprenantService {
    
    //On va creer les methodes crud
     
    private static List<ApprenantModel> app=new ArrayList<>(Arrays.asList(
        new ApprenantModel((long) 1,"salimata", "kanoute", "Dakar", 23),
        new ApprenantModel((long) 2,"Astou", "Niass", "Ouakam", 23),
        new ApprenantModel((long) 3,"Fatima", "kanoute", "Canada", 23),
        new ApprenantModel((long) 4,"Amina", "Goudj", "K.massar", 23),
        new ApprenantModel((long) 5,"Zeynab", "Thia", "Guediawaye", 20)

    ));

    //methode qui permet de recuperer la liste de tout les utulisateurs
    public List<ApprenantModel> getApp(){
       return app;
    }

    public ApprenantModel getApps(Long id) {
        return app.stream().filter(ApprenantModel -> ApprenantModel.getId() == id).findFirst().orElse(null);
    }
    
    //delete
    public void deleteApp(Long id) {
        app.removeIf(ApprenantModel -> ApprenantModel.getId() == id);
    }
    
    //ajouter 
    public void add(ApprenantModel app2) {
        app.add(app2);
    }

    public void updateApp(ApprenantModel app2, Long id) {
        app.forEach(app1 ->{
            if (app2.getId() ==id) {
                app.set(app.indexOf(app1), app1);
                
            }
            
        });
    }




}
