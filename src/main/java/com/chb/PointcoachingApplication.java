package com.chb;

import com.chb.dao.ClientRepository;
import com.chb.dao.CoachRepository;
import com.chb.dao.FormuleRepository;
import com.chb.dao.PointRepository;
import com.chb.entities.*;
import com.chb.metier.IPointMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PointcoachingApplication implements CommandLineRunner {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CoachRepository coachRepository;
    @Autowired
    private IPointMetier pointMetier;
    @Autowired
    private FormuleRepository formuleRepository;
    @Autowired
    private PointRepository pointRepository;
    public static void main(String[] args) {

        SpringApplication.run(PointcoachingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* Coach ch1 = coachRepository.save(new Coach("mamadou", "Mamadou"));
        Coach ch2 = coachRepository.save(new Coach("angele", "Angèle"));
        Coach ch3 = coachRepository.save(new Coach("yaya", "Yaya"));
        Coach ch4 = coachRepository.save(new Coach("codou", "Codou"));*/

      /*  Formule fBasic = formuleRepository.save(new Basic());
        Formule fSilver = formuleRepository.save(new Silver());
        Formule fGold = formuleRepository.save(new Gold());*/

      /*  Formule fAwa = formuleRepository.save(new Basic(185,true));
        Client clAwa = clientRepository.save(new Client("Awa","Fall", 32, 115, 10, 185,"Feminin", "awa@gmail.com","77 546 77 32","Senegal","Asmath" ,"Néant",ch1, fAwa));

        Formule fOuleye = formuleRepository.save(new Gold(155, false));
        Client clOuleye= clientRepository.save(new Client("Ouleye","Mané", 28, 123, 8, 174,"Feminin", "ouleye54@gmail.com","77 679 61 68","France","Néant","Diabétique", ch3, fOuleye));

        Formule fMor = formuleRepository.save(new Silver(118,false));
        Client cMor= clientRepository.save(new Client("Mor","Seck", 30, 123, 12, 135,"Masculin", "mor24@gmail.com","77 629 86 68","Belgique","Asmath","Néant", ch1, fMor));

        Formule fFatou = formuleRepository.save(new Gold(169, true));
        Client cFatou = clientRepository.save(new Client("Fatou","Faye", 26, 115, 6, 181,"Feminin", "fatou34@gmail.com","77 251 10 87","Senegal","Obèse","Hypertension", ch1, fFatou));

        Formule fOmar = formuleRepository.save(new Gold(145, false));
        Client clOmar= clientRepository.save(new Client("Omar","Diop", 25, 139, 18, 193,"Masculin", "omar14@gmail.com","77 453 66 09","France","Obèse","Néant", ch3, fOmar));

        Formule fDiarra = formuleRepository.save(new Silver(142, false));
        Client cDiarra= clientRepository.save(new Client("Diarra","Diouf", 30, 123, 8, 135,"Féminin", "diarrabaly@gmail.com","77 641 03 49","Senegal","Néant","Néant", ch2, fDiarra));

        Formule fAicha = formuleRepository.save(new Basic(185, true));
        Client clAicha = clientRepository.save(new Client("Touré","Aicha", 32, 115, 10, 185,"Feminin", "aichadieng@gmail.com","77 54( 08 13","Mauritanie","","", ch1, fAicha));

        Formule fRama = formuleRepository.save(new Gold(174, false));
        Client clRama= clientRepository.save(new Client("Rama","Diop", 25, 123, 8, 174,"Feminin", "rama24@gmail.com","76 767 65 10","France","Néant","Néant", ch3, fRama));

        Formule fCheikh = formuleRepository.save(new Silver(118, false));
        Client clCheikh= clientRepository.save(new Client("Cheikh","Sarr", 47, 123, 12, 135,"Masculin", "cheikhsarr@gmail.com","77 735 77 36","Senegal","Néant","", ch1, fCheikh));

        Formule fAminata = formuleRepository.save(new Gold(189, true));
        Client clAminata = clientRepository.save(new Client("Aminata","Mbacké", 46, 115, 6, 181,"Feminin", "minafaye@gmail.com","76 763 56 90","Mauritanie","Asmath","", ch1, fAminata));

        Formule fSerigne = formuleRepository.save(new Gold(145, false));
        Client clSerigne= clientRepository.save(new Client("Serigne","Sene", 25, 139, 18, 193,"Masculin", "serignefall@gmail.com","77 090 19 07","Senagal","Obèse","Néant", ch3, fSerigne));

        Formule fMareme = formuleRepository.save(new Silver(142, false));
        Client cMareme= clientRepository.save(new Client("Mareme","Fall", 30, 123, 8, 135,"Féminin", "mareme97@gmail.com","78 174 11 81","Etats unis","Néant","Néant", ch2, fMareme));

        Client test =  pointMetier.consulterClient("Mor");
        System.out.println(test.getFormule().getClass().getSimpleName());

        Point pAwa1 = pointRepository.save(new Point(new Date(), 1, "S1", true,true, true, false, "Neant", false, false));
        Point pAwa2 = pointRepository.save(new Point(new Date(), 1.5, "S2", true,true, true, true, "Neant", false, false));

        pAwa1.setClient(clAwa);
        pAwa1.setCoach(ch1);
        pAwa1.setFormule(fAwa);

        System.out.println(pAwa1.getCoach().getNomCoach());
        System.out.println(pAwa1.getFormule().getClass().getSimpleName());
        System.out.println(pAwa1.getClient().getPrenomClient() +" "+ pAwa1.getClient().getNomClient());*/
    }
}
