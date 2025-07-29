import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class feb extends fdz {
   public static final int b = 1;
   public static final int e = 0;
   protected final int f;
   protected final int h;
   protected final List<fex> i;
   final BiFunction<dcv, fdj, dcv> a;
   private final fdy j = new feb.c() {
      @Override
      public void a(Consumer<dcv> $$0, fdj $$1) {
         feb.this.a(fex.a(feb.this.a, $$0, $$1), $$1);
      }
   };

   protected feb(int $$0, int $$1, List<fgs> $$2, List<fex> $$3) {
      super($$2);
      this.f = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fez.a($$3);
   }

   protected static <T extends feb> P4<Mu<T>, Integer, Integer, List<fgs>, List<fex>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.f), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fez.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(fdp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(new bci.d("functions", $$1)));
      }
   }

   protected abstract void a(Consumer<dcv> var1, fdj var2);

   @Override
   public boolean expand(fdj $$0, Consumer<fdy> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static feb.a<?> a(feb.d $$0) {
      return new feb.b($$0);
   }

   public abstract static class a<T extends feb.a<T>> extends fdz.a<T> implements fet<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fex> c = ImmutableList.builder();

      public T a(fex.a $$0) {
         this.c.add($$0.b());
         return this.aE_();
      }

      protected List<fex> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aE_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aE_();
      }
   }

   static class b extends feb.a<feb.b> {
      private final feb.d c;

      public b(feb.d $$0) {
         this.c = $$0;
      }

      protected feb.b g() {
         return this;
      }

      @Override
      public fdz b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements fdy {
      @Override
      public int a(float $$0) {
         return Math.max(bcb.d(feb.this.f + feb.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      feb build(int var1, int var2, List<fgs> var3, List<fex> var4);
   }
}
