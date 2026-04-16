public class Subtract implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        Double sub = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sub -= numbers[i];
        }
        // Modificación realizada por Daniel Rubio
        System.out.println("Resta ejecutada con éxito por Daniel Rubio");
        return sub;
    }
}