public class Automovil {
    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje;
    /*public void detalle(){
    System.out.println("La marca del auto es: "+this.marca);
    System.out.println("auto.modelo = " + this.modelo);
    System.out.println("auto.color = " + this.color);
    System.out.println("auto = " + this.cilindraje);
    //this toma los atributos de la clase    }    */
    //Metodo para imprimir sin sout
    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("La marca del auto es: " + this.marca);
        sb.append("El modelo del auto es: " + this.modelo);
        sb.append("El color del auto es: " + this.color);
        sb.append("El cilindraje del auto es: " + this.cilindraje);
        return sb.toString();
    }
}
