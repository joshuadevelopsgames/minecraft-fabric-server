import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record dda(dbw<ddb> c) implements dga {
   public static final Codec<dda> a = dbw.a(mn.ba, ddb.c).xmap(dda::new, dda::a);
   public static final zm<wx, dda> b = zm.a(dbw.a(mn.ba, ddb.d), dda::a, dda::new);

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      jn.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            yc $$2x = ((ddb)$$1x.a()).c().f();
            xr.a($$2x, yl.a.a(o.h));
            $$1.accept($$2x);
         });
      }
   }

   public static bxj a(dmu $$0, jb $$1, dcv $$2, cut $$3) {
      dda $$4 = $$2.a(kq.ae);
      if ($$4 == null) {
         return bxj.f;
      } else {
         eeb $$5 = $$0.a_($$1);
         if ($$5.a(dqb.ek) && !$$5.c(dui.b)) {
            if (!$$0.C) {
               dcv $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof ece $$7) {
                  $$7.b($$6);
                  $$0.a(ejb.c, $$1, ejb.a.a($$3, $$5));
               }

               $$3.a(azj.am);
            }

            return bxj.a;
         } else {
            return bxj.f;
         }
      }
   }

   public dbw<ddb> a() {
      return this.c;
   }
}
