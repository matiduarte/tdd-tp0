package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper {

	public Paper(){}
	
	public Paper vs(Paper paper){
		return paper;
	}
	
	public Paper vs(Rock rock){
		return this;
	}
	
	public Scissor vs(Scissor scissor){
		return scissor;
	}
}
