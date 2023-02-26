
public class Driver {
	public static void main(String[] args) {
		//Oyuncu oyuncu = new Oyuncu();//Oyuncu sınıfı artık abstract(soyut) sınıf olduğu için instance alınamaz.
		Oyuncu oyuncu = new Futbolcu(); //Polymorphism kullanılmış olundu.
		
		oyuncu.setIsim("Ali can");
		oyuncu.setNumara(13);
		oyuncu.pasVer();
		oyuncu.sutCek();
	}
}
