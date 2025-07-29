import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Locale;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class any {
   static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.debug.alreadyRunning"));
   static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.debug.function.noRecursion"));
   static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.debug.function.noReturnRun"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("debug").requires(el.a(3)))
                  .then(el.b("start").executes($$0x -> a((ek)$$0x.getSource()))))
               .then(el.b("stop").executes($$0x -> b((ek)$$0x.getSource()))))
            .then(((LiteralArgumentBuilder)el.b("function").requires(el.a(3))).then(el.a("name", gw.a()).suggests(aon.b).executes(new any.a())))
      );
   }

   private static int a(ek $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.bg()) {
         throw c.create();
      } else {
         $$1.bh();
         $$0.a(() -> xo.c("commands.debug.started"), true);
         return 0;
      }
   }

   private static int b(ek $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.bg()) {
         throw b.create();
      } else {
         btr $$2 = $$1.bi();
         double $$3 = (double)$$2.g() / bdg.a;
         double $$4 = $$2.f() / $$3;
         $$0.a(() -> xo.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2.f(), String.format(Locale.ROOT, "%.2f", $$4)), true);
         return (int)$$4;
      }
   }

   static class a extends hl.b<ek> implements hl.a<ek> {
      public void a(ek $$0, ContextChain<ek> $$1, hj $$2, hp<ek> $$3) throws CommandSyntaxException {
         if ($$2.c()) {
            throw any.e.create();
         } else if ($$3.a() != null) {
            throw any.d.create();
         } else {
            CommandContext<ek> $$4 = $$1.getTopContext();
            Collection<ib<ek>> $$5 = gw.a($$4, "name");
            MinecraftServer $$6 = $$0.l();
            String $$7 = "debug-trace-" + ag.f() + ".txt";
            CommandDispatcher<ek> $$8 = $$0.l().aE().a();
            int $$9 = 0;

            try {
               Path $$10 = $$6.c("debug");
               Files.createDirectories($$10);
               final PrintWriter $$11 = new PrintWriter(Files.newBufferedWriter($$10.resolve($$7), StandardCharsets.UTF_8));
               any.b $$12 = new any.b($$11);
               $$3.a($$12);

               for (final ib<ek> $$13 : $$5) {
                  try {
                     ek $$14 = $$0.a($$12).b(2);
                     id<ek> $$15 = $$13.a(null, $$8);
                     $$3.a((new hv<ek>($$15, eh.a, false) {
                        public void a(ek $$0, ho<ek> $$1x, hq $$2x) {
                           $$11.println($$13.a());
                           super.a($$0, $$1x, $$2x);
                        }
                     }).bind($$14));
                     $$9 += $$15.b().size();
                  } catch (en var18) {
                     $$0.b(var18.a());
                  }
               }
            } catch (IOException | UncheckedIOException var19) {
               any.a.warn("Tracing failed", var19);
               $$0.b(xo.c("commands.debug.function.traceFailed"));
            }

            int $$18 = $$9;
            $$3.a(($$4x, $$5x) -> {
               if ($$5.size() == 1) {
                  $$0.a(() -> xo.a("commands.debug.function.success.single", $$18, xo.a($$5.iterator().next().a()), $$7), true);
               } else {
                  $$0.a(() -> xo.a("commands.debug.function.success.multiple", $$18, $$5.size(), $$7), true);
               }
            });
         }
      }
   }

   static class b implements ej, hr {
      public static final int b = 1;
      private final PrintWriter c;
      private int d;
      private boolean e;

      b(PrintWriter $$0) {
         this.c = $$0;
      }

      private void a(int $$0) {
         this.b($$0);
         this.d = $$0;
      }

      private void b(int $$0) {
         for (int $$1 = 0; $$1 < $$0 + 1; $$1++) {
            this.c.write("    ");
         }
      }

      private void e() {
         if (this.e) {
            this.c.println();
            this.e = false;
         }
      }

      @Override
      public void a(int $$0, String $$1) {
         this.e();
         this.a($$0);
         this.c.print("[C] ");
         this.c.print($$1);
         this.e = true;
      }

      @Override
      public void a(int $$0, String $$1, int $$2) {
         if (this.e) {
            this.c.print(" -> ");
            this.c.println($$2);
            this.e = false;
         } else {
            this.a($$0);
            this.c.print("[R = ");
            this.c.print($$2);
            this.c.print("] ");
            this.c.println($$1);
         }
      }

      @Override
      public void a(int $$0, ame $$1, int $$2) {
         this.e();
         this.a($$0);
         this.c.print("[F] ");
         this.c.print($$1);
         this.c.print(" size=");
         this.c.println($$2);
      }

      @Override
      public void a(String $$0) {
         this.e();
         this.a(this.d + 1);
         this.c.print("[E] ");
         this.c.print($$0);
      }

      @Override
      public void a(xo $$0) {
         this.e();
         this.b(this.d + 1);
         this.c.print("[M] ");
         this.c.println($$0.getString());
      }

      @Override
      public boolean x_() {
         return true;
      }

      @Override
      public boolean y_() {
         return true;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public boolean o_() {
         return true;
      }

      @Override
      public void close() {
         IOUtils.closeQuietly(this.c);
      }
   }
}
