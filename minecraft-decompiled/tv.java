import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tv implements tx, ty {
   static final tx a = Stream::empty;
   static final ty b = Stream::empty;
   private final tx c;
   private final ty d;
   private final ek e;

   @Override
   public Stream<jb> findTestPos() {
      return this.d.findTestPos();
   }

   public static tv.a a() {
      return new tv.a();
   }

   tv(ek $$0, tx $$1, ty $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ek b() {
      return this.e;
   }

   @Override
   public Stream<jl.c<ta>> findTests() {
      return this.c.findTests();
   }

   public static class a {
      private final UnaryOperator<Supplier<Stream<jl.c<ta>>>> a;
      private final UnaryOperator<Supplier<Stream<jb>>> b;

      public a() {
         this.a = $$0 -> $$0;
         this.b = $$0 -> $$0;
      }

      private a(UnaryOperator<Supplier<Stream<jl.c<ta>>>> $$0, UnaryOperator<Supplier<Stream<jb>>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public tv.a a(int $$0) {
         return new tv.a(b($$0), b($$0));
      }

      private static <Q> UnaryOperator<Supplier<Stream<Q>>> b(int $$0) {
         return $$1 -> {
            List<Q> $$2 = new LinkedList<>();
            List<Q> $$3 = ((Stream)$$1.get()).toList();

            for (int $$4 = 0; $$4 < $$0; $$4++) {
               $$2.addAll($$3);
            }

            return $$2::stream;
         };
      }

      private tv a(ek $$0, tx $$1, ty $$2) {
         return new tv($$0, this.a.apply($$1::findTests)::get, this.b.apply($$2::findTestPos)::get);
      }

      public tv a(CommandContext<ek> $$0, int $$1) {
         ek $$2 = (ek)$$0.getSource();
         jb $$3 = jb.a((jv)$$2.d());
         return this.a($$2, tv.a, () -> tr.c($$3, $$1, $$2.e()));
      }

      public tv a(CommandContext<ek> $$0) {
         ek $$1 = (ek)$$0.getSource();
         jb $$2 = jb.a((jv)$$1.d());
         return this.a($$1, tv.a, () -> tr.b($$2, 15, $$1.e()).stream());
      }

      public tv b(CommandContext<ek> $$0) {
         ek $$1 = (ek)$$0.getSource();
         jb $$2 = jb.a((jv)$$1.d());
         return this.a($$1, tv.a, () -> tr.c($$2, 200, $$1.e()));
      }

      public tv c(CommandContext<ek> $$0) {
         ek $$1 = (ek)$$0.getSource();
         return this.a($$1, tv.a, () -> tr.a(jb.a((jv)$$1.d()), $$1.i().L(), $$1.e()));
      }

      public tv a(CommandContext<ek> $$0, boolean $$1) {
         return this.a((ek)$$0.getSource(), () -> so.a().filter($$1x -> !$$1 || ((ta)$$1x.a()).h()), tv.b);
      }

      public tv a(CommandContext<ek> $$0, Collection<jl.c<ta>> $$1) {
         return this.a((ek)$$0.getSource(), $$1::stream, tv.b);
      }

      public tv d(CommandContext<ek> $$0) {
         return this.a($$0, false);
      }
   }
}
