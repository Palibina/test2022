package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.GregorianCalendar;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    @Column (name = "title")
    private String title;
    @Column (name = "content")
    private String content;
    @Column (name = "date")
    private GregorianCalendar date;
    @Column (name = "done")
    private boolean done;

    public Note() {
    }

    public Note(String title, String content, GregorianCalendar date, boolean done) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDate(Date date) {
        GregorianCalendar newDate = new GregorianCalendar();
        newDate.setTime(date);
        this.date = newDate;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(title+" | ")
                .append(content+" | ")
                .append(date.get(GregorianCalendar.DAY_OF_MONTH)+".")
                .append(date.get(GregorianCalendar.MONTH)+".")
                .append(date.get(GregorianCalendar.YEAR)+" | ")
                .append(done);
        return builder.toString();
    }
}
