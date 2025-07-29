import com.mojang.serialization.Codec;
import java.util.List;

public class gzj implements gzc {
   private final gzb a;

   public gzj(gzb $$0) {
      this.a = $$0;
   }

   @Override
   public void a(bck $$0, List<gzb> $$1) {
      $$1.add(this.a);
   }

   @Override
   public hrs a() {
      return this.a.b();
   }

   public record a(gzl e) implements gzc.b {
      public static final Codec<gzj.a> d = gzl.b.xmap(gzj.a::new, gzj.a::b);

      @Override
      public gzc a(huc $$0) {
         return new gzj(this.e.a($$0));
      }

      @Override
      public void a(huk.a $$0) {
         this.e.a($$0);
      }

      public gzl b() {
         return this.e;
      }
   }
}
