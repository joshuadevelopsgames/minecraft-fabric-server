import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.apache.commons.lang3.function.TriConsumer;

public record dfm(List<dfm.c> e) {
   public static final dfm a = new dfm(List.of());
   public static final Codec<dfm> b = dfm.c.a.listOf().xmap(dfm::new, dfm::b);
   public static final zm<wx, dfm> c = zm.a(dfm.c.b.a(zk.a()), dfm::b, dfm::new);
   public static final DecimalFormat d = ag.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static dfm.a a() {
      return new dfm.a();
   }

   public dfm a(jl<cbn> $$0, cbq $$1, bzx $$2) {
      Builder<dfm.c> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dfm.c $$4 : this.e) {
         if (!$$4.a($$0, $$1.a())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dfm.c($$0, $$1, $$2));
      return new dfm($$3.build());
   }

   public void a(bzx $$0, TriConsumer<jl<cbn>, cbq, dfm.b> $$1) {
      for (dfm.c $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d, $$2.f);
         }
      }
   }

   public void a(bzx $$0, BiConsumer<jl<cbn>, cbq> $$1) {
      for (dfm.c $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bzw $$0, BiConsumer<jl<cbn>, cbq> $$1) {
      for (dfm.c $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bzw $$1) {
      double $$2 = $$0;

      for (dfm.c $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.b();

            $$2 += switch ($$3.d.c()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<dfm.c> b() {
      return this.e;
   }

   public static class a {
      private final Builder<dfm.c> a = ImmutableList.builder();

      a() {
      }

      public dfm.a a(jl<cbn> $$0, cbq $$1, bzx $$2) {
         this.a.add(new dfm.c($$0, $$1, $$2));
         return this;
      }

      public dfm.a a(jl<cbn> $$0, cbq $$1, bzx $$2, dfm.b $$3) {
         this.a.add(new dfm.c($$0, $$1, $$2, $$3));
         return this;
      }

      public dfm a() {
         return new dfm(this.a.build());
      }
   }

   public interface b {
      Codec<dfm.b> a = dfm.b.d.d.dispatch("type", dfm.b::c, $$0 -> $$0.i);
      zm<wx, dfm.b> b = dfm.b.d.f.<wx>a().b(dfm.b::c, dfm.b.d::b);

      static dfm.b a() {
         return dfm.b.a.c;
      }

      static dfm.b b() {
         return dfm.b.b.c;
      }

      static dfm.b a(xo $$0) {
         return new dfm.b.c($$0);
      }

      dfm.b.d c();

      void a(Consumer<xo> var1, @Nullable cut var2, jl<cbn> var3, cbq var4);

      public record a() implements dfm.b {
         static final dfm.b.a c = new dfm.b.a();
         static final MapCodec<dfm.b.a> d = MapCodec.unit(c);
         static final zm<wx, dfm.b.a> e = zm.a(c);

         @Override
         public dfm.b.d c() {
            return dfm.b.d.a;
         }

         @Override
         public void a(Consumer<xo> $$0, @Nullable cut $$1, jl<cbn> $$2, cbq $$3) {
            double $$4 = $$3.b();
            boolean $$5 = false;
            if ($$1 != null) {
               if ($$3.a(dcr.h)) {
                  $$4 += $$1.j(cbs.c);
                  $$5 = true;
               } else if ($$3.a(dcr.i)) {
                  $$4 += $$1.j(cbs.e);
                  $$5 = true;
               }
            }

            double $$6;
            if ($$3.c() == cbq.a.b || $$3.c() == cbq.a.c) {
               $$6 = $$4 * 100.0;
            } else if ($$2.a(cbs.q)) {
               $$6 = $$4 * 10.0;
            } else {
               $$6 = $$4;
            }

            if ($$5) {
               $$0.accept(xn.a().b(xo.a("attribute.modifier.equals." + $$3.c().a(), dfm.d.format($$6), xo.c($$2.a().c()))).a(o.c));
            } else if ($$4 > 0.0) {
               $$0.accept(xo.a("attribute.modifier.plus." + $$3.c().a(), dfm.d.format($$6), xo.c($$2.a().c())).a($$2.a().b(true)));
            } else if ($$4 < 0.0) {
               $$0.accept(xo.a("attribute.modifier.take." + $$3.c().a(), dfm.d.format(-$$6), xo.c($$2.a().c())).a($$2.a().b(false)));
            }
         }
      }

      public record b() implements dfm.b {
         static final dfm.b.b c = new dfm.b.b();
         static final MapCodec<dfm.b.b> d = MapCodec.unit(c);
         static final zm<wx, dfm.b.b> e = zm.a(c);

         @Override
         public dfm.b.d c() {
            return dfm.b.d.b;
         }

         @Override
         public void a(Consumer<xo> $$0, @Nullable cut $$1, jl<cbn> $$2, cbq $$3) {
         }
      }

      public record c(xo c) implements dfm.b {
         static final MapCodec<dfm.b.c> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xq.a.fieldOf("value").forGetter(dfm.b.c::d)).apply($$0, dfm.b.c::new));
         static final zm<wx, dfm.b.c> e = zm.a(xq.b, dfm.b.c::d, dfm.b.c::new);

         @Override
         public dfm.b.d c() {
            return dfm.b.d.c;
         }

         @Override
         public void a(Consumer<xo> $$0, @Nullable cut $$1, jl<cbn> $$2, cbq $$3) {
            $$0.accept(this.c);
         }

         public xo d() {
            return this.c;
         }
      }

      public static enum d implements bda {
         a("default", 0, dfm.b.a.d, dfm.b.a.e),
         b("hidden", 1, dfm.b.b.d, dfm.b.b.e),
         c("override", 2, dfm.b.c.d, dfm.b.c.e);

         static final Codec<dfm.b.d> d = bda.a(dfm.b.d::values);
         private static final IntFunction<dfm.b.d> e = baq.a(dfm.b.d::a, values(), baq.a.a);
         static final zm<ByteBuf, dfm.b.d> f = zk.a(e, dfm.b.d::a);
         private final String g;
         private final int h;
         final MapCodec<? extends dfm.b> i;
         private final zm<wx, ? extends dfm.b> j;

         private d(final String $$0, final int $$1, final MapCodec<? extends dfm.b> $$2, final zm<wx, ? extends dfm.b> $$3) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
            this.j = $$3;
         }

         @Override
         public String c() {
            return this.g;
         }

         private int a() {
            return this.h;
         }

         private zm<wx, ? extends dfm.b> b() {
            return this.j;
         }
      }
   }

   public record c(jl<cbn> c, cbq d, bzx e, dfm.b f) {
      public static final Codec<dfm.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               cbn.a.fieldOf("type").forGetter(dfm.c::a),
               cbq.a.forGetter(dfm.c::b),
               bzx.m.optionalFieldOf("slot", bzx.a).forGetter(dfm.c::c),
               dfm.b.a.optionalFieldOf("display", dfm.b.a.c).forGetter(dfm.c::d)
            )
            .apply($$0, dfm.c::new)
      );
      public static final zm<wx, dfm.c> b = zm.a(cbn.b, dfm.c::a, cbq.c, dfm.c::b, bzx.n, dfm.c::c, dfm.b.b, dfm.c::d, dfm.c::new);

      public c(jl<cbn> $$0, cbq $$1, bzx $$2) {
         this($$0, $$1, $$2, dfm.b.a());
      }

      public boolean a(jl<cbn> $$0, ame $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jl<cbn> a() {
         return this.c;
      }

      public cbq b() {
         return this.d;
      }

      public bzx c() {
         return this.e;
      }

      public dfm.b d() {
         return this.f;
      }
   }
}
