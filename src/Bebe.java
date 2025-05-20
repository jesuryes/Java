public class Bebe {
    //Atributos
    String nombre;
    int edadMeses;
    boolean tieneHambre;

        //Constructor - ¿Qué es un método contrurtor?
        //Es una funcion especial dentro de una clase,cuya principal función es crear e inicializar
        //objetos de esta clase
        public Bebe(String nombre, int edadMeses,boolean tieneHambre){
            //THIS en POO:Palabra clave para referirse a la instacia actual del objeto
            //Instacia:En programcion orientada a objetos es una realizacion concreta
            //De una clase o un ejemplar a una clase
            this.nombre=nombre;
            this.edadMeses=edadMeses;
            this.tieneHambre=tieneHambre;
        }
        //Métodos
    public void llorar() {
        System.out.println(nombre+"Llorar");}

    //Los bebés comen
    public void comer (){
            if(tieneHambre){
        System.out.println(nombre+"comer");
    }else {
                System.out.println(nombre + "no va a comer");

            }
        }
        //Los bebés rién
    public void rien (){
        System.out.println(nombre+"se rié jajaja");
    }
        }



