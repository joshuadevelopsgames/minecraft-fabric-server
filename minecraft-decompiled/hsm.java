import java.io.IOException;

public class hsm extends axt<int[]> {
   private static final ame a = ame.b("textures/colormap/foliage.png");

   protected int[] a(axo $$0, btt $$1) {
      try {
         return hsp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, axo $$1, btt $$2) {
      dmp.a($$0);
   }
}
