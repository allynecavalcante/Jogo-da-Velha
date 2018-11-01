package modelos;

public abstract class Jogador implements Subject {

	private static final int Humano = 0;
	protected int[] tentativa = new int[2];
    protected int jogador;

    
    public Jogador(int jogador){
        this.jogador = jogador;
    }
    
    public abstract void jogar(Tabuleiro tabuleiro);
    
    public abstract void Tentativa(Tabuleiro tabuleiro);

    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro){
        if(tabuleiro.getPosicao(tentativa) == 0)
            return true;
        else
            return false;
            
    }
    public void addObserver(Observer observer) {
        observer.add( observer );
    }

    public void removeObserver(Observer observer) {
        int index = observer.indexOf( observer );
        if( index > -1 ){
            observer.remove( observer );
        }
    }

}
