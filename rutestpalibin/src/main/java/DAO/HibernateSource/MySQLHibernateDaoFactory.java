package DAO.HibernateSource;

import DAO.DaoFactory;
import DAO.NotesHandler;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySQLHibernateDaoFactory extends DaoFactory {
    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public NotesHandler getNotesHandler() {
        return new MySQLNotesHandlerH();
    }
}
