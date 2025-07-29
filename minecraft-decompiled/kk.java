import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kk implements Predicate<kl> {
   public static final Codec<kk> a = kp.d
      .xmap(
         $$0 -> new kk($$0.entrySet().stream().map(ks::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(ks::a, ks::b))
      );
   public static final zm<wx, kk> b = ks.a.a(zk.a()).a(kk::new, $$0 -> $$0.d);
   public static final kk c = new kk(List.of());
   private final List<ks<?>> d;

   kk(List<ks<?>> $$0) {
      this.d = $$0;
   }

   public static kk.a a() {
      return new kk.a();
   }

   public static <T> kk a(kp<T> $$0, T $$1) {
      return new kk(List.of(new ks<>($$0, $$1)));
   }

   public static kk a(kn $$0) {
      return new kk(ImmutableList.copyOf($$0));
   }

   public static kk a(kn $$0, kp<?>... $$1) {
      kk.a $$2 = new kk.a();

      for (kp<?> $$3 : $$1) {
         ks<?> $$4 = $$0.b($$3);
         if ($$4 != null) {
            $$2.a($$4);
         }
      }

      return $$2.a();
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof kk $$1 && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   @Override
   public String toString() {
      return this.d.toString();
   }

   public boolean a(kl $$0) {
      for (ks<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public ko d() {
      ko.a $$0 = ko.a();

      for (ks<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<ks<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kk.a a(ks<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public <T> kk.a a(kp<? super T> $$0, T $$1) {
         for (ks<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new ks<>($$0, $$1));
         return this;
      }

      public kk a() {
         return new kk(List.copyOf(this.a));
      }
   }
}
