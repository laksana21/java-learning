class Penggunaan{
	public static void main(String []args){
		Kereta bg = new Kereta();
		Lokomotif et = new Lokomotif();
		Jurusan ga = new Jurusan();
		
		bg.jurusan();
		System.out.println(bg.tipe());
		et.jurusan();
		bg.tambah(10,20);
		et.tambah(10,20);
		ga.tambah(10,20);
		et.jurusan("kutoarjo");
		ga.jurusan();
		ga.jurusan('a');
	}
}
