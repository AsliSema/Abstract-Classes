
public class Futbolcu extends Oyuncu{
	
	@Override //yazılarak abstract class içerisindeki metot ile aynı isimli metodu yanlışlıkla yazmadığımızı belirtiriz.
	public void sutCek() {
		System.out.println("Futbolcu şut çekti.");
	}
	
	@Override
	public void pasVer() {
		System.out.println("Futbolcu pas verdi.");
	}
}
