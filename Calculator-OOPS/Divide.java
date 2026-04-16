public class Divide implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        Double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            res /= numbers[i];
        }
        // Modificación realizada por Nelson Guzman
        System.out.println("División realizada por Nelson Guzman");
        return res;
    }
}