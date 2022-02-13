package DAO;

import Model.Note;

import java.util.ArrayList;

public interface NotesHandler {
    public ArrayList<Note> getNotesList();
    public void addNote(Note note);
}
