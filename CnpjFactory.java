public class CnpjFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new CorolaCar(100, "gasolina", "azul");
        }else{
            return new CretaCar(150, "gasolina", "black");
        }
    }

}