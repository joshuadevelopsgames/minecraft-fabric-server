import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dor extends dpz {
   public static final int a = 3;
   public static final ees b = eer.u;

   @Override
   protected abstract MapCodec<? extends dor> a();

   protected dor(eea.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fis> b(eeb var1);

   public static boolean c(eeb $$0) {
      return $$0.b(b) && ($$0.a(azo.T) || $$0.a(azo.bo)) && $$0.c(b);
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      if (!$$0.C && $$3.cb() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(eeb $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b($$2.u(), $$2.v(), $$2.w()), $$3));
      }
   }

   private static void a(dmu $$0, fis $$1, bck $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(me.ah, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, ayz.dN, aza.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(me.aM, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cut $$0, eeb $$1, dmv $$2, jb $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dor) {
         ((dor)$$1.b()).b($$1).forEach($$2x -> $$2.a(me.ah, $$3.u() + $$2x.a(), $$3.v() + $$2x.b(), $$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, ayz.dP, aza.e, 1.0F, 1.0F);
      $$2.a($$0, ejb.c, $$3);
   }

   private static void a(dmv $$0, eeb $$1, jb $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, $$3), 11);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
