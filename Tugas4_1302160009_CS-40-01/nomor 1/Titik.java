public class Titik{
	private int x;
	private int y;
	public Titik(){
		x = 0;
		y = 0;
	}
	public Titik(int _x, int _y){
		x = _x; y = _y;
	}
	public int getX(){
		return x;
	}
	public void setX(int _x){
		_x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int _y){
		_y = y;
	}
	public void printInfo(){
		System.out.println(" X-nya : " +x);
		System.out.println(" Y-nya : " +y);
	}
	public double hitungJarak(){
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
}