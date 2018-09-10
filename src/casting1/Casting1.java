
package casting1;

public class Casting1 {

    public static void main(String[] args) {
    
        
        int c = 10000000;
        long d=c;
        System.out.println("la conversion es :" + d);
        
        long e=10000000L;// se debe colocar L al final
        int f= (int)e;
        System.out.println("La conversion es: "+ f);
        
        double h =25.5;
        int i= (int)h;
        System.out.println("La conversion es:" + i);
    }
    
}
