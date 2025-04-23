public class TesteLista {
    public static void main(String[] args) {
        ListaBaseadaEmArray<String> registros = new ListaBaseadaEmArray<>();

        registros.adicionarRegistro("Natan");
        registros.adicionarRegistro("Luiz");
        registros.adicionarRegistro("Gabriel");
        registros.adicionarRegistro("Felipe");
        registros.adicionarRegistro("Hanry");
        registros.adicionarRegistro("Cleysso");
        registros.adicionarRegistro("Emile");

        System.out.println(registros.obterTamanho());
        System.out.println(registros.obterRegistro(0));
        System.out.println(registros.obterRegistro(1));
        System.out.println(registros.obterRegistro(2));
        System.out.println(registros.obterRegistro(3));
        System.out.println(registros.obterRegistro(4));
        System.out.println(registros.obterRegistro(5));
        System.out.println(registros.obterRegistro(6));

        System.out.println(registros.substituirRegistro("Natan","PIROCA "));


        System.out.println(registros.inserirNaPosicao("Piroca grande", 5));

        System.out.println(registros.obterTamanho());
        System.out.println(registros.obterRegistro(0));
        System.out.println(registros.obterRegistro(1));
        System.out.println(registros.obterRegistro(2));
        System.out.println(registros.obterRegistro(3));
        System.out.println(registros.obterRegistro(4));
        System.out.println(registros.obterRegistro(5));
        System.out.println(registros.obterRegistro(6)); 

       registros.reverterLista();

       for (int i = 0; i < registros.obterTamanho(); i++) {
        System.out.println(registros.obterRegistro(i));
       }

       ListaEncadeada<String> encadeada = new ListaEncadeada<>();   

       encadeada.adicionarRegistro("Natan");
       encadeada.adicionarRegistro("Luiz");
       encadeada.adicionarRegistro("Gabriel");
       encadeada.adicionarRegistro("Felipe");
       encadeada.adicionarRegistro("Hanry");
       encadeada.adicionarRegistro("Cleysso");
       encadeada.adicionarRegistro("Emile");

       System.out.println(encadeada.obterTamanho());
       System.out.println(encadeada.obterRegistro(0));
       System.out.println(encadeada.obterRegistro(1));
       System.out.println(encadeada.obterRegistro(2));
       System.out.println(encadeada.obterRegistro(3));
       System.out.println(encadeada.obterRegistro(4));
       System.out.println(encadeada.obterRegistro(5));
       System.out.println(encadeada.obterRegistro(6));

       System.out.println(encadeada.substituirRegistro("Natan","PIROCA "));

       System.out.println(encadeada.inserirNaPosicao("Piroca grande", 5));

       System.out.println(encadeada.obterTamanho());
       System.out.println(encadeada.obterRegistro(0));
       System.out.println(encadeada.obterRegistro(1));
       System.out.println(encadeada.obterRegistro(2));
       System.out.println(encadeada.obterRegistro(3));
       System.out.println(encadeada.obterRegistro(4));
       System.out.println(encadeada.obterRegistro(5));
       System.out.println(encadeada.obterRegistro(6)); 

       encadeada.reverterLista();

       for (int i = 0; i < encadeada.obterTamanho(); i++) {
        System.out.println(encadeada.obterRegistro(i));
       }

       encadeada.inserirNaPosicao("PIROCA GRANDE", 5);

       for (int i = 0; i < encadeada.obterTamanho(); i++) {
        System.out.println(encadeada.obterRegistro(i));
       }

       encadeada.inverter();

       for (int i = 0; i < encadeada.obterTamanho(); i++) {
        System.out.println(encadeada.obterRegistro(i));
       }
    }
}