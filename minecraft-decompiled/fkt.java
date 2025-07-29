import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public interface fkt {
   int b_ = 60000000;
   cbq c_ = new cbq(ame.b("waypoint_transmit_range_hide"), -1.0, cbq.a.c);

   static dcr.a a(dcr.a $$0) {
      return $$0.a(kq.o, dfm.a().a(cbs.H, c_, bzx.h, dfm.b.b()).a());
   }

   public static class a {
      public static final Codec<fkt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(amd.a(fkw.a).fieldOf("style").forGetter($$0x -> $$0x.d), bbi.l.optionalFieldOf("color").forGetter($$0x -> $$0x.e))
            .apply($$0, fkt.a::new)
      );
      public static final zm<ByteBuf, fkt.a> b = zm.a(amd.b(fkw.a), $$0 -> $$0.d, zk.a(zk.A), $$0 -> $$0.e, fkt.a::new);
      public static final fkt.a c = new fkt.a();
      public amd<fkv> d = fkw.b;
      public Optional<Integer> e = Optional.empty();

      public a() {
      }

      private a(amd<fkv> $$0, Optional<Integer> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public boolean a() {
         return this.d != fkw.b || this.e.isPresent();
      }

      public fkt.a a(cam $$0) {
         amd<fkv> $$1 = this.b();
         Optional<Integer> $$2 = this.e.or(() -> Optional.ofNullable($$0.cu()).map($$0xx -> $$0xx.o().f()).map($$0xx -> $$0xx == 0 ? -13619152 : $$0xx));
         return $$1 == this.d && $$2.isEmpty() ? this : new fkt.a($$1, $$2);
      }

      private amd<fkv> b() {
         return this.d != fkw.b ? this.d : fkw.b;
      }
   }
}
