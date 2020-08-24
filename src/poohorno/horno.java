
package poohorno;
public class horno {
    boolean encendido = false;
    int temperatura = 0;
    public void encender(){
        encendido = true;
    }
    public void apagar(){
        encendido = false;        
    }
    public void temperaturaBaja(){
        temperatura = 100;
    }
    public void temperaturaMedia(){
        temperatura = 200;
    }
    public void temperaturaAlta(){
        temperatura = 300;
        
    }
}
