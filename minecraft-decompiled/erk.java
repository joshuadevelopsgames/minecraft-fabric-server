import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class erk {
   public static final Codec<erk> d = mm.W.q().dispatch(erk::a, erl::a);
   protected final bwo e;
   protected final ern f;
   protected final Optional<erh> g;

   protected static <P extends erk> P3<Mu<P>, bwo, ern, Optional<erh>> a(Instance<P> $$0) {
      return $$0.group(
         bwo.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ern.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         erh.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public erk(bwo $$0, ern $$1, Optional<erh> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract erl<?> a();

   public abstract boolean a(dna var1, BiConsumer<jb, eeb> var2, bck var3, jb var4, jb var5, eqi var6);

   protected boolean a(dna $$0, jb $$1) {
      return eot.d($$0, $$1);
   }

   protected void a(dna $$0, BiConsumer<jb, eeb> $$1, bck $$2, jb $$3, eqi $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            erh $$5 = this.g.get();
            jb $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, eea.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected eeb a(dna $$0, jb $$1, eeb $$2) {
      if ($$2.b(eer.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(azu.a));
         return $$2.b(eer.I, $$3);
      } else {
         return $$2;
      }
   }

   public jb a(jb $$0, bck $$1) {
      return $$0.b(this.e.a($$1));
   }
}
