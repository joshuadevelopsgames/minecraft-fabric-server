import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record eap(List<eap.b> d) implements dga {
   static final Logger e = LogUtils.getLogger();
   public static final eap a = new eap(List.of());
   public static final Codec<eap> b = eap.b.a.listOf().xmap(eap::new, eap::b);
   public static final zm<wx, eap> c = eap.b.b.a(zk.a()).a(eap::new, eap::b);

   public eap a() {
      return new eap(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(o.h));
      }
   }

   public List<eap.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<eap.b> a = ImmutableList.builder();

      @Deprecated
      public eap.a a(jm<eao> $$0, amd<eao> $$1, dbt $$2) {
         Optional<jl.c<eao>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            eap.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public eap.a a(jl<eao> $$0, dbt $$1) {
         return this.a(new eap.b($$0, $$1));
      }

      public eap.a a(eap.b $$0) {
         this.a.add($$0);
         return this;
      }

      public eap.a a(eap $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public eap a() {
         return new eap(this.a.build());
      }
   }

   public record b(jl<eao> c, dbt d) {
      public static final Codec<eap.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eao.c.fieldOf("pattern").forGetter(eap.b::b), dbt.q.fieldOf("color").forGetter(eap.b::c)).apply($$0, eap.b::new)
      );
      public static final zm<wx, eap.b> b = zm.a(eao.d, eap.b::b, dbt.r, eap.b::c, eap.b::new);

      public yc a() {
         String $$0 = this.c.a().b();
         return xo.c($$0 + "." + this.d.b());
      }

      public jl<eao> b() {
         return this.c;
      }

      public dbt c() {
         return this.d;
      }
   }
}
