import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cfj {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> a(jl<cui> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new cex(0.8F)),
         Pair.of(0, cdb.a()),
         Pair.of(0, new cdj(45, 90)),
         Pair.of(0, new cfl()),
         Pair.of(0, cfm.a()),
         Pair.of(0, cdw.a()),
         Pair.of(0, ceg.a()),
         Pair.of(0, cfg.a($$0.a().b(), cjo.c)),
         Pair.of(0, cfg.a($$0.a().c(), cjo.d)),
         Pair.of(1, new cdn()),
         Pair.of(2, cdq.a()),
         Pair.of(3, new cdi($$1)),
         new Pair[]{
            Pair.of(5, ccx.a($$1, false, 4)),
            Pair.of(6, cbw.a($$0.a().c(), cjo.c, cjo.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new ccv($$1)),
            Pair.of(8, cfp.a($$1)),
            Pair.of(10, cbw.a($$0x -> $$0x.a(clt.n), cjo.b, false, Optional.of((byte)14), cfj::a)),
            Pair.of(10, cbw.a($$0x -> $$0x.a(clt.o), cjo.e, true, Optional.of((byte)14))),
            Pair.of(10, cbz.a()),
            Pair.of(10, cdx.a())
         }
      );
   }

   private static boolean a(aub $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      return $$2.a(azo.Q) && !$$2.c(dps.c);
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> b(jl<cui> $$0, float $$1) {
      cfo $$2;
      if ($$0.a(cui.g)) {
         $$2 = new cfn();
      } else {
         $$2 = new cfo();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new cea(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(ceu.a(cjo.c, 0.4F, 4), 2),
                  Pair.of(cev.a(cjo.c, 0.4F, 1, 10), 5),
                  Pair.of(cew.a(cjo.f, $$1, 1, 6, cjo.c), 5),
                  Pair.of(new ccy(), $$0.a(cui.g) ? 2 : 5),
                  Pair.of(new cff(), $$0.a(cui.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new cel(400, 1600)),
         Pair.of(10, cef.a(bzv.bU, 4)),
         Pair.of(2, cej.a(cjo.c, $$1, 9, 100, 1200)),
         Pair.of(3, new ccs(100)),
         Pair.of(99, cfe.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new cdn(80, 120)),
         a(),
         Pair.of(5, cdp.a()),
         Pair.of(
            5,
            new cea(
               ImmutableMap.of(cjo.i, cjp.b),
               ImmutableList.of(
                  Pair.of(cda.a(bzv.bF, 8, cjo.r, $$0, 2), 2),
                  Pair.of(cda.a(bzv.v, 8, cjo.r, $$0, 2), 1),
                  Pair.of(cfh.a($$0), 1),
                  Pair.of(cek.a($$0, 2), 1),
                  Pair.of(new cdc($$0), 2),
                  Pair.of(new ccn(20, 40), 2)
               )
            )
         ),
         Pair.of(99, cfe.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> c(jl<cui> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cej.a(cjo.b, $$1, 1, 150, 1200)),
         Pair.of(3, cfg.a($$0x -> $$0x.a(clt.n), cjo.b)),
         Pair.of(3, new cen()),
         Pair.of(
            5,
            new cea(
               ImmutableMap.of(cjo.b, cjp.b),
               ImmutableList.of(Pair.of(ceb.a($$1), 1), Pair.of(ccz.a($$1), 4), Pair.of(ccu.a($$1, 4), 2), Pair.of(new ccn(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, cfe.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> d(jl<cui> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cez.a(ImmutableList.of(Pair.of(ceu.a(cjo.e, 0.4F, 40), 2), Pair.of(ceo.a(), 2)))),
         Pair.of(10, new cel(400, 1600)),
         Pair.of(10, cef.a(bzv.bU, 4)),
         Pair.of(2, cej.a(cjo.e, $$1, 6, 100, 200)),
         Pair.of(3, new ccs(100)),
         Pair.of(3, cfg.a($$0x -> $$0x.a(clt.o), cjo.e)),
         Pair.of(3, new ccr(ImmutableMap.of(), ImmutableSet.of(cjo.r), ccr.a.a, ccr.b.a, ImmutableList.of(Pair.of(new cey(), 1)))),
         a(),
         Pair.of(99, cfe.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> e(jl<cui> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new cea(
               ImmutableList.of(
                  Pair.of(cda.a(bzv.bF, 8, cjo.r, $$1, 2), 2),
                  Pair.of(cda.a(bzv.bF, 8, bzc::Y_, bzc::Y_, cjo.s, $$1, 2), 1),
                  Pair.of(cda.a(bzv.v, 8, cjo.r, $$1, 2), 1),
                  Pair.of(cfh.a($$1), 1),
                  Pair.of(cek.a($$1, 2), 1),
                  Pair.of(new cdc($$1), 1),
                  Pair.of(new ccn(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new ccs(100)),
         Pair.of(3, cef.a(bzv.bU, 4)),
         Pair.of(3, new cel(400, 1600)),
         Pair.of(3, new ccr(ImmutableMap.of(), ImmutableSet.of(cjo.r), ccr.a.a, ccr.b.a, ImmutableList.of(Pair.of(new cey(), 1)))),
         Pair.of(3, new ccr(ImmutableMap.of(), ImmutableSet.of(cjo.s), ccr.a.a, ccr.b.a, ImmutableList.of(Pair.of(new cfk(), 1)))),
         a(),
         Pair.of(99, cfe.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> f(jl<cui> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, cfi.a()), Pair.of(1, ceh.b(cjo.B, $$2, 6, false)), Pair.of(1, ceh.b(cjo.z, $$2, 6, false)), Pair.of(3, cfh.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> g(jl<cui> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cdz.a()),
         Pair.of(0, cez.a(ImmutableList.of(Pair.of(cej.a(cjo.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cfh.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, cdy.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> h(jl<cui> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cfq.a(cfq.a(cfj::b), cez.a(ImmutableList.of(Pair.of(cdm.a($$1), 5), Pair.of(cfh.a($$1 * 1.1F), 2))))),
         Pair.of(0, new cch(600, 600)),
         Pair.of(2, cfq.a(cfq.a(cfj::a), cdd.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, cdy.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends cce<? super cuf>>> i(jl<cui> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, cee.a(15, 3)), Pair.of(1, cdd.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, cce<cam>> a() {
      return Pair.of(
         5,
         new cea(
            ImmutableList.of(
               Pair.of(cec.a(bzv.v, 8.0F), 8),
               Pair.of(cec.a(bzv.bF, 8.0F), 2),
               Pair.of(cec.a(bzv.bU, 8.0F), 2),
               Pair.of(cec.a(cap.b, 8.0F), 1),
               Pair.of(cec.a(cap.f, 8.0F), 1),
               Pair.of(cec.a(cap.d, 8.0F), 1),
               Pair.of(cec.a(cap.e, 8.0F), 1),
               Pair.of(cec.a(cap.g, 8.0F), 1),
               Pair.of(cec.a(cap.a, 8.0F), 1),
               Pair.of(new ccn(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, cce<cam>> b() {
      return Pair.of(5, new cea(ImmutableList.of(Pair.of(cec.a(bzv.bF, 8.0F), 2), Pair.of(cec.a(bzv.bU, 8.0F), 2), Pair.of(new ccn(30, 60), 8))));
   }

   private static boolean a(aub $$0, cam $$1) {
      cwj $$2 = $$0.d($$1.dx());
      return $$2 != null && $$2.r() && !$$2.e() && !$$2.f();
   }

   private static boolean b(aub $$0, cam $$1) {
      cwj $$2 = $$0.d($$1.dx());
      return $$2 != null && $$2.e();
   }
}
