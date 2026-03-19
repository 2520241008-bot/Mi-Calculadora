public class Add implements Operate{
    @Override
    public Double getResult(Double... numbers){
        Double sum = 0.0;
        
        for(Double num: numbers){
            sum += num;
        }

        // AGREGA ESTA LÍNEA AQUÍ ABAJO:
        System.out.println("Suma realizada correctamente por Laura Gomez");

        return sum;
    }
}