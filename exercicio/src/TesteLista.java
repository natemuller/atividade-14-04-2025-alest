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
    }
}