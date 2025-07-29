import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dwp extends dpz {
   public static final MapCodec<dwp> a = b(dwp::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final efb d = eer.bc;
   private static final ImmutableList<kg> e = ImmutableList.of(
      new kg(0, 0, -1), new kg(-1, 0, 0), new kg(0, 0, 1), new kg(1, 0, 0), new kg(-1, 0, -1), new kg(1, 0, -1), new kg(-1, 0, 1), new kg(1, 0, 1)
   );
   private static final ImmutableList<kg> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kg::p).iterator())
      .addAll(e.stream().map(kg::q).iterator())
      .add(new kg(0, 1, 0))
      .build();

   @Override
   public MapCodec<dwp> a() {
      return a;
   }

   public dwp(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, 0));
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bxj.a;
      } else {
         return (bxj)($$5 == bxi.a && a($$4.b(bxi.b)) && o($$1) ? bxj.e : bxj.f);
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$0.c(d) == 0) {
         return bxj.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bxj.a;
      } else {
         if ($$3 instanceof auc $$5) {
            auc.a $$6 = $$5.T();
            auc.a $$7 = new auc.a($$1.aj(), $$2, 0.0F, false);
            if ($$6 == null || !$$6.a($$7)) {
               $$5.a($$7, true);
               $$1.a(null, $$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, ayz.wM, aza.e, 1.0F, 1.0F);
               return bxj.b;
            }
         }

         return bxj.c;
      }
   }

   private static boolean a(dcv $$0) {
      return $$0.a(dcz.fQ);
   }

   private static boolean o(eeb $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jb $$0, dmu $$1) {
      fal $$2 = $$1.b_($$0);
      if (!$$2.a(azu.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = $$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            fal $$4 = $$1.b_($$0.e());
            return !$$4.a(azu.a);
         }
      }
   }

   private void d(eeb $$0, dmu $$1, final jb $$2) {
      $$1.a($$2, false);
      boolean $$3 = jh.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(azu.a);
      dmo $$5 = new dmo() {
         @Override
         public Optional<Float> a(dmn $$0, dly $$1x, jb $$2x, eeb $$3x, fal $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dqb.J.e()) : super.a($$0, $$1x, $$2, $$3x, $$4);
         }
      };
      fis $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, dmu.a.b);
   }

   public static boolean a(dmu $$0) {
      return $$0.G_().m();
   }

   public static void a(@Nullable bzm $$0, dmu $$1, jb $$2, eeb $$3) {
      eeb $$4 = $$3.b(d, $$3.c(d) + 1);
      $$1.a($$2, $$4, 3);
      $$1.a(ejb.c, $$2, ejb.a.a($$0, $$4));
      $$1.a(null, $$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, ayz.wK, aza.e, 1.0F, 1.0F);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, ayz.wJ, aza.e, 1.0F, 1.0F, false);
         }

         double $$4 = $$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = $$2.v() + 1.0;
         double $$6 = $$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = $$3.i() * 0.04;
         $$1.a(me.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   public static int a(eeb $$0, int $$1) {
      return bcb.d(($$0.c(d) - 0) / 4.0F * $$1);
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return a($$0, 15);
   }

   public static Optional<fis> a(bzv<?> $$0, dmc $$1, jb $$2) {
      Optional<fis> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fis> a(bzv<?> $$0, dmc $$1, jb $$2, boolean $$3) {
      jb.a $$4 = new jb.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kg $$5 = (kg)var5.next();
         $$4.g($$2).h($$5);
         fis $$6 = cxm.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
