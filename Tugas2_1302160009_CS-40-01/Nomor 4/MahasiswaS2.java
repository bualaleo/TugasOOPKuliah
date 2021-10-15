public class MahasiswaS2 extends Mahasiswa{
	private String asalProgramStudiS1;
	private String programStudiS2;
	public MahasiswaS2(){
		this.asalProgramStudiS1=asalProgramStudiS1;
		this.programStudiS2=programStudiS2;
	}
	public MahasiswaS2(String nama, int nim,String asalProgramStudiS1, String programStudiS2){
		super(nama,nim);
		this.asalProgramStudiS1=asalProgramStudiS1;
		this.programStudiS2=programStudiS2;
	}
	public String getAsalProgramStudiS1(){
		return this.asalProgramStudiS1;
	}
	public String getProgramStudiS2(){
		return this.programStudiS2;
	}
	public void setAsalProgramStudiS1(String a){
		this.asalProgramStudiS1=asalProgramStudiS1;
	}
	public void setProgramStudiS2(){
		this.programStudiS2=programStudiS2;
	}
	public void printInfo(){
		super.printInfo();
		System.out.println("Asal Program Studi S1 : "+asalProgramStudiS1);
		System.out.println("Program Studi S2 : "+programStudiS2);
	}
}
