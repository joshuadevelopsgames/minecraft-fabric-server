import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class gbh extends gbf {
   private final gbh.b c;
   private final List<gbh.a> d = new ArrayList<>();
   private final gbn e = gbn.i();

   public gbh(int $$0, int $$1, gbh.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public gbh(int $$0, int $$1, int $$2, int $$3, gbh.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (gbh.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<gbh.a> $$5 = this.d.iterator();
         gbh.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               gbh.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (gbh.a $$10 : this.d) {
            this.c.a($$10, $$9, $$1);
         }

         switch (this.c) {
            case a:
               this.b = $$1;
               break;
            case b:
               this.a = $$1;
         }
      }
   }

   @Override
   public void b(Consumer<gbm> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public gbn b() {
      return this.e.g();
   }

   public gbn c() {
      return this.e;
   }

   public <T extends gbm> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends gbm> T a(T $$0, gbn $$1) {
      this.d.add(new gbh.a($$0, $$1));
      return $$0;
   }

   public <T extends gbm> T a(T $$0, Consumer<gbn> $$1) {
      return this.a($$0, ag.a(this.b(), $$1));
   }

   static class a extends gbf.a {
      protected a(gbm $$0, gbn $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(gbm $$0) {
         return switch (this) {
            case a -> $$0.z();
            case b -> $$0.y();
         };
      }

      int a(gbh.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(gbm $$0) {
         return switch (this) {
            case a -> $$0.y();
            case b -> $$0.z();
         };
      }

      int b(gbh.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(gbh.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(gbh.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(gbm $$0) {
         return switch (this) {
            case a -> $$0.E();
            case b -> $$0.F();
         };
      }

      int d(gbm $$0) {
         return switch (this) {
            case a -> $$0.F();
            case b -> $$0.E();
         };
      }
   }
}
