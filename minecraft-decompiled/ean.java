import javax.annotation.Nullable;

public class ean extends eaz implements bxn {
   public static final int a = 6;
   private static final String b = "patterns";
   @Nullable
   private xo c;
   private final dbt d;
   private eap e = eap.a;

   public ean(jb $$0, eeb $$1) {
      this($$0, $$1, ((doq)$$1.b()).b());
   }

   public ean(jb $$0, eeb $$1, dbt $$2) {
      super(ebb.u, $$0, $$1);
      this.d = $$2;
   }

   @Override
   public xo aj() {
      return (xo)(this.c != null ? this.c : xo.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xo al() {
      return this.c;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.e.equals(eap.a)) {
         $$0.a("patterns", eap.b, this.e);
      }

      $$0.b("CustomName", xq.a, this.c);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.c = a($$0, "CustomName");
      this.e = $$0.<eap>a("patterns", eap.b).orElse(eap.a);
   }

   public acw a() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.c($$0);
   }

   public eap b() {
      return this.e;
   }

   public dcv c() {
      dcv $$0 = new dcv(dpe.a(this.d));
      $$0.b(this.r());
      return $$0;
   }

   public dbt f() {
      return this.d;
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      this.e = $$0.a(kq.am, eap.a);
      this.c = $$0.a(kq.g);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.am, this.e);
      $$0.a(kq.g, this.c);
   }

   @Override
   public void b(fdc $$0) {
      $$0.c("patterns");
      $$0.c("CustomName");
   }
}
