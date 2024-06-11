package projetoIphone;

public class ReprodutorMusical {
	
	boolean musica = false;
	int volume = 50;
	
	boolean top = false;
	
	public void tocarMusica() {
		musica = true;
	}
	
	public void DesligarMusica() {
		musica = false;
	}
	
	public void pausarMusica() {
		top = true;
	}
	
	public String aumentarVolume() {
		volume += 10;
		if(volume >=100) {
			return "Volume maximo";
		}
		
	}
	
	public String diminuirVolume() {
		volume -= 10;
		if(volume == 0) {
			return "Volume esta no zero";
		}
		
	}
}
