import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class fd implements fu<fd.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("argument.message.too_long", $$0, $$1));

   public static fd a() {
      return new fd();
   }

   public static xo a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      fd.a $$2 = (fd.a)$$0.getArgument($$1, fd.a.class);
      return $$2.a((ek)$$0.getSource());
   }

   public static void a(CommandContext<ek> $$0, String $$1, Consumer<ye> $$2) throws CommandSyntaxException {
      fd.a $$3 = (fd.a)$$0.getArgument($$1, fd.a.class);
      ek $$4 = (ek)$$0.getSource();
      xo $$5 = $$3.a($$4);
      ei $$6 = $$4.n();
      ye $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, ye.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<ye> $$0, ek $$1, ye $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<auu> $$4 = a($$1, $$2);
      xo $$5 = $$3.bk().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         ye $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<ye> $$0, ek $$1, ye $$2) {
      xj $$3 = $$1.l().bk();
      xo $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<auu> a(ek $$0, ye $$1) {
      auc $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cK()) ? $$2.W().a($$1.c()) : CompletableFuture.completedFuture(auu.a($$1.c()));
   }

   public fd.a a(StringReader $$0) throws CommandSyntaxException {
      return fd.a.a($$0, true);
   }

   public <S> fd.a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
      return fd.a.a($$0, he.a($$1));
   }

   public Collection<String> getExamples() {
      return a;
   }

   public record a(String a, fd.b[] b) {

      xo a(ek $$0) throws CommandSyntaxException {
         return this.a($$0, he.a($$0));
      }

      public xo a(ek $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            yc $$2 = xo.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fd.b $$4 : this.b) {
               xo $$5 = $$4.a($$0);
               if ($$3 < $$4.a()) {
                  $$2.f(this.a.substring($$3, $$4.a()));
               }

               $$2.b($$5);
               $$3 = $$4.b();
            }

            if ($$3 < this.a.length()) {
               $$2.f(this.a.substring($$3));
            }

            return $$2;
         } else {
            return xo.b(this.a);
         }
      }

      public static fd.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fd.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fd.a($$2, new fd.b[0]);
            } else {
               List<fd.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  hd $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fd.a($$2, $$3.toArray(new fd.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           he $$6 = new he($$0, true);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != he.h && var8.getType() != he.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fd.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public record b(int a, int b, hd c) {
      public xo a(ek $$0) throws CommandSyntaxException {
         return hd.a(this.c.b($$0));
      }
   }
}
