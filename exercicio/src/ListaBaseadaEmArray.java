import java.util.Arrays;

public class ListaBaseadaEmArray <T> implements ListaDala <T> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaBaseadaEmArray() {
            elementos = (T[]) new Object[10];
            tamanho = 0;
    }

    public void adicionarRegistro(T dado) {
        if (tamanho == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }
        elementos[tamanho++] = dado;
    }

    public T obterRegistro(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return elementos[posicao];
    }

    public T removerRegistro(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        T elementoRemovido = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return elementoRemovido;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public void limparReistros() {
        Arrays.fill(elementos, null);
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public T inserirNaPosicao(T dado, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        if (tamanho == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicao] = dado;
        tamanho++;
        return dado;
    }

    public T substituirRegistro(T antigo, T novo) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(antigo)) {
                T temp = elementos[i];
                elementos[i] = novo;
                return temp;
            }
        }
        return null;
    }

    public void reverterLista() {
        for (int i = 0; i < tamanho / 2; i++) {
            T temp = elementos[i];
            elementos[i] = elementos[tamanho - i - 1];
            elementos[tamanho - i - 1] = temp;
        }
    }
}
