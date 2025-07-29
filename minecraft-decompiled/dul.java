import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dul extends dpz implements dxl {
   public static final MapCodec<dul> a = b(dul::new);
   public static final eez<jh> b = dub.f;
   public static final ees c = eer.I;
   public static final Map<jh, fjm> d = fjj.c(dpz.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<dul> a() {
      return a;
   }

   protected dul(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, false));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(dly $$0, jb $$1, jh $$2) {
      eeb $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jh $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dqb.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, fam.c, fam.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      if (!$$0.c()) {
         eeb $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      eeb $$2 = this.m();
      dmx $$3 = $$0.q();
      jb $$4 = $$0.a();
      fal $$5 = $$0.q().b_($$0.a());

      for (jh $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, $$5.a() == fam.c);
            }
         }
      }

      return null;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(c) ? fam.c.a(false) : super.b_($$0);
   }
}
