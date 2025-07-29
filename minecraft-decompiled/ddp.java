import java.util.OptionalInt;

public interface ddp {
   cvo a(dmu var1, jv var2, dcv var3, jh var4);

   default ddp.a a() {
      return ddp.a.a;
   }

   default void a(cvo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public record a(ddp.b b, float c, float d, OptionalInt e) {
      public static final ddp.a a = a().a();

      public static ddp.a.a a() {
         return new ddp.a.a();
      }

      public static class a {
         private ddp.b a = ($$0, $$1) -> dsf.a($$0, 0.7, new fis(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public ddp.a.a a(ddp.b $$0) {
            this.a = $$0;
            return this;
         }

         public ddp.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public ddp.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public ddp.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public ddp.a a() {
            return new ddp.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jv getDispensePosition(lk var1, jh var2);
   }
}
