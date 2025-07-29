import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dro extends dpz {
   public static final MapCodec<dro> a = b(dro::new);
   public static final ees b = eer.A;
   public static final ees c = eer.u;

   @Override
   protected MapCodec<? extends dro> a() {
      return a;
   }

   public dro(eea.d $$0) {
      super($$0);
      this.l(this.m().b(c, false).b(b, false));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aub $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if ($$1 instanceof aub $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(eeb $$0, aub $$1, jb $$2) {
      boolean $$3 = $$1.E($$2);
      if ($$3 != $$0.c(b)) {
         eeb $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? ayz.fK : ayz.fL, aza.e);
         }

         $$1.a($$2, $$4.b(b, $$3), 3);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
