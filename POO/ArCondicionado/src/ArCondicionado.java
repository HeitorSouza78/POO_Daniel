public class ArCondicionado{
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;


    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.ligado = ligado;
    }

    public ArCondicionado() {
    }

    public String getMarca() {
        return marca;
    }
    // setMarca(String m): Só aceita se a marca tiver pelo menos 3 caracteres.
    public void setMarca(String marca) {
        if(marca.length() > 3){
            this.marca = marca;
        }
        else{
            System.out.println("Marca inválida");
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }
//    setTemperatura(int t): Só deve aceitar valores entre 16 e 30 graus.
//    Caso contrário, exibir "Temperatura fora da faixa".
    public void setTemperatura(int temperatura) {
        if(temperatura >= 16 && temperatura <= 30){
            this.temperatura = temperatura;
        }
        else{
            System.out.println("Temperatura inválida");
        }
    }
    // Método público
    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("Modo Turbo ativado! Temperatura ajustada para 16.");
        } else {
            System.out.println("Falha no compressor. Não foi possível ativar o modo turbo.");
        }
    }

    // Método privado
    private boolean verificarCompressor() {
        int numero = (int) (Math.random() * 5); // gera número de 0 a 4
        if (numero > 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + ligado +
                '}';
    }
}
