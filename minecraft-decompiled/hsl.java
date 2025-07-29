import java.io.IOException;

public class hsl extends axt<int[]> {
   private static final ame a = ame.b("textures/colormap/dry_foliage.png");

   protected int[] a(axo $$0, btt $$1) {
      try {
         return hsp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load dry foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, axo $$1, btt $$2) {
      dmi.a($$0);
   }
}
