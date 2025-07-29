import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class hca implements hbz.a {
   private final fue a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<hca.a> d = Lists.newArrayList();
   private final List<hca.b> e = Lists.newArrayList();

   public hca(fue $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      dmu $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         fis $$6 = new fis($$2, 0.0, $$4);
         this.d.removeIf(hca.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         fog $$7 = $$1.getBuffer(gxz.v());

         for (hca.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - $$8.b();
               double $$8x = $$6x.b() - $$8.b();
               double $$9 = $$6x.c() - $$8.b();
               double $$10 = $$6x.a() + $$8.b();
               double $$11 = $$6x.b() + $$8.b();
               double $$12x = $$6x.c() + $$8.b();
               hbz.a($$0, $$7, fjj.a(new fin($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         fog $$9 = $$1.getBuffer(gxz.y());

         for (hca.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> gyh.b(
                     $$0,
                     $$9,
                     $$5x.a() - 0.25 - $$2,
                     $$5x.b() - $$3,
                     $$5x.c() - 0.25 - $$4,
                     $$5x.a() + 0.25 - $$2,
                     $$5x.b() - $$3 + 1.0,
                     $$5x.c() + 0.25 - $$4,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.35F
                  )
               );
         }

         for (hca.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               hbz.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               hbz.a($$0, $$1, jb.a((jv)$$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (hca.a $$12 : this.d) {
            fis $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.d - 0.2F;
            double $$16 = $$13.e - 0.2F;
            double $$17 = $$13.f - 0.2F;
            double $$18 = $$13.d + 0.2F;
            double $$19 = $$13.e + 0.2F + 0.5;
            double $$20 = $$13.f + 0.2F;
            a($$0, $$1, new fin($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            hbz.a($$0, $$1, $$12.b.a().toString(), $$13.d, $$13.e + 0.85F, $$13.f, -7564911, 0.0075F);
         }
      }
   }

   private static void a(fod $$0, gxn $$1, fin $$2, float $$3, float $$4, float $$5, float $$6) {
      ftm $$7 = fue.R().j.l();
      if ($$7.j()) {
         fis $$8 = $$7.d().e();
         hbz.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(amd<ejb> $$0, fis $$1) {
      this.d.add(new hca.a(ag.c(), $$0, $$1));
   }

   public void a(ejf $$0, int $$1) {
      this.e.add(new hca.b($$0, $$1));
   }

   record a(long a, amd<ejb> b, fis c) {

      public boolean a() {
         return ag.c() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public amd<ejb> c() {
         return this.b;
      }

      public fis d() {
         return this.c;
      }
   }

   static class b implements ejd {
      public final ejf a;
      public final int b;

      public b(ejf $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(dmu $$0, fis $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<fis> a(dmu $$0) {
         return this.a.a($$0);
      }

      @Override
      public ejf a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aub $$0, jl<ejb> $$1, ejb.a $$2, fis $$3) {
         return false;
      }
   }
}
