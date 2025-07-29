import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class ett extends euf {
   public static final MapCodec<ett> a = bwo.b(0, 256).fieldOf("count").xmap(ett::new, $$0 -> $$0.c);
   private final bwo c;

   private ett(bwo $$0) {
      this.c = $$0;
   }

   public static ett a(bwo $$0) {
      return new ett($$0);
   }

   public static ett a(int $$0) {
      return a(bwl.a($$0));
   }

   @Override
   public Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      Builder<jb> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(eka.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new jb($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public eug<?> b() {
      return eug.i;
   }

   private static int a(eud $$0, int $$1, int $$2, int $$3, int $$4) {
      jb.a $$5 = new jb.a($$1, $$2, $$3);
      int $$6 = 0;
      eeb $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         eeb $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dqb.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(eeb $$0) {
      return $$0.l() || $$0.a(dqb.J) || $$0.a(dqb.K);
   }
}
