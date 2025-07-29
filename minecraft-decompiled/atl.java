public record atl(String b, int c, cuq d, boolean e, int f, cad g, boolean h, boolean i, att j) {
   public static final int a = 16;

   public atl(wg $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(cuq.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(cad.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(att.class)
      );
   }

   public void a(wg $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.a(this.j);
   }

   public static atl a() {
      return new atl("en_us", 2, cuq.a, true, 0, cut.bQ, false, false, att.a);
   }
}
