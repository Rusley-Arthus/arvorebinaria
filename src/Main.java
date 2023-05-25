public class Main {
    public static void main(String[] args) {

        Arvore minhaArvore =  new Arvore();
        minhaArvore.inserir(7);
        minhaArvore.inserir(5);
        minhaArvore.inserir(9);
        minhaArvore.inserir(6);
        minhaArvore.inserir(8);
        minhaArvore.inserir(10);

        minhaArvore.imprimirEmOrdem(minhaArvore.raiz);
        minhaArvore.eliminarNo(5, minhaArvore.raiz);
        minhaArvore.imprimirEmOrdem(minhaArvore.raiz);
    }
}