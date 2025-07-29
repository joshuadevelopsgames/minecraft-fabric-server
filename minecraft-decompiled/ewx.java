import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ewx {
   public static final int a = 90;
   static final ame b = ame.b("igloo/top");
   private static final ame c = ame.b("igloo/middle");
   private static final ame d = ame.b("igloo/bottom");
   static final Map<ame, jb> e = ImmutableMap.of(b, new jb(3, 5, 5), c, new jb(1, 3, 1), d, new jb(3, 6, 7));
   static final Map<ame, jb> f = ImmutableMap.of(b, jb.c, c, new jb(2, -3, 4), d, new jb(0, -3, -2));

   public static void a(ezb $$0, jb $$1, dwu $$2, evd $$3, bck $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ewx.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ewx.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ewx.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends evi {
      public a(ezb $$0, ame $$1, jb $$2, dwu $$3, int $$4) {
         super(evp.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ezb $$0, ui $$1) {
         super(evp.I, $$1, $$0, $$1x -> a($$1.<dwu>a("Rot", dwu.h).orElseThrow(), $$1x));
      }

      private static eyw a(dwu $$0, ame $$1) {
         return new eyw().a($$0).a(dvd.a).a(ewx.e.get($$1)).a(eyb.b).a(eyk.a);
      }

      private static jb a(ame $$0, jb $$1, int $$2) {
         return $$1.a(ewx.f.get($$0)).c($$2);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dwu.h, this.c.d());
      }

      @Override
      protected void a(String $$0, jb $$1, dnl $$2, bck $$3, euq $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dqb.a.m(), 3);
            eaz $$5 = $$2.c_($$1.e());
            if ($$5 instanceof ebh) {
               ((ebh)$$5).a(fdf.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         ame $$7 = ame.a(this.a);
         eyw $$8 = a(this.c.d(), $$7);
         jb $$9 = ewx.f.get($$7);
         jb $$10 = this.d.a((kg)eza.a($$8, new jb(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(eka.a.a, $$10.u(), $$10.w());
         jb $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ewx.b)) {
            jb $$13 = this.d.a((kg)eza.a($$8, new jb(3, 0, 5)));
            eeb $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dqb.da)) {
               $$0.a($$13, dqb.ef.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
