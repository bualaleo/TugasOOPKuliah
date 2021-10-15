public class Driver{
	public static void main(String[] args){
		Titik t1 = new Titik(8,-5);
		Titik t2 = new Titik(9,17);
		Titik t3 = new Titik(18,6);	
		
		Poligon Po = new Poligon();	
		Po.addTitik(t1);
		Po.addTitik(t2);
		Po.addTitik(t3);
			
		Po.printArrayTitik();
		System.out.println("-------Titik di Kuadran Satu-------");
		Po.filterArrayTitikKuadranSatu();
		System.out.println("-------Titik dengan jarak lebih dari 12-------");
		Po.filterArrayTitikByJarak(12);
	}
}