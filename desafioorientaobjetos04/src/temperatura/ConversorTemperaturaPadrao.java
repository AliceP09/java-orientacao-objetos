package temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double valor) {
        return (valor * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double valor) {
        return (valor - 32) / 1.8;
    }
}
