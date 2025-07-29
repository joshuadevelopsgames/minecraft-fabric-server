import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class amd<T> {
   private static final ConcurrentMap<amd.a, amd<?>> a = new MapMaker().weakValues().makeMap();
   private final ame b;
   private final ame c;

   public static <T> Codec<amd<T>> a(amd<? extends jy<T>> $$0) {
      return ame.a.xmap($$1 -> a($$0, $$1), amd::a);
   }

   public static <T> zm<ByteBuf, amd<T>> b(amd<? extends jy<T>> $$0) {
      return ame.b.a($$1 -> a($$0, $$1), amd::a);
   }

   public static <T> amd<T> a(amd<? extends jy<T>> $$0, ame $$1) {
      return a($$0.c, $$1);
   }

   public static <T> amd<jy<T>> a(ame $$0) {
      return a(mn.a, $$0);
   }

   private static <T> amd<T> a(ame $$0, ame $$1) {
      return (amd<T>)a.computeIfAbsent(new amd.a($$0, $$1), $$0x -> new amd($$0x.a, $$0x.b));
   }

   private amd(ame $$0, ame $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(amd<? extends jy<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<amd<E>> d(amd<? extends jy<E>> $$0) {
      return this.c($$0) ? Optional.of((amd<E>)this) : Optional.empty();
   }

   public ame a() {
      return this.c;
   }

   public ame b() {
      return this.b;
   }

   public amd<jy<T>> c() {
      return a(this.b);
   }

   record a(ame a, ame b) {
   }
}
