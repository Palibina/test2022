package DAO.HibernateSource;

import DAO.NotesHandler;
import Model.Note;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MySQLNotesHandlerH implements NotesHandler {
    public ArrayList<Note> getNotesList() {
        Session session = MySQLHibernateDaoFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List list = session.createQuery("FROM Note").list();
        session.close();
        return new ArrayList<Note>(list);
    }

    public void addNote(Note note) {
       Session session = MySQLHibernateDaoFactory.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(note);
       transaction.commit();
       session.close();
    }
}
