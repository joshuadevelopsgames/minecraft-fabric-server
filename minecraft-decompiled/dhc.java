import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dhc implements dhb {
   private final dgz d;

   public dhc(dgz $$0) {
      this.d = $$0;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dgz c() {
      return this.d;
   }

   @Override
   public dhl ao_() {
      return dhl.b;
   }

   @Override
   public abstract dhw<? extends dhc> a();

   public static class a<T extends dhb> implements dhw<T> {
      private final MapCodec<T> w;
      private final zm<wx, T> x;

      public a(dhc.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dgz.e.fieldOf("category").orElse(dgz.d).forGetter(dhb::c)).apply($$1, $$0::create));
         this.x = zm.a(dgz.g, dhb::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public zm<wx, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends dhb> {
         T create(dgz var1);
      }
   }
}
