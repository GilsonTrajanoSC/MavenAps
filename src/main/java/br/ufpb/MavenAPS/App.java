package br.ufpb.MavenAPS;

/**
 * Hello world!
 *
 */
public class App {
    
	private int x,y;
	
	public App(){
		this.x = -1;
		this.y = -1;
	}
	
	public int getX() {
		return x;
	}

	public void setValorX(int x) {
		if(this.isPositivoX(x)){
			if(this.x != -1){
				throw new ValorJaInformadoException("Valor já informado ");
			}else{
				this.x = x;
			}
		}else{
			throw new ValorNegativoException("Valor informado é negativo " + x);
		}
		
	}

	public int getY() {
		return y;
	}

	public void setValorY(int y) {
		if(this.isPositivoY(y)){
			if(this.y != -1){
				throw new ValorJaInformadoException("Valor já informado ");
			}else{
				this.y = y;
			}
		}else{
			throw new ValorNegativoException("Valor informado é negativo " + y);
		}
	}

	public boolean isPositivoX(int x) {
		if(x >= 0){
			return true;
		}
		return false;
	}
	
	public boolean isPositivoY(int y) {
		if(y >= 0){
			return true;
		}
		return false;
	}

	public int somaValor() {
		if(this.x == -1 || this.y == -1){
			throw new FaltarValorExcepiton("Faltar valor se informado");
		}
		int soma = this.x + this.y;
		this.x = -1;
		this.y = -1;
		return soma;
	}
	
	
}
