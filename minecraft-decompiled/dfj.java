import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record dfj(dfj.a e, IntList f, IntList g, boolean h, boolean i) implements dga {
   public static final dfj a = new dfj(dfj.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<dfj> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            dfj.a.g.fieldOf("shape").forGetter(dfj::a),
            b.optionalFieldOf("colors", IntList.of()).forGetter(dfj::b),
            b.optionalFieldOf("fade_colors", IntList.of()).forGetter(dfj::c),
            Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(dfj::d),
            Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(dfj::e)
         )
         .apply($$0, dfj::new)
   );
   private static final zm<ByteBuf, IntList> j = zk.g.a(zk.a()).a(IntArrayList::new, ArrayList::new);
   public static final zm<ByteBuf, dfj> d = zm.a(dfj.a.f, dfj::a, j, dfj::b, j, dfj::c, zk.b, dfj::d, zk.b, dfj::e, dfj::new);
   private static final xo k = xo.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      $$1.accept(this.e.a().a(o.h));
      this.a($$1);
   }

   public void a(Consumer<xo> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xo.i().a(o.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xo.c("item.minecraft.firework_star.fade_to").b(xn.w).a(o.h), this.g));
      }

      if (this.h) {
         $$0.accept(xo.c("item.minecraft.firework_star.trail").a(o.h));
      }

      if (this.i) {
         $$0.accept(xo.c("item.minecraft.firework_star.flicker").a(o.h));
      }
   }

   private static xo a(yc $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xo a(int $$0) {
      dbt $$1 = dbt.b($$0);
      return (xo)($$1 == null ? k : xo.c("item.minecraft.firework_star." + $$1.b()));
   }

   public dfj a(IntList $$0) {
      return new dfj(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public dfj.a a() {
      return this.e;
   }

   public IntList b() {
      return this.f;
   }

   public IntList c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public static enum a implements bda {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<dfj.a> h = baq.a(dfj.a::b, values(), baq.a.a);
      public static final zm<ByteBuf, dfj.a> f = zk.a(h, dfj.a::b);
      public static final Codec<dfj.a> g = bda.b(dfj.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public yc a() {
         return xo.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static dfj.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
