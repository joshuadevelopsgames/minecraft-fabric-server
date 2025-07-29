import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxn extends dpz implements dxl {
   public static final MapCodec<dxn> a = b(dxn::new);
   public static final eez<efj> b = eer.bl;
   public static final ees c = eer.I;
   private static final fjm d = dpz.b(16.0, 0.0, 8.0);
   private static final fjm e = dpz.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dxn> a() {
      return a;
   }

   public dxn(eea.d $$0) {
      super($$0);
      this.l(this.m().b(b, efj.b).b(c, false));
   }

   @Override
   protected boolean g_(eeb $$0) {
      return $$0.c(b) != efj.c;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return switch ((efj)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fjj.b();
      };
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      jb $$1 = $$0.a();
      eeb $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, efj.c).b(c, false);
      } else {
         fal $$3 = $$0.q().b_($$1);
         eeb $$4 = this.m().b(b, efj.b).b(c, $$3.a() == fam.c);
         jh $$5 = $$0.k();
         return $$5 != jh.a && ($$5 == jh.b || !($$0.l().e - $$1.v() > 0.5)) ? $$4 : $$4.b(b, efj.a);
      }
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      dcv $$2 = $$1.n();
      efj $$3 = $$0.c(b);
      if ($$3 == efj.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - $$1.a().v() > 0.5;
         jh $$5 = $$1.k();
         return $$3 == efj.b ? $$5 == jh.b || $$4 && $$5.o().d() : $$5 == jh.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(c) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dmv $$0, jb $$1, eeb $$2, fal $$3) {
      return $$2.c(b) != efj.c ? dxl.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cam $$0, dly $$1, jb $$2, eeb $$3, fak $$4) {
      return $$3.c(b) != efj.c ? dxl.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(azu.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
