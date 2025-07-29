import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface djt {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static djt.a a(djz... $$0) {
      return new djt.a(List.of($$0));
   }

   static djt.b a(dka... $$0) {
      return new djt.b(List.of($$0));
   }

   static djt.c a(dkb... $$0) {
      return new djt.c(List.of($$0));
   }

   public record a(List<djz> d) implements djz {
      public static final MapCodec<djt.a> a = djt.a(djz.b, djt.a::new, djt.a::b);

      @Override
      public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
         for (djz $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<djt.a> a() {
         return a;
      }

      public List<djz> b() {
         return this.d;
      }
   }

   public record b(List<dka> b) implements dka {
      public static final MapCodec<djt.b> a = djt.a(dka.c, djt.b::new, djt.b::b);

      @Override
      public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4, boolean $$5) {
         for (dka $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(djh $$0, bzm $$1, fis $$2, int $$3) {
         for (dka $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<djt.b> a() {
         return a;
      }
   }

   public record c(List<dkb> c) implements dkb {
      public static final MapCodec<djt.c> a = djt.a(dkb.b, djt.c::new, djt.c::b);

      @Override
      public float a(int $$0, bck $$1, float $$2) {
         for (dkb $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<djt.c> a() {
         return a;
      }

      public List<dkb> b() {
         return this.c;
      }
   }
}
