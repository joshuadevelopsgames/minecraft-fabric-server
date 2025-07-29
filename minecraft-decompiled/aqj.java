import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aqj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("summon").requires(el.a(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("entity", fl.a($$1, mn.D))
                     .suggests(ip.a(ip.c))
                     .executes($$0x -> b((ek)$$0x.getSource(), fl.e($$0x, "entity"), ((ek)$$0x.getSource()).d(), new ui(), true)))
                  .then(
                     ((RequiredArgumentBuilder)el.a("pos", gr.a())
                           .executes($$0x -> b((ek)$$0x.getSource(), fl.e($$0x, "entity"), gr.a($$0x, "pos"), new ui(), true)))
                        .then(el.a("nbt", ev.a()).executes($$0x -> b((ek)$$0x.getSource(), fl.e($$0x, "entity"), gr.a($$0x, "pos"), ev.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bzm a(ek $$0, jl.c<bzv<?>> $$1, fis $$2, ui $$3, boolean $$4) throws CommandSyntaxException {
      jb $$5 = jb.a((jv)$$2);
      if (!dmu.l($$5)) {
         throw c.create();
      } else {
         ui $$6 = $$3.l();
         $$6.a("id", $$1.h().a().toString());
         aub $$7 = $$0.e();
         bzm $$8 = bzv.a($$6, $$7, bzu.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dP(), $$1x.dR());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof cao) {
               ((cao)$$8).a($$0.e(), $$0.e().d_($$8.dx()), bzu.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ek $$0, jl.c<bzv<?>> $$1, fis $$2, ui $$3, boolean $$4) throws CommandSyntaxException {
      bzm $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xo.a("commands.summon.success", $$5.Q_()), true);
      return 1;
   }
}
