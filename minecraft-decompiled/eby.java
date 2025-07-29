import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class eby {
   private final Object2IntSortedMap<dcr> a;

   eby(Object2IntSortedMap<dcr> $$0) {
      this.a = $$0;
   }

   public boolean a(dcv $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<dcr> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(dcv $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static eby a(jn.a $$0, cyd $$1) {
      return a($$0, $$1, 200);
   }

   public static eby a(jn.a $$0, cyd $$1, int $$2) {
      return new eby.a($$0, $$1)
         .a(dcz.rH, $$2 * 100)
         .a(dqb.jd, $$2 * 8 * 10)
         .a(dcz.tF, $$2 * 12)
         .a(dcz.pC, $$2 * 8)
         .a(dcz.pD, $$2 * 8)
         .a(azx.D, $$2 * 3 / 2)
         .a(azx.p, $$2 * 3 / 2)
         .a(azx.b, $$2 * 3 / 2)
         .a(dqb.y, $$2 * 3 / 2)
         .a(azx.i, $$2 * 3 / 2)
         .a(dqb.iw, $$2 * 3 / 2)
         .a(azx.j, $$2 * 3 / 4)
         .a(dqb.kf, $$2 * 3 / 4)
         .a(azx.M, $$2 * 3 / 2)
         .a(azx.m, $$2 * 3 / 2)
         .a(azx.k, $$2 * 3 / 2)
         .a(azx.l, $$2 * 3 / 2)
         .a(dqb.bf, $$2 * 3 / 2)
         .a(dqb.cv, $$2 * 3 / 2)
         .a(dqb.cw, $$2 * 3 / 2)
         .a(dqb.oH, $$2 * 3 / 2)
         .a(dqb.ek, $$2 * 3 / 2)
         .a(dqb.cG, $$2 * 3 / 2)
         .a(dqb.hw, $$2 * 3 / 2)
         .a(dqb.cL, $$2 * 3 / 2)
         .a(dqb.hA, $$2 * 3 / 2)
         .a(azx.ak, $$2 * 3 / 2)
         .a(dcz.pA, $$2 * 3 / 2)
         .a(dcz.su, $$2 * 3 / 2)
         .a(dqb.da, $$2 * 3 / 2)
         .a(azx.ah, $$2)
         .a(azx.ai, $$2 * 4)
         .a(dcz.pS, $$2)
         .a(dcz.pR, $$2)
         .a(dcz.pV, $$2)
         .a(dcz.pU, $$2)
         .a(dcz.pT, $$2)
         .a(azx.h, $$2)
         .a(azx.aZ, $$2 * 6)
         .a(azx.a, $$2 / 2)
         .a(azx.d, $$2 / 2)
         .a(dcz.qv, $$2 / 2)
         .a(azx.o, $$2 / 2)
         .a(dcz.py, $$2 / 2)
         .a(azx.g, 1 + $$2 / 3)
         .a(dqb.mK, 1 + $$2 * 20)
         .a(dcz.xA, $$2 * 3 / 2)
         .a(dqb.nG, $$2 / 4)
         .a(dqb.bC, $$2 / 2)
         .a(dqb.bE, $$2 / 2)
         .a(dqb.bF, $$2 / 2)
         .a(dqb.oz, $$2 / 4)
         .a(dqb.oA, $$2 * 3 / 2)
         .a(dqb.oB, $$2 * 3 / 2)
         .a(dqb.oE, $$2 * 3 / 2)
         .a(dqb.oF, $$2 * 3 / 2)
         .a(dqb.oI, $$2 * 3 / 2)
         .a(dqb.pL, $$2 * 3 / 2)
         .a(dqb.th, $$2 / 2)
         .a(dqb.ti, $$2 / 2)
         .a(dqb.ag, $$2 * 3 / 2)
         .a(dqb.tm, $$2 / 2)
         .a(azx.aY)
         .a();
   }

   public static class a {
      private final jn<dcr> a;
      private final cyd b;
      private final Object2IntSortedMap<dcr> c = new Object2IntLinkedOpenHashMap();

      public a(jn.a $$0, cyd $$1) {
         this.a = $$0.e(mn.N);
         this.b = $$1;
      }

      public eby a() {
         return new eby(this.c);
      }

      public eby.a a(bae<dcr> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public eby.a a(bae<dcr> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jl<dcr> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public eby.a a(dmt $$0, int $$1) {
         dcr $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, dcr $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
