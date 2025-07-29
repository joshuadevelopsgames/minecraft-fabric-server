import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class fdz implements fdr {
   protected final List<fgs> g;
   private final Predicate<fdj> a;

   protected fdz(List<fgs> $$0) {
      this.g = $$0;
      this.a = ag.a($$0);
   }

   protected static <T extends fdz> P1<Mu<T>, List<fgs>> a(Instance<T> $$0) {
      return $$0.group(fgs.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public void a(fdp $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(new bci.d("conditions", $$1)));
      }
   }

   protected final boolean a(fdj $$0) {
      return this.a.test($$0);
   }

   public abstract fea a();

   public abstract static class a<T extends fdz.a<T>> implements fgk<T> {
      private final Builder<fgs> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(fgs.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<fgs> f() {
         return this.a.build();
      }

      public fdq.a a(fdz.a<?> $$0) {
         return new fdq.a(this, $$0);
      }

      public fdv.a b(fdz.a<?> $$0) {
         return new fdv.a(this, $$0);
      }

      public fed.a c(fdz.a<?> $$0) {
         return new fed.a(this, $$0);
      }

      public abstract fdz b();
   }
}
