package DAO;

import DAO.HibernateSource.MySQLHibernateDaoFactory;
import DAO.JDBC.MySQLJDBCDaoFactory;

public abstract class DaoFactory {
    //константы выбора источников информации
    public static final int JDBC_DATA_SOURCE = 1;
    public static final int HIBERNATE_SOURCE = 2;
    // абстрактные методы получения обработчиков наших POJO
    public abstract NotesHandler getNotesHandler();
    // создание актуальной фабрики с соответствующими методами доступа
    public static DaoFactory getDaoFactory(int type) {
        switch(type) {
            case JDBC_DATA_SOURCE: {
                return new MySQLJDBCDaoFactory();
            }
            case HIBERNATE_SOURCE: {
                return new MySQLHibernateDaoFactory();
            }
        default: return null;
        }
    }
}
