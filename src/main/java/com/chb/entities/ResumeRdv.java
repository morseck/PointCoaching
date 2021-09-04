package com.chb.entities;

import java.io.Serializable;

public class ResumeRdv implements Serializable {
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
