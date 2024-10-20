public class Celulares {
    String marca;
    String modelo;
    float precio;
    String color;
    public void metodo(){
        System.out.println("La marca del celular es: "+this.marca);
        System.out.println("celular.modelo = " + this.modelo);
        System.out.println("celular.precio = " + this.precio);
        System.out.println("celular.color = " + this.color);        //this toma los atributos de la clase
    }
}