public class TP3nomor1 {
    public static class Triangle {
        double tinggi;
        double alas;
    }
    public static void main(String[] args) {
        Triangle segitiga1 = new Triangle();
        Triangle segitiga2 = segitiga1;

        segitiga1.tinggi = 5.0;
        segitiga2.tinggi = 10.0;
        segitiga1.alas = 5.0;
        segitiga2.alas = 10.0;
        double hasil1 = (segitiga1.alas * segitiga1.tinggi) / 2;
        double hasil2 = (segitiga2.alas * segitiga2.tinggi) / 2;

        System.out.println("Luas segitiga1 : " + hasil1);
        System.out.println("Luas segitiga2 : " + hasil2);
    }
}