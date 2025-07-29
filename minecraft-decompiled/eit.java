import java.util.UUID;
import javax.annotation.Nullable;

public interface eit<IdentifiedType extends eiu> {
   @Nullable
   IdentifiedType getEntity(UUID var1);
}
