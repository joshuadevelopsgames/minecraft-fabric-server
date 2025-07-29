import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dsg extends dpz {
   public static final MapCodec<dsg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeq.a.fieldOf("block_set_type").forGetter(dsg::b), t()).apply($$0, dsg::new)
   );
   public static final eez<jh> b = dub.f;
   public static final eez<eex> c = eer.ah;
   public static final eez<eew> d = eer.bi;
   public static final ees e = eer.y;
   public static final ees f = eer.A;
   private static final Map<jh, fjm> g = fjj.c(dpz.c(16.0, 13.0, 16.0));
   private final eeq h;

   @Override
   public MapCodec<? extends dsg> a() {
      return a;
   }

   protected dsg(eeq $$0, eea.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(b, jh.c).b(e, false).b(d, eew.a).b(f, false).b(c, eex.b));
   }

   public eeq b() {
      return this.h;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      jh $$4 = $$0.c(b);
      jh $$5 = $$0.c(e) ? ($$0.c(d) == eew.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      eex $$8 = $$0.c(c);
      if ($$4.o() != jh.a.b || $$8 == eex.b != ($$4 == jh.b)) {
         return $$8 == eex.b && $$4 == jh.a && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dsg && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dqb.a.m();
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if ($$3.g() && $$0.c(c) == eex.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if (!$$0.C && ($$3.gu() || !$$3.d($$2))) {
         dsi.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      jb $$1 = $$0.a();
      dmu $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.E($$1) || $$2.E($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, $$3).b(e, $$3).b(c, eex.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
      $$0.a($$1.d(), $$2.b(c, eex.a), 3);
   }

   private eew b(dgo $$0) {
      dly $$1 = $$0.q();
      jb $$2 = $$0.a();
      jh $$3 = $$0.g();
      jb $$4 = $$2.d();
      jh $$5 = $$3.i();
      jb $$6 = $$2.a($$5);
      eeb $$7 = $$1.a_($$6);
      jb $$8 = $$4.a($$5);
      eeb $$9 = $$1.a_($$8);
      jh $$10 = $$3.h();
      jb $$11 = $$2.a($$10);
      eeb $$12 = $$1.a_($$11);
      jb $$13 = $$4.a($$10);
      eeb $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dsg && $$7.c(c) == eex.b;
      boolean $$17 = $$12.b() instanceof dsg && $$12.c(c) == eex.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fis $$20 = $$0.l();
            double $$21 = $$20.d - $$2.u();
            double $$22 = $$20.f - $$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? eew.a : eew.b;
         } else {
            return eew.a;
         }
      } else {
         return eew.b;
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!this.h.c()) {
         return bxj.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? ejb.h : ejb.d, $$2);
         return bxj.a;
      }
   }

   public boolean n(eeb $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bzm $$0, dmu $$1, eeb $$2, jb $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, $$4), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ejb.h : ejb.d, $$3);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      boolean $$6 = $$1.E($$2) || $$1.E($$2.a($$0.c(c) == eex.b ? jh.b : jh.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ejb.h : ejb.d, $$2);
         }

         $$1.a($$2, $$0.b(f, $$6).b(e, $$6), 2);
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      eeb $$4 = $$1.a_($$3);
      return $$0.c(c) == eex.b ? $$4.c($$1, $$3, jh.b) : $$4.a(this);
   }

   private void a(@Nullable bzm $$0, dmu $$1, jb $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), aza.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$1 == dvd.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(eeb $$0, jb $$1) {
      return bcb.b($$1.u(), $$1.c($$0.c(c) == eex.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(dmu $$0, jb $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(eeb $$0) {
      return $$0.b() instanceof dsg $$1 && $$1.b().c();
   }
}
