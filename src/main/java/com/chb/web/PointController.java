package com.chb.web;

import com.chb.dao.ClientRepository;
import com.chb.dao.CoachRepository;
import com.chb.dao.PointRepository;
import com.chb.entities.*;
import com.chb.metier.IPointMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PointController {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CoachRepository coachRepository;
    @Autowired
    private PointRepository pointRepository;
    @Autowired
    private IPointMetier pointMetier;

    @RequestMapping("/listClient")
    public String index(Model model) {
        try {
            List<Client> pageClients = clientRepository.findAll();
            model.addAttribute("listClient", pageClients);
        } catch (Exception e) {
            model.addAttribute("exception", e);
        }
        return "listClient";
    }


    @RequestMapping("/consulterClient")
    public String consulter(Model model, String prenomClient) {
        try {
           Client cl = clientRepository.consulterClientDao(prenomClient);
           String formule = cl.getFormule().getClass().getSimpleName();
           String coach = cl.getCoach().getNomCoach();
           model.addAttribute("coachClient", coach);
           model.addAttribute("formule", formule);
           model.addAttribute("client", cl);
        } catch (Exception e) {
            model.addAttribute("exception", e);
        }
        return "profilClient";
    }

    @RequestMapping(value = "/ajoutClient", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("client", new Client());
        return "ajoutClient";
    }

    @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
    public String save(Client client) {
        Coach coach = new Coach();
        Formule formule;
        clientRepository.save(client);
        client.setCoach(coach);
            if(client.getFormule().getCodeFormule() == 1){
                formule = new Basic();
            }
            else if(client.getFormule().getCodeFormule() == 2){
                formule = new Silver();
            }
            else
                formule = new Gold();
        client.setFormule(formule);
        System.out.println(client.getCoach().getCodeCoach());
        System.out.println(client.getPrenomClient());
        return "redirect:/listClient";
    }
    @RequestMapping(value = "/editClient", method = RequestMethod.GET)
    public String edit(Long codeClient, Model model) {
        Client cl = clientRepository.findClientByCodeClient(codeClient);
        model.addAttribute("client", cl);
        return "editClient";
    }
    @RequestMapping(value = "/updateClient", method = RequestMethod.POST)
    public String update(Client client) {
        Coach coach = new Coach();
        Formule formule;
        clientRepository.save(client);
        client.setCoach(coach);
        if(client.getFormule().getCodeFormule() == 1){
            formule = new Basic();
        }
        else if(client.getFormule().getCodeFormule() == 2){
            formule = new Silver();
        }
        else
            formule = new Gold();
        client.setFormule(formule);
        return "redirect:/listClient";
    }

    @RequestMapping(value = "/deleteClient")
    public String deleteClient(Long codeClient){
        Client cl = clientRepository.findClientByCodeClient(codeClient);
        clientRepository.delete(cl);
        return "redirect:/listClient";
    }

    @RequestMapping("/listClientsDuCoach")
    public String clientCoach(Model model, String nomCoach) {
        try {
            String username = nomCoach;
//            Coach coach = coachRepository.consulterCoach(nomCoach);
            List<Client> pageClients = pointMetier.listClientDuCoach(nomCoach);
            model.addAttribute("listClient", pageClients);
        } catch (Exception e) {
            model.addAttribute("exception", e);
        }
        return "listClientsCoach";
    }
    // **************************** Formulaire d'ajout pour les coachs ****************************************
    @RequestMapping(value = "/ajoutCoach", method = RequestMethod.GET)
    public String formCoach(Model model) {
        model.addAttribute("coach", new Coach());
        return "ajoutCoach";
    }
    @RequestMapping(value = "/saveCoach", method = RequestMethod.POST)
    public String saveCoach(Coach coach) {
        coachRepository.save(coach);
        return "redirect:/listCoach";
    }
    @RequestMapping("/listCoach")
    public String listCocach(Model model) {
        try {
            List<Coach> pageCoachs = coachRepository.findAll();
            model.addAttribute("listCoach", pageCoachs);
        } catch (Exception e) {
            model.addAttribute("exception", e);
        }
        return "listCoach";
    }
    // ************************** Formulaire d'ajout pour les points ***************************************
    @RequestMapping(value = "/ajoutPoint", method = RequestMethod.GET)
    public String formPoint(Model model) {
        model.addAttribute("point", new Point());
        return "profilClient";
    }
    @RequestMapping(value = "/savePoint", method = RequestMethod.POST)
    public String savePoint(Point point, Client client) {
        point.setClient(client);
        pointRepository.save(point);
        return "redirect:/listPoint";
    }
    @RequestMapping("/listPoint")
    public String listPoint(Model model) {
        try {
            List<Point> pagePoints = pointRepository.findAll();
            model.addAttribute("listPoint", pagePoints);
        } catch (Exception e) {
            model.addAttribute("exception", e);
        }
        return "listPoint";
    }
    @RequestMapping("/test")
    public String tabBord(Model model) {
        return "ajoutCoach";
    }
}
