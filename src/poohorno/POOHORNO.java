package poohorno;
public class POOHORNO {
    public static void main(String[] args) {
        horno hornoGas, hornalla;
        hornoGas = new horno();
        hornalla = new horno();
        hornoGas.encender();
        System.out.println(hornoGas.encendido);
        hornalla.encender();
        System.out.println(hornalla.encendido);        
        hornoGas.temperaturaBaja();
        System.out.println(hornoGas.temperatura);
        hornoGas.temperaturaMedia();
        System.out.println(hornalla.temperatura);
        hornoGas.apagar();
        hornalla.apagar();
        System.out.println(hornoGas.encendido);
        System.out.println(hornalla.encendido);
    }
    
}
