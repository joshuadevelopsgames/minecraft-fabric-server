import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;

public record ahc(ahc.a b, fkr c) implements zw<acq> {
   public static final zm<wx, ahc> a = zm.a(ahc.a.e, ahc::b, fkr.a, ahc::e, ahc::new);

   public static ahc a(UUID $$0) {
      return new ahc(ahc.a.b, fkr.a($$0));
   }

   public static ahc a(UUID $$0, fkt.a $$1, kg $$2) {
      return new ahc(ahc.a.a, fkr.a($$0, $$1, $$2));
   }

   public static ahc b(UUID $$0, fkt.a $$1, kg $$2) {
      return new ahc(ahc.a.c, fkr.a($$0, $$1, $$2));
   }

   public static ahc a(UUID $$0, fkt.a $$1, dlz $$2) {
      return new ahc(ahc.a.a, fkr.a($$0, $$1, $$2));
   }

   public static ahc b(UUID $$0, fkt.a $$1, dlz $$2) {
      return new ahc(ahc.a.c, fkr.a($$0, $$1, $$2));
   }

   public static ahc a(UUID $$0, fkt.a $$1, float $$2) {
      return new ahc(ahc.a.a, fkr.a($$0, $$1, $$2));
   }

   public static ahc b(UUID $$0, fkt.a $$1, float $$2) {
      return new ahc(ahc.a.c, fkr.a($$0, $$1, $$2));
   }

   @Override
   public zy<ahc> a() {
      return ahk.bk;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public void a(fks $$0) {
      this.b.f.accept($$0, this.c);
   }

   public fkr e() {
      return this.c;
   }

   static enum a {
      a(fku::c),
      b(fku::a),
      c(fku::b);

      final BiConsumer<fks, fkr> f;
      public static final IntFunction<ahc.a> d = baq.a(Enum::ordinal, values(), baq.a.b);
      public static final zm<ByteBuf, ahc.a> e = zk.a(d, Enum::ordinal);

      private a(final BiConsumer<fks, fkr> $$0) {
         this.f = $$0;
      }
   }
}
