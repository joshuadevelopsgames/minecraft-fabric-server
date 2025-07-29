import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dum extends dpz implements dxl {
   public static final MapCodec<dum> a = b(dum::new);
   public static final ees b = eer.m;
   public static final ees c = eer.I;
   private static final fjm d = fjj.a(dpz.b(4.0, 7.0, 9.0), dpz.b(6.0, 0.0, 7.0));
   private static final fjm e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<dum> a() {
      return a;
   }

   public dum(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false).b(c, false));
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());

      for (jh $$2 : $$0.f()) {
         if ($$2.o() == jh.a.b) {
            eeb $$3 = this.m().b(b, $$2 == jh.b);
            if ($$3.a((dmx)$$0.q(), $$0.a())) {
               return $$3.b(c, $$1.a() == fam.c);
            }
         }
      }

      return null;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jh $$3 = o($$0).g();
      return dpz.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jh o(eeb $$0) {
      return $$0.c(b) ? jh.a : jh.b;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(c) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
