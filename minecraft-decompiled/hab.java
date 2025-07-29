import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class hab implements axp {
   private Map<ebb<?>, hac<?>> d = ImmutableMap.of();
   private final fwz e;
   private final Supplier<gqj> f;
   public dmu a;
   public ftm b;
   public fiq c;
   private final gys g;
   private final hof h;
   private final hfd i;
   private final hec j;

   public hab(fwz $$0, Supplier<gqj> $$1, gys $$2, hof $$3, hfd $$4, hec $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends eaz> hac<E> a(E $$0) {
      return (hac<E>)this.d.get($$0.q());
   }

   public void a(dmu $$0, ftm $$1, fiq $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends eaz> void a(E $$0, float $$1, fod $$2, gxn $$3) {
      hac<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.d())) {
               try {
                  a($$4, $$0, $$1, $$2, $$3, this.b.d());
               } catch (Throwable var9) {
                  p $$6 = p.a(var9, "Rendering Block Entity");
                  q $$7 = $$6.a("Block Entity Details");
                  $$0.a($$7);
                  throw new aa($$6);
               }
            }
         }
      }
   }

   private static <T extends eaz> void a(hac<T> $$0, T $$1, float $$2, fod $$3, gxn $$4, fis $$5) {
      dmu $$6 = $$1.i();
      int $$7;
      if ($$6 != null) {
         $$7 = gxh.a($$6, $$1.aA_());
      } else {
         $$7 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$7, hri.d, $$5);
   }

   public void a(@Nullable dmu $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(axo $$0) {
      had.a $$1 = new had.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = hae.a($$1);
   }
}
