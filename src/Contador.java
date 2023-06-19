import tech.model.ContModel;

public class Contador {
    public static void main(String[] args) throws Exception {
        ContModel model = new ContModel();

        model.getDadosFromTerminal();
        model.contar();
    }
}