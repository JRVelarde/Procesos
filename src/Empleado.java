public class Empleado {
    int numHorasTrabajadas=0;
    public synchronized void incrementarHoras(){
        numHorasTrabajadas++;
    }

}