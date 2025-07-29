import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dze extends dpz {
   public static final MapCodec<dze> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mm.e.q().fieldOf("hook").forGetter($$0x -> $$0x.T), t()).apply($$0, dze::new)
   );
   public static final ees b = eer.A;
   public static final ees c = eer.a;
   public static final ees d = eer.g;
   public static final ees e = dvu.b;
   public static final ees f = dvu.c;
   public static final ees g = dvu.d;
   public static final ees h = dvu.e;
   private static final Map<jh, ees> i = drx.f;
   private static final fjm D = dpz.b(16.0, 1.0, 2.5);
   private static final fjm R = dpz.b(16.0, 0.0, 8.0);
   private static final int S = 10;
   private final dpz T;

   @Override
   public MapCodec<dze> a() {
      return a;
   }

   public dze(dpz $$0, eea.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, false).b(c, false).b(d, false).b(e, false).b(f, false).b(g, false).b(h, false));
      this.T = $$0;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$0.c(c) ? D : R;
   }

   @Override
   public eeb a(dgo $$0) {
      dly $$1 = $$0.q();
      jb $$2 = $$0.a();
      return this.m()
         .b(e, this.a($$1.a_($$2.f()), jh.c))
         .b(f, this.a($$1.a_($$2.i()), jh.f))
         .b(g, this.a($$1.a_($$2.g()), jh.d))
         .b(h, this.a($$1.a_($$2.h()), jh.e));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), this.a($$6, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, true));
      }
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if (!$$0.C && !$$3.fh().f() && $$3.fh().a(dcz.tu)) {
         $$0.a($$1, $$2.b(d, true), 260);
         $$0.a($$3, ejb.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dmu $$0, jb $$1, eeb $$2) {
      for (jh $$3 : new jh[]{jh.d, jh.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jb $$5 = $$1.a($$3, $$4);
            eeb $$6 = $$0.a_($$5);
            if ($$6.a(this.T)) {
               if ($$6.c(dzf.b) == $$3.g()) {
                  dzf.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, bzm $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dmu $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      List<? extends bzm> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dmu $$0, jb $$1, List<? extends bzm> $$2) {
      eeb $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bzm $$6 : $$2) {
            if (!$$6.n_()) {
               $$5 = true;
               break;
            }
         }
      }

      if ($$5 != $$4) {
         $$3 = $$3.b(b, $$5);
         $$0.a($$1, $$3, 3);
         this.a($$0, $$1, $$3);
      }

      if ($$5) {
         $$0.a(new jb($$1), this, 10);
      }
   }

   public boolean a(eeb $$0, jh $$1) {
      return $$0.a(this.T) ? $$0.c(dzf.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      switch ($$1) {
         case c:
            return $$0.b(e, $$0.c(g)).b(f, $$0.c(h)).b(g, $$0.c(e)).b(h, $$0.c(f));
         case d:
            return $$0.b(e, $$0.c(f)).b(f, $$0.c(g)).b(g, $$0.c(h)).b(h, $$0.c(e));
         case b:
            return $$0.b(e, $$0.c(h)).b(f, $$0.c(e)).b(g, $$0.c(f)).b(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      switch ($$1) {
         case b:
            return $$0.b(e, $$0.c(g)).b(g, $$0.c(e));
         case c:
            return $$0.b(f, $$0.c(h)).b(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
