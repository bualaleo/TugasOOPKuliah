public class kotak0009{
	private double panjang;
	private double lebar;
	private double tinggi;
	
	public kotak0009(){panjang = 0.1;lebar = 0.1;tinggi=0.1;}
	public kotak0009(double p, double l, double t){panjang = p;lebar = l;tinggi = t; atur();}
	public double getPanjang(){return panjang;}
	public void setPanjang(double p){panjang = p;}
	public double getLebar(){return lebar;}
	public void setLebar(double l){lebar = l;}
	public double getTinggi(){return tinggi;}
	public void setTinggi(double t){tinggi = t;}
	public void Info(){
		System.out.println("Panjang= "+panjang);
		System.out.println("Lebar= "+lebar);
		System.out.println("Tinggi= "+tinggi);
	}
	public void atur(){
		double tmp;
		if((panjang<=lebar)&&(panjang>=tinggi)&&(lebar>=tinggi)){
			tmp = panjang;
			panjang	= lebar;
			lebar = tmp;
			tmp = lebar;
			lebar = tinggi;
			tinggi = tmp;
		}
		if((panjang<=lebar)&&(panjang<=tinggi)){
			if(lebar<=tinggi){
				tmp = tinggi;
				tinggi = panjang;
				panjang = tmp;
			}else{
				if(lebar>=tinggi){
					tmp = panjang;
					panjang = lebar;
					lebar = tmp;
					tmp = tinggi;
					tinggi = lebar;
					lebar = tmp;
				}
			}
		}else{
			if((panjang>=lebar)&&(lebar<=tinggi)){
				if(panjang>=tinggi){
					tmp=tinggi;
					tinggi=lebar;
					lebar=tmp;
				}else{
					if(panjang<=tinggi){
						tmp=panjang;
						panjang=tinggi;
						tinggi=tmp;
						tmp=lebar;
						lebar=tinggi;
						tinggi=tmp;
					}
				}
			}
		}
	}
		
		public kotak0009 tumpuk(kotak0009 a){
			double p, l, t;
			if (panjang>=a.panjang){
				p = panjang;
			} else {
				p = a.panjang;
			}
			if (lebar>=a.lebar){
				l = lebar;
			} else {
				l = a.lebar;
			}
			if (tinggi>=a.tinggi){
				t = tinggi;
			} else {
				t = tinggi+a.tinggi;
			}
			return new kotak0009(p,l,t);
		}
		
		public kotak0009 jejer(kotak0009 a){
			double p, l, t;
			if (panjang>=a.panjang){
				p = panjang;
			} else {
				p = a.panjang;
			}
			if (lebar>=a.lebar){
				l = lebar;
			} else {
				l = lebar+a.lebar;
			}
			if (tinggi>=a.tinggi){
				t = tinggi;
			} else {
				t = a.tinggi;
			}
			return new kotak0009(p,l,t);
		}
				
				
		public kotak0009 potong(int n){
			double x = panjang/n;
			return new kotak0009(x,lebar,tinggi);
		}
		
		public boolean lebihBesar(kotak0009 a){
			double x = panjang*lebar*tinggi;
			double y = a.hitungvolume();
			if(x>y){
				return true;
			} else {
				return false;
			}
		}
		
		public boolean sama(kotak0009 a) {
			double x = panjang*lebar*tinggi;
			double y = a.hitungvolume();
			if(x==y){
				return true;
			} else {
				return false;
			}
		}
		
		public double hitungvolume(){
		return panjang*lebar*tinggi;
		}
		
		public double hitungluaspermukaan(){
		return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
		}
	}