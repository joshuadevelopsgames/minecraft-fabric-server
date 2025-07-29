import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aqr {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("title").requires(el.a(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                    "targets", ey.d()
                                 )
                                 .then(el.b("clear").executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets")))))
                              .then(el.b("reset").executes($$0x -> b((ek)$$0x.getSource(), ey.f($$0x, "targets")))))
                           .then(
                              el.b("title")
                                 .then(
                                    el.a("title", eu.a($$1))
                                       .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), eu.a($$0x, "title"), "title", ago::new))
                                 )
                           ))
                        .then(
                           el.b("subtitle")
                              .then(
                                 el.a("title", eu.a($$1))
                                    .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), eu.a($$0x, "title"), "subtitle", agm::new))
                              )
                        ))
                     .then(
                        el.b("actionbar")
                           .then(
                              el.a("title", eu.a($$1))
                                 .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), eu.a($$0x, "title"), "actionbar", afn::new))
                           )
                     ))
                  .then(
                     el.b("times")
                        .then(
                           el.a("fadeIn", gc.a())
                              .then(
                                 el.a("stay", gc.a())
                                    .then(
                                       el.a("fadeOut", gc.a())
                                          .executes(
                                             $$0x -> a(
                                                (ek)$$0x.getSource(),
                                                ey.f($$0x, "targets"),
                                                IntegerArgumentType.getInteger($$0x, "fadeIn"),
                                                IntegerArgumentType.getInteger($$0x, "stay"),
                                                IntegerArgumentType.getInteger($$0x, "fadeOut")
                                             )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<auc> $$1) {
      adg $$2 = new adg(false);

      for (auc $$3 : $$1) {
         $$3.g.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.title.cleared.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ek $$0, Collection<auc> $$1) {
      adg $$2 = new adg(true);

      for (auc $$3 : $$1) {
         $$3.g.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.title.reset.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<auc> $$1, xo $$2, String $$3, Function<xo, zw<?>> $$4) throws CommandSyntaxException {
      for (auc $$5 : $$1) {
         $$5.g.b($$4.apply(xr.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<auc> $$1, int $$2, int $$3, int $$4) {
      agp $$5 = new agp($$2, $$3, $$4);

      for (auc $$6 : $$1) {
         $$6.g.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.title.times.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
