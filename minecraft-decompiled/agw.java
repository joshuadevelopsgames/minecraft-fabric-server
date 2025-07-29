import javax.annotation.Nullable;

public class agw implements zw<acq> {
   public static final zm<wg, agw> a = zw.a(agw::a, agw::new);
   private final int b;
   @Nullable
   private final ui c;

   public agw(int $$0, @Nullable ui $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agw(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a((vi)this.c);
   }

   @Override
   public zy<agw> a() {
      return ahk.bb;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public ui e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
