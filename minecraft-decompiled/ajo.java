import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;

public record ajo(jb b, ajo.a c, ecu.a d) implements zw<ahm> {
   public static final zm<wx, ajo> a = zm.a(jb.b, ajo::b, ajo.a.h, ajo::e, ecu.a.b, ajo::f, ajo::new);

   public ajo(jb $$0, ajo.a $$1, Optional<amd<ta>> $$2, kg $$3, dwu $$4, boolean $$5) {
      this($$0, $$1, new ecu.a($$2, $$3, $$4, $$5, ecu.b.a, Optional.empty()));
   }

   @Override
   public zy<ajo> a() {
      return ahk.cl;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public ajo.a e() {
      return this.c;
   }

   public ecu.a f() {
      return this.d;
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      private static final IntFunction<ajo.a> i = baq.a($$0 -> $$0.j, values(), baq.a.a);
      public static final zm<ByteBuf, ajo.a> h = zk.a(i, $$0 -> $$0.j);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }
   }
}
