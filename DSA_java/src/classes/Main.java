package classes;

public class Main {

    public static void main(String[] args) {

        Cookie cookieOne = new Cookie("green");  // cookieOne --> instance of Cookie
                                                      // new --> this is a keyword to run the Constructor
        Cookie cookieTwo = new Cookie("blue");  // cookieTwo --> new instance of cookie

        cookieOne.setColor("yellow");  //change the color of a particular Cookie(cookieOne) -->

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
