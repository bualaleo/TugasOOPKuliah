public class PulseCounter{
	private Time start;
	private Time finish;
	private final int biayaPerDetik =100;
	public PulseCounter(){}
	public PulseCounter(Time s, Time f){start=s; finish=f;}
	public Time getStart(){return start;}
	public Time getFinish(){return finish;}
	public void setStart(Time start){this.start=start;}	
	public void setFinish(Time finish){this.finish=finish;}
	public void printInfo(){
		System.out.println("Start : "+start.timeToSecond());
		System.out.println("Finish : "+finish.timeToSecond());
	}	
	public int hitungSelisihDetik(){
		return start.timeToSecond() + finish.timeToSecond();
	}	
	public int hitungPulsaBicara(){
		return hitungSelisihDetik() * 100;
	}
}