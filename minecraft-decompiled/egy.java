import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record egy(ImmutableList<ehc> c) {
   public static final egy a = new egy.a()
      .a(egz.c, $$0 -> $$0)
      .a(egz.d, $$0 -> $$0.a(ehb::b))
      .a(egz.e, $$0 -> $$0.a(egz.d, 8).a(ehb::d))
      .a(egz.f, $$0 -> $$0.a(egz.d, 8).a(ehb::e))
      .a(egz.g, $$0 -> $$0.a(egz.d, 8).a(egz.f, 1).a(0).a(ehb::f))
      .a(egz.h, $$0 -> $$0.a(egz.d, 8).a(egz.f, 1).a(0).a(ehb::g))
      .a(egz.i, $$0 -> $$0.a(egz.d, 8).a(0).a(ehb::h))
      .a(egz.j, $$0 -> $$0.a(egz.d, 8).a(egz.i, 1).a(1).a(ehb::i))
      .a(egz.k, $$0 -> $$0.a(ehb::j))
      .a(egz.l, $$0 -> $$0.a(egz.k, 1).a(ehb::k))
      .a(egz.m, $$0 -> $$0.a(egz.f, 1).a(ehb::l))
      .a(egz.n, $$0 -> $$0.a(ehb::m))
      .a();
   public static final egy b = new egy.a()
      .a(egz.c, $$0 -> $$0)
      .a(egz.d, $$0 -> $$0.a(ehb::c))
      .a(egz.e, $$0 -> $$0)
      .a(egz.f, $$0 -> $$0)
      .a(egz.g, $$0 -> $$0)
      .a(egz.h, $$0 -> $$0)
      .a(egz.i, $$0 -> $$0)
      .a(egz.j, $$0 -> $$0)
      .a(egz.k, $$0 -> $$0.a(ehb::j))
      .a(egz.l, $$0 -> $$0.a(egz.k, 1).a(ehb::k))
      .a(egz.m, $$0 -> $$0)
      .a(egz.n, $$0 -> $$0.a(ehb::m))
      .a();

   public ehc a(egz $$0) {
      return (ehc)this.c.get($$0.b());
   }

   public ImmutableList<ehc> a() {
      return this.c;
   }

   public static class a {
      private final List<ehc> a = new ArrayList<>();

      public egy a() {
         return new egy(ImmutableList.copyOf(this.a));
      }

      public egy.a a(egz $$0, UnaryOperator<ehc.a> $$1) {
         ehc.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new ehc.a($$0);
         } else {
            $$2 = new ehc.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
