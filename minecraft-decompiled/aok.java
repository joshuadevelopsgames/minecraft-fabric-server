import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableInt;

public class aok {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("fillbiome").requires(el.a(2)))
            .then(
               el.a("from", gk.a())
                  .then(
                     el.a("to", gk.a())
                        .then(
                           ((RequiredArgumentBuilder)el.a("biome", fl.a($$1, mn.aK))
                                 .executes($$0x -> a((ek)$$0x.getSource(), gk.a($$0x, "from"), gk.a($$0x, "to"), fl.a($$0x, "biome", mn.aK), $$0xx -> true)))
                              .then(
                                 el.b("replace")
                                    .then(
                                       el.a("filter", fp.a($$1, mn.aK))
                                          .executes(
                                             $$0x -> a(
                                                (ek)$$0x.getSource(),
                                                gk.a($$0x, "from"),
                                                gk.a($$0x, "to"),
                                                fl.a($$0x, "biome", mn.aK),
                                                fp.a($$0x, "filter", mn.aK)::test
                                             )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(int $$0) {
      return jw.c(jw.a($$0));
   }

   private static jb a(jb $$0) {
      return new jb(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static doa a(MutableInt $$0, efy $$1, euq $$2, jl<dnx> $$3, Predicate<jl<dnx>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jw.c($$5);
         int $$10 = jw.c($$6);
         int $$11 = jw.c($$7);
         jl<dnx> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(aub $$0, jb $$1, jb $$2, jl<dnx> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {});
   }

   public static Either<Integer, CommandSyntaxException> a(aub $$0, jb $$1, jb $$2, jl<dnx> $$3, Predicate<jl<dnx>> $$4, Consumer<Supplier<xo>> $$5) {
      jb $$6 = a($$1);
      jb $$7 = a($$2);
      euq $$8 = euq.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.P().d(dmq.B);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<efy> $$11 = new ArrayList<>();

         for (int $$12 = ke.a($$8.j()); $$12 <= ke.a($$8.m()); $$12++) {
            for (int $$13 = ke.a($$8.h()); $$13 <= ke.a($$8.k()); $$13++) {
               efy $$14 = $$0.a($$13, $$12, egz.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (efy $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.n().i().b());
            $$16.i();
         }

         $$0.n().a.b($$11);
         $$5.accept(() -> xo.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ek $$0, jb $$1, jb $$2, jl.c<dnx> $$3, Predicate<jl<dnx>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
