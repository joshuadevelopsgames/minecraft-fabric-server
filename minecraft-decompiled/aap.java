import io.netty.buffer.ByteBuf;

public record aap(ame c, byte[] d) implements zw<aae> {
   public static final zm<wg, aap> a = zw.a(aap::a, aap::new);
   private static final int e = 5120;
   public static final zm<ByteBuf, byte[]> b = zk.a(5120);

   private aap(wg $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zy<aap> a() {
      return aas.k;
   }

   public void a(aae $$0) {
      $$0.a(this);
   }

   public ame b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
