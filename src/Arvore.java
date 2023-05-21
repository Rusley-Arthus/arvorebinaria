public class Arvore {

    public No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        if (this.raiz == null) {
            this.raiz = new No(valor);
        } else {
            No novo = new No(valor);
            inserir(this.raiz, novo);
        }
    }

    private void inserir(No arvore, No novo) {
        if (novo.getValor() > arvore.getValor()) {
            if (arvore.getDireita() == null) {
                arvore.setDireita(novo);
            } else {
                inserir(arvore.getDireita(), novo);
            }
        } else {
            if (arvore.getEsquerda() == null) {
                arvore.setEsquerda(novo);
            } else {
                inserir(arvore.getEsquerda(), novo);
            }
        }
    }

    public void imprimirPreOrdem(No raiz){
        if(raiz != null){
            System.out.println(raiz.getValor() + " ");
            imprimirEmOrdem(raiz.getEsquerda());
            imprimirEmOrdem(raiz.getDireita());
        }
    }

    public void imprimirEmOrdem(No raiz){
        if(raiz != null){
            imprimirEmOrdem(raiz.getEsquerda());
            System.out.println(raiz.getValor() + " ");
            imprimirEmOrdem(raiz.getDireita());
        }
    }

    public void imprimirPosOrdem(No raiz){
        if(raiz != null){
            imprimirEmOrdem(raiz.getEsquerda());
            imprimirEmOrdem(raiz.getDireita());
            System.out.println(raiz.getValor() + " ");

        }
    }
}