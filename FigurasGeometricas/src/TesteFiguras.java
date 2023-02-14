
public class TesteFiguras {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(10.0);
		triangulo.setAltura(20.0);
		triangulo.setLadoA(4.0);
		triangulo.setLadoB(7.0);
		triangulo.setLadoC(8.0);
		
		
		System.out.println("Area "  + triangulo.getNomeFigura() + ": " +  triangulo.getArea());
		System.out.println("Perimetro " + triangulo.getNomeFigura() + ": "+ triangulo.getPerimetro());
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(5.0);
		
		System.out.println();
		
		System.out.println("Area "  + quadrado.getNomeFigura() + ": " +  quadrado.getArea());
		System.out.println("Perimetro " + quadrado.getNomeFigura() + ": "+ quadrado.getPerimetro());
		
		System.out.println();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(7.0);
		retangulo.setBase(18.0);
		
		System.out.println("Area "  + retangulo.getNomeFigura() + ": " +  retangulo.getArea());
		System.out.println("Perimetro " + retangulo.getNomeFigura() + ": "+ retangulo.getPerimetro());
		
	}
}
