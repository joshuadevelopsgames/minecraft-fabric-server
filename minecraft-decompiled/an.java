import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record an(int c, List<amd<fdo>> d, List<amd<dhm<?>>> e, Optional<ef> f) {
   public static final Codec<an> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.INT.optionalFieldOf("experience", 0).forGetter(an::a),
            fdo.a.listOf().optionalFieldOf("loot", List.of()).forGetter(an::b),
            dhm.b.listOf().optionalFieldOf("recipes", List.of()).forGetter(an::c),
            ef.a.optionalFieldOf("function").forGetter(an::d)
         )
         .apply($$0, an::new)
   );
   public static final an b = new an(0, List.of(), List.of(), Optional.empty());

   public void a(auc $$0) {
      $$0.d(this.c);
      aub $$1 = $$0.y();
      MinecraftServer $$2 = $$1.q();
      fdm $$3 = new fdm.a($$1).a(fgd.a, $$0).a(fgd.f, $$0.dv()).a(fgc.m);
      boolean $$4 = false;

      for (amd<fdo> $$5 : this.d) {
         ObjectListIterator var8 = $$2.bc().a($$5).a($$3).iterator();

         while (var8.hasNext()) {
            dcv $$6 = (dcv)var8.next();
            if ($$0.h($$6)) {
               $$1.a(null, $$0.dC(), $$0.dE(), $$0.dI(), ayz.oF, aza.h, 0.2F, (($$0.ec().i() - $$0.ec().i()) * 0.7F + 1.0F) * 2.0F);
               $$4 = true;
            } else {
               cqz $$7 = $$0.a($$6, false);
               if ($$7 != null) {
                  $$7.l();
                  $$7.b($$0.cK());
               }
            }
         }
      }

      if ($$4) {
         $$0.cn.d();
      }

      if (!this.e.isEmpty()) {
         $$0.b(this.e);
      }

      this.f.flatMap($$1x -> $$1x.a($$2.aE())).ifPresent($$2x -> $$2.aE().a($$2x, $$0.A().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<amd<fdo>> b() {
      return this.d;
   }

   public List<amd<dhm<?>>> c() {
      return this.e;
   }

   public Optional<ef> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<amd<fdo>> b = ImmutableList.builder();
      private final Builder<amd<dhm<?>>> c = ImmutableList.builder();
      private Optional<ame> d = Optional.empty();

      public static an.a a(int $$0) {
         return new an.a().b($$0);
      }

      public an.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static an.a a(amd<fdo> $$0) {
         return new an.a().b($$0);
      }

      public an.a b(amd<fdo> $$0) {
         this.b.add($$0);
         return this;
      }

      public static an.a c(amd<dhm<?>> $$0) {
         return new an.a().d($$0);
      }

      public an.a d(amd<dhm<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static an.a a(ame $$0) {
         return new an.a().b($$0);
      }

      public an.a b(ame $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public an a() {
         return new an(this.a, this.b.build(), this.c.build(), this.d.map(ef::new));
      }
   }
}
