import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public record cbq(ame d, double e, cbq.a f) {
   public static final MapCodec<cbq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ame.a.fieldOf("id").forGetter(cbq::a), Codec.DOUBLE.fieldOf("amount").forGetter(cbq::b), cbq.a.f.fieldOf("operation").forGetter(cbq::c))
         .apply($$0, cbq::new)
   );
   public static final Codec<cbq> b = a.codec();
   public static final zm<ByteBuf, cbq> c = zm.a(ame.b, cbq::a, zk.m, cbq::b, cbq.a.e, cbq::c, cbq::new);

   public boolean a(ame $$0) {
      return $$0.equals(this.d);
   }

   public ame a() {
      return this.d;
   }

   public double b() {
      return this.e;
   }

   public cbq.a c() {
      return this.f;
   }

   public static enum a implements bda {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<cbq.a> d = baq.a(cbq.a::a, values(), baq.a.a);
      public static final zm<ByteBuf, cbq.a> e = zk.a(d, cbq.a::a);
      public static final Codec<cbq.a> f = bda.a(cbq.a::values);
      private final String g;
      private final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
