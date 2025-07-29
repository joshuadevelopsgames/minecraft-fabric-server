import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ewg {
   public static final Codec<ewg> f = mm.ag.q().dispatch("element_type", ewg::a, ewh::codec);
   private static final jl<eyy> a = jl.a(new eyy(List.of()));
   @Nullable
   private volatile ewi.a b;

   protected static <E extends ewg> RecordCodecBuilder<E, ewi.a> f() {
      return ewi.a.c.fieldOf("projection").forGetter(ewg::g);
   }

   protected ewg(ewi.a $$0) {
      this.b = $$0;
   }

   public abstract kg a(ezb var1, dwu var2);

   public abstract List<eza.a> a(ezb var1, jb var2, dwu var3, bck var4);

   public abstract euq a(ezb var1, jb var2, dwu var3);

   public abstract boolean a(ezb var1, dnt var2, dnq var3, efz var4, jb var5, jb var6, dwu var7, euq var8, bck var9, eyk var10, boolean var11);

   public abstract ewh<?> a();

   public void a(dmv $$0, eza.d $$1, jb $$2, dwu $$3, bck $$4, euq $$5) {
   }

   public ewg a(ewi.a $$0) {
      this.b = $$0;
      return this;
   }

   public ewi.a g() {
      ewi.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int h() {
      return 1;
   }

   public static Function<ewi.a, evz> i() {
      return $$0 -> evz.b;
   }

   public static Function<ewi.a, ewd> a(String $$0) {
      return $$1 -> new ewd(Either.left(ame.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ewi.a, ewd> a(String $$0, jl<eyy> $$1) {
      return $$2 -> new ewd(Either.left(ame.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ewi.a, ewf> b(String $$0) {
      return $$1 -> new ewf(Either.left(ame.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ewi.a, ewf> b(String $$0, jl<eyy> $$1) {
      return $$2 -> new ewf(Either.left(ame.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ewi.a, ewf> a(String $$0, eyk $$1) {
      return $$2 -> new ewf(Either.left(ame.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<ewi.a, ewf> a(String $$0, jl<eyy> $$1, eyk $$2) {
      return $$3 -> new ewf(Either.left(ame.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<ewi.a, ewa> a(jl<euc> $$0) {
      return $$1 -> new ewa($$0, $$1);
   }

   public static Function<ewi.a, ewe> b(List<Function<ewi.a, ? extends ewg>> $$0) {
      return $$1 -> new ewe($$0.stream().map($$1x -> (ewg)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
