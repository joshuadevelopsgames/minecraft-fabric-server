import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class evs extends evv {
   public static final MapCodec<evs> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, evs::new));
   private final int c;
   private final int d;
   private final int e;
   private final jp<dnx> f;

   private static P9<Mu<evs>, kg, evv.c, Float, Integer, Optional<evv.a>, Integer, Integer, Integer, jp<dnx>> b(Instance<evs> $$0) {
      P5<Mu<evs>, kg, evv.c, Float, Integer, Optional<evv.a>> $$1 = a($$0);
      P4<Mu<evs>, Integer, Integer, Integer, jp<dnx>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(evs::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(evs::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(evs::c),
         ka.a(mn.aK).fieldOf("preferred_biomes").forGetter(evs::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public evs(kg $$0, evv.c $$1, float $$2, int $$3, Optional<evv.a> $$4, int $$5, int $$6, int $$7, jp<dnx> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public evs(int $$0, int $$1, int $$2, jp<dnx> $$3) {
      this(kg.i, evv.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public jp<dnx> d() {
      return this.f;
   }

   @Override
   protected boolean a(ega $$0, int $$1, int $$2) {
      List<dlz> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dlz($$1, $$2));
   }

   @Override
   public evw<?> e() {
      return evw.b;
   }
}
