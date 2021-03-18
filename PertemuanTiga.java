public class PertemuanTiga {
    
    public static class Rectangle {
        double length;
        double breadth;
    }
    
    public static class PointerRekursif {
        public static void deret(int i) {
            if(i <= 10) {
                System.out.print(i + " ");
                deret(++i);
            }
        }
    }
    
    public static class HitungFaktorial {
        public static int faktorial(int i) {
            if(i == 0 || i == 1)
                return 1;
            else
                return i*faktorial(i-1);
        }
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = r1;
        int i = 0;
        
        r1.length = 10.0;
        r2.length = 20.0;
        
        System.out.println("Value of R1's Length : " + r1.length); 
        System.out.println("Value of R2's Length : " + r2.length);
        
        PointerRekursif rekursif = new PointerRekursif();
        rekursif.deret(i);
        
        System.out.println(" ");
        HitungFaktorial factorial = new HitungFaktorial();
        System.out.print(factorial.faktorial(6));
    }
}
