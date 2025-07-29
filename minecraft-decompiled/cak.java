import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cak {
   String x_ = "leash";
   double h = 12.0;
   double i = 6.0;
   double j = 16.0;
   fis k = new fis(0.8, 0.2, 0.8);
   float d_ = 0.7F;
   double e_ = 10.0;
   double f_ = 0.11;
   List<fis> g_ = ImmutableList.of(new fis(0.0, 0.5, 0.5));
   List<fis> h_ = ImmutableList.of(new fis(0.0, 0.5, 0.0));
   List<fis> i_ = ImmutableList.of(new fis(-0.5, 0.5, 0.5), new fis(-0.5, 0.5, -0.5), new fis(0.5, 0.5, -0.5), new fis(0.5, 0.5, 0.5));

   @Nullable
   cak.a T_();

   void a(@Nullable cak.a var1);

   default boolean R_() {
      return this.T_() != null && this.T_().b != null;
   }

   default boolean u() {
      return this.T_() != null;
   }

   default boolean b_(bzm $$0) {
      if (this == $$0) {
         return false;
      } else {
         return this.b($$0) > this.A() ? false : this.v();
      }
   }

   default double b(bzm $$0) {
      return $$0.cV().f().f(((bzm)this).cV().f());
   }

   default boolean v() {
      return true;
   }

   default void e_(int $$0) {
      this.a(new cak.a($$0));
      a((bzm & cak)this, false, false);
   }

   default void b(fda $$0) {
      cak.a $$1 = $$0.<cak.a>a("leash", cak.a.a).orElse(null);
      if (this.T_() != null && $$1 == null) {
         this.x();
      }

      this.a($$1);
   }

   default void a(fdc $$0, @Nullable cak.a $$1) {
      $$0.b("leash", cak.a.a, $$1);
   }

   private static <E extends bzm & cak> void b(E $$0, cak.a $$1) {
      if ($$1.c != null && $$0.ai() instanceof aub $$2) {
         Optional<UUID> $$3 = $$1.c.left();
         Optional<jb> $$4 = $$1.c.right();
         if ($$3.isPresent()) {
            bzm $$5 = $$2.b($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, cqt.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.as > 100) {
            $$0.a($$2, dcz.wn);
            $$0.a(null);
         }
      }
   }

   default void S_() {
      a((bzm & cak)this, true, true);
   }

   default void x() {
      a((bzm & cak)this, true, false);
   }

   default void y() {
   }

   private static <E extends bzm & cak> void a(E $$0, boolean $$1, boolean $$2) {
      cak.a $$3 = $$0.T_();
      if ($$3 != null && $$3.b != null) {
         $$0.a(null);
         $$0.y();
         if ($$0.ai() instanceof aub $$4) {
            if ($$2) {
               $$0.a($$4, dcz.wn);
            }

            if ($$1) {
               $$4.n().b($$0, new aga($$0, null));
            }

            $$3.b.b($$0);
         }
      }
   }

   static <E extends bzm & cak> void a_(aub $$0, E $$1) {
      cak.a $$2 = $$1.T_();
      if ($$2 != null && $$2.c != null) {
         b($$1, $$2);
      }

      if ($$2 != null && $$2.b != null) {
         if (!$$1.bO() || !$$2.b.bO()) {
            if ($$0.P().c(dmq.j)) {
               $$1.S_();
            } else {
               $$1.x();
            }
         }

         bzm $$3 = $$1.aj_();
         if ($$3 != null && $$3.ai() == $$1.ai()) {
            double $$4 = $$1.b($$3);
            $$1.d($$3);
            if ($$4 > $$1.A()) {
               $$0.a(null, $$3.dC(), $$3.dE(), $$3.dI(), ayz.pc, aza.g, 1.0F, 1.0F);
               $$1.C();
            } else if ($$4 > $$1.B() - $$3.ds() - $$1.ds() && $$1.a($$3, $$2)) {
               $$1.z();
            } else {
               $$1.e($$3);
            }

            $$1.v((float)($$1.dP() - $$2.d));
            $$2.d = $$2.d * c($$1);
         }
      }
   }

   default void z() {
      bzm $$0 = (bzm)this;
      $$0.cC();
   }

   default double A() {
      return 12.0;
   }

   default double B() {
      return 6.0;
   }

   static <E extends bzm & cak> float c(E $$0) {
      if ($$0.aK()) {
         return $$0.ai().a_($$0.aT()).b().g() * 0.91F;
      } else {
         return $$0.bp() ? 0.8F : 0.91F;
      }
   }

   default void d(bzm $$0) {
      $$0.a(this);
   }

   default void C() {
      this.S_();
   }

   default void e(bzm $$0) {
   }

   default boolean a(bzm $$0, cak.a $$1) {
      boolean $$2 = $$0.dL() && this.D();
      List<cak.b> $$3 = a((bzm & cak)this, $$0, $$2 ? i_ : g_, $$2 ? i_ : h_);
      if ($$3.isEmpty()) {
         return false;
      } else {
         cak.b $$4 = cak.b.a($$3).a($$2 ? 0.25 : 1.0);
         $$1.d = $$1.d + 10.0 * $$4.b();
         fis $$5 = g($$0).d(((bzm)this).ae());
         ((bzm)this).j($$4.a().h(k).e($$5.c(0.11)));
         return true;
      }
   }

   private static fis g(bzm $$0) {
      return $$0 instanceof cao $$1 && $$1.gw() ? fis.c : $$0.ae();
   }

   private static <E extends bzm & cak> List<cak.b> a(E $$0, bzm $$1, List<fis> $$2, List<fis> $$3) {
      double $$4 = $$0.B();
      fis $$5 = g($$0);
      float $$6 = $$0.dP() * (float) (Math.PI / 180.0);
      fis $$7 = new fis($$0.ds(), $$0.dt(), $$0.ds());
      float $$8 = $$1.dP() * (float) (Math.PI / 180.0);
      fis $$9 = new fis($$1.ds(), $$1.dt(), $$1.ds());
      List<cak.b> $$10 = new ArrayList<>();

      for (int $$11 = 0; $$11 < $$2.size(); $$11++) {
         fis $$12 = $$2.get($$11).h($$7).b(-$$6);
         fis $$13 = $$0.dv().e($$12);
         fis $$14 = $$3.get($$11).h($$9).b(-$$8);
         fis $$15 = $$1.dv().e($$14);
         a($$15, $$13, $$4, $$5, $$12).ifPresent($$10::add);
      }

      return $$10;
   }

   private static Optional<cak.b> a(fis $$0, fis $$1, double $$2, fis $$3, fis $$4) {
      double $$5 = $$1.f($$0);
      if ($$5 < $$2) {
         return Optional.empty();
      } else {
         fis $$6 = $$0.d($$1).d().c($$5 - $$2);
         double $$7 = cak.b.a($$4, $$6);
         boolean $$8 = $$3.b($$6) >= 0.0;
         if ($$8) {
            $$6 = $$6.c(0.3F);
         }

         return Optional.of(new cak.b($$6, $$7));
      }
   }

   default boolean D() {
      return false;
   }

   default fis[] E() {
      return a((bzm)this, 0.0, 0.5, 0.5, 0.5);
   }

   static fis[] a(bzm $$0, double $$1, double $$2, double $$3, double $$4) {
      float $$5 = $$0.ds();
      double $$6 = $$1 * $$5;
      double $$7 = $$2 * $$5;
      double $$8 = $$3 * $$5;
      double $$9 = $$4 * $$0.dt();
      return new fis[]{new fis(-$$8, $$9, $$7 + $$6), new fis(-$$8, $$9, -$$7 + $$6), new fis($$8, $$9, -$$7 + $$6), new fis($$8, $$9, $$7 + $$6)};
   }

   default fis a_(float $$0) {
      return this.F();
   }

   default fis F() {
      bzm $$0 = (bzm)this;
      return new fis(0.0, $$0.cW(), $$0.ds() * 0.4F);
   }

   default void a_(bzm $$0, boolean $$1) {
      if (this != $$0) {
         a((bzm & cak)this, $$0, $$1);
      }
   }

   private static <E extends bzm & cak> void a(E $$0, bzm $$1, boolean $$2) {
      cak.a $$3 = $$0.T_();
      if ($$3 == null) {
         $$3 = new cak.a($$1);
         $$0.a($$3);
      } else {
         bzm $$4 = $$3.b;
         $$3.a($$1);
         if ($$4 != null && $$4 != $$1) {
            $$4.b($$0);
         }
      }

      if ($$2 && $$0.ai() instanceof aub $$5) {
         $$5.n().b($$0, new aga($$0, $$1));
      }

      if ($$0.cc()) {
         $$0.bS();
      }
   }

   @Nullable
   default bzm aj_() {
      return h((bzm & cak)this);
   }

   @Nullable
   private static <E extends bzm & cak> bzm h(E $$0) {
      cak.a $$1 = $$0.T_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.e != 0 && $$0.ai().C) {
            bzm var3 = $$0.ai().a($$1.e);
            if (var3 instanceof bzm) {
               $$1.a(var3);
            }
         }

         return $$1.b;
      }
   }

   static List<cak> c_(bzm $$0) {
      return a($$0, $$1 -> $$1.aj_() == $$0);
   }

   static List<cak> a(bzm $$0, Predicate<cak> $$1) {
      return a($$0.ai(), $$0.cV().f(), $$1);
   }

   static List<cak> a(dmu $$0, fis $$1, Predicate<cak> $$2) {
      double $$3 = 32.0;
      fin $$4 = fin.a($$1, 32.0, 32.0, 32.0);
      return $$0.a(bzm.class, $$4, $$1x -> $$1x instanceof cak $$2x && $$2.test($$2x)).stream().map(cak.class::cast).toList();
   }

   public static final class a {
      public static final Codec<cak.a> a = Codec.xor(kf.a.fieldOf("UUID").codec(), jb.a).xmap(cak.a::new, $$0 -> {
         if ($$0.b instanceof cqt $$2) {
            return Either.right($$2.i());
         } else {
            return $$0.b != null ? Either.left($$0.b.cK()) : Objects.requireNonNull($$0.c, "Invalid LeashData had no attachment");
         }
      });
      int e;
      @Nullable
      public bzm b;
      @Nullable
      public Either<UUID, jb> c;
      public double d;

      private a(Either<UUID, jb> $$0) {
         this.c = $$0;
      }

      a(bzm $$0) {
         this.b = $$0;
      }

      a(int $$0) {
         this.e = $$0;
      }

      public void a(bzm $$0) {
         this.b = $$0;
         this.c = null;
         this.e = 0;
      }
   }

   public record b(fis b, double c) {
      static cak.b a = new cak.b(fis.c, 0.0);

      static double a(fis $$0, fis $$1) {
         return $$0.f * $$1.d - $$0.d * $$1.f;
      }

      static cak.b a(List<cak.b> $$0) {
         if ($$0.isEmpty()) {
            return a;
         } else {
            double $$1 = 0.0;
            double $$2 = 0.0;
            double $$3 = 0.0;
            double $$4 = 0.0;

            for (cak.b $$5 : $$0) {
               fis $$6 = $$5.b;
               $$1 += $$6.d;
               $$2 += $$6.e;
               $$3 += $$6.f;
               $$4 += $$5.c;
            }

            return new cak.b(new fis($$1, $$2, $$3), $$4);
         }
      }

      public cak.b a(double $$0) {
         return new cak.b(this.b.c($$0), this.c * $$0);
      }

      public fis a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }
}
