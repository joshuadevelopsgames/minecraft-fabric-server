import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class evt extends evv {
   public static final MapCodec<evt> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.intRange(0, 4096).fieldOf("spacing").forGetter(evt::a),
                  Codec.intRange(0, 4096).fieldOf("separation").forGetter(evt::b),
                  evu.c.optionalFieldOf("spread_type", evu.a).forGetter(evt::c)
               )
            )
            .apply($$0, evt::new)
      )
      .validate(evt::a);
   private final int c;
   private final int d;
   private final evu e;

   private static DataResult<evt> a(evt $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public evt(kg $$0, evv.c $$1, float $$2, int $$3, Optional<evv.a> $$4, int $$5, int $$6, evu $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public evt(int $$0, int $$1, evu $$2, int $$3) {
      this(kg.i, evv.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public evu c() {
      return this.e;
   }

   public dlz a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      ekz $$5 = new ekz(new ekb(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dlz($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(ega $$0, int $$1, int $$2) {
      dlz $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public evw<?> e() {
      return evw.a;
   }
}
