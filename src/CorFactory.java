import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private static Map<String, Cor> cores = new HashMap<>();

    public Cor getCor(String cor) {
        if (!cores.containsKey(cor)) {
            cores.put(cor, new Cor(cor));
        }
        return cores.get(cor);
    }
}
