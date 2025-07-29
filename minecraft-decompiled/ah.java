import java.util.Date;

public interface ah {
   fck a();

   String b();

   String c();

   int d();

   int a(awd var1);

   Date e();

   boolean f();

   public record a(String a, String b, fck c, int d, int e, int f, Date g, boolean h) implements ah {
      @Override
      public int a(awd $$0) {
         return switch ($$0) {
            case a -> this.e;
            case b -> this.f;
         };
      }

      @Override
      public String b() {
         return this.a;
      }

      @Override
      public String c() {
         return this.b;
      }

      @Override
      public fck a() {
         return this.c;
      }

      public int g() {
         return this.e;
      }

      public int h() {
         return this.f;
      }

      @Override
      public Date e() {
         return this.g;
      }

      @Override
      public boolean f() {
         return this.h;
      }
   }
}
