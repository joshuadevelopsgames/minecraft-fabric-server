import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hol<T> implements hoe {
   private final hqg<T> a;
   private final hol.a<T> b;

   public hol(hqg<T> $$0, hol.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hoe $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hoe get(@Nullable T var1, @Nullable grk var2);
   }

   public record b<T>(List<T> a, hoe.b b) {

      public static <T> Codec<hol.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(bbi.b(bbi.a($$0)).fieldOf("when").forGetter(hol.b::a), hog.a.fieldOf("model").forGetter(hol.b::b)).apply($$1, hol.b::new)
         );
      }
   }

   public record c(hol.d<?, ?> b, Optional<hoe.b> c) implements hoe.b {
      public static final MapCodec<hol.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hol.d.a.forGetter(hol.c::b), hog.a.optionalFieldOf("fallback").forGetter(hol.c::c)).apply($$0, hol.c::new)
      );

      @Override
      public MapCodec<hol.c> a() {
         return a;
      }

      @Override
      public hoe a(hoe.a $$0) {
         hoe $$1 = this.c.<hoe>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(huk.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public record d<P extends hqg<T>, T>(P b, List<hol.b<T>> c) {
      public static final MapCodec<hol.d<?, ?>> a = hqf.a.dispatchMap("property", $$0 -> $$0.a().a(), hqg.a::a);

      public hoe a(hoe.a $$0, hoe $$1) {
         Object2ObjectMap<T, hoe> $$2 = new Object2ObjectOpenHashMap();

         for (hol.b<T> $$3 : this.c) {
            hoe.b $$4 = $$3.b;
            hoe $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hol<>(this.b, this.a($$2, $$0.d()));
      }

      private hol.a<T> a(Object2ObjectMap<T, hoe> $$0, @Nullable bcl $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hoe)$$0.get($$1x);
         } else {
            hoe $$2 = (hoe)$$0.defaultReturnValue();
            grd<grk, Object2ObjectMap<T, hoe>> $$3 = new grd<>($$3x -> {
               Object2ObjectMap<T, hoe> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.K_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hoe)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hoe)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(huk.a $$0) {
         for (hol.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hol.b<T>> b() {
         return this.c;
      }
   }
}
