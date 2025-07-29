import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum edf implements bda {
   a("inactive", 0, edf.b.a, -1.0, false),
   b("waiting_for_players", 4, edf.b.b, 200.0, true),
   c("active", 8, edf.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, edf.b.b, -1.0, false),
   e("ejecting_reward", 8, edf.b.b, -1.0, false),
   f("cooldown", 0, edf.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = bcb.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final edf.b l;
   private final boolean m;

   private edf(final String $$0, final int $$1, final edf.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   edf a(jb $$0, edc $$1, aub $$2) {
      edg $$3 = $$1.h();
      edd $$4 = $$1.a();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$1.a($$2)) {
               $$3.c();
               yield this;
            } else if (!$$3.a($$1, $$2.A)) {
               yield a;
            } else {
               $$3.a($$2, $$0, $$1);
               yield $$3.a.isEmpty() ? this : c;
            }
         }
         case c -> {
            if (!$$1.a($$2)) {
               $$3.c();
               yield b;
            } else if (!$$3.a($$1, $$2.A)) {
               yield a;
            } else {
               int $$5 = $$3.a($$0);
               $$3.a($$2, $$0, $$1);
               if ($$1.d()) {
                  this.a($$2, $$0, $$1);
               }

               if ($$3.a($$4, $$5)) {
                  if ($$3.d()) {
                     $$3.c = $$2.ae() + $$1.e();
                     $$3.e = 0;
                     $$3.d = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$5)) {
                  $$1.c($$2, $$0).ifPresent($$4x -> {
                     $$3.b.add($$4x);
                     $$3.e++;
                     $$3.d = $$2.ae() + $$4.h();
                     $$4.i().a($$2.H_()).ifPresent($$2xx -> {
                        $$3.f = Optional.of($$2xx);
                        $$1.i();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.e())) {
               $$2.a(null, $$0, ayz.nd, aza.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, h, $$1.e())) {
               yield this;
            } else if ($$3.a.isEmpty()) {
               $$2.a(null, $$0, ayz.ne, aza.e);
               $$3.g = Optional.empty();
               yield f;
            } else {
               if ($$3.g.isEmpty()) {
                  $$3.g = $$4.j().a($$2.H_());
               }

               $$3.g.ifPresent($$3x -> $$1.a($$2, $$0, $$3x));
               $$3.a.remove($$3.a.iterator().next());
               yield this;
            }
         }
         case f -> {
            $$3.a($$2, $$0, $$1);
            if (!$$3.a.isEmpty()) {
               $$3.e = 0;
               $$3.d = 0L;
               yield c;
            } else if ($$3.a($$2)) {
               $$1.b($$2, $$0);
               $$3.b();
               yield b;
            } else {
               yield this;
            }
         }
      };
   }

   private void a(aub $$0, jb $$1, edc $$2) {
      edg $$3 = $$2.h();
      edd $$4 = $$2.a();
      dcv $$5 = $$3.a($$0, $$4, $$1).a($$0.A).orElse(dcv.l);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               cas $$5x = cas.a($$0, $$5);
               $$5x.f($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.H_().i() - $$0.H_().i()) * 0.2F + 1.0F;
               $$0.a(null, jb.a((jv)$$4x), ayz.mY, aza.e, 1.0F, $$6);
               $$3.c = $$0.ae() + $$2.c().a();
            });
         }
      }
   }

   private static Optional<fis> a(aub $$0, jb $$1, edc $$2, edg $$3) {
      List<cut> $$4 = $$3.a
         .stream()
         .map($$0::a)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.gI() && !$$2x.am() && $$2x.bO() && $$2x.g($$1.b()) <= bcb.i($$2.f()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bzm $$5 = a($$4, $$3.b, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<fis> a(bzm $$0, aub $$1) {
      fis $$2 = $$0.dv();
      fis $$3 = $$2.a(jh.b, (double)($$0.dt() + 2.0F + $$1.A.a(4)));
      fio $$4 = $$1.a(new dmb($$2, $$3, dmb.a.c, dmb.b.a, fix.a()));
      fis $$5 = $$4.b().b().a(jh.a, 1.0);
      jb $$6 = jb.a((jv)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bzm a(List<cut> $$0, Set<UUID> $$1, edc $$2, jb $$3, aub $$4) {
      Stream<bzm> $$5 = $$1.stream().map($$4::b).filter(Objects::nonNull).filter($$2x -> $$2x.bO() && $$2x.g($$3.b()) <= bcb.i($$2.f()));
      List<? extends bzm> $$6 = $$4.A.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ag.a($$6, $$4.A);
      }
   }

   private boolean a(aub $$0, edg $$1) {
      return $$0.ae() >= $$1.c;
   }

   public int a() {
      return this.j;
   }

   public double b() {
      return this.k;
   }

   public boolean d() {
      return this.k >= 0.0;
   }

   public boolean e() {
      return this.m;
   }

   public void a(dmu $$0, jb $$1, boolean $$2) {
      this.l.emit($$0, $$0.H_(), $$1, $$2);
   }

   @Override
   public String c() {
      return this.i;
   }

   static class a {
      private static final int a = 0;
      private static final int b = 4;
      private static final int c = 8;

      private a() {
      }
   }

   interface b {
      edf.b a = ($$0, $$1, $$2, $$3) -> {};
      edf.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            fis $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? me.N : me.aM, $$4, $$0);
         }
      };
      edf.b c = ($$0, $$1, $$2, $$3) -> {
         fis $$4 = $$2.b().a($$1, 1.0F);
         a(me.ah, $$4, $$0);
         a($$3 ? me.N : me.F, $$4, $$0);
      };
      edf.b d = ($$0, $$1, $$2, $$3) -> {
         fis $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(me.ah, $$4, $$0);
         }

         if ($$0.ae() % 20L == 0L) {
            fis $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.H_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(me.ah, $$5, $$0);
            }
         }
      };

      private static void a(mi $$0, fis $$1, dmu $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dmu var1, bck var2, jb var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
