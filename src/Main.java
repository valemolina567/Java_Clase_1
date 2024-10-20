public class Main {
    public static void main(String[] args) {
        Automovil auto=new Automovil();
        auto.marca = "BMW";
        auto.modelo = "1320";
        auto.color = "Blanco"; //El molde dice negro, pero el cambio en main dice blanco
        auto.cilindraje = 3.2;
        Automovil bmw=new Automovil();
        bmw.marca = "BMW";
        bmw.modelo = "1320";
        bmw.color = "Blanco"; //El molde dice negro, pero el cambio en main dice blanco
        bmw.cilindraje = 3.2;
        System.out.println(bmw.detalle());
        Automovil mb=new Automovil();
        mb.marca = "Mercedes Benz";
        mb.modelo = "1320";
        mb.color = "Blanco"; //El molde dice negro, pero el cambio en main dice blanco
        mb.cilindraje = 3.2;
        //Imprimir el metodo detalle ubicado en la clase Automovil
        System.out.println(mb.detalle());

        //Objetos instanciados de la clase celulares
        Celulares samsung=new Celulares();
        samsung.marca = "Samsung";
        samsung.modelo = "A11";
        samsung.precio = 120;
        samsung.color = "Negro";
        samsung.metodo();
        System.out.println("La marca del auto es: "+auto.marca);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto = " + auto.cilindraje);
        Celulares celular = new Celulares();
        celular.marca = "Samsung";
        celular.modelo = "A10";
        celular.precio = 100;
        celular.color = "Azul";
        System.out.println("celular.marca = " + celular.marca);
        System.out.println("celular.modelo = " + celular.modelo);
        System.out.println("celular.precio = " + celular.precio);
        System.out.println("celular.color = " + celular.color);
    }
}