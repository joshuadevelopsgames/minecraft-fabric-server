import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class aom {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("forceload").requires(el.a(2)))
                  .then(
                     el.b("add")
                        .then(
                           ((RequiredArgumentBuilder)el.a("from", gl.a())
                                 .executes($$0x -> a((ek)$$0x.getSource(), gl.a($$0x, "from"), gl.a($$0x, "from"), true)))
                              .then(el.a("to", gl.a()).executes($$0x -> a((ek)$$0x.getSource(), gl.a($$0x, "from"), gl.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)el.b("remove")
                        .then(
                           ((RequiredArgumentBuilder)el.a("from", gl.a())
                                 .executes($$0x -> a((ek)$$0x.getSource(), gl.a($$0x, "from"), gl.a($$0x, "from"), false)))
                              .then(el.a("to", gl.a()).executes($$0x -> a((ek)$$0x.getSource(), gl.a($$0x, "from"), gl.a($$0x, "to"), false)))
                        ))
                     .then(el.b("all").executes($$0x -> b((ek)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)el.b("query").executes($$0x -> a((ek)$$0x.getSource())))
                  .then(el.a("pos", gl.a()).executes($$0x -> a((ek)$$0x.getSource(), gl.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ek $$0, atm $$1) throws CommandSyntaxException {
      dlz $$2 = $$1.a();
      aub $$3 = $$0.e();
      amd<dmu> $$4 = $$3.aj();
      boolean $$5 = $$3.z().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xo.a("commands.forceload.query.success", xo.a($$2), xo.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ek $$0) {
      aub $$1 = $$0.e();
      amd<dmu> $$2 = $$1.aj();
      LongSet $$3 = $$1.z();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(dlz::new).map(dlz::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xo.a("commands.forceload.list.single", xo.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xo.a("commands.forceload.list.multiple", $$4, xo.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xo.a("commands.forceload.added.none", xo.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ek $$0) {
      aub $$1 = $$0.e();
      amd<dmu> $$2 = $$1.aj();
      LongSet $$3 = $$1.z();
      $$3.forEach($$1x -> $$1.a(dlz.a($$1x), dlz.b($$1x), false));
      $$0.a(() -> xo.a("commands.forceload.removed.all", xo.a($$2.a())), true);
      return 0;
   }

   private static int a(ek $$0, atm $$1, atm $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = ke.a($$4);
         int $$9 = ke.a($$5);
         int $$10 = ke.a($$6);
         int $$11 = ke.a($$7);
         long $$12 = ($$10 - $$8 + 1L) * ($$11 - $$9 + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aub $$13 = $$0.e();
            amd<dmu> $$14 = $$13.aj();
            dlz $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new dlz($$17, $$18);
                     }
                  }
               }
            }

            dlz $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> xo.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xo.a($$20), xo.a($$14.a())), true);
               } else {
                  dlz $$22 = new dlz($$8, $$9);
                  dlz $$23 = new dlz($$10, $$11);
                  $$0.a(() -> xo.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, xo.a($$14.a()), xo.a($$22), xo.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gk.b.create();
      }
   }
}
