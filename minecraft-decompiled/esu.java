import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class esu {
   public static final Codec<esu> c = mm.V.q().dispatch(esu::a, esv::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends esu> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public esu(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract esv<?> a();

   public abstract List<eqy.a> a(dna var1, BiConsumer<jb, eeb> var2, bck var3, int var4, jb var5, eqi var6);

   public int a(bck $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dna $$0, jb $$1) {
      return $$0.a($$1, $$0x -> enh.b($$0x) && !$$0x.a(dqb.i) && !$$0x.a(dqb.fE));
   }

   protected static void a(dna $$0, BiConsumer<jb, eeb> $$1, bck $$2, jb $$3, eqi $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dna $$0, BiConsumer<jb, eeb> $$1, bck $$2, jb $$3, eqi $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dna $$0, BiConsumer<jb, eeb> $$1, bck $$2, jb $$3, eqi $$4, Function<eeb, eeb> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dna $$0, BiConsumer<jb, eeb> $$1, bck $$2, jb.a $$3, eqi $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dna $$0, jb $$1) {
      return eot.d($$0, $$1);
   }

   public boolean b(dna $$0, jb $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(azo.D));
   }
}
