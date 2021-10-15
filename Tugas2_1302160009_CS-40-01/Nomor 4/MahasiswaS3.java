public class MahasiswaS3 extends Mahasiswa{
	private String asalProgramStudiS2;
	private String programStudiS3;
	public MahasiswaS3(){
		this.asalProgramStudiS2=asalProgramStudiS2;
		this.programStudiS3=programStudiS3;
	}
	public MahasiswaS3(String nama, int nim, String asalprogramStudiS1, String asalProgramStudiS2, String programStudiS3){
		super(nama,nim);
		this.asalProgramStudiS2=asalProgramStudiS2;
		this.programStudiS3=programStudiS3;
	}
	public String getAsalProgramStudiS2(){
		return this.asalProgramStudiS2;
	}
	public String getProgramStudiS3(){
		return this.programStudiS3;
	}
	public void setAsalProgramStudiS2(){
		this.asalProgramStudiS2=asalProgramStudiS2;
	}
	public void setProgramStudiS3(){
		this.programStudiS3=programStudiS3;
	}
	public void printInfo(){
		super.printInfo();
		System.out.println("Asal Program Studi S2 : "+asalProgramStudiS2);
		System.out.println("Program Studi S3 : "+programStudiS3);
	}
}
