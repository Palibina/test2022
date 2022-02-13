package DAO.JDBC;

import DAO.NotesHandler;
import Helpers.DateHelper;
import Model.Note;

import java.sql.*;
import java.util.ArrayList;

public class MySQLNotesHandlerJ implements NotesHandler {
    static final String GET_ALL_NOTES_QUERY = "SELECT * FROM notes;";
    static final String ADD_NOTE = "INSERT INTO notes (date, title, content, done) VALUES (?,?,?,?);";

    public ArrayList<Note> getNotesList() {
        ArrayList<Note> list = new ArrayList<Note>();
        ResultSet resultSet = null;
        Connection connection = null;
        Statement statement = null;
        try {
            connection = MySQLJDBCDaoFactory.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(GET_ALL_NOTES_QUERY);

        while(resultSet.next()) {
            Note note = new Note();
            note.setContent(resultSet.getString("content"));
            note.setTitle(resultSet.getString("title"));
            note.setDate(resultSet.getDate("date"));
            note.setDone(resultSet.getBoolean("done"));
            list.add(note);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        MySQLJDBCDaoFactory.closeSession(resultSet,statement,connection);
        return list;
    }

    public void addNote(Note note) {
        Connection connection = MySQLJDBCDaoFactory.getConnection();;
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = connection.prepareStatement(ADD_NOTE);
            preparedStatement.setDate(1,DateHelper.convertUtilDateToSqlDate(note.getDate()));
            preparedStatement.setString(2, note.getTitle());
            preparedStatement.setString(3,note.getContent());
            preparedStatement.setBoolean(4,note.isDone());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        MySQLJDBCDaoFactory.closeSession(null,preparedStatement,connection);
    }
}
