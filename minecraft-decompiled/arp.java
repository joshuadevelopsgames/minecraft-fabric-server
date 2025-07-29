import com.mojang.serialization.MapCodec;
import java.util.Optional;

public interface arp extends art {
   @Override
   MapCodec<? extends arp> a();

   int b();

   Optional<aro> c();

   @Override
   default Optional<asd> d() {
      return this.c().flatMap(aro::b);
   }
}
