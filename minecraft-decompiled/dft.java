import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dft(int f) implements dfb, dga {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dft> d = bbi.a(0, 4).xmap(dft::new, dft::a);
   public static final zm<wx, dft> e = zm.a(zk.h, dft::a, dft::new);

   @Override
   public void a(dmu $$0, cam $$1, dcv $$2, dfa $$3) {
      $$1.a(new byq(bys.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      List<byq> $$4 = List.of(new byq(bys.E, 120000, this.f, false, false, true));
      der.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
