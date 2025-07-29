import com.mojang.serialization.Codec;

public record bxl(cn d) {
   public static final bxl a = new bxl(cn.a.a().b());
   public static final Codec<bxl> b = cn.a.xmap(bxl::new, bxl::a);
   public static final String c = "lock";

   public boolean a(dcv $$0) {
      return this.d.a($$0);
   }

   public void a(fdc $$0) {
      if (this != a) {
         $$0.a("lock", b, this);
      }
   }

   public static bxl a(fda $$0) {
      return $$0.<bxl>a("lock", b).orElse(a);
   }

   public cn a() {
      return this.d;
   }
}
