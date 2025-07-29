import com.google.common.base.MoreObjects;
import java.util.List;

public class glh {
   public static final int a = -1;
   private final List<glf> b;
   private final int c;

   public glh(List<glf> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public glf a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (glf)MoreObjects.firstNonNull(this.b.get($$0), gld.a) : gld.a;
   }

   public int a() {
      return this.c;
   }
}
