package classes;

public class Cookie {

    private String color;  // class variable

    public Cookie(String color) {  // 1st method --> Constructor - This method always has the name of the class
        this.color = color; // instance of color
    }

    public String getColor() {  // returns the color for particular instance of Cookie
        return color;
    }

    public void setColor(String color) { // to pass it a color, & will change the color of a particular Cookie.
        this.color = color;
    }
}


