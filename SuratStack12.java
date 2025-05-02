public class SuratStack12 {
    Surat12[] stack12;
    int size, top;

    public SuratStack12(int size) {
        this.size = size;
        stack12 = new Surat12[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat12 surat12) {
        if (!isFull()) {
            stack12[++top] = surat12;
            System.out.println("Surat berhasil dimasukkan.");
        } else {
            System.out.println("Stack penuh. Tidak bisa menambah surat.");
        }
    }

    public Surat12 pop() {
        if (!isEmpty()) {
            return stack12[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat12 peek() {
        if (!isEmpty()) {
            return stack12[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack12[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack12[i].idSurat + ", Nama: " + stack12[i].namaMahasiswa +  ", Kelas: " + stack12[i].kelas + ", Jenis Izin: " + stack12[i].jenisIzin + ", Durasi: " + stack12[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
