import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class fem extends few {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fem> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               ka.a(mn.aW).optionalFieldOf("options").forGetter($$0x -> $$0x.c), Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
            )
         )
         .apply($$0, fem::new)
   );
   private final Optional<jp<dji>> c;
   private final boolean d;

   fem(List<fgs> $$0, Optional<jp<dji>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fey<fem> b() {
      return fez.h;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      bck $$2 = $$1.b();
      boolean $$3 = $$0.a(dcz.rW);
      boolean $$4 = !$$3 && this.d;
      Stream<jl<dji>> $$5 = this.c
         .<Stream<jl<dji>>>map(jp::a)
         .orElseGet(() -> $$1.d().K_().f(mn.aW).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dji)$$2x.a()).c($$0));
      List<jl<dji>> $$6 = $$5.toList();
      Optional<jl<dji>> $$7 = ag.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static dcv a(dcv $$0, jl<dji> $$1, bck $$2) {
      int $$3 = bcb.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(dcz.rW)) {
         $$0 = new dcv(dcz.vY);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static fem.a c() {
      return new fem.a();
   }

   public static fem.a a(jn.a $$0) {
      return c().a($$0.e(mn.aW).b(azr.n));
   }

   public static class a extends few.a<fem.a> {
      private Optional<jp<dji>> a = Optional.empty();
      private boolean b = true;

      protected fem.a a() {
         return this;
      }

      public fem.a a(jl<dji> $$0) {
         this.a = Optional.of(jp.a($$0));
         return this;
      }

      public fem.a a(jp<dji> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fem.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fex b() {
         return new fem(this.g(), this.a, this.b);
      }
   }
}
