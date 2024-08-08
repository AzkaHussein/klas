import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ultramen pendapat_azka = new Ultramen();

        Scanner masuk = new Scanner(System.in);
        System.out.println("Nama ultramenmu siapa: ");
        pendapat_azka.nama = masuk.nextLine();
        System.out.println("Angkatan berapa ultramennya: ");
        pendapat_azka.angkatan_ultramen = masuk.nextLine();
        Scanner ifi = new Scanner(System.in);
        String keputusuan;
        System.out.println("Mau dipanggil ultramennya? (mau/gak)");
        keputusuan = ifi.nextLine();

        if (keputusuan.equalsIgnoreCase("mau")) {
            pendapat_azka.ultramen_datang();
            Scanner dalam = new Scanner(System.in);
            String pendapat_dalam;
            System.out.println("Mau tau angkatan berapa? (mau/gak)");
            pendapat_dalam = dalam.nextLine();
            if (pendapat_dalam.equalsIgnoreCase("mau")) {
                pendapat_azka.ultramen_angkatan();
                System.out.println("ULTRAMENNN DISERANGGG");
            } else {
                System.out.println("ULTRAMENNN MATII");
            }

        }

        else {
            System.out.println("KOTAA HANCORRR");
        }

    }
}