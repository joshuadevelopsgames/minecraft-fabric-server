import java.util.List;

public abstract class ebn {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dmu var1, jb var2, eeb var3);

   protected abstract void b(dmu var1, jb var2, eeb var3);

   protected abstract void a(dmu var1, jb var2, eeb var3, int var4, int var5);

   protected abstract boolean a(cut var1);

   public void a(cut $$0, dmu $$1, jb $$2, eeb $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ejb.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gV(), this.c);
   }

   public void b(cut $$0, dmu $$1, jb $$2, eeb $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ejb.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cut> a(dmu $$0, jb $$1) {
      double $$2 = this.c + 4.0;
      fin $$3 = new fin($$1).g($$2);
      return $$0.a(ein.a(cut.class), $$3, this::a);
   }

   public void c(dmu $$0, jb $$1, eeb $$2) {
      List<cut> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cut $$4 : $$3) {
         this.c = Math.max($$4.gV(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ejb.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ejb.j, $$1);
         }

         this.b = $$5;
      }

      this.a($$0, $$1, $$2, $$6, $$5);
      if ($$5 > 0) {
         d($$0, $$1, $$2);
      }
   }

   public int a() {
      return this.b;
   }

   private static void d(dmu $$0, jb $$1, eeb $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
