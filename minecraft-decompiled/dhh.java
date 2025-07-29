import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dhh extends dhc {
   private static final Map<dcr, dfj.a> d = Map.of(
      dcz.vy,
      dfj.a.b,
      dcz.qy,
      dfj.a.e,
      dcz.tH,
      dfj.a.c,
      dcz.vN,
      dfj.a.d,
      dcz.vO,
      dfj.a.d,
      dcz.vR,
      dfj.a.d,
      dcz.vP,
      dfj.a.d,
      dcz.vS,
      dfj.a.d,
      dcz.vQ,
      dfj.a.d,
      dcz.vT,
      dfj.a.d
   );
   private static final dhi e = dhi.a(dcz.pE);
   private static final dhi f = dhi.a(dcz.sx);
   private static final dhi g = dhi.a(dcz.qz);

   public dhh(dgz $$0) {
      super($$0);
   }

   public boolean a(dha $$0, dmu $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            dcv $$8 = $$0.a($$7);
            if (!$$8.f()) {
               if (d.containsKey($$8.h())) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (f.a($$8)) {
                  if ($$6) {
                     return false;
                  }

                  $$6 = true;
               } else if (e.a($$8)) {
                  if ($$5) {
                     return false;
                  }

                  $$5 = true;
               } else if (g.a($$8)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$8.h() instanceof dbu)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public dcv a(dha $$0, jn.a $$1) {
      dfj.a $$2 = dfj.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         dcv $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dfj.a $$8 = d.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (f.a($$7)) {
               $$3 = true;
            } else if (e.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof dbu $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      dcv $$10 = new dcv(dcz.vX);
      $$10.b(kq.ai, new dfj($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dhw<dhh> a() {
      return dhw.h;
   }
}
