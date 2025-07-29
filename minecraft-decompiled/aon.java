import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import javax.annotation.Nullable;

public class aon {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ek> b = ($$0, $$1) -> {
      amt $$2 = ((ek)$$0.getSource()).l().aE();
      eq.a($$2.e(), $$1, "#");
      return eq.a($$2.d(), $$1);
   };
   static final aon.b<ek> e = new aon.b<ek>() {
      public void a(ek $$0, ame $$1, int $$2) {
         $$0.a(() -> xo.a("commands.function.result", xo.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralArgumentBuilder<ek> $$1 = el.b("with");

      for (arc.c $$2 : arc.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new aon.c() {
            @Override
            protected ui a(CommandContext<ek> $$0) throws CommandSyntaxException {
               return $$2.a($$0).a();
            }
         }).then(el.a("path", fe.a()).executes(new aon.c() {
            @Override
            protected ui a(CommandContext<ek> $$0) throws CommandSyntaxException {
               return aon.a(fe.a($$0, "path"), $$2.a($$0));
            }
         })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("function").requires(el.a(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("name", gw.a()).suggests(b).executes(new aon.c() {
               @Nullable
               @Override
               protected ui a(CommandContext<ek> $$0) {
                  return null;
               }
            })).then(el.a("arguments", ev.a()).executes(new aon.c() {
               @Override
               protected ui a(CommandContext<ek> $$0) {
                  return ev.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static ui a(fe.g $$0, arb $$1) throws CommandSyntaxException {
      vi $$2 = arc.a($$0, $$1);
      if ($$2 instanceof ui $$3) {
         return $$3;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ek a(ek $$0) {
      return $$0.a().b(2);
   }

   public static <T extends em<T>> void a(Collection<ib<T>> $$0, @Nullable ui $$1, T $$2, T $$3, hp<T> $$4, aon.b<T> $$5, hj $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends em<T>> void a(@Nullable ui $$0, hp<T> $$1, CommandDispatcher<T> $$2, T $$3, ib<T> $$4, ame $$5, eh $$6, boolean $$7) throws CommandSyntaxException {
      try {
         id<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hv<>($$8, $$6, $$7).bind($$3));
      } catch (en var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends em<T>> eh a(T $$0, aon.b<T> $$1, ame $$2, eh $$3) {
      return $$0.x() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends em<T>> void a(Collection<ib<T>> $$0, @Nullable ui $$1, T $$2, T $$3, hp<T> $$4, aon.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      eh $$8 = eh.chain($$2.p(), $$4.b().d());

      for (ib<T> $$9 : $$0) {
         ame $$10 = $$9.a();
         eh $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(hy.a());
   }

   private static <T extends em<T>> void b(Collection<ib<T>> $$0, @Nullable ui $$1, T $$2, T $$3, hp<T> $$4, aon.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      eh $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ib<T> $$9 = $$0.iterator().next();
            ame $$10 = $$9.a();
            eh $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == eh.a) {
            for (ib<T> $$12 : $$0) {
               ame $$13 = $$12.a();
               eh $$14 = a($$2, $$5, $$13, $$8);
               a($$1, $$4, $$6, $$7, $$12, $$13, $$14, false);
            }
         } else {
            class a {
               boolean a;
               int b;

               public void a(int $$0) {
                  this.a = true;
                  this.b += $$0;
               }
            }

            a $$15 = new a();
            eh $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ib<T> $$17 : $$0) {
               ame $$18 = $$17.a();
               eh $$19 = a($$2, $$5, $$18, $$16);
               a($$1, $$4, $$6, $$7, $$17, $$18, $$19, false);
            }

            $$4.a(($$2x, $$3x) -> {
               if ($$15.a) {
                  $$8.onSuccess($$15.b);
               }
            });
         }
      }
   }

   public interface b<T> {
      void a(T var1, ame var2, int var3);
   }

   abstract static class c extends hl.b<ek> implements hl.a<ek> {
      @Nullable
      protected abstract ui a(CommandContext<ek> var1) throws CommandSyntaxException;

      public void a(ek $$0, ContextChain<ek> $$1, hj $$2, hp<ek> $$3) throws CommandSyntaxException {
         CommandContext<ek> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<ame, Collection<ib<ek>>> $$5 = gw.c($$4, "name");
         Collection<ib<ek>> $$6 = (Collection<ib<ek>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw aon.d.create(xo.a((ame)$$5.getFirst()));
         } else {
            ui $$7 = this.a($$4);
            ek $$8 = aon.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> xo.a("commands.function.scheduled.single", xo.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> xo.a("commands.function.scheduled.multiple", xr.b($$6.stream().map(ib::a).toList(), xo::a)), true);
            }

            aon.a($$6, $$7, $$0, $$8, $$3, aon.e, $$2);
         }
      }
   }
}
