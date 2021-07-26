public class BiodataObject {

	int iUmur = 18;
	String nama = "", alamat = "";
	
	public BiodataObject(String nama, String alamat){
		this.nama = nama;
		this.alamat = alamat;
		System.out.println("Objek " + nama + "Sudah dibuat");
		
	}
	
	public void show(){
		System.out.println("Nama lengkap : " + nama);
		System.out.println("Alamat : " + alamat);
	}
}
