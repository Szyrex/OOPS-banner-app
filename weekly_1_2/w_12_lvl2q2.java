public class w_12_lvl2q2 {
    public static void main(String[] args) {
        
        double base = 10.0;     
        double height = 8.0;    
        
        double areaCm = 0.5 * base * height;
        
        
        double baseInch = base / 2.54;
        double heightInch = height / 2.54;
        
        double areaInch = 0.5 * baseInch * heightInch;
        
        System.out.println("The Area of the triangle in sq cm is " + areaCm);
        System.out.println("The Area of the triangle in sq inches is " + areaInch);
    }
}