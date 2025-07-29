import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public final class azd {
   public static final zm<wg, azd> a = zm.a(azd.a.f, $$0 -> $$0.c, azd.a.f, $$0 -> $$0.d, azd.a.f, $$0 -> $$0.e, azd.a.f, $$0 -> $$0.f, azd::new);
   public static final MapCodec<azd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            azd.a.b.forGetter($$0x -> $$0x.c), azd.a.c.forGetter($$0x -> $$0x.d), azd.a.d.forGetter($$0x -> $$0x.e), azd.a.e.forGetter($$0x -> $$0x.f)
         )
         .apply($$0, azd::new)
   );
   private azd.a c;
   private azd.a d;
   private azd.a e;
   private azd.a f;

   public azd() {
      this(azd.a.a, azd.a.a, azd.a.a, azd.a.a);
   }

   private azd(azd.a $$0, azd.a $$1, azd.a $$2, azd.a $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @VisibleForTesting
   public azd.a a(dac $$0) {
      return switch ($$0) {
         case a -> this.c;
         case b -> this.d;
         case c -> this.e;
         case d -> this.f;
      };
   }

   private void a(dac $$0, UnaryOperator<azd.a> $$1) {
      switch ($$0) {
         case a:
            this.c = $$1.apply(this.c);
            break;
         case b:
            this.d = $$1.apply(this.d);
            break;
         case c:
            this.e = $$1.apply(this.e);
            break;
         case d:
            this.f = $$1.apply(this.f);
      }
   }

   public boolean b(dac $$0) {
      return this.a($$0).g;
   }

   public void a(dac $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean c(dac $$0) {
      return this.a($$0).h;
   }

   public void b(dac $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public azd a() {
      return new azd(this.c, this.d, this.e, this.f);
   }

   public void a(azd $$0) {
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }

   public record a(boolean g, boolean h) {
      public static final azd.a a = new azd.a(false, false);
      public static final MapCodec<azd.a> b = a("isGuiOpen", "isFilteringCraftable");
      public static final MapCodec<azd.a> c = a("isFurnaceGuiOpen", "isFurnaceFilteringCraftable");
      public static final MapCodec<azd.a> d = a("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable");
      public static final MapCodec<azd.a> e = a("isSmokerGuiOpen", "isSmokerFilteringCraftable");
      public static final zm<ByteBuf, azd.a> f = zm.a(zk.b, azd.a::a, zk.b, azd.a::b, azd.a::new);

      @Override
      public String toString() {
         return "[open=" + this.g + ", filtering=" + this.h + "]";
      }

      public azd.a a(boolean $$0) {
         return new azd.a($$0, this.h);
      }

      public azd.a b(boolean $$0) {
         return new azd.a(this.g, $$0);
      }

      private static MapCodec<azd.a> a(String $$0, String $$1) {
         return RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(Codec.BOOL.optionalFieldOf($$0, false).forGetter(azd.a::a), Codec.BOOL.optionalFieldOf($$1, false).forGetter(azd.a::b))
               .apply($$2, azd.a::new)
         );
      }

      public boolean a() {
         return this.g;
      }

      public boolean b() {
         return this.h;
      }
   }
}
