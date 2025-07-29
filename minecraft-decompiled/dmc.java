import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dmc extends dly {
   eft F_();

   @Nullable
   dly c(int var1, int var2);

   default boolean a(@Nullable bzm $$0, fjm $$1) {
      return true;
   }

   default boolean a(eeb $$0, jb $$1, fix $$2) {
      fjm $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bzm $$0) {
      return this.a($$0, fjj.a($$0.cV()));
   }

   default boolean b(fin $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bzm $$0) {
      return this.a($$0, $$0.cV());
   }

   default boolean a(@Nullable bzm $$0, fin $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bzm $$0, fin $$1, boolean $$2) {
      for (fjm $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fjm $$5 = this.i($$0, $$1);
         return $$5 == null || !fjj.c($$5, fjj.a($$1), fiw.i);
      }
   }

   default boolean b(@Nullable bzm $$0, fin $$1) {
      for (fjm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fjm> c(@Nullable bzm var1, fin var2);

   default Iterable<fjm> d(@Nullable bzm $$0, fin $$1) {
      List<fjm> $$2 = this.c($$0, $$1);
      Iterable<fjm> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fjm> a(@Nullable bzm $$0, fin $$1, fis $$2) {
      List<fjm> $$3 = this.c($$0, $$1);
      Iterable<fjm> $$4 = this.a(fix.a($$0, $$2.e), $$1);
      return $$3.isEmpty() ? $$4 : Iterables.concat($$3, $$4);
   }

   default Iterable<fjm> e(@Nullable bzm $$0, fin $$1) {
      return this.a($$0 == null ? fix.a() : fix.a($$0), $$1);
   }

   default Iterable<fjm> f(@Nullable bzm $$0, fin $$1) {
      return this.a($$0 == null ? fix.a() : fix.a($$0, true), $$1);
   }

   private Iterable<fjm> a(fix $$0, fin $$1) {
      return () -> new dlw<fjm>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fjm i(bzm $$0, fin $$1) {
      eft $$2 = this.F_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fio b(dmb $$0) {
      fio $$1 = this.a($$0);
      eft $$2 = this.F_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fis $$3 = $$1.g().d($$0.b());
         jh $$4 = jh.a($$3.d, $$3.e, $$3.f);
         fis $$5 = $$2.c($$1.g());
         return new fio($$5, $$4, jb.a((jv)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bzm $$0, fin $$1) {
      dlw<fjm> $$2 = new dlw<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fjm)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jb> h(bzm $$0, fin $$1) {
      jb $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dlw<jb> $$4 = new dlw<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jb $$5 = (jb)$$4.next();
         double $$6 = $$5.b($$0.dv());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fis> a(@Nullable bzm $$0, fjm $$1, fis $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fin $$6 = $$1.a().c($$3, $$4, $$5);
         fjm $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.F_() == null || this.F_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fjj::a)
            .reduce(fjj.a(), fjj::a);
         fjm $$8 = fjj.a($$1, $$7, fiw.e);
         return $$8.b($$2);
      }
   }
}
