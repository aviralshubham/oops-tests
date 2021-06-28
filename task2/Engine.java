
// Some aggregation and composition relation. both are non blood relation but one is weak bonding and one is strong bonding 

class Sound{

	void start(){

      System.out.println("musicplayer is turned on");
	}

}
class MusicPlayer{
	public Sound magnet;

	MusicPlayer(Sound magnet){

		this.magnet = magnet;
	}
	public void play(){

		magnet.start();
		System.out.println("Music starts playing");

	}
}

class Engine{
	
	void start(){
	 System.out.println("engine is started");
	}

}


class Car{
	
	public Engine eng;  // composition

	Car(Engine eng){
	  this.eng = eng;
	}

	public void move(){
	   eng.start();
	   System.out.println("car starts moving");
	}

   public static void main(String[] args){

	Engine eng = new Engine();
    Car c = new Car(eng);
    c.move();

    Sound tune = new Sound();
    MusicPlayer m = new MusicPlayer(tune);
    m.play();

   }
}

