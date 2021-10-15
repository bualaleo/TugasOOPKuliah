public class MainPulse{
	public static void main(String[] args) {
		Time Ta= new Time(11,16,29);
		Time Tb= new Time(23,59,59);
		System.out.println();
		Ta.printInfo();
		Tb.printInfo();
		PulseCounter g = new PulseCounter(Ta,Tb);
		System.out.println();
		g.printInfo();
		System.out.println("Selisih Detik : "+g.hitungSelisihDetik());
		System.out.println("Pulsa Bicara : "+g.hitungPulsaBicara());
	}
}