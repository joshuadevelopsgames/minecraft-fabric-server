import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fym extends fxu<fym.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final giq n;

   public fym(fue $$0, int $$1, giq $$2) {
      super($$0, $$1, $$2.e.d(), $$2.e.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fuh<?> $$0) {
      this.b(fym.b.a(this.c.n, $$0, this.n));
   }

   public void a(fuh<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fuh<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fym.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fxm> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fxm $$0, @Nullable fxm $$1) {
      this.b(fym.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fxm b(fuh<?> $$0) {
      for (fym.a $$1 : this.aH_()) {
         if ($$1 instanceof fym.b $$2) {
            fxm $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fym.a $$0 : this.aH_()) {
         if ($$0 instanceof fym.b $$1) {
            for (fxm $$2 : $$1.a.values()) {
               if ($$2 instanceof fuh.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fzn> e(double $$0, double $$1) {
      for (fym.a $$2 : this.aH_()) {
         for (fzn $$3 : $$2.aH_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fxu.a<fym.a> {
      private final List<fxm> a;
      private final get b;
      private static final int c = 160;

      a(List<fxm> $$0, get $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fym.a a(List<fxm> $$0, get $$1) {
         return new fym.a($$0, $$1);
      }

      public static fym.a a(fxm $$0, @Nullable fxm $$1, get $$2) {
         return $$1 == null ? new fym.a(ImmutableList.of($$0), $$2) : new fym.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.o / 2 - 155;

         for (fxm $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fzn> aH_() {
         return this.a;
      }

      @Override
      public List<? extends gbr> b() {
         return this.a;
      }
   }

   protected static class b extends fym.a {
      final Map<fuh<?>, fxm> a;

      private b(Map<fuh<?>, fxm> $$0, giq $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fym.b a(fui $$0, fuh<?> $$1, giq $$2) {
         return new fym.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fym.b a(fui $$0, fuh<?> $$1, @Nullable fuh<?> $$2, giq $$3) {
         fxm $$4 = $$1.a($$0);
         return $$2 == null ? new fym.b(ImmutableMap.of($$1, $$4), $$3) : new fym.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
