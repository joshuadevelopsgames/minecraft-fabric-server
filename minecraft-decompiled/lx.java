import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lx implements mc {
   private final md<lx> a;
   private final int b;

   public static MapCodec<lx> a(md<lx> $$0) {
      return bbi.m.xmap($$1 -> new lx($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static zm<? super ByteBuf, lx> b(md<lx> $$0) {
      return zk.g.a($$1 -> new lx($$0, $$1), $$0x -> $$0x.b);
   }

   private lx(md<lx> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public md<lx> a() {
      return this.a;
   }

   public float b() {
      return baj.b(this.b) / 255.0F;
   }

   public float c() {
      return baj.c(this.b) / 255.0F;
   }

   public float d() {
      return baj.d(this.b) / 255.0F;
   }

   public float e() {
      return baj.a(this.b) / 255.0F;
   }

   public static lx a(md<lx> $$0, int $$1) {
      return new lx($$0, $$1);
   }

   public static lx a(md<lx> $$0, float $$1, float $$2, float $$3) {
      return a($$0, baj.a(1.0F, $$1, $$2, $$3));
   }
}
