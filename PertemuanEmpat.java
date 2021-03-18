public class PertemuanEmpat {
    public static class nilaiMatkul {
        private String nim;
        private String nama;
        private Double nilai;

        void setNim(String nim) {
            this.nim = nim;
        }
        
        String getNim() {
            return this.nim;
        }

        void setNama(String nama) {
            this.nama = nama;
        }

        String getNama() {
            return this.nama;
        }

        void setNilai(Double nilai) {
            this.nilai = nilai;
        }

        Double getNilai() {
            return this.nilai;
        }
    }

    public static class Stack {
        private int top;
        private nilaiMatkul[] data = new nilaiMatkul[10];

        public Stack() {
            for(int i = 0; i < 10; i++){
                data[i] = new nilaiMatkul();
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
            if(this.top == (this.data.length-1))
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
                    this.data[0].setNim(nim);
                    this.data[0].setNama(nama);
                    this.data[0].setNilai(nilai);
                }
                else {
                    // Jika stack tidak kosong
                    this.top = this.top + 1;
                    this.data[this.top].setNim(nim);
                    this.data[this.top].setNama(nama);
                    this.data[this.top].setNilai(nilai);
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
                    System.out.println("nim : " + this.data[i].getNim());
                    System.out.println("nama : " + this.data[i].getNama());
                    System.out.println("nilai : " + this.data[i].getNilai());
                }
            }
        }
    }
    public static void main(String[] args) {
        Stack S = new Stack();
        S.createEmpty();
        S.printStack();
        System.out.println("================================");
        S.push("12345678", "Nana", 64.75);
        S.push("12333424", "Andah", 75.0);
        S.push("11111111", "Mariana", 90.0);
        S.printStack();
        System.out.println("================================");
        S.pop();
        S.printStack();
    }
}
