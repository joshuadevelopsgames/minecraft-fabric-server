import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eyi extends eyx {
   public static final MapCodec<eyi> a = MapCodec.unit(() -> eyi.b);
   public static final eyi b = new eyi();

   @Nullable
   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      jb $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dqb.K);
      return $$7 && !dpz.a($$4.b().f($$0, $$6)) ? new eza.d($$6, dqb.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected eyz<?> a() {
      return eyz.m;
   }
}
