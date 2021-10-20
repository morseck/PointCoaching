package com.chb.metier;

import com.chb.dao.ClientRepository;
import com.chb.dao.CoachRepository;
import com.chb.entities.Client;
import com.chb.entities.Coach;
import com.chb.entities.Point;
import com.chb.entities.ResumeRdv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PointMetierImpl implements IPointMetier{
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CoachRepository coachRepository;


    @Override
    public Client consulterClient(String prenomClient) {
        Client cl = clientRepository.consulterClientDao(prenomClient);
        if(cl==null) throw new RuntimeException("Le client est introuvable");
        return cl;
    }

    @Override
    public Client findClientByCodeClient(Long codeClient) {
        Client cl = clientRepository.findClientByCodeClient(codeClient);
        return cl;
    }


    @Override
    public Page<Client> listClient(int page, int size) {
        return clientRepository.listClient(PageRequest.of(page, size));
    }

    @Override
    public Page<Point> listPoint(int page, int size) {
        return null;
    }

   /* @Override
    public Page<Client> listClient(int page, int size) {
        return clientRepository.listClient(PageRequest.of(page, size));
    }*/

    /*@Override
    public Page<Point> listPoint(String codeCoach, int page, int size) {
        return null;
    }
*/
    @Override
    public Page<ResumeRdv> listResumeRdv(String codeCoach, int page, int size) {
        return null;
    }

    @Override
    public List<Client> listClientDuCoach(String nomCoach) {

        return clientRepository.listClientsDuCoach(nomCoach);
    }

    @Override
    public Coach consulterCoach(String nomCoach) {
            Coach coach = coachRepository.consulterCoach(nomCoach);
            if(coach==null)
                throw new RuntimeException("Le coach est introuvable");
        return coach;
    }
}
