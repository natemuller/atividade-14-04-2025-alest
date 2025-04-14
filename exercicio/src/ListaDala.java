public interface ListaDala <T> { 
    void adicionarRegistro(T dado);
    T removerRegistro(int posicao);
    T obterRegistro(int posicao);
    void limparReistros();
    int obterTamanho();
    boolean estaVazia();
    T inserirNaPosicao (T dado, int posicao);
    T substituirRegistro (T antigo, T novo);
    void reverterLista();

}