import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dec extends dcr {
   private static final Map<bzv<? extends cao>, dec> a = Maps.newIdentityHashMap();
   private final bzv<?> b;

   public dec(bzv<? extends cao> $$0, dcr.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      if ($$1.C) {
         return bxj.a;
      } else {
         dcv $$2 = $$0.n();
         jb $$3 = $$0.a();
         jh $$4 = $$0.k();
         eeb $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dnp $$6) {
            bzv<?> $$7 = this.a($$1.K_(), $$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ejb.c, $$3);
            $$2.h(1);
            return bxj.a;
         } else {
            jb $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bzv<?> $$10 = this.a($$1.K_(), $$2);
            if ($$10.a((aub)$$1, $$2, $$0.o(), $$8, bzu.m, true, !Objects.equals($$3, $$8) && $$4 == jh.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ejb.t, $$3);
            }

            return bxj.a;
         }
      }
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      fio $$4 = a($$0, $$1, dmb.b.b);
      if ($$4.d() != fiq.a.b) {
         return bxj.e;
      } else if ($$0 instanceof aub $$5) {
         jb $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof duw)) {
            return bxj.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bzv<?> $$9 = this.a($$5.K_(), $$3);
            bzm $$10 = $$9.a($$5, $$3, $$1, $$8, bzu.m, false, false);
            if ($$10 == null) {
               return bxj.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(azj.c.b(this));
               $$0.a($$1, ejb.t, $$10.dv());
               return bxj.a;
            }
         } else {
            return bxj.d;
         }
      } else {
         return bxj.a;
      }
   }

   public boolean a(jn.a $$0, dcv $$1, bzv<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static dec a(@Nullable bzv<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<dec> a() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bzv<?> a(jn.a $$0, dcv $$1) {
      dfd $$2 = $$1.a(kq.Y, dfd.a);
      if (!$$2.c()) {
         bzv<?> $$3 = $$2.a($$0, mn.D);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cyd k() {
      return this.b.k();
   }

   public Optional<cao> a(cut $$0, cao $$1, bzv<? extends cao> $$2, aub $$3, fis $$4, dcv $$5) {
      if (!this.a($$3.K_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         cao $$6;
         if ($$1 instanceof bzc) {
            $$6 = ((bzc)$$1).a($$3, (bzc)$$1);
         } else {
            $$6 = $$2.a($$3, bzu.m);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.g_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$6.c($$5);
               $$3.a_($$6);
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }

   @Override
   public boolean a(dcv $$0, @Nullable cut $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dfd $$2 = $$0.a(kq.Y);
         if ($$2 != null) {
            bzv<?> $$3 = $$2.a($$1.ai().K_(), mn.D);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
