import com.mojang.blaze3d.vertex.VertexFormat;
import javax.annotation.Nullable;

public class fof {
   private static final int a = 786432;
   private final foa b;
   @Nullable
   private static fof c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fof();
      }
   }

   public static fof b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fof(int $$0) {
      this.b = new foa($$0);
   }

   public fof() {
      this(786432);
   }

   public fnz a(VertexFormat.b $$0, VertexFormat $$1) {
      return new fnz(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
