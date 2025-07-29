import javax.annotation.Nullable;

public record afh(String b, @Nullable String c) implements zw<acq> {
   public static final zm<wg, afh> a = zw.a(afh::a, afh::new);

   private afh(wg $$0) {
      this($$0.p(), $$0.c(wg::p));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wg::a);
   }

   @Override
   public zy<afh> a() {
      return ahk.cr;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
