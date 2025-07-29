import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cel extends ccd<cuf> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private dcv e;
   private final List<dcv> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cel(int $$0, int $$1) {
      super(ImmutableMap.of(cjo.r, cjp.a), $$0, $$1);
   }

   public boolean a(aub $$0, cuf $$1) {
      cbm<?> $$2 = $$1.eh();
      if ($$2.c(cjo.r).isEmpty()) {
         return false;
      } else {
         cam $$3 = $$2.c(cjo.r).get();
         return $$3.ap() == bzv.bU && $$1.bO() && $$3.bO() && !$$1.g_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aub $$0, cuf $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eh().c(cjo.r).isPresent();
   }

   public void b(aub $$0, cuf $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aub $$0, cuf $$1, long $$2) {
      cam $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aub $$0, cuf $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eh().b(cjo.r);
      c($$1);
      this.e = null;
   }

   private void a(cam $$0, cuf $$1) {
      boolean $$2 = false;
      dcv $$3 = $$0.fh();
      if (this.e == null || !dcv.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.f()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cuf $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cuf $$0) {
      for (dlq $$1 : $$0.gJ()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dlq $$0) {
      return dcv.b(this.e, $$0.b()) || dcv.b(this.e, $$0.c());
   }

   private static void c(cuf $$0) {
      $$0.a(bzw.a, dcv.l);
      $$0.a(bzw.a, 0.085F);
   }

   private static void a(cuf $$0, dcv $$1) {
      $$0.a(bzw.a, $$1);
      $$0.a(bzw.a, 0.0F);
   }

   private cam d(cuf $$0) {
      cbm<?> $$1 = $$0.eh();
      cam $$2 = $$1.c(cjo.r).get();
      $$1.a(cjo.o, new cco($$2, true));
      return $$2;
   }

   private void e(cuf $$0) {
      if (this.f.size() >= 2 && ++this.g >= 40) {
         this.h++;
         this.g = 0;
         if (this.h > this.f.size() - 1) {
            this.h = 0;
         }

         a($$0, this.f.get(this.h));
      }
   }
}
