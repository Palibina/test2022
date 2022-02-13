package Servlets;

import DAO.DaoDriver;
import Model.Note;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MainServlet extends HttpServlet {
    public static final String PAGE_NUMBER = "Page Number";
    public static final String OUTPUT_LIST = "List For Pager";
    private static int pagingValue = 10;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pageNumber =  (Integer) req.getAttribute(PAGE_NUMBER);
        if(pageNumber==null) pageNumber = 1;
        ArrayList<Note> result = new ArrayList<Note>();
        ArrayList<Note> notes = DaoDriver.getActualNotesHandler().getNotesList();
        //оцениваем с какой страницы заходим, какие записи отдать и заполняем result
        fillListForPage(pageNumber,notes,result);
        req.setAttribute(OUTPUT_LIST,result);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index_test.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }

    private void fillListForPage(Integer pageNumber, ArrayList<Note> inputList, ArrayList<Note> outputList) {
        int currentIndex = pageNumber*pagingValue+outputList.size()- pagingValue-1;
        outputList.add(inputList.get(currentIndex));
        if (outputList.size() != (inputList.size()-pageNumber*pagingValue)) fillListForPage(pageNumber,inputList,outputList);
    }
}
