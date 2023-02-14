
public class Retangulo implements FiguraGeometrica{
	private double base;
	private double altura;

	@Override
	public String getNomeFigura() {
		return "retangulo";
	}
	
	@Override
	public double getArea() {
		double area = this.base * this.altura;
		return area;
	}
	
	@Override
	public double getPerimetro() {
		double perimetro = 2*(this.base + this.altura);
		return perimetro;
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
		
}
