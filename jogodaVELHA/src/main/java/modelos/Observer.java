package modelos;

public interface Observer  {
	
	 public void update( int Computador, int Humano, int Jogador );

	public void add(Observer observer);

	public int indexOf(Observer observer);

	public void remove(Observer observer);

}
