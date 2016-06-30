
import java.util.Map;

public class MemLeakCollection {
    public final String key;
    
    public MemLeakCollection(String key) {
        this.key =key;
    }
    
    public static void main(String args[]) {
        try {
            Map map = System.getProperties();
            
            for(;;) {
                map.put(new MemLeakCollection("key"), "value");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}