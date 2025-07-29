import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dud extends dtu {
   public static final MapCodec<dud> e = b(dud::new);

   @Override
   public MapCodec<? extends dud> a() {
      return e;
   }

   public dud(eea.d $$0) {
      super($$0);
   }

   public static eeb b() {
      return dqb.J.m();
   }

   @Override
   public void a(dmu $$0, cut $$1, jb $$2, eeb $$3, @Nullable eaz $$4, dcv $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!djk.a($$5, azr.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         eeb $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.c($$2, b());
         }
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.a(dnd.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(eeb $$0, dmu $$1, jb $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.c($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
