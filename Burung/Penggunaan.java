class Penggunaan{
	public static void main(String []args){
		Burung bg = new Burung();
		Emprit et = new Emprit();
		Gereja ga = new Gereja();
		
		bg.suara();
		System.out.println(bg.bertelur());
		et.suara();
		bg.tambah(10,20);
		et.tambah(10,20);
		ga.tambah(10,20);
		et.suara("obat");
		ga.suara();
		ga.suara('a');
	}
}
