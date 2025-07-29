import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class akk implements zw<akh> {
   public static final zm<wg, akk> a = zw.a(akk::a, akk::new);
   private final byte[] b;
   private final byte[] c;

   public akk(SecretKey $$0, PublicKey $$1, byte[] $$2) throws bay {
      this.b = bax.a($$1, $$0.getEncoded());
      this.c = bax.a($$1, $$2);
   }

   private akk(wg $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<akk> a() {
      return akf.h;
   }

   public void a(akh $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws bay {
      return bax.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, bax.b($$1, this.c));
      } catch (bay var4) {
         return false;
      }
   }
}
