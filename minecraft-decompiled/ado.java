import java.util.List;

public record ado(ado.a b, List<String> c) implements zw<acq> {
   public static final zm<wg, ado> a = zw.a(ado::a, ado::new);

   private ado(wg $$0) {
      this($$0.b(ado.a.class), $$0.a(wg::p));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wg::a);
   }

   @Override
   public zy<ado> a() {
      return ahk.x;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
