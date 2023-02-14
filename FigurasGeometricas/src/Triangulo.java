
public class Triangulo implements FiguraGeometrica{
	
	private double base;
	private double altura;
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	@Override
	public double getArea() {
		double area = (this.base * this.altura) / 2;
		return area;
	}
	
	@Override
	public double getPerimetro() {
		double perimetro = this.ladoA + this.ladoB + this.ladoC;
		return perimetro;
	}
	
	@Override
	public String getNomeFigura() {
		return "triangulo";
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	
	
	
	
}
