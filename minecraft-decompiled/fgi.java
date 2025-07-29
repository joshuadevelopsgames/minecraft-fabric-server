import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fgi implements fgs {
   protected final List<fgs> c;
   private final Predicate<fdj> a;

   protected fgi(List<fgs> $$0, Predicate<fdj> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fgi> MapCodec<T> a(Function<List<fgs>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fgs.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fgi> Codec<T> b(Function<List<fgs>, T> $$0) {
      return fgs.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(fdj $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(fdp $$0) {
      fgs.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(new bci.d("terms", $$1)));
      }
   }

   public abstract static class a implements fgs.a {
      private final Builder<fgs> a = ImmutableList.builder();

      protected a(fgs.a... $$0) {
         for (fgs.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fgs.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fgs build() {
         return this.a(this.a.build());
      }

      protected abstract fgs a(List<fgs> var1);
   }
}
