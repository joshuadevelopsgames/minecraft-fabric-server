import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class apl {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b(
                                    "raid"
                                 )
                                 .requires(el.a(3)))
                              .then(
                                 el.b("start")
                                    .then(
                                       el.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(el.b("stop").executes($$0x -> c((ek)$$0x.getSource()))))
                        .then(el.b("check").executes($$0x -> d((ek)$$0x.getSource()))))
                     .then(el.b("sound").then(el.a("type", eu.a($$1)).executes($$0x -> a((ek)$$0x.getSource(), eu.b($$0x, "type"))))))
                  .then(el.b("spawnleader").executes($$0x -> b((ek)$$0x.getSource()))))
               .then(
                  el.b("setomen")
                     .then(
                        el.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(el.b("glow").executes($$0x -> a((ek)$$0x.getSource())))
      );
   }

   private static int a(ek $$0) throws CommandSyntaxException {
      cwj $$1 = a($$0.h());
      if ($$1 != null) {
         for (cwk $$3 : $$1.h()) {
            $$3.a(new byq(bys.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ek $$0, int $$1) throws CommandSyntaxException {
      cwj $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.k();
         if ($$1 > $$3) {
            $$0.b(xo.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.l();
            $$2.a($$1);
            $$0.a(() -> xo.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(xo.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ek $$0) {
      $$0.a(() -> xo.b("Spawned a raid captain"), false);
      cwk $$1 = bzv.aV.a($$0.e(), bzu.n);
      if ($$1 == null) {
         $$0.b(xo.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.x(true);
         $$1.a(bzw.f, cwj.a($$0.u().f(mn.aJ)));
         $$1.a_($$0.d().d, $$0.d().e, $$0.d().f);
         $$1.a($$0.e(), $$0.e().d_(jb.a((jv)$$0.d())), bzu.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ek $$0, @Nullable xo $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         aub $$2 = $$0.e();
         fis $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.d, $$3.e, $$3.f, ayz.wp, aza.g, 2.0F, 1.0F, $$2.A.g());
      }

      return 1;
   }

   private static int b(ek $$0, int $$1) throws CommandSyntaxException {
      auc $$2 = $$0.h();
      jb $$3 = $$2.dx();
      if ($$2.y().e($$3)) {
         $$0.b(xo.b("Raid already started close by"));
         return -1;
      } else {
         cwl $$4 = $$2.y().C();
         cwj $$5 = $$4.a($$2, $$2.dx());
         if ($$5 != null) {
            $$5.a($$1);
            $$4.e();
            $$0.a(() -> xo.b("Created a raid in your local village"), false);
         } else {
            $$0.b(xo.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(ek $$0) throws CommandSyntaxException {
      auc $$1 = $$0.h();
      jb $$2 = $$1.dx();
      cwj $$3 = $$1.y().d($$2);
      if ($$3 != null) {
         $$3.m();
         $$0.a(() -> xo.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(xo.b("No raid here"));
         return -1;
      }
   }

   private static int d(ek $$0) throws CommandSyntaxException {
      cwj $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> xo.b($$2.toString()), false);
         StringBuilder $$3 = new StringBuilder();
         $$3.append("Num groups spawned: ");
         $$3.append($$1.j());
         $$3.append(" Raid omen level: ");
         $$3.append($$1.l());
         $$3.append(" Num mobs: ");
         $$3.append($$1.p());
         $$3.append(" Raid health: ");
         $$3.append($$1.o());
         $$3.append(" / ");
         $$3.append($$1.g());
         $$0.a(() -> xo.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(xo.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cwj a(auc $$0) {
      return $$0.y().d($$0.dx());
   }
}
