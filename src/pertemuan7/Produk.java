package pertemuan7;

public class Produk {
	
	// atribut
	private String nama;
	private int harga;
	private String kategori;

	public Produk(String nama, int harga, String kategori) {
		this.nama = nama;
		this.harga = harga;
		this.kategori = kategori;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	
	

}
