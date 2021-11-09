package com.chb.metier;

import com.chb.dao.ClientRepository;
import com.chb.dao.CoachRepository;
import com.chb.dao.PointRepository;
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
    @Autowired
    private PointRepository pointRepository;

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
    public Page<ResumeRdv> listResumeRdv(String codeCoach) {
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

    @Override
    public List<Point> listPoints(String nomCoach) {
        return pointRepository.listPoint(nomCoach);
    }

    @Override
    public List<Client> ClienteFormule(Long codeFormule, String codeCoach) {
        if(codeFormule == 1)
            return clientRepository.findClienteFormule(codeFormule,codeCoach);
        else if(codeFormule == 2)
            return clientRepository.findClienteFormule(codeFormule,codeCoach);
        else
            return clientRepository.findClienteFormule(codeFormule, codeCoach);
    }

    @Override
    public List<Client> findClFormCoach(Long codeFormule, String codeCoach) {
        if(codeFormule == 1)
            return clientRepository.findClFormCoach(codeFormule, codeCoach);
        else if(codeFormule == 2)
            return clientRepository.findClFormCoach(codeFormule, codeCoach);
        else
            return clientRepository.findClFormCoach(codeFormule, codeCoach);
    }

}
