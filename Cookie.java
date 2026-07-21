public class Cookie {
    private String color;

    public Cookie(String color) {
        this.color = color;
    
    }
    void printCookie(){
        System.out.println("cookie color is:"+color);
    }
    
    public static void main(String args[]){
        Cookie one = new Cookie("green");
        Cookie two  = new Cookie("yellow");
         one.printCookie();
         two.printCookie();
    }
}