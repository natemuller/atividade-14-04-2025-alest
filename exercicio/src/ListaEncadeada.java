import java.util.Arrays;

public class ListaEncadeada <T> implements ListaDala <T> {
    private Nodo<T> head;
    private Nodo<T> tail;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaEncadeada() {
            this.head = null;
            this.tamanho = 0;
    }

    @Override
    public void adicionarRegistro(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        if (head == null) {
            head = novoNodo;
            tail = novoNodo;
        } else {
            tail.proximo = novoNodo;
            tail = novoNodo;
        }
        tamanho++;
    }

    public T obterRegistro(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        Nodo<T> atual = head;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    public T removerRegistro(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        if (posicao == 0) {
            Nodo<T> aux = head;
            head = head.proximo;
            if (head == null) {
                tail = null;
            }
            tamanho--;
            return aux.dado;
        } else {
            Nodo<T> atual = head;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            Nodo<T> aux = atual.proximo;
            atual.proximo = aux.proximo;
            tamanho--;
            return aux.dado;
        }
    }

    public int obterTamanho() {
        return tamanho;
    }

    public void limparReistros() {
        head = null;
        tail = null;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public T inserirNaPosicao(T dado, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        Nodo<T> novoNodo = new Nodo<>(dado);
        if (head == null) {
            head = novoNodo;
            tail = novoNodo;
        } 
        else {
            if (posicao == 0) {
                novoNodo.proximo = head;
                head = novoNodo;
            } else if (posicao == tamanho) {
                tail.proximo = novoNodo;
                tail = novoNodo;
            } else {
                Nodo<T> atual = head;
                for (int i = 0; i < posicao - 1; i++) {
                    atual = atual.proximo;
                }
                novoNodo.proximo = atual.proximo;
                atual.proximo = novoNodo;
            }
            tamanho++;
        }
        return dado;

    }

    public T substituirRegistro(int posicao, T novo) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        if (posicao == 0) {
            head.dado = novo;
        } else {
            Nodo<T> atual = head;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo.dado = novo;
            if (posicao == tamanho - 1) {
                tail.dado = novo;
            }
        }
        return null;
    }

    public void reverterLista() {
        Nodo<T> novoHead = null;
        Nodo<T> atual = head;
        while (atual != null) {
            Nodo<T> proximo = atual.proximo;
            atual.proximo = novoHead;
            novoHead = atual;
            atual = proximo;
        }
        head = novoHead;
        tail = null;
        for (Nodo<T> nodo = head; nodo != null; nodo = nodo.proximo) {
            if (nodo.proximo == null) {
                tail = nodo;
            }
        }
    }
        
}
