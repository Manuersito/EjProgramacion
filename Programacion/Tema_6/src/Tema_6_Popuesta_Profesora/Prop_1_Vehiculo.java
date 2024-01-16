package Tema_6_Popuesta_Profesora;

public class Prop_1_Vehiculo {
    String matricula;
    String marca;
    String color;

    public Prop_1_Vehiculo(String matricula, String marca, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
