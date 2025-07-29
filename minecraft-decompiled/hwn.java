import java.io.IOException;
import java.nio.ByteBuffer;

public interface hwn extends hwk {
   ByteBuffer b() throws IOException;
}
