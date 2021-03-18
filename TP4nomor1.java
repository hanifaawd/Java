import java.util.ArrayList;

public class TP4nomor1 {
    public static class kalimat {
        private String kata = " ";

        void setKata(String kata) {
            this.kata = kata;
        }

        String getKata() {
            return this.kata;
        }
    }

    public static class Stack {
        private int top;
        private ArrayList<kalimat> data = new ArrayList<kalimat>();

        public Stack() {
            for(int i = 0; i < data.size(); i++){
                data.get(i) = new kalimat();
            }
        }

        void setTop(int top) {
            this.top = top;
        }

        int getTop() {
            return this.top;
        }

        void createEmpty() {
            this.top = -1;
        }

        boolean isEmpty() {
            boolean hasil = false;
            if(this.top == -1)
                hasil = true;
            return hasil;
        }

        boolean isFull() {
            boolean hasil = false;
            if(this.top == (this.data.size()-1))
                hasil = true;
            return hasil;
        }

        void push(String nim, String nama, Double nilai) {
            if(isFull() == true) {
                // Jika stack penuh
                System.out.println("Stack penuh");
            }
            else {
                if(isEmpty() == true) {
                    // Jika stack kosong
                    this.top = 0;
                    this.data.get(0).setKata(kata);
                }
                else {
                    // Jika stack tidak kosong
                    this.top = this.top + 1;
                    this.data.get(this.top).setKata(kata);
                }
            }
        }

        void pop() {
            if(this.top == 0) {
                // jika stack berisi satu elemen
                this.top = -1;
            }
            else {
                if(this.top != -1) {
                    // jika stack tidak kosong
                    this.top = this.top - 1;
                }
            }
        }

        void printStack() {
            if(this.top != -1) {
                System.out.println("=========== isi stack ==========");
                int i;
                for(i = this.top; i>=0; i--) {
                    System.out.println("================================");
                    System.out.println("elemen ke-" + i);
                    System.out.println("kalimat : " + this.data.get(i).getKata());
                }
            }
        }
    }
    public static void main(String[] args) {
        Stack S = new Stack();
        S.createEmpty();
        S.printStack();
        System.out.println("================================");
        S.push("kasur rusak");
        S.push("kasur rusak");
        S.push("11111111", "Mariana", 90.0);
        S.printStack();
        System.out.println("================================");
        S.pop();
        S.printStack();
    }
}