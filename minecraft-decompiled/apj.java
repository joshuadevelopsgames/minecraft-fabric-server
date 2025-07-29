import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class apj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      RequiredArgumentBuilder<ek, ame> $$1 = (RequiredArgumentBuilder<ek, ame>)el.a("sound", fn.a())
         .suggests(ip.a(ip.b))
         .executes($$0x -> a((ek)$$0x.getSource(), a(((ek)$$0x.getSource()).i()), fn.a($$0x, "sound"), aza.a, ((ek)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (aza $$2 : aza.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("playsound").requires(el.a(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ek> a(aza $$0) {
      return (LiteralArgumentBuilder<ek>)((LiteralArgumentBuilder)el.b($$0.a())
            .executes($$1 -> a((ek)$$1.getSource(), a(((ek)$$1.getSource()).i()), fn.a($$1, "sound"), $$0, ((ek)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)el.a("targets", ey.d())
                  .executes($$1 -> a((ek)$$1.getSource(), ey.f($$1, "targets"), fn.a($$1, "sound"), $$0, ((ek)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)el.a("pos", gr.a())
                        .executes($$1 -> a((ek)$$1.getSource(), ey.f($$1, "targets"), fn.a($$1, "sound"), $$0, gr.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)el.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                    (ek)$$1.getSource(),
                                    ey.f($$1, "targets"),
                                    fn.a($$1, "sound"),
                                    $$0,
                                    gr.a($$1, "pos"),
                                    (Float)$$1.getArgument("volume", Float.class),
                                    1.0F,
                                    0.0F
                                 )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)el.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                          (ek)$$1.getSource(),
                                          ey.f($$1, "targets"),
                                          fn.a($$1, "sound"),
                                          $$0,
                                          gr.a($$1, "pos"),
                                          (Float)$$1.getArgument("volume", Float.class),
                                          (Float)$$1.getArgument("pitch", Float.class),
                                          0.0F
                                       )
                                    ))
                                 .then(
                                    el.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                             (ek)$$1.getSource(),
                                             ey.f($$1, "targets"),
                                             fn.a($$1, "sound"),
                                             $$0,
                                             gr.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             (Float)$$1.getArgument("minVolume", Float.class)
                                          )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   private static Collection<auc> a(@Nullable auc $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ek $$0, Collection<auc> $$1, ame $$2, aza $$3, fis $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jl<ayy> $$8 = jl.a(ayy.a($$2));
      double $$9 = bcb.l($$8.a().a($$5));
      aub $$10 = $$0.e();
      long $$11 = $$10.H_().g();
      List<auc> $$12 = new ArrayList<>();

      for (auc $$13 : $$1) {
         if ($$13.y() == $$10) {
            double $$14 = $$4.d - $$13.dC();
            double $$15 = $$4.e - $$13.dE();
            double $$16 = $$4.f - $$13.dI();
            double $$17 = $$14 * $$14 + $$15 * $$15 + $$16 * $$16;
            fis $$18 = $$4;
            float $$19 = $$5;
            if ($$17 > $$9) {
               if ($$7 <= 0.0F) {
                  continue;
               }

               double $$20 = Math.sqrt($$17);
               $$18 = new fis($$13.dC() + $$14 / $$20 * 2.0, $$13.dE() + $$15 / $$20 * 2.0, $$13.dI() + $$16 / $$20 * 2.0);
               $$19 = $$7;
            }

            $$13.g.b(new agr($$8, $$3, $$18.a(), $$18.b(), $$18.c(), $$19, $$6, $$11));
            $$12.add($$13);
         }
      }

      int $$21 = $$12.size();
      if ($$21 == 0) {
         throw a.create();
      } else {
         if ($$21 == 1) {
            $$0.a(() -> xo.a("commands.playsound.success.single", xo.a($$2), $$12.getFirst().Q_()), true);
         } else {
            $$0.a(() -> xo.a("commands.playsound.success.multiple", xo.a($$2), $$21), true);
         }

         return $$21;
      }
   }
}
