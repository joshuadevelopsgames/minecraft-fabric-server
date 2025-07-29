import javax.annotation.Nullable;

public class hvo implements hwz<hvo> {
   public static final alx a = new alx("sounds", ".ogg");
   private final ame b;
   private final bwr c;
   private final bwr d;
   private final int e;
   private final hvo.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hvo(ame $$0, bwr $$1, bwr $$2, int $$3, hvo.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ame a() {
      return this.b;
   }

   public ame b() {
      return a.a(this.b);
   }

   public bwr c() {
      return this.c;
   }

   public bwr d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hvo a(bck $$0) {
      return this;
   }

   @Override
   public void a(hwu $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hvo.a f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public int i() {
      return this.i;
   }

   @Override
   public String toString() {
      return "Sound[" + this.b + "]";
   }

   public static enum a {
      a("file"),
      b("event");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      @Nullable
      public static hvo.a a(String $$0) {
         for (hvo.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
