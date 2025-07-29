import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class hve implements hva {
   private static final int a = 40;
   private static final float b = 0.001F;
   private final gwi c;
   private final hwx d;
   private final dnz e;
   private final bck f;
   private final Object2ObjectArrayMap<dnx, hve.a> g = new Object2ObjectArrayMap();
   private Optional<dnv> h = Optional.empty();
   private Optional<dnu> i = Optional.empty();
   private float j;
   @Nullable
   private dnx k;

   public hve(gwi $$0, hwx $$1, dnz $$2) {
      this.f = $$0.ai().H_();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public float b() {
      return this.j;
   }

   @Override
   public void a() {
      this.g.values().removeIf(huz::m);
      dnx $$0 = this.e.a(this.c.dC(), this.c.dE(), this.c.dI()).a();
      if ($$0 != this.k) {
         this.k = $$0;
         this.h = $$0.n();
         this.i = $$0.o();
         this.g.values().forEach(hve.a::o);
         $$0.m().ifPresent($$1 -> this.g.compute($$0, ($$1x, $$2) -> {
            if ($$2 == null) {
               $$2 = new hve.a((ayy)$$1.a());
               this.d.a((hvr)$$2);
            }

            $$2.p();
            return $$2;
         }));
      }

      this.i.ifPresent($$0x -> {
         if (this.f.j() < $$0x.b()) {
            this.d.a(hvm.a($$0x.a().a()));
         }
      });
      this.h.ifPresent($$0x -> {
         dmu $$1 = this.c.ai();
         int $$2 = $$0x.c() * 2 + 1;
         jb $$3 = jb.a(this.c.dC() + this.f.a($$2) - $$0x.c(), this.c.dG() + this.f.a($$2) - $$0x.c(), this.c.dI() + this.f.a($$2) - $$0x.c());
         int $$4 = $$1.a(dnd.a, $$3);
         if ($$4 > 0) {
            this.j -= $$4 / 15.0F * 0.001F;
         } else {
            this.j = this.j - (float)($$1.a(dnd.b, $$3) - 1) / $$0x.b();
         }

         if (this.j >= 1.0F) {
            double $$5 = $$3.u() + 0.5;
            double $$6 = $$3.v() + 0.5;
            double $$7 = $$3.w() + 0.5;
            double $$8 = $$5 - this.c.dC();
            double $$9 = $$6 - this.c.dG();
            double $$10 = $$7 - this.c.dI();
            double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
            double $$12 = $$11 + $$0x.d();
            hvm $$13 = hvm.a($$0x.a().a(), this.f, this.c.dC() + $$8 / $$11 * $$12, this.c.dG() + $$9 / $$11 * $$12, this.c.dI() + $$10 / $$11 * $$12);
            this.d.a($$13);
            this.j = 0.0F;
         } else {
            this.j = Math.max(this.j, 0.0F);
         }
      });
   }

   public static class a extends huz {
      private int n;
      private int o;

      public a(ayy $$0) {
         super($$0, aza.i, hvr.t());
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.o < 0) {
            this.n();
         }

         this.o = this.o + this.n;
         this.d = bcb.a(this.o / 40.0F, 0.0F, 1.0F);
      }

      public void o() {
         this.o = Math.min(this.o, 40);
         this.n = -1;
      }

      public void p() {
         this.o = Math.max(0, this.o);
         this.n = 1;
      }
   }
}
