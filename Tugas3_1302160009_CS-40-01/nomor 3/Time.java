public class Time{
	private int hour;
	private int minute;
	private int second;
	public Time(){hour=0; minute=0; second=0;}	
	public Time(int h, int m, int s){hour=h ; minute=m; second=s;}
	public int getHour(){return hour;}
	public int getMinute(){return minute;}	
	public int getSecond(){return second;}
	public void setHour(int hour){this.hour=hour;}	
	public void setMinute(int minute){this.minute=minute;}	
	public void setSecond(int second){this.second=second;}
	public void printInfo(){
		System.out.println(" "+ hour+" : " + " "+minute+ " : "+" "+second);
	}
	public boolean cekvalid(){
		if ((hour>=0)&&(hour<24)&&(minute>=0)&&(minute<60)&&(second>=0)&&(second<60))
			{	return true;
		} else {
			return false; 
		}
	}
	public int timeToSecond(){
		int jumlah ;
		jumlah = (hour*3600) + (minute*60) + second;
		return jumlah;
     }	
}