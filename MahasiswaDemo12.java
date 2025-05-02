import java.util.Scanner;
public class MahasiswaDemo12 {
    public static void main(String[] args) {
        StackTugasMahasiswa12 stack = new StackTugasMahasiswa12(5);
        Scanner sc12 = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n==== MENU PENGUMPULAN TUGAS ====");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Menghitung Jumlah Tugas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc12.nextInt();
            sc12.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc12.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc12.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc12.nextLine();
                    Mahasiswa12 mhs = new Mahasiswa12(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa12 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai dari (0-100): ");
                        int nilai = sc12.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa12 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa12 pertama = stack.bottom();
                    if (pertama != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + pertama.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.jumlahTugas());
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

    }
}
