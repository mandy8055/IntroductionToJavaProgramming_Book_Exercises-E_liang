package objectsandclassesprimer.Exercises;

public class Exercise2 {
    public static void main(String[] args) {
        Stock stockVar = new Stock("ORCL", "Oracle Corporation", 34.5);
        stockVar.setCurrentPrice(34.35);
        System.out.println("The price Change percentage is: " + Math.round((stockVar.getChangePercentage() * 1000.0)) / 1000.0 + "%.");
    }
}
class Stock{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbolData, String nameData, double previousClosingPriceVal){
        symbol = symbolData;
        name = nameData;
        previousClosingPrice = previousClosingPriceVal;
    }

    public void setCurrentPrice(double currentPriceVal){
        currentPrice = currentPriceVal;
    }

    public double getChangePercentage(){
        return ((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
    }
}
