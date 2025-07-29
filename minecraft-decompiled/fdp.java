import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

public class fdp {
   private final bci a;
   private final bdo b;
   private final Optional<jm.a> c;
   private final Set<amd<?>> d;

   public fdp(bci $$0, bdo $$1, jm.a $$2) {
      this($$0, $$1, Optional.of($$2), Set.of());
   }

   public fdp(bci $$0, bdo $$1) {
      this($$0, $$1, Optional.empty(), Set.of());
   }

   private fdp(bci $$0, bdo $$1, Optional<jm.a> $$2, Set<amd<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public fdp a(bci.f $$0) {
      return new fdp(this.a.a($$0), this.b, this.c, this.d);
   }

   public fdp a(bci.f $$0, amd<?> $$1) {
      Set<amd<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new fdp(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(amd<?> $$0) {
      return this.d.contains($$0);
   }

   public void a(bci.g $$0) {
      this.a.a($$0);
   }

   public void a(fdk $$0) {
      Set<bdn<?>> $$1 = $$0.a();
      Set<bdn<?>> $$2 = Sets.difference($$1, this.b.b());
      if (!$$2.isEmpty()) {
         this.a.a(new fdp.b($$2));
      }
   }

   public jm.a a() {
      return this.c.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public boolean b() {
      return this.c.isPresent();
   }

   public fdp a(bdo $$0) {
      return new fdp(this.a, $$0, this.c, this.d);
   }

   public bci c() {
      return this.a;
   }

   public record a(amd<?> a) implements bci.g {
      @Override
      public String a() {
         return "Missing element " + this.a.a() + " of type " + this.a.b();
      }

      public amd<?> b() {
         return this.a;
      }
   }

   public record b(Set<bdn<?>> a) implements bci.g {
      @Override
      public String a() {
         return "Parameters " + this.a + " are not provided in this context";
      }

      public Set<bdn<?>> b() {
         return this.a;
      }
   }

   public record c(amd<?> a) implements bci.g {
      @Override
      public String a() {
         return this.a.a() + " of type " + this.a.b() + " is recursively called";
      }

      public amd<?> b() {
         return this.a;
      }
   }

   public record d(amd<?> a) implements bci.g {
      @Override
      public String a() {
         return "Reference to " + this.a.a() + " of type " + this.a.b() + " was used, but references are not allowed";
      }

      public amd<?> b() {
         return this.a;
      }
   }
}
