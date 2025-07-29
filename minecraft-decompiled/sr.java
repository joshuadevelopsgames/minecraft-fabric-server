import javax.annotation.Nullable;

public class sr extends sq {
   private final jb c;
   private final jb d;

   public sr(xo $$0, jb $$1, jb $$2, int $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public xo a() {
      return xo.a("test.error.position", this.a, this.c.u(), this.c.v(), this.c.w(), this.d.u(), this.d.v(), this.d.w(), this.b);
   }

   @Nullable
   public String b() {
      return super.getMessage();
   }

   @Nullable
   public jb c() {
      return this.d;
   }

   @Nullable
   public jb d() {
      return this.c;
   }
}
