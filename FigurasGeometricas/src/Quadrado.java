
public class Quadrado implements FiguraGeometrica {
	private double lado;
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public String getNomeFigura() {
		return "quadrado";
	}
	
	@Override
	public double getArea() {
		double area = this.lado * this.lado;
		return area;
	}
	
	@Override
	public double getPerimetro() {
		double perimetro = this.lado * 4;
		return perimetro;
	}
}
