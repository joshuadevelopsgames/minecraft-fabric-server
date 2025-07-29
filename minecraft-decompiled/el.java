import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class el {
   public static final String a = "/";
   private static final ThreadLocal<ho<ek>> g = new ThreadLocal<>();
   private static final Logger h = LogUtils.getLogger();
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   public static final int f = 4;
   private static final adi.e<ek> i = new adi.e<ek>() {
      @Nullable
      @Override
      public ame a(ArgumentCommandNode<ek, ?> $$0) {
         SuggestionProvider<ek> $$1 = $$0.getCustomSuggestions();
         return $$1 != null ? ip.b($$1) : null;
      }

      @Override
      public boolean a(CommandNode<ek> $$0) {
         return $$0.getCommand() != null;
      }

      @Override
      public boolean b(CommandNode<ek> $$0) {
         return $$0.getRequirement() instanceof aph<?> $$1 && $$1.a() > 0;
      }
   };
   private final CommandDispatcher<ek> j = new CommandDispatcher();

   public el(el.a $$0, eg $$1) {
      anm.a(this.j);
      ann.a(this.j, $$1);
      aoi.a(this.j, $$1);
      anr.a(this.j, $$1);
      ant.a(this.j, $$1);
      anu.a(this.j, $$1);
      anv.a(this.j, $$1);
      arc.a(this.j);
      anw.a(this.j, $$1);
      any.a(this.j);
      aoc.a(this.j);
      aod.a(this.j, $$1);
      aoe.a(this.j);
      aof.a(this.j, $$1);
      aog.a(this.j);
      aoh.a(this.j, $$1);
      aoj.a(this.j);
      aol.a(this.j, $$1);
      aok.a(this.j, $$1);
      aom.a(this.j);
      aon.a(this.j);
      aoo.a(this.j);
      aop.a(this.j, $$1);
      aoq.a(this.j, $$1);
      aor.a(this.j);
      aot.a(this.j, $$1);
      aov.a(this.j);
      aow.a(this.j);
      aox.a(this.j);
      aoy.a(this.j, $$1);
      apa.a(this.j, $$1);
      apb.a(this.j);
      apf.a(this.j, $$1);
      api.a(this.j);
      apj.a(this.j);
      apm.a(this.j);
      apo.a(this.j);
      apn.a(this.j);
      app.a(this.j);
      apq.a(this.j);
      apr.a(this.j);
      apv.a(this.j);
      apw.a(this.j);
      apx.a(this.j, $$1);
      apy.a(this.j, $$0 != el.a.c);
      aqu.a(this.j, $$0 != el.a.c);
      aqa.a(this.j, $$1);
      aqc.a(this.j);
      aqd.a(this.j);
      aqf.a(this.j);
      aqg.a(this.j);
      aqi.a(this.j);
      aqj.a(this.j, $$1);
      aqk.a(this.j);
      aql.a(this.j, $$1);
      aqm.a(this.j);
      aqn.a(this.j);
      aqo.a(this.j, $$1);
      ts.a(this.j, $$1);
      aqp.a(this.j);
      aqq.a(this.j);
      aqr.a(this.j, $$1);
      aqt.a(this.j);
      aqw.a(this.j, $$1);
      aqx.a(this.j);
      aqz.a(this.j);
      if (bub.f.d()) {
         aou.a(this.j);
      }

      if (ac.aZ) {
         apl.a(this.j, $$1);
         aob.a(this.j);
         aoa.a(this.j);
         aqv.a(this.j);
         aqe.a(this.j);
         apz.a(this.j);
         if ($$0.e) {
            anz.a(this.j, $$1);
         }
      }

      if ($$0.e) {
         ano.a(this.j);
         anp.a(this.j);
         anq.a(this.j);
         anx.a(this.j);
         apc.a(this.j);
         apd.a(this.j);
         ape.a(this.j);
         apg.a(this.j);
         aps.a(this.j);
         apt.a(this.j);
         apu.a(this.j);
         aqb.a(this.j);
         aqh.a(this.j);
         aqs.a(this.j);
         aqy.a(this.j);
      }

      if ($$0.d) {
         apk.a(this.j);
      }

      this.j.setConsumer(em.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ek $$0, String $$1) {
      $$1 = a($$1);
      this.a(this.j.parse($$1, $$0), $$1);
   }

   public static String a(String $$0) {
      return $$0.startsWith("/") ? $$0.substring(1) : $$0;
   }

   public void a(ParseResults<ek> $$0, String $$1) {
      ek $$2 = (ek)$$0.getContext().getSource();
      bts.a().a(() -> "/" + $$1);
      ContextChain<ek> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> ho.a($$3x, $$1, $$3, $$2, eh.a));
         }
      } catch (Exception var12) {
         yc $$5 = xo.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (h.isDebugEnabled()) {
            h.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(xo.c("command.failed").a($$1x -> $$1x.a(new xu.e($$5))));
         if (ac.aZ) {
            $$2.b(xo.b(ag.c(var12)));
            h.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         bts.a().c();
      }
   }

   @Nullable
   private static ContextChain<ek> a(ParseResults<ek> $$0, String $$1, ek $$2) {
      try {
         a($$0);
         return (ContextChain<ek>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(xr.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            yc $$5 = xo.i().a(o.h).a($$1x -> $$1x.a(new xm.i("/" + $$1)));
            if ($$4 > 10) {
               $$5.b(xn.v);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               xo $$6 = xo.b(var7.getInput().substring($$4)).a(o.m, o.t);
               $$5.b($$6);
            }

            $$5.b(xo.c("command.context.here").a(o.m, o.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ek $$0, Consumer<ho<ek>> $$1) {
      MinecraftServer $$2 = $$0.l();
      ho<ek> $$3 = g.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aL().d(dmq.z));
         int $$6 = $$2.aL().d(dmq.A);

         try (ho<ek> $$7 = new ho<>($$5, $$6, bts.a())) {
            g.set($$7);
            $$1.accept($$7);
            $$7.a();
         } finally {
            g.set(null);
         }
      } else {
         $$1.accept($$3);
      }
   }

   public void a(auc $$0) {
      Map<CommandNode<ek>, CommandNode<ek>> $$1 = new HashMap<>();
      RootCommandNode<ek> $$2 = new RootCommandNode();
      $$1.put(this.j.getRoot(), $$2);
      a(this.j.getRoot(), $$2, $$0.A(), $$1);
      $$0.g.b(new adi($$2, i));
   }

   private static <S> void a(CommandNode<S> $$0, CommandNode<S> $$1, S $$2, Map<CommandNode<S>, CommandNode<S>> $$3) {
      for (CommandNode<S> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<S, ?> $$5 = $$4.createBuilder();
            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<S> $$6 = $$5.build();
            $$3.put($$4, $$6);
            $$1.addChild($$6);
            if (!$$4.getChildren().isEmpty()) {
               a($$4, $$6, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ek> b(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ek, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(el.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ek> a() {
      return this.j;
   }

   public static <S> void a(ParseResults<S> $$0) throws CommandSyntaxException {
      CommandSyntaxException $$1 = b($$0);
      if ($$1 != null) {
         throw $$1;
      }
   }

   @Nullable
   public static <S> CommandSyntaxException b(ParseResults<S> $$0) {
      if (!$$0.getReader().canRead()) {
         return null;
      } else if ($$0.getExceptions().size() == 1) {
         return (CommandSyntaxException)$$0.getExceptions().values().iterator().next();
      } else {
         return $$0.getContext().getRange().isEmpty()
            ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader())
            : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext($$0.getReader());
      }
   }

   public static eg a(final jn.a $$0) {
      return new eg() {
         @Override
         public cyd a() {
            return cyf.e.a();
         }

         @Override
         public Stream<amd<? extends jy<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<jn.b<T>> a(amd<? extends jy<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> jn.b.a<T> a(final jn.b<T> $$0x) {
            return new jn.b.a<T>() {
               @Override
               public jn.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<jp.c<T>> a(bae<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public jp.c<T> b(bae<T> $$0xx) {
                  Optional<jp.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> jp.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      eg $$0 = a(pc.a());
      CommandDispatcher<ek> $$1 = new el(el.a.a, $$0).a();
      RootCommandNode<ek> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> h.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = im.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !il.a($$0x.getClass())).collect(Collectors.toSet());
      if (!$$4.isEmpty()) {
         h.warn("Missing type registration for following arguments:\n {}", $$4.stream().map($$0x -> "\t" + $$0x).collect(Collectors.joining(",\n")));
         throw new IllegalStateException("Unregistered argument types");
      }
   }

   public static <T extends ep> aph<T> a(int $$0) {
      return new ep.a<>($$0);
   }

   public static enum a {
      a(true, true),
      b(false, true),
      c(true, false);

      final boolean d;
      final boolean e;

      private a(final boolean $$0, final boolean $$1) {
         this.d = $$0;
         this.e = $$1;
      }
   }

   @FunctionalInterface
   public interface b {
      void parse(StringReader var1) throws CommandSyntaxException;
   }
}
