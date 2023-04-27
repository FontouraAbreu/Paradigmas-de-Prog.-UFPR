public class Lampada {
    private boolean on;

    public Lampada() {
        setOnOff(false);
    }

    public Lampada(boolean value) {
        setOnOff(value);
    }

    public void setOnOff(boolean value) {
        this.on = value;
    }

    public boolean isOn() {
        return this.on;
    }

    public String toString() {
        String on = isOn() ? "Ligada" : "Desligada";
        return String.format("Status: %s", on);
    }
}
