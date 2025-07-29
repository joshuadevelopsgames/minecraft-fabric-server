import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hnz implements hoe {
   static final hoe a = new hnz();

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
      dcv $$7 = dbk.i($$1);
      if (!$$7.f()) {
         $$2.b($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public record a() implements hoe.b {
      public static final MapCodec<hnz.a> a = MapCodec.unit(new hnz.a());

      @Override
      public MapCodec<hnz.a> a() {
         return a;
      }

      @Override
      public hoe a(hoe.a $$0) {
         return hnz.a;
      }

      @Override
      public void a(huk.a $$0) {
      }
   }
}
