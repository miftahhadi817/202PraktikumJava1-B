import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[]args){
  String namaDepan = "Miftah";
  String namaTengah = "Hadi";
  String namaBelakang = "Hadi";

  int usia = 20;
  int lamaKuliah = 4;
  double ipk;
  char nilai = 'A';

  Scanner inputan = new Scanner(System.in);

  System.out.println("========= Fase input ========");
  System.out.println("Input nama depan : ");
  namaDepan = inputan.nextLine();

  System.out.println("========= Fase output ========");
  System.out.println("Nama depan : ");
  System.out.println(namaDepan);
  System.out.println("Nama tengah : " + namaTengah);
  System.out.println("Usia : " + usia);
  System.out.println("Usia saat lulus (String): " + usia + lamaKuliah);
  System.out.println("Usia saat lulus (Kurung): " + (usia + lamaKuliah));

  int usiaLulus = usia + lamaKuliah;
  System.out.println("Usia saat lulus (Variabel): " + usiaLulus);  

  JOptionPane.showMessageDialog(null, "Hai, " + namaDepan + namaTengah);

 }
}