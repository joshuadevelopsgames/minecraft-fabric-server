import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cic<T extends cwk> extends chi {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cic(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(chi.a.a));
   }

   @Override
   public boolean b() {
      return this.c.e() == null && !this.c.cZ() && this.c.gX() && !this.c.gU().a() && !a(this.c.ai()).c(this.c.dx());
   }

   @Override
   public boolean c() {
      return this.c.gX() && !this.c.gU().a() && !a(this.c.ai()).c(this.c.dx());
   }

   @Override
   public void a() {
      if (this.c.gX()) {
         cwj $$0 = this.c.gU();
         if (this.c.as > this.d) {
            this.d = this.c.as + 20;
            this.a($$0);
         }

         if (!this.c.gD()) {
            fis $$1 = clg.a(this.c, 15, 4, fis.c($$0.q()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.S().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cwj $$0) {
      if ($$0.r()) {
         aub $$1 = a(this.c.ai());
         Set<cwk> $$2 = Sets.newHashSet();
         List<cwk> $$3 = $$1.a(cwk.class, this.c.cV().g(16.0), $$0x -> !$$0x.gX() && cwl.a($$0x));
         $$2.addAll($$3);

         for (cwk $$4 : $$2) {
            $$0.a($$1, $$0.j(), $$4, null, true);
         }
      }
   }
}
