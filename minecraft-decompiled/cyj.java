import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyj(int c, float d, boolean e) implements dfb {
   public static final Codec<cyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.o.fieldOf("nutrition").forGetter(cyj::a),
            Codec.FLOAT.fieldOf("saturation").forGetter(cyj::b),
            Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cyj::c)
         )
         .apply($$0, cyj::new)
   );
   public static final zm<wx, cyj> b = zm.a(zk.h, cyj::a, zk.l, cyj::b, zk.b, cyj::c, cyj::new);

   @Override
   public void a(dmu $$0, cam $$1, dcv $$2, dfa $$3) {
      bck $$4 = $$1.ec();
      $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), $$3.e().a(), aza.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cut $$5) {
         $$5.gD().a(this);
         $$0.a(null, $$5.dC(), $$5.dE(), $$5.dI(), ayz.vx, aza.h, 0.5F, bcb.b($$4, 0.9F, 1.0F));
      }
   }

   public int a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;

      public cyj.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cyj.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cyj.a a() {
         this.c = true;
         return this;
      }

      public cyj b() {
         float $$0 = cyh.a(this.a, this.b);
         return new cyj(this.a, $$0, this.c);
      }
   }
}
