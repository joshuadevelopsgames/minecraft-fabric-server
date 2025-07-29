import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dtg extends dzl implements dym {
   protected static final MapCodec<dfx> b = dfx.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dtg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dtg::c), t()).apply($$0, dtg::new));
   private static final fjm a = dpz.b(6.0, 0.0, 10.0);
   private final dfx d;

   @Override
   public MapCodec<? extends dtg> a() {
      return c;
   }

   public dtg(jl<byo> $$0, float $$1, eea.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dtg(dfx $$0, eea.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static dfx a(jl<byo> $$0, float $$1) {
      return new dfx(List.of(new dfx.a($$0, bcb.d($$1 * 20.0F))));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public dfx c() {
      return this.d;
   }

   @Nullable
   public byq b() {
      return null;
   }
}
