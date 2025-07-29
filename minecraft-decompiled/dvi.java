import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dvi {
   public static final dvi.e[] a = new dvi.e[]{dvi.e.a, dvi.e.b, dvi.e.c};
   private final dvi.b b;

   public dvi(dvg $$0) {
      this(new dvi.a($$0));
   }

   public dvi(dvi.b $$0) {
      this.b = $$0;
   }

   public boolean a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return jh.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dvi.c> a(eeb $$0, dmv $$1, jb $$2, bck $$3) {
      return jh.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(eeb $$0, dmv $$1, jb $$2, boolean $$3) {
      return jh.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dvi.c> a(eeb $$0, dmv $$1, jb $$2, jh $$3, bck $$4, boolean $$5) {
      return jh.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(eeb $$0, dmv $$1, jb $$2, jh $$3, boolean $$4) {
      return jh.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dvi.c> a(eeb $$0, dmv $$1, jb $$2, jh $$3, jh $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dvi.c> a(eeb $$0, dly $$1, jb $$2, jh $$3, jh $$4, dvi.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dvi.e $$6 : this.b.a()) {
            dvi.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dvi.c> a(dmv $$0, dvi.c $$1, boolean $$2) {
      eeb $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dvi.b {
      protected dvg a;

      public a(dvg $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public eeb a(eeb $$0, dly $$1, jb $$2, jh $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dly $$0, jb $$1, jb $$2, jh $$3, eeb $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dqb.J) && $$4.y().b();
      }

      @Override
      public boolean a(dly $$0, jb $$1, dvi.c $$2) {
         eeb $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      eeb a(eeb var1, dly var2, jb var3, jh var4);

      boolean a(dly var1, jb var2, dvi.c var3);

      default dvi.e[] a() {
         return dvi.a;
      }

      default boolean a(eeb $$0, jh $$1) {
         return dvg.a($$0, $$1);
      }

      default boolean a(eeb $$0) {
         return false;
      }

      default boolean b(eeb $$0, jh $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dmv $$0, dvi.c $$1, eeb $$2, boolean $$3) {
         eeb $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
         if ($$4 != null) {
            if ($$3) {
               $$0.A($$1.a()).e($$1.a());
            }

            return $$0.a($$1.a(), $$4, 2);
         } else {
            return false;
         }
      }
   }

   public record c(jb a, jh b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dly var1, jb var2, dvi.c var3);
   }

   public static enum e {
      a {
         @Override
         public dvi.c a(jb $$0, jh $$1, jh $$2) {
            return new dvi.c($$0, $$1);
         }
      },
      b {
         @Override
         public dvi.c a(jb $$0, jh $$1, jh $$2) {
            return new dvi.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dvi.c a(jb $$0, jh $$1, jh $$2) {
            return new dvi.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dvi.c a(jb var1, jh var2, jh var3);
   }
}
