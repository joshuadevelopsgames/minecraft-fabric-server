import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class evz extends ewg {
   public static final MapCodec<evz> a = MapCodec.unit(() -> evz.b);
   public static final evz b = new evz();

   private evz() {
      super(ewi.a.a);
   }

   @Override
   public kg a(ezb $$0, dwu $$1) {
      return kg.i;
   }

   @Override
   public List<eza.a> a(ezb $$0, jb $$1, dwu $$2, bck $$3) {
      return Collections.emptyList();
   }

   @Override
   public euq a(ezb $$0, jb $$1, dwu $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ezb $$0, dnt $$1, dnq $$2, efz $$3, jb $$4, jb $$5, dwu $$6, euq $$7, bck $$8, eyk $$9, boolean $$10) {
      return true;
   }

   @Override
   public ewh<?> a() {
      return ewh.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
