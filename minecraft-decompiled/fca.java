import java.util.Optional;

public record fca(jl<fcb> b, byte c, byte d, byte e, Optional<xo> f) {
   public static final zm<wx, fca> a = zm.a(fcb.c, fca::c, zk.c, fca::d, zk.c, fca::e, zk.c, fca::f, xq.c, fca::g, fca::new);

   public fca(jl<fcb> b, byte c, byte d, byte e, Optional<xo> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ame a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jl<fcb> c() {
      return this.b;
   }

   public byte d() {
      return this.c;
   }

   public byte e() {
      return this.d;
   }

   public byte f() {
      return this.e;
   }

   public Optional<xo> g() {
      return this.f;
   }
}
