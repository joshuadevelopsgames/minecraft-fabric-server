import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsi extends dzl {
   public static final MapCodec<dsi> a = b(dsi::new);
   public static final eez<eex> b = eer.ah;

   @Override
   public MapCodec<? extends dsi> a() {
      return a;
   }

   public dsi(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eex.b));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      eex $$8 = $$0.c(b);
      if ($$4.o() != jh.a.b || $$8 == eex.b != ($$4 == jh.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == eex.b && $$4 == jh.a && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dqb.a.m();
      }
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      jb $$1 = $$0.a();
      dmu $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
      jb $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, eex.a)), 3);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      if ($$0.c(b) != eex.a) {
         return super.a($$0, $$1, $$2);
      } else {
         eeb $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == eex.b;
      }
   }

   public static void a(dmv $$0, eeb $$1, jb $$2, int $$3) {
      jb $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, eex.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, eex.a)), $$3);
   }

   public static eeb b(dmx $$0, jb $$1, eeb $$2) {
      return $$2.b(eer.I) ? $$2.b(eer.I, $$0.B($$1)) : $$2;
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if (!$$0.C) {
         if ($$3.gu()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fh());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dmu $$0, cut $$1, jb $$2, eeb $$3, @Nullable eaz $$4, dcv $$5) {
      super.a($$0, $$1, $$2, dqb.a.m(), $$4, $$5);
   }

   protected static void b(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      eex $$4 = $$2.c(b);
      if ($$4 == eex.a) {
         jb $$5 = $$1.e();
         eeb $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == eex.b) {
            eeb $$7 = $$6.y().b(fam.c) ? dqb.J.m() : dqb.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dpz.j($$6));
         }
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(eeb $$0, jb $$1) {
      return bcb.b($$1.u(), $$1.c($$0.c(b) == eex.b ? 0 : 1).v(), $$1.w());
   }
}
