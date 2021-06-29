// class grinder{
// 	public void mixer(){

// 	}                                       // this have 2 reason to change one is functionality and other is display 
// 	public void juicer(){                   // if grinder is used in further 10 more classes  if display changes 5 times a year and functionaity(mixer,juicer) changes 3 times a year 
                                            // then there are 10*(5+3) = 80 breaks per year
// 	}

// 	public void print{
// 		System.out.println("output print");
// 	}
// }

interface grinder{

	public void mixer(String s);                // only single responsibility i.e functionality of grinder.  it changes 3 times a year and used by 8 other class then , 24 breaks per
	public void juicer(String s);

}
interface printer{

	public void print();                         // only single responsibility i.e display of grinder. it changes 5 times a year and used by 2 other class then , 10 breaks per
}

class Display implements printer{

	public void print(){

		System.out.println("Grinding is complete timeout");
	}
}
                                                 // total breaks per year = 24+10 = 34 which is obviously very less then 80 breaksper year
class Oatmilk implements grinder{


	public void mixer(String Oats){

		System.out.println(Oats+ " grinded ");
	}

	public void juicer(String Milk){

		System.out.println("Oat"+ Milk +" Prepared");
	}

	public static void main(String[] args) {

		Oatmilk o = new Oatmilk();
		o.mixer("Oats");
		o.juicer("Milk");
		Display d = new Display();
		d.print();

	}
}