import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class aab<T extends ws, B extends ByteBuf, C> {
   final we a;
   final zx b;
   private final List<aab.a<T, ?, B, C>> c = new ArrayList<>();
   @Nullable
   private zu d;

   public aab(we $$0, zx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zw<? super T>> aab<T, B, C> a(zy<P> $$0, zm<? super B, P> $$1) {
      this.c.add(new aab.a<>($$0, $$1, null));
      return this;
   }

   public <P extends zw<? super T>> aab<T, B, C> a(zy<P> $$0, zm<? super B, P> $$1, zv<B, P, C> $$2) {
      this.c.add(new aab.a<>($$0, $$1, $$2));
      return this;
   }

   public <P extends zt<? super T>, D extends zs<? super T>> aab<T, B, C> a(zy<P> $$0, Function<Iterable<zw<? super T>>, P> $$1, D $$2) {
      zm<ByteBuf, D> $$3 = zm.a($$2);
      zy<D> $$4 = (zy<D>)$$2.a();
      this.c.add(new aab.a<>($$4, $$3, null));
      this.d = zu.a($$0, $$1, $$2);
      return this;
   }

   zm<ByteBuf, zw<? super T>> a(Function<ByteBuf, B> $$0, List<aab.a<T, ?, B, C>> $$1, C $$2) {
      aaa<ByteBuf, T> $$3 = new aaa<>(this.b);

      for (aab.a<T, ?, B, C> $$4 : $$1) {
         $$4.a($$3, $$0, $$2);
      }

      return $$3.a();
   }

   private static wu.a a(final we $$0, final zx $$1, final List<? extends aab.a<?, ?, ?, ?>> $$2) {
      return new wu.a() {
         @Override
         public we a() {
            return $$0;
         }

         @Override
         public zx b() {
            return $$1;
         }

         @Override
         public void a(wu.a.a $$0x) {
            for (int $$1x = 0; $$1x < $$2.size(); $$1x++) {
               aab.a<?, ?, ?, ?> $$2x = (aab.a<?, ?, ?, ?>)$$2.get($$1x);
               $$0.accept($$2x.a, $$1x);
            }
         }
      };
   }

   public aac<T, B> a(final C $$0) {
      final List<aab.a<T, ?, B, C>> $$1 = List.copyOf(this.c);
      final zu $$2 = this.d;
      final wu.a $$3 = a(this.a, this.b, $$1);
      return new aac<T, B>() {
         @Override
         public wu<T> a(Function<ByteBuf, B> $$0x) {
            return new aab.b<>(aab.this.a, aab.this.b, aab.this.a($$0, $$1, $$0), $$2);
         }

         @Override
         public wu.a a() {
            return $$3;
         }
      };
   }

   public aad<T, B, C> a() {
      final List<aab.a<T, ?, B, C>> $$0 = List.copyOf(this.c);
      final zu $$1 = this.d;
      final wu.a $$2 = a(this.a, this.b, $$0);
      return new aad<T, B, C>() {
         @Override
         public wu<T> a(Function<ByteBuf, B> $$0x, C $$1x) {
            return new aab.b<>(aab.this.a, aab.this.b, aab.this.a($$0, $$0, $$1), $$1);
         }

         @Override
         public wu.a a() {
            return $$2;
         }
      };
   }

   private static <L extends ws, B extends ByteBuf> aac<L, B> a(we $$0, zx $$1, Consumer<aab<L, B, bdk>> $$2) {
      aab<L, B, bdk> $$3 = new aab<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(bdk.a);
   }

   public static <T extends wy, B extends ByteBuf> aac<T, B> a(we $$0, Consumer<aab<T, B, bdk>> $$1) {
      return a($$0, zx.a, $$1);
   }

   public static <T extends wa, B extends ByteBuf> aac<T, B> b(we $$0, Consumer<aab<T, B, bdk>> $$1) {
      return a($$0, zx.b, $$1);
   }

   private static <L extends ws, B extends ByteBuf, C> aad<L, B, C> b(we $$0, zx $$1, Consumer<aab<L, B, C>> $$2) {
      aab<L, B, C> $$3 = new aab<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wy, B extends ByteBuf, C> aad<T, B, C> c(we $$0, Consumer<aab<T, B, C>> $$1) {
      return b($$0, zx.a, $$1);
   }

   public static <T extends wa, B extends ByteBuf, C> aad<T, B, C> d(we $$0, Consumer<aab<T, B, C>> $$1) {
      return b($$0, zx.b, $$1);
   }

   record a<T extends ws, P extends zw<? super T>, B extends ByteBuf, C>(zy<P> a, zm<? super B, P> b, @Nullable zv<B, P, C> c) {

      public void a(aaa<ByteBuf, T> $$0, Function<ByteBuf, B> $$1, C $$2) {
         zm<? super B, P> $$3;
         if (this.c != null) {
            $$3 = this.c.apply(this.b, $$2);
         } else {
            $$3 = this.b;
         }

         zm<ByteBuf, P> $$5 = $$3.b($$1);
         $$0.a(this.a, $$5);
      }
   }

   record b<L extends ws>(we a, zx b, zm<ByteBuf, zw<? super L>> c, @Nullable zu d) implements wu<L> {
   }
}
