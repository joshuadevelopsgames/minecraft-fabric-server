import io.netty.buffer.ByteBuf;
import java.util.List;

public record abs(long c, List<abs.a> d) implements abe {
   public static final abe.b<abs> a = abe.a("debug/redstone_update_order");
   public static final zm<wg, abs> b = zm.a(zk.k, abs::b, abs.a.a.a(zk.a()), abs::c, abs::new);

   @Override
   public abe.b<abs> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abs.a> c() {
      return this.d;
   }

   public record a(jb b, fbt c) {
      public static final zm<ByteBuf, abs.a> a = zm.a(jb.b, abs.a::a, fbt.a, abs.a::b, abs.a::new);

      public jb a() {
         return this.b;
      }

      public fbt b() {
         return this.c;
      }
   }
}
