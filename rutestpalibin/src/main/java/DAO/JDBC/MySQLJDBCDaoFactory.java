package DAO.JDBC;

import DAO.DaoFactory;
import DAO.NotesHandler;

import java.sql.*;

public class MySQLJDBCDaoFactory extends DaoFactory {

    static final String DRIVER = "com.mysql.cj.jdbc.Driver";// указание на драйвер базы, с которой будем работать

    static final String DATABASE_URL ="jdbc:mysql://localhost/test"+
            //Вот дальше я не знаю что это за костыли, но взяты из интернета и работают.
            "?verifyServerCertificate=false"+
            "&allowPublicKeyRetrieval=true"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";;//путь до базы
    static final String USER = "root";
    static final String PASSWORD = "scuko_41drum";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(DATABASE_URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeSession(ResultSet resultSet, Statement statement, Connection connection){
        try {
            if (resultSet !=null) resultSet.close();
            if (statement !=null) statement.close();
            if (connection !=null)connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public NotesHandler getNotesHandler() {
        return new MySQLNotesHandlerJ();
    }


}
