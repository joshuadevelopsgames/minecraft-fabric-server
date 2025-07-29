import javax.annotation.Nullable;

public record aco(ame b, @Nullable byte[] c) implements zw<acn> {
   public static final zm<wg, aco> a = zw.a(aco::a, aco::new);

   private aco(wg $$0) {
      this($$0.q(), $$0.c(aap.b));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aap.b);
   }

   @Override
   public zy<aco> a() {
      return acm.b;
   }

   public void a(acn $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
