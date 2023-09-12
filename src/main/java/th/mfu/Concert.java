package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    private int id; 
    private String title; 
    private String performer;
    private Date date; 
    private String description;
    
    public Concert(int id, String title, String performer, Date date, String description) {
        this.id = id;
        this.title = title;
        this.performer = performer;
        this.date = date;
        this.description = description;
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


    public String getPerformer() {
        return performer;
    }


    public void setPerformer(String performer) {
        this.performer = performer;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.description = description;
    }
 
    //TODO: add getters and setters for all attributes
    // You can use Source action/generate getter setter function

}
