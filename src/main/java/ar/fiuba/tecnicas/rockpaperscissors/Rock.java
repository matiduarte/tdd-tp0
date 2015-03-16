package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {

	public Rock(){}
	
	public Paper vs(Paper paper){
		return paper;
	}
	
	public Rock vs(Rock rock){
		return rock;
	}
	
	public Rock vs(Scissor scissor){
		return this;
	}
}
