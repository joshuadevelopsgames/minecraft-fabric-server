import java.util.Objects;
import javax.annotation.Nullable;

public class afy implements zw<acq> {
   public static final zm<wg, afy> a = zw.a(afy::a, afy::new);
   private final fjo b;
   private final String c;

   public afy(fjo $$0, @Nullable fjp $$1) {
      this.b = $$0;
      if ($$1 == null) {
         this.c = "";
      } else {
         this.c = $$1.c();
      }
   }

   private afy(wg $$0) {
      this.b = $$0.a(fjo.u);
      this.c = $$0.p();
   }

   private void a(wg $$0) {
      $$0.a(fjo::a, this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<afy> a() {
      return ahk.aE;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public fjo b() {
      return this.b;
   }

   @Nullable
   public String e() {
      return Objects.equals(this.c, "") ? null : this.c;
   }
}
