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
                novo.setPai(arvore);
            } else {
                inserir(arvore.getDireita(), novo);
            }
        } else {
            if (arvore.getEsquerda() == null) {
                arvore.setEsquerda(novo);
                novo.setPai(arvore);
            } else {
                inserir(arvore.getEsquerda(), novo);
            }
        }
    }

    public void imprimirPreOrdem(No raiz) {
        if (raiz != null) {
            System.out.println(raiz.getValor() + " ");
            imprimirEmOrdem(raiz.getEsquerda());
            imprimirEmOrdem(raiz.getDireita());
        }
    }

    public void imprimirEmOrdem(No raiz) {
        if (raiz != null) {
            imprimirEmOrdem(raiz.getEsquerda());
            System.out.println(raiz.getValor() + " ");
            imprimirEmOrdem(raiz.getDireita());
        }
    }

    public void imprimirPosOrdem(No raiz) {
        if (raiz != null) {
            imprimirEmOrdem(raiz.getEsquerda());
            imprimirEmOrdem(raiz.getDireita());
            System.out.println(raiz.getValor() + " ");

        }
    }

    public void buscar(int valor, No no) {
        if (valor == no.getValor()) {
            System.out.println("Valor encontrado!");
        }

        if (valor > no.getValor()) {
            if (no.getDireita() == null) {
                System.out.println("Valor não encontrado!");
            } else {
                buscar(valor, no.getDireita());
            }
        }

        if (valor < no.getValor()) {
            if (no.getEsquerda() == null) {
                System.out.println("Valor não encontrado!");
            } else {
                buscar(valor, no.getEsquerda());
            }
        }
    }

    public void eliminarNo(int valor, No no) {
        if (valor == no.getValor()) { // Eliminando nó folha
            if (no.getEsquerda() == null && no.getDireita() == null) {
                if (no.getPai().getDireita() == no) {
                    no.getPai().setDireita(null);
                    System.out.println("Nó Eliminado!");
                } else {
                    no.getPai().setEsquerda(null);
                    System.out.println("Nó Eliminado!");
                }
            }

            if (no.getEsquerda() == null || no.getDireita() == null) {
                if (no.getPai().getDireita() != null && no.getPai().getDireita() == no) {
                    if (no.getDireita() != null) {
                        no.getPai().setDireita(no.getDireita());
                        System.out.println("Nó Eliminado!");
                    } else if (no.getEsquerda() != null) {
                        no.getPai().setDireita(no.getEsquerda());
                        System.out.println("Nó Eliminado!");
                    }

                }

                if (no.getPai().getEsquerda() != null && no.getPai().getEsquerda() == no) {
                    if (no.getDireita() != null) {
                        no.getPai().setDireita(no.getDireita());
                        System.out.println("Nó Eliminado!");
                    } else if (no.getEsquerda() != null) {
                        no.getPai().setDireita(no.getEsquerda());
                        System.out.println("Nó Eliminado!");
                    }

                }
            }
        }

        if (valor > no.getValor()) {
            if (no.getDireita() == null) {
                System.out.println("Valor não encontrado!");
            } else {
                eliminarNo(valor, no.getDireita());
            }
        }

        if (valor < no.getValor()) {
            if (no.getEsquerda() == null) {
                System.out.println("Valor não encontrado!");
            } else {
                eliminarNo(valor, no.getEsquerda());
            }
        }
    }
}