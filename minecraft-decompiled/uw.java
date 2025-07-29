import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class uw implements DynamicOps<vi> {
   public static final uw a = new uw();

   private uw() {
   }

   public vi a() {
      return uk.b;
   }

   public <U> U a(DynamicOps<U> $$0, vi $$1) {
      return (U)(switch ($$1) {
         case uk $$2 -> (Object)$$0.empty();
         case ug var6 -> {
            ug var53 = var6;

            try {
               var54 = var53.n();
            } catch (Throwable var33) {
               throw new MatchException(var33.toString(), var33);
            }

            byte var34 = var54;
            yield $$0.createByte(var34);
         }
         case vb var8 -> {
            vb var51 = var8;

            try {
               var52 = var51.n();
            } catch (Throwable var32) {
               throw new MatchException(var32.toString(), var32);
            }

            short var35 = var52;
            yield $$0.createShort(var35);
         }
         case un var10 -> {
            un var49 = var10;

            try {
               var50 = var49.n();
            } catch (Throwable var31) {
               throw new MatchException(var31.toString(), var31);
            }

            int var36 = var50;
            yield $$0.createInt(var36);
         }
         case uq var12 -> {
            uq var47 = var12;

            try {
               var48 = var47.n();
            } catch (Throwable var30) {
               throw new MatchException(var30.toString(), var30);
            }

            long var37 = var48;
            yield $$0.createLong(var37);
         }
         case ul var15 -> {
            ul var45 = var15;

            try {
               var46 = var45.n();
            } catch (Throwable var29) {
               throw new MatchException(var29.toString(), var29);
            }

            float var38 = var46;
            yield $$0.createFloat(var38);
         }
         case uj var17 -> {
            uj var43 = var17;

            try {
               var44 = var43.n();
            } catch (Throwable var28) {
               throw new MatchException(var28.toString(), var28);
            }

            double var39 = var44;
            yield $$0.createDouble(var39);
         }
         case uf $$9 -> (Object)$$0.createByteList(ByteBuffer.wrap($$9.e()));
         case vg var21 -> {
            vg var41 = var21;

            try {
               var42 = var41.k();
            } catch (Throwable var27) {
               throw new MatchException(var27.toString(), var27);
            }

            String var40 = var42;
            yield $$0.createString(var40);
         }
         case uo $$11 -> (Object)this.convertList($$0, $$11);
         case ui $$12 -> (Object)this.convertMap($$0, $$12);
         case um $$13 -> (Object)$$0.createIntList(Arrays.stream($$13.g()));
         case up $$14 -> (Object)$$0.createLongList(Arrays.stream($$14.g()));
         default -> throw new MatchException(null, null);
      });
   }

   public DataResult<Number> a(vi $$0) {
      return $$0.o().<DataResult<Number>>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Not a number"));
   }

   public vi a(Number $$0) {
      return uj.a($$0.doubleValue());
   }

   public vi a(byte $$0) {
      return ug.a($$0);
   }

   public vi a(short $$0) {
      return vb.a($$0);
   }

   public vi a(int $$0) {
      return un.a($$0);
   }

   public vi a(long $$0) {
      return uq.a($$0);
   }

   public vi a(float $$0) {
      return ul.a($$0);
   }

   public vi a(double $$0) {
      return uj.a($$0);
   }

   public vi a(boolean $$0) {
      return ug.a($$0);
   }

   public DataResult<String> b(vi $$0) {
      if ($$0 instanceof vg var2) {
         vg var10000 = var2;

         try {
            var6 = var10000.k();
         } catch (Throwable var5) {
            throw new MatchException(var5.toString(), var5);
         }

         String var4 = var6;
         return DataResult.success(var4);
      } else {
         return DataResult.error(() -> "Not a string");
      }
   }

   public vi a(String $$0) {
      return vg.a($$0);
   }

   public DataResult<vi> a(vi $$0, vi $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vi> a(vi $$0, List<vi> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vi> a(vi $$0, vi $$1, vi $$2) {
      if (!($$0 instanceof ui) && !($$0 instanceof uk)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if ($$1 instanceof vg $$6) {
         vg var10000 = $$6;

         try {
            var10 = var10000.k();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         String $$5 = var10;
         ui $$6x = $$0 instanceof ui $$5x ? $$5x.k() : new ui();
         $$6x.a($$5, $$2);
         return DataResult.success($$6x);
      } else {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      }
   }

   public DataResult<vi> a(vi $$0, MapLike<vi> $$1) {
      if (!($$0 instanceof ui) && !($$0 instanceof uk)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ui $$3 = $$0 instanceof ui $$2 ? $$2.k() : new ui();
         List<vi> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vi $$3x = (vi)$$2x.getFirst();
            if ($$3x instanceof vg $$4x) {
               vg var10000 = $$4x;

               try {
                  var8 = var10000.k();
               } catch (Throwable var7) {
                  throw new MatchException(var7.toString(), var7);
               }

               String $$5 = var8;
               $$3.a($$5, (vi)$$2x.getSecond());
            } else {
               $$4.add($$3x);
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vi> a(vi $$0, Map<vi, vi> $$1) {
      if (!($$0 instanceof ui) && !($$0 instanceof uk)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ui $$3 = $$0 instanceof ui $$2 ? $$2.k() : new ui();
         List<vi> $$4 = new ArrayList<>();

         for (Entry<vi, vi> $$5 : $$1.entrySet()) {
            vi $$6 = $$5.getKey();
            if ($$6 instanceof vg var8) {
               vg var13 = var8;

               try {
                  var14 = var13.k();
               } catch (Throwable var11) {
                  throw new MatchException(var11.toString(), var11);
               }

               String var10 = var14;
               $$3.a(var10, $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vi, vi>>> c(vi $$0) {
      return $$0 instanceof ui $$1
         ? DataResult.success($$1.g().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vi)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vi, vi>>> d(vi $$0) {
      return $$0 instanceof ui $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vi> $$2 : $$1.g()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vi>> e(vi $$0) {
      return $$0 instanceof ui $$1 ? DataResult.success(new MapLike<vi>() {
         @Nullable
         public vi a(vi $$0) {
            if ($$0 instanceof vg var2) {
               vg var10000 = var2;

               try {
                  var6 = var10000.k();
               } catch (Throwable var5) {
                  throw new MatchException(var5.toString(), var5);
               }

               String var4 = var6;
               return $$1.a(var4);
            } else {
               throw new UnsupportedOperationException("Cannot get map entry with non-string key: " + $$0);
            }
         }

         @Nullable
         public vi a(String $$0) {
            return $$1.a($$0);
         }

         public Stream<Pair<vi, vi>> entries() {
            return $$1.g().stream().map($$0x -> Pair.of(uw.this.a($$0x.getKey()), $$0x.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vi a(Stream<Pair<vi, vi>> $$0) {
      ui $$1 = new ui();
      $$0.forEach($$1x -> {
         vi $$2 = (vi)$$1x.getFirst();
         vi $$3 = (vi)$$1x.getSecond();
         if ($$2 instanceof vg $$4) {
            vg var10000 = $$4;

            try {
               var8 = var10000.k();
            } catch (Throwable var7) {
               throw new MatchException(var7.toString(), var7);
            }

            String $$5 = var8;
            $$1.a($$5, $$3);
         } else {
            throw new UnsupportedOperationException("Cannot create map with non-string key: " + $$2);
         }
      });
      return $$1;
   }

   public DataResult<Stream<vi>> f(vi $$0) {
      return $$0 instanceof uh $$1 ? DataResult.success($$1.stream()) : DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<vi>>> g(vi $$0) {
      return $$0 instanceof uh $$1 ? DataResult.success($$1::forEach) : DataResult.error(() -> "Not a list: " + $$0);
   }

   public DataResult<ByteBuffer> h(vi $$0) {
      return $$0 instanceof uf $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vi a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new uf($$2);
   }

   public DataResult<IntStream> i(vi $$0) {
      return $$0 instanceof um $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vi a(IntStream $$0) {
      return new um($$0.toArray());
   }

   public DataResult<LongStream> j(vi $$0) {
      return $$0 instanceof up $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vi a(LongStream $$0) {
      return new up($$0.toArray());
   }

   public vi b(Stream<vi> $$0) {
      return new uo($$0.collect(ag.b()));
   }

   public vi a(vi $$0, String $$1) {
      if ($$0 instanceof ui $$2) {
         ui $$3 = $$2.k();
         $$3.r($$1);
         return $$3;
      } else {
         return $$0;
      }
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public RecordBuilder<vi> mapBuilder() {
      return new uw.f();
   }

   private static Optional<uw.d> k(vi $$0) {
      if ($$0 instanceof uk) {
         return Optional.of(new uw.b());
      } else if ($$0 instanceof uh $$1) {
         if ($$1.isEmpty()) {
            return Optional.of(new uw.b());
         } else {
            return switch ($$1) {
               case uo $$2 -> Optional.of(new uw.b($$2));
               case uf $$3 -> Optional.of(new uw.a($$3.e()));
               case um $$4 -> Optional.of(new uw.c($$4.g()));
               case up $$5 -> Optional.of(new uw.e($$5.g()));
               default -> throw new MatchException(null, null);
            };
         }
      } else {
         return Optional.empty();
      }
   }

   static class a implements uw.d {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uw.d a(vi $$0) {
         if ($$0 instanceof ug $$1) {
            this.a.add($$1.j());
            return this;
         } else {
            return new uw.b(this.a).a($$0);
         }
      }

      @Override
      public vi a() {
         return new uf(this.a.toByteArray());
      }
   }

   static class b implements uw.d {
      private final uo a = new uo();

      b() {
      }

      b(uo $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(un.a($$0x)));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(ug.a($$0x)));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(uq.a($$0x)));
      }

      @Override
      public uw.d a(vi $$0) {
         this.a.add($$0);
         return this;
      }

      @Override
      public vi a() {
         return this.a;
      }
   }

   static class c implements uw.d {
      private final IntArrayList a = new IntArrayList();

      public c(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uw.d a(vi $$0) {
         if ($$0 instanceof un $$1) {
            this.a.add($$1.h());
            return this;
         } else {
            return new uw.b(this.a).a($$0);
         }
      }

      @Override
      public vi a() {
         return new um(this.a.toIntArray());
      }
   }

   interface d {
      uw.d a(vi var1);

      default uw.d a(Iterable<vi> $$0) {
         uw.d $$1 = this;

         for (vi $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default uw.d a(Stream<vi> $$0) {
         return this.a($$0::iterator);
      }

      vi a();
   }

   static class e implements uw.d {
      private final LongArrayList a = new LongArrayList();

      public e(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uw.d a(vi $$0) {
         if ($$0 instanceof uq $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new uw.b(this.a).a($$0);
         }
      }

      @Override
      public vi a() {
         return new up(this.a.toLongArray());
      }
   }

   class f extends AbstractStringBuilder<vi, ui> {
      protected f() {
         super(uw.this);
      }

      protected ui a() {
         return new ui();
      }

      protected ui a(String $$0, vi $$1, ui $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vi> a(ui $$0, vi $$1) {
         if ($$1 == null || $$1 == uk.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ui $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ui $$3 = $$2.k();

            for (Entry<String, vi> $$4 : $$0.g()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
