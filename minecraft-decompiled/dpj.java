import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpj extends dpz implements dxl {
   public static final ees b = eer.I;
   private static final fjm a = dpz.b(12.0, 0.0, 4.0);

   protected dpj(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, true));
   }

   @Override
   protected abstract MapCodec<? extends dpj> a();

   protected void a(eeb $$0, dly $$1, dnj $$2, bck $$3, jb $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(eeb $$0, dly $$1, jb $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (jh $$3 : jh.values()) {
            if ($$1.b_($$2.a($$3)).a(azu.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, $$1.a(azu.a) && $$1.e() == 8);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return a;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$4 == jh.a && !this.a($$0, $$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jh.b);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(b) ? fam.c.a(false) : super.b_($$0);
   }
}
