import io.netty.buffer.ByteBuf;

public record awv(String c, String d, String e) {
   public static final zm<ByteBuf, awv> a = zm.a(zk.p, awv::b, zk.p, awv::c, zk.p, awv::d, awv::new);
   public static final String b = "minecraft";

   public static awv a(String $$0) {
      return new awv("minecraft", $$0, ac.b().b());
   }

   public boolean a() {
      return this.c.equals("minecraft");
   }

   @Override
   public String toString() {
      return this.c + ":" + this.d + ":" + this.e;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }
}
