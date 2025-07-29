import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dps extends dub implements dsu {
   public static final MapCodec<dps> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.q.fieldOf("color").forGetter(dps::b), t()).apply($$0, dps::new));
   public static final eez<eeo> b = eer.bf;
   public static final ees c = eer.x;
   private static final Map<jh, fjm> d = ag.a(() -> {
      fjm $$0 = dpz.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      fjm $$1 = fjj.a($$0, h.a(i.a, i.b));
      return fjj.c(fjj.a(dpz.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final dbt e;

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   public dps(dbt $$0, eea.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(b, eeo.b).b(c, false));
   }

   @Nullable
   public static jh a(dly $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      return $$2.b() instanceof dps ? $$2.c(f) : null;
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1.C) {
         return bxj.b;
      } else {
         if ($$0.c(b) != eeo.a) {
            $$2 = $$2.a($$0.c(f));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bxj.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jb $$5 = $$2.a($$0.c(f).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fis $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, dmu.a.b);
            return bxj.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xo.c("block.minecraft.bed.occupied"), true);
            }

            return bxj.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bxj.b;
         }
      }
   }

   public static boolean a(dmu $$0) {
      return $$0.G_().l();
   }

   private boolean a(dmu $$0, jb $$1) {
      List<cuf> $$2 = $$0.a(cuf.class, new fin($$1), cam::fY);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fZ();
         return true;
      }
   }

   @Override
   public void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(dly $$0, bzm $$1) {
      if ($$1.ci()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bzm $$0) {
      fis $$1 = $$0.dA();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof cam ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == a($$0.c(b), $$0.c(f))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dqb.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jh a(eeo $$0, jh $$1) {
      return $$0 == eeo.b ? $$1 : $$1.g();
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if (!$$0.C && $$3.gu()) {
         eeo $$4 = $$2.c(b);
         if ($$4 == eeo.b) {
            jb $$5 = $$1.a(a($$4, $$2.c(f)));
            eeb $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == eeo.a) {
               $$0.a($$5, dqb.a.m(), 35);
               $$0.a($$3, 2001, $$5, dpz.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      jh $$1 = $$0.g();
      jb $$2 = $$0.a();
      jb $$3 = $$2.a($$1);
      dmu $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(f, $$1) : null;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d.get(h($$0).g());
   }

   public static jh h(eeb $$0) {
      jh $$1 = $$0.c(f);
      return $$0.c(b) == eeo.a ? $$1.g() : $$1;
   }

   public static dsh.a i(eeb $$0) {
      eeo $$1 = $$0.c(b);
      return $$1 == eeo.a ? dsh.a.b : dsh.a.c;
   }

   private static boolean b(dly $$0, jb $$1) {
      return $$0.a_($$1.e()).b() instanceof dps;
   }

   public static Optional<fis> a(bzv<?> $$0, dmc $$1, jb $$2, jh $$3, float $$4) {
      jh $$5 = $$3.h();
      jh $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fis> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fis> a(bzv<?> $$0, dmc $$1, jb $$2, jh $$3, jh $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fis> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jb $$7 = $$2.e();
         Optional<fis> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fis> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fis> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fis> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fis> a(bzv<?> $$0, dmc $$1, jb $$2, int[][] $$3, boolean $$4) {
      jb.a $$5 = new jb.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fis $$7 = cxm.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, b, c);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new eav($$0, $$1, this.e);
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, @Nullable cam $$3, dcv $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jb $$5 = $$1.a($$2.c(f));
         $$0.a($$5, $$2.b(b, eeo.a), 3);
         $$0.a($$1, dqb.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public dbt b() {
      return this.e;
   }

   @Override
   protected long a(eeb $$0, jb $$1) {
      jb $$2 = $$1.a($$0.c(f), $$0.c(b) == eeo.a ? 0 : 1);
      return bcb.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   private static int[][] a(jh $$0, jh $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jh $$0, jh $$1) {
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$1.j() - $$0.j(), $$1.l() - $$0.l()},
         {$$1.j() - $$0.j() * 2, $$1.l() - $$0.l() * 2},
         {-$$0.j() * 2, -$$0.l() * 2},
         {-$$1.j() - $$0.j() * 2, -$$1.l() - $$0.l() * 2},
         {-$$1.j() - $$0.j(), -$$1.l() - $$0.l()},
         {-$$1.j(), -$$1.l()},
         {-$$1.j() + $$0.j(), -$$1.l() + $$0.l()},
         {$$0.j(), $$0.l()},
         {$$1.j() + $$0.j(), $$1.l() + $$0.l()}
      };
   }

   private static int[][] a(jh $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
