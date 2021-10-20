package com.chb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ResumeRdv implements Serializable {
    @Id @GeneratedValue
    private Long codedResumeRdv;
    private String noteResumeRdv;

    public ResumeRdv() {
        super();
    }

    public ResumeRdv(String noteResumeRdv) {
        super();
        this.noteResumeRdv = noteResumeRdv;
    }

    public Long getCodedResumeRdv() {
        return codedResumeRdv;
    }

    public void setCodedResumeRdv(Long codedResumeRdv) {
        this.codedResumeRdv = codedResumeRdv;
    }

    public String getNoteResumeRdv() {
        return noteResumeRdv;
    }

    public void setNoteResumeRdv(String noteResumeRdv) {
        this.noteResumeRdv = noteResumeRdv;
    }
}
