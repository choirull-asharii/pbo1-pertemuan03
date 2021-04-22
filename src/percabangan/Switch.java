package percabangan;

public class Switch {
    public static void main(String[] args){
        char nilai='B';
        switch(nilai){
            case 'A':
                System.out.println("Mhs    : \"Selamat Pagi pak\"");
                System.out.println("Dosen  : \"iya pagi!!\"");
                break;
            case 'B':
                System.out.println("Mhs    : \"Saya boleh bertanya pak?\"");
                System.out.println("Dosen  : \"iya\"");
                break;
            case 'C':
                System.out.println("Mhs    : \"Kenapa nilai saya D ya pak?:(\"");
                System.out.println("Dosen  : \"Apakah kamu sudah menggumpulkan tugas?\"");
                System.out.println("Mhs    : \"Sudah pak\"");
                break;
            default:
                System.out.println("Mhs    : \"Kemarin saya menggumpulkan sesuai waktu yang di tentukan pak\"");
                System.out.println("Dosen  : \"Coba saya lihat dulu>\"");
                System.out.println("Dosen  : \"*Melihati Berkas\"");
                System.out.println("Dosen  : \"sudah menggumpulkan namun masih di e-learning belum di kirimkan ke berkas bapak\"");
                System.out.println("Mhs    : \"Astaga\"");
                break;
        }
    }
}
