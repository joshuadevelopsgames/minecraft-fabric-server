import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cdg<E extends cao> extends ccd<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bwu p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<cdg.a> h = Lists.newArrayList();
   protected Optional<fis> i = Optional.empty();
   @Nullable
   protected fis j;
   protected int k;
   protected long l;
   private final Function<E, ayy> q;
   private final BiPredicate<E, jb> r;

   public cdg(bwu $$0, int $$1, int $$2, float $$3, Function<E, ayy> $$4) {
      this($$0, $$1, $$2, $$3, $$4, cdg::a);
   }

   public static <E extends cao> boolean a(E $$0, jb $$1) {
      dmu $$2 = $$0.ai();
      jb $$3 = $$1.e();
      return $$2.a_($$3).s() && $$0.a(fbh.b($$0, $$1)) == 0.0F;
   }

   public cdg(bwu $$0, int $$1, int $$2, float $$3, Function<E, ayy> $$4, BiPredicate<E, jb> $$5) {
      super(ImmutableMap.of(cjo.o, cjp.c, cjo.T, cjp.b, cjo.U, cjp.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aub $$0, cao $$1) {
      boolean $$2 = $$1.aK() && !$$1.bm() && !$$1.bA() && !$$0.a_($$1.dx()).a(dqb.pP);
      if (!$$2) {
         $$1.eh().a(cjo.T, this.p.a($$0.A) / 2);
      }

      return $$2;
   }

   protected boolean b(aub $$0, cao $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dv()) && this.k > 0 && !$$1.bm() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.eh().c(cjo.U).isEmpty()) {
         $$1.eh().a(cjo.T, this.p.a($$0.A) / 2);
         $$1.eh().b(cjo.o);
      }

      return $$3;
   }

   protected void a(aub $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dv());
      jb $$3 = $$1.dx();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = jb.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new cdg.a($$1x.j(), bcb.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aub $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.v($$1.br);
            $$1.r(true);
            double $$3 = this.j.g();
            double $$4 = $$3 + $$1.fo();
            $$1.i(this.j.c($$4 / $$3));
            $$1.eh().a(cjo.U, true);
            $$0.a(null, $$1, this.q.apply($$1), aza.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aub $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<cdg.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            cdg.a $$4 = $$3.get();
            jb $$5 = $$4.a();
            if (this.a($$0, $$1, $$5)) {
               fis $$6 = fis.b($$5);
               fis $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.eh().a(cjo.o, new ccg($$5));
                  cjw $$8 = $$1.S();
                  faz $$9 = $$8.a($$5, 0, 8);
                  if ($$9 == null || !$$9.j()) {
                     this.j = $$7;
                     this.l = $$2;
                     return;
                  }
               }
            }
         }
      }
   }

   protected Optional<cdg.a> a(aub $$0) {
      Optional<cdg.a> $$1 = bvu.a($$0.A, this.h, cdg.a::b);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aub $$0, E $$1, jb $$2) {
      jb $$3 = $$1.dx();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected fis a(cao $$0, fis $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.i(cbs.p) * this.g);

      for (int $$4 : $$2) {
         Optional<fis> $$5 = cdh.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public record a(jb a, int b) {
   }
}
