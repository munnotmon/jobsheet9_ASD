public class Mahasiswa12 {
    String nama, nim, kelas;
    int nilai;

    public Mahasiswa12() {

    }

    public Mahasiswa12 (String nama, String nim, String kelas) {
        this.nama = nama; 
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

}