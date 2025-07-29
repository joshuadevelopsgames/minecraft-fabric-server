import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class dny {
   private static final Logger c = LogUtils.getLogger();
   public static final dny a = new dny(jp.a(), List.of());
   public static final MapCodec<dny> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            eme.c.promotePartial(ag.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
            euc.d.promotePartial(ag.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
         )
         .apply($$0, dny::new)
   );
   private final jp<eme<?>> d;
   private final List<jp<euc>> e;
   private final Supplier<List<ems<?, ?>>> f;
   private final Supplier<Set<euc>> g;

   dny(jp<eme<?>> $$0, List<jp<euc>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jp::a).map(jl::a).flatMap(euc::a).filter($$0xx -> $$0xx.b() == enh.h).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jp::a).map(jl::a).collect(Collectors.toSet()));
   }

   public Iterable<jl<eme<?>>> a() {
      return this.d;
   }

   public List<ems<?, ?>> b() {
      return this.f.get();
   }

   public List<jp<euc>> c() {
      return this.e;
   }

   public boolean a(euc $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dny.b {
      private final jm<euc> a;
      private final jm<eme<?>> b;

      public a(jm<euc> $$0, jm<eme<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dny.a a(ejw.a $$0, amd<euc> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dny.a a(amd<eme<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jl<eme<?>>> a = new ArrayList<>();
      private final List<List<jl<euc>>> b = new ArrayList<>();

      public dny.b a(ejw.a $$0, jl<euc> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dny.b a(int $$0, jl<euc> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dny.b a(jl<eme<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dny a() {
         return new dny(jp.a(this.a), this.b.stream().map(jp::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
