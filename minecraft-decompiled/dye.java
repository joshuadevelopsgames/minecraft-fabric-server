import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dye extends dpz implements dxl {
   public static final MapCodec<dye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeb.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dye::new)
   );
   public static final eez<jh> b = dub.f;
   public static final eez<efa> c = eer.ai;
   public static final eez<efk> d = eer.bm;
   public static final ees e = eer.I;
   private static final fjm g = fjj.a(dpz.b(16.0, 0.0, 8.0), dpz.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final fjm h = fjj.a(g, fjj.a(g, h.a(i.a, i.b)));
   private static final fjm i = fjj.a(h, fjj.a(h, h.a(i.a, i.b)));
   private static final Map<jh, fjm> D = fjj.c(g);
   private static final Map<jh, fjm> R = fjj.c(h);
   private static final Map<jh, fjm> S = fjj.c(i);
   private static final Map<jh, fjm> T = fjj.c(fjj.a(g, h.A));
   private static final Map<jh, fjm> U = fjj.c(fjj.a(h, h.A));
   private static final Map<jh, fjm> V = fjj.c(fjj.a(i, h.A));
   private final dpz W;
   protected final eeb f;

   @Override
   public MapCodec<? extends dye> a() {
      return a;
   }

   protected dye(eeb $$0, eea.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jh.c).b(c, efa.b).b(d, efk.a).b(e, false));
      this.W = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      boolean $$4 = $$0.c(c) == efa.b;
      jh $$5 = $$0.c(b);

      Map var10000 = switch ((efk)$$0.c(d)) {
         case a -> $$4 ? R : U;
         case d, e -> $$4 ? D : T;
         case c, b -> $$4 ? S : V;
      };

      return (fjm)var10000.get(switch ((efk)$$0.c(d)) {
         case a, d, c -> $$5;
         case b -> $$5.i();
         case e -> $$5.h();
      });
   }

   @Override
   public float e() {
      return this.W.e();
   }

   @Override
   public eeb a(dgo $$0) {
      jh $$1 = $$0.k();
      jb $$2 = $$0.a();
      fal $$3 = $$0.q().b_($$2);
      eeb $$4 = this.m().b(b, $$0.g()).b(c, $$1 != jh.a && ($$1 == jh.b || !($$0.l().e - $$2.v() > 0.5)) ? efa.b : efa.a).b(e, $$3.a() == fam.c);
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static efk e(eeb $$0, dly $$1, jb $$2) {
      jh $$3 = $$0.c(b);
      eeb $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jh $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return efk.d;
            }

            return efk.e;
         }
      }

      eeb $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jh $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return efk.b;
            }

            return efk.c;
         }
      }

      return efk.a;
   }

   private static boolean c(eeb $$0, dly $$1, jb $$2, jh $$3) {
      eeb $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(eeb $$0) {
      return $$0.b() instanceof dye;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      jh $$2 = $$0.c(b);
      efk $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jh.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dwu.c).b(d, efk.e);
                  case c:
                     return $$0.a(dwu.c).b(d, efk.b);
                  case b:
                     return $$0.a(dwu.c).b(d, efk.c);
                  case e:
                     return $$0.a(dwu.c).b(d, efk.d);
                  default:
                     return $$0.a(dwu.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jh.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dwu.c);
                  case d:
                     return $$0.a(dwu.c).b(d, efk.e);
                  case c:
                     return $$0.a(dwu.c).b(d, efk.c);
                  case b:
                     return $$0.a(dwu.c).b(d, efk.b);
                  case e:
                     return $$0.a(dwu.c).b(d, efk.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(e) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
