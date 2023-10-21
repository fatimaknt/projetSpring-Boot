package sn.isep.fatimah.Apprenant.Apprenant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.isep.fatimah.Apprenant.service.ApprenantService;

//definir le controller
@RestController
public class ApprenantController {

    //Appeler le service 
    @Autowired
    private ApprenantService apprenantService;

    //instancier l'objet
    @RequestMapping("/Apprenants")

    public List<ApprenantModel> getApp(){
        return apprenantService.getApp();
    }

    //recuper id
    @RequestMapping("/Apprenant/{id}")
    public ApprenantModel getApprenant(@PathVariable Long id){
        return apprenantService.getApps(id);
    }

    //delete une methode 
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/Apprenant/{id}")
    public void deleteApprenant(@PathVariable Long id){
        apprenantService.deleteApp(id);
    }

    //ajouter 
    @RequestMapping(method = RequestMethod.POST, value = "/Apprenants")
    public void addApp(@RequestBody ApprenantModel app){
        apprenantService.add(app);
    }

    //modifier
    @RequestMapping(method = RequestMethod.PUT, value = "/Apprenant/{id}")
    public void updateApprenant(@RequestBody ApprenantModel app, @PathVariable Long id){
        apprenantService.updateApp(app,id);
    }
}
