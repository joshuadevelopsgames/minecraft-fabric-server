import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public class aqn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("teleport").requires(el.a(2)))
                  .then(
                     el.a("location", gr.a())
                        .executes(
                           $$0x -> a(
                              (ek)$$0x.getSource(),
                              Collections.singleton(((ek)$$0x.getSource()).g()),
                              ((ek)$$0x.getSource()).e(),
                              gr.b($$0x, "location"),
                              null,
                              null
                           )
                        )
                  ))
               .then(
                  el.a("destination", ey.a())
                     .executes($$0x -> a((ek)$$0x.getSource(), Collections.singleton(((ek)$$0x.getSource()).g()), ey.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ey.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("location", gr.a())
                                 .executes(
                                    $$0x -> a((ek)$$0x.getSource(), ey.b($$0x, "targets"), ((ek)$$0x.getSource()).e(), gr.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 el.a("rotation", go.a())
                                    .executes(
                                       $$0x -> a(
                                          (ek)$$0x.getSource(),
                                          ey.b($$0x, "targets"),
                                          ((ek)$$0x.getSource()).e(),
                                          gr.b($$0x, "location"),
                                          go.a($$0x, "rotation"),
                                          null
                                       )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)el.b("facing")
                                    .then(
                                       el.b("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("facingEntity", ey.a())
                                                   .executes(
                                                      $$0x -> a(
                                                         (ek)$$0x.getSource(),
                                                         ey.b($$0x, "targets"),
                                                         ((ek)$$0x.getSource()).e(),
                                                         gr.b($$0x, "location"),
                                                         null,
                                                         new aoz.a(ey.a($$0x, "facingEntity"), ex.a.a)
                                                      )
                                                   ))
                                                .then(
                                                   el.a("facingAnchor", ex.a())
                                                      .executes(
                                                         $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            ey.b($$0x, "targets"),
                                                            ((ek)$$0x.getSource()).e(),
                                                            gr.b($$0x, "location"),
                                                            null,
                                                            new aoz.a(ey.a($$0x, "facingEntity"), ex.a($$0x, "facingAnchor"))
                                                         )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    el.a("facingLocation", gr.a())
                                       .executes(
                                          $$0x -> a(
                                             (ek)$$0x.getSource(),
                                             ey.b($$0x, "targets"),
                                             ((ek)$$0x.getSource()).e(),
                                             gr.b($$0x, "location"),
                                             null,
                                             new aoz.b(gr.a($$0x, "facingLocation"))
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(el.a("destination", ey.a()).executes($$0x -> a((ek)$$0x.getSource(), ey.b($$0x, "targets"), ey.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("tp").requires(el.a(2))).redirect($$1));
   }

   private static int a(ek $$0, Collection<? extends bzm> $$1, bzm $$2) throws CommandSyntaxException {
      for (bzm $$3 : $$1) {
         a($$0, $$3, (aub)$$2.ai(), $$2.dC(), $$2.dE(), $$2.dI(), EnumSet.noneOf(cba.class), $$2.dP(), $$2.dR(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.teleport.success.entity.single", $$1.iterator().next().Q_(), $$2.Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.Q_()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<? extends bzm> $$1, aub $$2, gm $$3, @Nullable gm $$4, @Nullable aoz $$5) throws CommandSyntaxException {
      fis $$6 = $$3.a($$0);
      fir $$7 = $$4 == null ? null : $$4.b($$0);

      for (bzm $$8 : $$1) {
         Set<cba> $$9 = a($$3, $$4, $$8.ai().aj() == $$2.aj());
         if ($$7 == null) {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$8.dP(), $$8.dR(), $$5);
         } else {
            a($$0, $$8, $$2, $$6.d, $$6.e, $$6.f, $$9, $$7.k, $$7.j, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.teleport.success.location.single", $$1.iterator().next().Q_(), a($$6.d), a($$6.e), a($$6.f)), true);
      } else {
         $$0.a(() -> xo.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.d), a($$6.e), a($$6.f)), true);
      }

      return $$1.size();
   }

   private static Set<cba> a(gm $$0, @Nullable gm $$1, boolean $$2) {
      Set<cba> $$3 = EnumSet.noneOf(cba.class);
      if ($$0.a()) {
         $$3.add(cba.f);
         if ($$2) {
            $$3.add(cba.a);
         }
      }

      if ($$0.b()) {
         $$3.add(cba.g);
         if ($$2) {
            $$3.add(cba.b);
         }
      }

      if ($$0.c()) {
         $$3.add(cba.h);
         if ($$2) {
            $$3.add(cba.c);
         }
      }

      if ($$1 == null || $$1.a()) {
         $$3.add(cba.e);
      }

      if ($$1 == null || $$1.b()) {
         $$3.add(cba.d);
      }

      return $$3;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ek $$0, bzm $$1, aub $$2, double $$3, double $$4, double $$5, Set<cba> $$6, float $$7, float $$8, @Nullable aoz $$9) throws CommandSyntaxException {
      jb $$10 = jb.a($$3, $$4, $$5);
      if (!dmu.l($$10)) {
         throw a.create();
      } else {
         double $$11 = $$6.contains(cba.a) ? $$3 - $$1.dC() : $$3;
         double $$12 = $$6.contains(cba.b) ? $$4 - $$1.dE() : $$4;
         double $$13 = $$6.contains(cba.c) ? $$5 - $$1.dI() : $$5;
         float $$14 = $$6.contains(cba.d) ? $$7 - $$1.dP() : $$7;
         float $$15 = $$6.contains(cba.e) ? $$8 - $$1.dR() : $$8;
         float $$16 = bcb.h($$14);
         float $$17 = bcb.h($$15);
         if ($$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17, true)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof cam $$18 && $$18.fQ())) {
               $$1.i($$1.dA().d(1.0, 0.0, 1.0));
               $$1.e(true);
            }

            if ($$1 instanceof cau $$19) {
               $$19.S().n();
            }
         }
      }
   }
}
