package division;

public class Divison {

    public float calcularDivision(float dividendo, float divisor) throws Exception {

        if (divisor == 0) {

            throw (new Exception("Error. El divisor no puede ser 0."));

        }

        float resultado = dividendo / divisor;

        return resultado;

    }
}
