import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ffx extends few {
   public static final MapCodec<ffx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dgf.h.fieldOf("pages").forGetter($$0x -> $$0x.b), fev.a.forGetter($$0x -> $$0x.c))).apply($$0, ffx::new)
   );
   private final List<aut<xo>> b;
   private final fev c;

   protected ffx(List<fgs> $$0, List<aut<xo>> $$1, fev $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected dcv a(dcv $$0, fdj $$1) {
      $$0.a(kq.V, dgf.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dgf a(dgf $$0) {
      List<aut<xo>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public fey<ffx> b() {
      return fez.N;
   }
}
