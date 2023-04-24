package SoruÇözümlerim.midterm1;
import java.util.Date;
public class Shape {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public  Shape(String c, boolean f){

        this.filled=f;
        this.color=c;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
