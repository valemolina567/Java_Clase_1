//Main
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.marca = "BMW";
        auto.modelo = "1320";
        auto.color = "Blanco";
        auto.cilindraje = 3.2;
        Automovil bmw = new Automovil();
        bmw.marca = "BMW";
        bmw.modelo = "1320";
        bmw.color = "Blanco";
        bmw.cilindraje = 3.2;
        System.out.println(bmw.detalle());
        Automovil mb = new Automovil();
        mb.marca = "Mercedes Benz";
        mb.modelo = "1320";
        mb.color = "Blanco";
        mb.cilindraje = 3.2;
        System.out.println(mb.detalle());
        Celulares samsung = new Celulares();
        samsung.marca = "Samsung";
        samsung.modelo = "A11";
        samsung.precio = 120.0F;
        samsung.color = "Negro";
        samsung.metodo();
        System.out.println("La marca del auto es: " + auto.marca);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto = " + auto.cilindraje);
        Celulares celular = new Celulares();
        celular.marca = "Samsung";
        celular.modelo = "A10";
        celular.precio = 100.0F;
        celular.color = "Azul";
        System.out.println("celular.marca = " + celular.marca);
        System.out.println("celular.modelo = " + celular.modelo);
        System.out.println("celular.precio = " + celular.precio);
        System.out.println("celular.color = " + celular.color);
    }
}
//Automovil
public class Automovil {
    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje;

    public Automovil() {
    }

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("La marca del auto es: " + this.marca);
        sb.append("El modelo del auto es: " + this.modelo);
        sb.append("El color del auto es: " + this.color);
        sb.append("El cilindraje del auto es: " + this.cilindraje);
        return sb.toString();
    }
}
//Celulares
public class Celulares {
    String marca;
    String modelo;
    float precio;
    String color;

    public Celulares() {
    }

    public void metodo() {
        System.out.println("La marca del celular es: " + this.marca);
        System.out.println("celular.modelo = " + this.modelo);
        System.out.println("celular.precio = " + this.precio);
        System.out.println("celular.color = " + this.color);
    }
}
