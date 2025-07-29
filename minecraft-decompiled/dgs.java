import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dgs extends die {
   private final dgy d;
   private final float e;
   private final int f;

   public dgs(String $$0, dgy $$1, dhi $$2, dcv $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.d = $$1;
      this.e = $$4;
      this.f = $$5;
   }

   @Override
   public abstract dhw<? extends dgs> a();

   @Override
   public abstract dhx<? extends dgs> b();

   public float c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public dgy e() {
      return this.d;
   }

   protected abstract dcr f();

   @Override
   public List<dis> g() {
      return List.of(new dir(this.k().c(), diy.a.c, new diy.f(this.l()), new diy.d(this.f()), this.f, this.e));
   }

   @FunctionalInterface
   public interface a<T extends dgs> {
      T create(String var1, dgy var2, dhi var3, dcv var4, float var5, int var6);
   }

   public static class b<T extends dgs> implements dhw<T> {
      private final MapCodec<T> w;
      private final zm<wx, T> x;

      public b(dgs.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter(die::j),
                  dgy.d.fieldOf("category").orElse(dgy.c).forGetter(dgs::e),
                  dhi.d.fieldOf("ingredient").forGetter(die::k),
                  dcv.e.fieldOf("result").forGetter(die::l),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dgs::c),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dgs::d)
               )
               .apply($$2, $$0::create)
         );
         this.x = zm.a(zk.p, die::j, dgy.e, dgs::e, dhi.a, die::k, dcv.j, die::l, zk.l, dgs::c, zk.g, dgs::d, $$0::create);
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
