/**
 * @author Ana
 * @version 0.1
 */


public class Carro {

        public String marca;

        public String modelo;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public static void main(String args[]) {
        Carro carro = new Carro();
        carro.setMarca("BMW");
        carro.setModelo("X1");
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
    }

}
