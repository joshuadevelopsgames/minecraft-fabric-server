import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aam(UUID c, String d, String e, boolean f, Optional<xo> g) implements zw<aae> {
   public static final int a = 40;
   public static final zm<ByteBuf, aam> b = zm.a(kf.g, aam::b, zk.p, aam::e, zk.b(40), aam::f, zk.b, aam::g, xq.f.a(zk::a), aam::h, aam::new);

   public aam(UUID c, String d, String e, boolean f, Optional<xo> g) {
      if (e.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + e.length() + ")");
      } else {
         this.c = c;
         this.d = d;
         this.e = e;
         this.f = f;
         this.g = g;
      }
   }

   @Override
   public zy<aam> a() {
      return aas.h;
   }

   public void a(aae $$0) {
      $$0.a(this);
   }

   public UUID b() {
      return this.c;
   }

   public String e() {
      return this.d;
   }

   public String f() {
      return this.e;
   }

   public boolean g() {
      return this.f;
   }

   public Optional<xo> h() {
      return this.g;
   }
}
