import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class cds<E extends cau> extends ccd<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final clc h;
   private final int i;
   private final Function<E, ayy> j;
   private Optional<Long> k = Optional.empty();
   private Optional<cds.a> l = Optional.empty();

   public cds(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, clc $$4, int $$5, Function<E, ayy> $$6) {
      super(ImmutableMap.of(cjo.o, cjp.c, cjo.W, cjp.b, cjo.h, cjp.a, cjo.X, cjp.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aub $$0, cau $$1, long $$2) {
      cbm<?> $$3 = $$1.eh();
      $$3.c(cjo.h).flatMap($$2x -> $$2x.a($$2xx -> this.h.a($$0, $$1, $$2xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aub $$0, E $$1, long $$2) {
      cbm<?> $$3 = $$1.eh();
      if (!$$3.a(cjo.X)) {
         $$0.a($$1, (byte)59);
         $$3.a(cjo.W, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aub $$0, cau $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bO();
   }

   protected void d(aub $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.eh().a(cjo.n, new cjr(this.l.get().a(), this.g, 0));
         $$1.eh().a(cjo.o, new cco(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dx().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.S().n();
            this.b($$1, this.l.get().c);
         } else {
            jb $$4 = $$1.dx();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= this.i) {
                  $$1.eh().a(cjo.X, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), aza.g, 1.0F, $$1.fl());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private fis a(jb $$0, jb $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * bcb.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * bcb.j((double)($$1.w() - $$0.w()));
      return fis.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jb> a(cau $$0, cam $$1) {
      jb $$2 = $$1.dx();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<jb> $$3 = Lists.newArrayList();
         jb.a $$4 = $$2.k();

         for (jh $$5 : jh.c.a) {
            $$4.g($$2);

            for (int $$6 = 0; $$6 < this.f; $$6++) {
               if (!this.a($$0, $$4.c($$5))) {
                  $$4.c($$5.g());
                  break;
               }
            }

            if ($$4.k($$2) >= this.e) {
               $$3.add($$4.j());
            }
         }

         cjw $$7 = $$0.S();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dx()::j)).filter($$1x -> {
            faz $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(cau $$0, jb $$1) {
      return $$0.S().a($$1) && $$0.a(fbh.b($$0, $$1)) == 0.0F;
   }

   private void b(cau $$0, cam $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new cds.a($$1x, $$1.dx(), $$1));
   }

   public static class a {
      private final jb a;
      private final jb b;
      final cam c;

      public a(jb $$0, jb $$1, cam $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jb a() {
         return this.a;
      }

      public jb b() {
         return this.b;
      }

      public cam c() {
         return this.c;
      }
   }
}
