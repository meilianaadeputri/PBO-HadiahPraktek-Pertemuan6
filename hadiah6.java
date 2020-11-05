import java.util.Scanner;

class listrik {
	byte tipe_rumah;
	char blok;
	int bayar, harga, kembalian;
	
	public void setHarga(byte tipe_rumah,char blok) {
		harga=0;
		switch(this.tipe_rumah) {
			case 36: switch(this.blok) {
				case 'A': this.harga=500000; break;
				case 'B': this.harga=300000; break;
				default: System.out.println("Blok salah");
			}; break;
			case 37: switch(this.blok) {
				case 'A': this.harga=800000; break;
				case 'B': this.harga=600000; break;
				default: System.out.println("Blok salah");
			}; break;
			default: System.out.println("Tipe rumah salah");
		}
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setKembalian(int bayar){
		this.bayar=bayar;
		this.kembalian=this.bayar-harga;
	}
	
	public int getKembalian() {
		return kembalian;
	}
}

public class hadiah6 {
	public static void main(String args[]){
		System.out.println("Harga: ");
		System.out.println("1. Tipe 36 Blok A = Rp 500.000");
		System.out.println("1. Tipe 36 Blok A = Rp 300.000");
		System.out.println("1. Tipe 37 Blok B = Rp 800.000");
		System.out.println("1. Tipe 37 Blok B = Rp 600.000");
		System.out.println("==============================");
		
		listrik pln=new listrik();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama anda: ");
		String nama = input.nextLine();
		System.out.print("Masukkan alamat anda: ");
		String alamat = input.nextLine();
		
		System.out.print("Masukkan tipe rumah anda: ");
		pln.tipe_rumah = input.nextByte();
		System.out.print("Masukkan blok: ");
		pln.blok = input.next().charAt(0);
		pln.setHarga(pln.tipe_rumah,pln.blok);
		System.out.println("==============================");
		
		System.out.println("Harga: "+pln.getHarga());
		System.out.print("Masukkan jumlah bayar: ");
		pln.bayar = input.nextInt();
		pln.setKembalian(pln.bayar);
		
		System.out.println("==============================");
		System.out.println("Nama		: " + nama);
		System.out.println("Alamat		: " + alamat);
		System.out.println("Tipe rumah 	: " + pln.tipe_rumah + "   		Blok	: "+pln.blok);
		System.out.println("Harga		: " + pln.getHarga());
		System.out.println("Bayar		: " + pln.bayar);
		System.out.println("Kembalian	: " + pln.getKembalian());
	}
}