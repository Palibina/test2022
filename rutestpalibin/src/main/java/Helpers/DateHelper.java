package Helpers;

import java.util.GregorianCalendar;

public class DateHelper {
    public static java.sql.Date convertUtilDateToSqlDate(GregorianCalendar date){
        java.sql.Date dateForDB = new java.sql.Date(date.getTime().getTime());
        return dateForDB;
    }
}
