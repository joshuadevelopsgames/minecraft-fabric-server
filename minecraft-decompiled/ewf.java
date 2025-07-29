import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ewf extends ewg {
   private static final Comparator<eza.a> a = Comparator.comparingInt(eza.a::g).reversed();
   private static final Codec<Either<ame, eza>> g = Codec.of(ewf::a, ame.a.map(Either::left));
   public static final MapCodec<ewf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, ewf::new));
   protected final Either<ame, eza> c;
   protected final jl<eyy> d;
   protected final Optional<eyk> e;

   private static <T> DataResult<T> a(Either<ame, eza> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ame> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ame.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ewf> RecordCodecBuilder<E, jl<eyy>> b() {
      return eyz.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ewf> RecordCodecBuilder<E, Optional<eyk>> c() {
      return eyk.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends ewf> RecordCodecBuilder<E, Either<ame, eza>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ewf(Either<ame, eza> $$0, jl<eyy> $$1, ewi.a $$2, Optional<eyk> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kg a(ezb $$0, dwu $$1) {
      eza $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private eza a(ezb $$0) {
      return (eza)this.c.map($$0::a, Function.identity());
   }

   public List<eza.d> a(ezb $$0, jb $$1, dwu $$2, boolean $$3) {
      eza $$4 = this.a($$0);
      List<eza.d> $$5 = $$4.a($$1, new eyw().a($$2), dqb.pH, $$3);
      List<eza.d> $$6 = Lists.newArrayList();

      for (eza.d $$7 : $$5) {
         ui $$8 = $$7.c();
         if ($$8 != null) {
            efl $$9 = $$8.<efl>a("mode", efl.e).orElseThrow();
            if ($$9 == efl.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<eza.a> a(ezb $$0, jb $$1, dwu $$2, bck $$3) {
      List<eza.a> $$4 = this.a($$0).a($$1, $$2);
      ag.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<eza.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public euq a(ezb $$0, jb $$1, dwu $$2) {
      eza $$3 = this.a($$0);
      return $$3.b(new eyw().a($$2), $$1);
   }

   @Override
   public boolean a(ezb $$0, dnt $$1, dnq $$2, efz $$3, jb $$4, jb $$5, dwu $$6, euq $$7, bck $$8, eyk $$9, boolean $$10) {
      eza $$11 = this.a($$0);
      eyw $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (eza.d $$14 : eza.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eyw a(dwu $$0, euq $$1, eyk $$2, boolean $$3) {
      eyw $$4 = new eyw();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eyb.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(eyh.b);
      }

      this.d.a().a().forEach($$4::a);
      this.g().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public ewh<?> a() {
      return ewh.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }

   @VisibleForTesting
   public ame e() {
      return (ame)this.c.orThrow();
   }
}
