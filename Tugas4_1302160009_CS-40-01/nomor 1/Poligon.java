public class Poligon{
	private int jmlTitik;
	private Titik[] arrayTitik = new Titik[20];		
	public Poligon(){
	}
	public  int getjmlTitik(){
		return jmlTitik;
	}		
	public Titik[] getArrayTitik(){
		return arrayTitik;
	}	
	public void setJmlTitik(int jml){
		jmlTitik = jml;
	}
	public void setArrayTitik(Titik[] arrayDot){
		arrayTitik = arrayDot;
	}
	public void addTitik(Titik t){
		arrayTitik[jmlTitik] = t;
		jmlTitik++;
	}	
	public void printArrayTitik(){
		for(int i = 0;i<jmlTitik;i++){
			System.out.println("Titik ke : "+ (i+1));
			arrayTitik[i].printInfo();
		}	
	}
	public void filterArrayTitikKuadranSatu(){
		for(int i=0;i<getjmlTitik();i++){
			if((arrayTitik[i].getX()>0) && (arrayTitik[i].getY()>0)){
				System.out.println("Titik ke :"+ (i+1));
				arrayTitik[i].printInfo();
			}
		}
	}
	public void filterArrayTitikByJarak(int d){
		for(int i=0; i<getjmlTitik();i++){
			if((arrayTitik[i].hitungJarak() >= d)){
				System.out.println("Titik ke : "+ (i+1)); 
				arrayTitik[i].printInfo(); 
				System.out.println("Jarak : " +arrayTitik[i].hitungJarak());		
			}
		}
	}
}
	