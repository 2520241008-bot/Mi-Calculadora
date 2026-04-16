public class Multiply implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        Double res = 1.0;
        for (Double num : numbers) {
            res *= num;
        }
        // Modificación realizada por Gabriel Ramirez
        System.out.println("Multiplicación realizada por Gabriel Ramirez");
        return res;
    }
}