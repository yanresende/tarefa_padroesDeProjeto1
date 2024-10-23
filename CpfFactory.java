public class CpfFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new BrasiliaCar(50, "gasolina", "red");
        } else {
            return new PuntoCar(60, "álcool", "pink");
        }

    }
}
