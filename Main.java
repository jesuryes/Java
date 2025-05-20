public class Main {
    public static void main(String [] args){
        //Crear el objeto a partir de nuestra clase Bebe -> a esto le llamas a esto le llamos instacia
        Bebe bebeUno = new Bebe(nombre: "Miguel", edadMeses: 2, tieneHambre: true);
        Bebe bebeDos = new Bebe(nombre: "Mario", edadMeses:1, tieneHambre: false);
        bebeUno.comer();
        bebeDos.comer();

        //Pasa una hora después
        bebeUno.Llorar();

        //Pasan 30 min más y hora...
        bebeDos.comer(),
    }
}