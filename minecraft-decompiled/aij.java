import java.util.function.Function;
import javax.annotation.Nullable;

public class aij implements zw<ahm> {
   public static final zm<wg, aij> a = zw.a(aij::a, aij::new);
   private final int b;
   private final aij.a c;
   private final boolean d;
   static final aij.a e = new aij.a() {
      @Override
      public aij.b a() {
         return aij.b.b;
      }

      @Override
      public void a(aij.c $$0) {
         $$0.a();
      }

      @Override
      public void a(wg $$0) {
      }
   };

   private aij(int $$0, boolean $$1, aij.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static aij a(bzm $$0, boolean $$1) {
      return new aij($$0.ar(), $$1, e);
   }

   public static aij a(bzm $$0, boolean $$1, bxi $$2) {
      return new aij($$0.ar(), $$1, new aij.d($$2));
   }

   public static aij a(bzm $$0, boolean $$1, bxi $$2, fis $$3) {
      return new aij($$0.ar(), $$1, new aij.e($$2, $$3));
   }

   private aij(wg $$0) {
      this.b = $$0.l();
      aij.b $$1 = $$0.b(aij.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zy<aij> a() {
      return ahk.bH;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   @Nullable
   public bzm a(aub $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(aij.c $$0) {
      this.c.a($$0);
   }

   interface a {
      aij.b a();

      void a(aij.c var1);

      void a(wg var1);
   }

   static enum b {
      a(aij.d::new),
      b($$0 -> aij.e),
      c(aij.e::new);

      final Function<wg, aij.a> d;

      private b(final Function<wg, aij.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bxi var1);

      void a(bxi var1, fis var2);

      void a();
   }

   static class d implements aij.a {
      private final bxi a;

      d(bxi $$0) {
         this.a = $$0;
      }

      private d(wg $$0) {
         this.a = $$0.b(bxi.class);
      }

      @Override
      public aij.b a() {
         return aij.b.a;
      }

      @Override
      public void a(aij.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(wg $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements aij.a {
      private final bxi a;
      private final fis b;

      e(bxi $$0, fis $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(wg $$0) {
         this.b = new fis($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
         this.a = $$0.b(bxi.class);
      }

      @Override
      public aij.b a() {
         return aij.b.c;
      }

      @Override
      public void a(aij.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(wg $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}
