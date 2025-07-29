import com.mojang.serialization.Codec;

public record kx(da e) implements kz {
   public static final Codec<kx> a = da.a.xmap(kx::new, kx::a);

   @Override
   public boolean a(kl $$0) {
      return this.e.a($$0);
   }

   public static kx a(da $$0) {
      return new kx($$0);
   }

   public da a() {
      return this.e;
   }
}
