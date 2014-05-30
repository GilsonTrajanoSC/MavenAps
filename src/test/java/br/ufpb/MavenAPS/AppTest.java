package br.ufpb.MavenAPS;

import static org.junit.Assert.*;

import org.junit.*;

public class AppTest {
    
	App a;
	
	@Before
	public void iniciaTest(){
		a = new App();
        assertTrue(a.getX() == -1);
        assertTrue(a.getY() == -1);
	}
	@Test(expected=FaltarValorExcepiton.class)
    public void receberUmValorESomaTest() {
        a.setValorX(1);
        assertEquals(1,a.getX());
        a.somaValor();
    }
	@Test(expected=ValorNegativoException.class)
	public void receberValoresNegNoYTest(){
		a.setValorX(10);
		a.setValorY(-10);
	}
	@Test(expected=ValorNegativoException.class)
	public void receberValoresNegNoXTest(){
		a.setValorX(-10);
		a.setValorY(10);
	}
	@Test(expected=FaltarValorExcepiton.class)
	public void somaSemReceberNenhumValorTest(){
		a.somaValor();
	}
	@Test
	public void somaValoresPosTest(){
		a.setValorX(10);
		a.setValorY(10);
		assertEquals(20,a.somaValor());
		assertEquals(-1,a.getX());
		assertEquals(-1,a.getY());
	}
	@Test(expected=ValorJaInformadoException.class)
	public void setaUmValorDuasVezesNoXTest(){
		a.setValorX(10);
		a.setValorX(29);
	}
	@Test(expected=ValorJaInformadoException.class)
	public void setaUmValorDuasVezesNoYTest(){
		a.setValorY(10);
		a.setValorY(29);
	}
}
