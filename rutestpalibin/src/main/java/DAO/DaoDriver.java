package DAO;

public class DaoDriver {
    static private DaoFactory actualFactory = DaoFactory.getDaoFactory(DaoFactory.HIBERNATE_SOURCE);

    private static NotesHandler actualNotesHandler = actualFactory.getNotesHandler();

    public static NotesHandler getActualNotesHandler(){return actualNotesHandler;}
}
