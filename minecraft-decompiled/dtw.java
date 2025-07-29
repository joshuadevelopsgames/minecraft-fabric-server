import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtw extends dpz implements dxl {
   public static final MapCodec<dtw> a = b(dtw::new);
   private static final ees b = eer.I;
   private static final fjm c = dpz.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dtw> a() {
      return a;
   }

   protected dtw(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(b) ? fam.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = super.a($$0);
      if ($$1 != null) {
         fal $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, $$2.a() == fam.c);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.d();
      eeb $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jh.a);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.b && !this.a($$0, $$1, $$3)) {
         return dqb.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, fam.c, fam.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
