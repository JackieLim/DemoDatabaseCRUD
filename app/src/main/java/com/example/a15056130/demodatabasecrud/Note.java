package com.example.a15056130.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by 15056130 on 5/18/2017.
 */

public class Note implements Serializable {
    private Integer id;
    private String noteContent;

    public Note(Integer id, String noteContent){
        this.id = id;
        this.noteContent = noteContent;
    }
    public int getId() { return id; }

    public String getNoteContent() { return noteContent; }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
    @Override
    public String toString() {
        return "ID:" + id + ", " + noteContent;
    }



}
