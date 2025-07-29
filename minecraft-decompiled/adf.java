import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record adf(List<adf.a> b) implements zw<acq> {
   public static final zm<wg, adf> a = zw.a(adf::a, adf::new);
   private static final int c = 2097152;

   private adf(wg $$0) {
      this($$0.a(adf.a::new));
   }

   public static adf a(List<egi> $$0) {
      return new adf($$0.stream().map(adf.a::new).toList());
   }

   private void a(wg $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zy<adf> a() {
      return ahk.o;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public record a(dlz a, byte[] b) {
      public a(egi $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wg(this.d()), $$0);
      }

      public a(wg $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(egi $$0) {
         int $$1 = 0;

         for (egj $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wg a() {
         return new wg(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wg $$0, egi $$1) {
         for (egj $$2 : $$1.d()) {
            $$2.i().b($$0);
         }

         if ($$0.writerIndex() != $$0.capacity()) {
            throw new IllegalStateException("Didn't fill biome buffer: expected " + $$0.capacity() + " bytes, got " + $$0.writerIndex());
         }
      }

      public void a(wg $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dlz b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
