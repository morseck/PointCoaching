package com.chb.metier;

import com.chb.entities.Client;
import com.chb.entities.Coach;
import com.chb.entities.Point;
import com.chb.entities.ResumeRdv;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPointMetier {
    public Client consulterClient(String prenomClient);
    public Client findClientByCodeClient(Long codeClient);
    public Page<ResumeRdv> listResumeRdv(String codeCoach);
    public List<Client> listClientDuCoach(String nomCoach);
    public Coach consulterCoach(String nomCoach);
}
