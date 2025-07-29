import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class die implements dhm<dif> {
   private final dhi d;
   private final dcv e;
   private final String f;
   @Nullable
   private dhl g;

   public die(String $$0, dhi $$1, dcv $$2) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public abstract dhw<? extends die> a();

   @Override
   public abstract dhx<? extends die> b();

   public boolean a(dif $$0, dmu $$1) {
      return this.d.a($$0.c());
   }

   @Override
   public String j() {
      return this.f;
   }

   public dhi k() {
      return this.d;
   }

   protected dcv l() {
      return this.e;
   }

   @Override
   public dhl ao_() {
      if (this.g == null) {
         this.g = dhl.a(this.d);
      }

      return this.g;
   }

   public dcv a(dif $$0, jn.a $$1) {
      return this.e.v();
   }

   @FunctionalInterface
   public interface a<T extends die> {
      T create(String var1, dhi var2, dcv var3);
   }

   public static class b<T extends die> implements dhw<T> {
      private final MapCodec<T> w;
      private final zm<wx, T> x;

      protected b(die.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter(die::j),
                  dhi.d.fieldOf("ingredient").forGetter(die::k),
                  dcv.d.fieldOf("result").forGetter(die::l)
               )
               .apply($$1, $$0::create)
         );
         this.x = zm.a(zk.p, die::j, dhi.a, die::k, dcv.j, die::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public zm<wx, T> b() {
         return this.x;
      }
   }
}
