public class no<T> {
    private T valor;
    private no<T> prox;

    public no(T val) {
        this.valor = val;
        this.prox = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    protected no<T> getProx() {
        return prox;
    }

    protected void setProx(no<T> prox) {
        this.prox = prox;
    }

    public boolean equals(no<T> elem) {
        return this.getValor().equals(elem.getValor());
    }
}
