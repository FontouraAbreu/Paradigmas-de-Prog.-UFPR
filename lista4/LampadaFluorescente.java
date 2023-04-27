public class LampadaFluorescente extends Lampada {
    private int size;

    public LampadaFluorescente() {
        super();
        setSize(0);
    }

    public LampadaFluorescente(boolean value, int size) {
        super(value);
        setSize(size);
    }

    public void setSize(int value) {
        if (value > 0)
            this.size = value;
        else
            this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        return String.format("LampadaFluorescente:\n %s\n Tamanho: %d", super.toString(), getSize());
    }
}
