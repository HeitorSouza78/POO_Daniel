public class Drone{

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.codigo = codigo;
        this.altura = altura;
        this.bateria = bateria;
        this.emVoo = emVoo;
    }

    public Drone() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura < 0 || altura > 120){
            System.out.println("Altura errada");
        }
        else{
            this.altura = altura;
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if(bateria < 0 || bateria > 100){
            System.out.println("Bateria inadequada ");
        }
        else{
            this.bateria = bateria;
        }
    }
    public void decolar(){
        if(this.bateria > 20){
            if(testarMotores()){
                emVoo = true;
                setAltura(2);
                System.out.println("Drone decolou");

            }
            else{
                System.out.println("Falha nos motores");
            }
        }
        else{
            System.out.println("Bateria Inadequada");
        }


    }
    private boolean testarMotores(){
        int numero = (int) (Math.random() * 10); // gera número de 0 a 9
        if(numero < 8){
            System.out.println("Calibrando GPS...  \n  Testando Helices...");
            return true;

        }
        else{
            System.out.println("Numero maior que 8, por favor tente de novo");
            return false;
        }
    }

    public void subir(float x){
        setAltura(this.altura + x);
    }

    public void descer(float x){
        setAltura(this.altura - x);
    }



    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "codigo='" + codigo + '\'' +
                ", altura=" + altura +
                ", bateria=" + bateria +
                ", emVoo=" + emVoo +
                '}';
    }
}
