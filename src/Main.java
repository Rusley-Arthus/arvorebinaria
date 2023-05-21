public class Main {
    public static void main(String[] args) {

        Arvore minhaArvore =  new Arvore();
        minhaArvore.inserir(55);
        minhaArvore.inserir(70);
        minhaArvore.inserir(14);
        minhaArvore.inserir(80);
        minhaArvore.inserir(15);
        minhaArvore.inserir(72);
        minhaArvore.inserir(81);

        minhaArvore.imprimirPreOrdem(minhaArvore.raiz);
        System.out.println("-------------------------");
        minhaArvore.imprimirEmOrdem(minhaArvore.raiz);
        System.out.println("-------------------------");
        minhaArvore.imprimirPosOrdem(minhaArvore.raiz);

    }
}