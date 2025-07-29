import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gv {
   public static <T, C, P> bsx<List<T>> a(gv.b<T, C, P> $$0) {
      bsj<List<T>> $$1 = bsj.a("top");
      bsj<Optional<T>> $$2 = bsj.a("type");
      bsj<bdk> $$3 = bsj.a("any_type");
      bsj<T> $$4 = bsj.a("element_type");
      bsj<T> $$5 = bsj.a("tag_type");
      bsj<List<T>> $$6 = bsj.a("conditions");
      bsj<List<T>> $$7 = bsj.a("alternatives");
      bsj<T> $$8 = bsj.a("term");
      bsj<T> $$9 = bsj.a("negation");
      bsj<T> $$10 = bsj.a("test");
      bsj<C> $$11 = bsj.a("component_type");
      bsj<P> $$12 = bsj.a("predicate_type");
      bsj<ame> $$13 = bsj.a("id");
      bsj<Dynamic<?>> $$14 = bsj.a("tag");
      bsn<StringReader> $$15 = new bsn<>();
      bsq<StringReader, ame> $$16 = $$15.a($$13, btc.a);
      bsq<StringReader, List<T>> $$17 = $$15.a($$1, bsv.b(bsv.a($$15.c($$2), btg.a('['), bsv.c(), bsv.a($$15.c($$6)), btg.a(']')), $$15.c($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bsv.b($$15.c($$4), bsv.a(btg.a('#'), bsv.c(), $$15.c($$5)), $$15.c($$3)), $$2x -> Optional.ofNullable($$2x.b($$4, $$5)));
      $$15.a($$3, btg.a('*'), $$0x -> bdk.a);
      $$15.a($$4, new gv.c<>($$16, $$0));
      $$15.a($$5, new gv.e<>($$16, $$0));
      $$15.a($$6, bsv.a($$15.c($$7), bsv.a(bsv.a(btg.a(','), $$15.c($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ag.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bsv.a($$15.c($$8), bsv.a(bsv.a(btg.a('|'), $$15.c($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ag.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bsv.b($$15.c($$10), bsv.a(btg.a('!'), $$15.c($$9))), $$2x -> $$2x.c($$10, $$9));
      $$15.a($$9, $$15.c($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10, bsv.b(bsv.a($$15.c($$11), btg.a('='), bsv.c(), $$15.c($$14)), bsv.a($$15.c($$12), btg.a('~'), bsv.c(), $$15.c($$14)), $$15.c($$11)), $$4x -> {
            bst $$5x = $$4x.a();
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  Dynamic<?> $$7x = $$5x.b($$14);
                  return $$0.b((ImmutableStringReader)$$4x.f(), $$6x, $$7x);
               } else {
                  C $$8x = $$5x.b($$11);
                  Dynamic<?> $$9x = $$5x.a($$14);
                  return $$9x != null ? $$0.a((ImmutableStringReader)$$4x.f(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.f(), $$8x);
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.b().a($$4x.g(), var9x);
               return null;
            }
         }
      );
      $$15.a($$11, new gv.a<>($$16, $$0));
      $$15.a($$12, new gv.d<>($$16, $$0));
      $$15.a($$14, new bth(uw.a));
      return new bsx<>($$15, $$17);
   }

   static class a<T, C, P> extends btd<gv.b<T, C, P>, C> {
      a(bsq<StringReader, ame> $$0, gv.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, ame $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<ame> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, ame var2) throws CommandSyntaxException;

      Stream<ame> a();

      T b(ImmutableStringReader var1, ame var2) throws CommandSyntaxException;

      Stream<ame> b();

      C c(ImmutableStringReader var1, ame var2) throws CommandSyntaxException;

      Stream<ame> c();

      T a(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, ame var2) throws CommandSyntaxException;

      Stream<ame> d();

      T b(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends btd<gv.b<T, C, P>, T> {
      c(bsq<StringReader, ame> $$0, gv.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ame $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<ame> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends btd<gv.b<T, C, P>, P> {
      d(bsq<StringReader, ame> $$0, gv.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, ame $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<ame> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends btd<gv.b<T, C, P>, T> {
      e(bsq<StringReader, ame> $$0, gv.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ame $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<ame> a() {
         return this.a.b();
      }
   }
}
