import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class aql {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xo.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xo.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xo.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xo.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xo.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xo.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b(
                                    "team"
                                 )
                                 .requires(el.a(2)))
                              .then(
                                 ((LiteralArgumentBuilder)el.b("list").executes($$0x -> a((ek)$$0x.getSource())))
                                    .then(el.a("team", fz.a()).executes($$0x -> c((ek)$$0x.getSource(), fz.a($$0x, "team"))))
                              ))
                           .then(
                              el.b("add")
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          el.a("displayName", eu.a($$1))
                                             .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), eu.b($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(el.b("remove").then(el.a("team", fz.a()).executes($$0x -> b((ek)$$0x.getSource(), fz.a($$0x, "team"))))))
                     .then(el.b("empty").then(el.a("team", fz.a()).executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"))))))
                  .then(
                     el.b("join")
                        .then(
                           ((RequiredArgumentBuilder)el.a("team", fz.a())
                                 .executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), Collections.singleton(((ek)$$0x.getSource()).g()))))
                              .then(el.a("members", fs.b()).suggests(fs.a).executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fs.c($$0x, "members"))))
                        )
                  ))
               .then(el.b("leave").then(el.a("members", fs.b()).suggests(fs.a).executes($$0x -> a((ek)$$0x.getSource(), fs.c($$0x, "members"))))))
            .then(
               el.b("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                                   "team", fz.a()
                                                )
                                                .then(
                                                   el.b("displayName")
                                                      .then(
                                                         el.a("displayName", eu.a($$1))
                                                            .executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), eu.b($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                el.b("color")
                                                   .then(
                                                      el.a("value", et.a()).executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), et.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             el.b("friendlyFire")
                                                .then(
                                                   el.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ek)$$0x.getSource(), fz.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          el.b("seeFriendlyInvisibles")
                                             .then(
                                                el.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("nametagVisibility")
                                                   .then(el.b("never").executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.b.b))))
                                                .then(el.b("hideForOtherTeams").executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.b.c))))
                                             .then(el.b("hideForOwnTeam").executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.b.d))))
                                          .then(el.b("always").executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("deathMessageVisibility")
                                                .then(el.b("never").executes($$0x -> b((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.b.b))))
                                             .then(el.b("hideForOtherTeams").executes($$0x -> b((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.b.c))))
                                          .then(el.b("hideForOwnTeam").executes($$0x -> b((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.b.d))))
                                       .then(el.b("always").executes($$0x -> b((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("collisionRule")
                                             .then(el.b("never").executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.a.b))))
                                          .then(el.b("pushOwnTeam").executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.a.d))))
                                       .then(el.b("pushOtherTeams").executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.a.c))))
                                    .then(el.b("always").executes($$0x -> a((ek)$$0x.getSource(), fz.a($$0x, "team"), fjz.a.a)))
                              ))
                           .then(
                              el.b("prefix")
                                 .then(el.a("prefix", eu.a($$1)).executes($$0x -> b((ek)$$0x.getSource(), fz.a($$0x, "team"), eu.b($$0x, "prefix"))))
                           ))
                        .then(
                           el.b("suffix").then(el.a("suffix", eu.a($$1)).executes($$0x -> c((ek)$$0x.getSource(), fz.a($$0x, "team"), eu.b($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xo a(Collection<fjw> $$0) {
      return $$0.iterator().next().ht();
   }

   private static int a(ek $$0, Collection<fjw> $$1) {
      fjx $$2 = $$0.l().aJ();

      for (fjw $$3 : $$1) {
         $$2.d($$3.cM());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xo.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, fjs $$1, Collection<fjw> $$2) {
      fjx $$3 = $$0.l().aJ();

      for (fjw $$4 : $$2) {
         $$3.a($$4.cM(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xo.a("commands.team.join.success.single", a($$2), $$1.e()), true);
      } else {
         $$0.a(() -> xo.a("commands.team.join.success.multiple", $$2.size(), $$1.e()), true);
      }

      return $$2.size();
   }

   private static int a(ek $$0, fjs $$1, fjz.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.team.option.nametagVisibility.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int b(ek $$0, fjs $$1, fjz.b $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xo.a("commands.team.option.deathMessageVisibility.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fjs $$1, fjz.a $$2) throws CommandSyntaxException {
      if ($$1.m() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.team.option.collisionRule.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fjs $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> xo.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
         return 0;
      }
   }

   private static int b(ek $$0, fjs $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fjs $$1, xo $$2) throws CommandSyntaxException {
      if ($$1.d().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.team.option.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fjs $$1, o $$2) throws CommandSyntaxException {
      if ($$1.o() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.team.option.color.success", $$1.e(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fjs $$1) throws CommandSyntaxException {
      fjx $$2 = $$0.l().aJ();
      Collection<String> $$3 = Lists.newArrayList($$1.h());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> xo.a("commands.team.empty.success", $$3.size(), $$1.e()), true);
         return $$3.size();
      }
   }

   private static int b(ek $$0, fjs $$1) {
      fjx $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> xo.a("commands.team.remove.success", $$1.e()), true);
      return $$2.f().size();
   }

   private static int a(ek $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xo.b($$1));
   }

   private static int a(ek $$0, String $$1, xo $$2) throws CommandSyntaxException {
      fjx $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         fjs $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xo.a("commands.team.add.success", $$4.e()), true);
         return $$3.f().size();
      }
   }

   private static int c(ek $$0, fjs $$1) {
      Collection<String> $$2 = $$1.h();
      if ($$2.isEmpty()) {
         $$0.a(() -> xo.a("commands.team.list.members.empty", $$1.e()), false);
      } else {
         $$0.a(() -> xo.a("commands.team.list.members.success", $$1.e(), $$2.size(), xr.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ek $$0) {
      Collection<fjs> $$1 = $$0.l().aJ().f();
      if ($$1.isEmpty()) {
         $$0.a(() -> xo.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xo.a("commands.team.list.teams.success", $$1.size(), xr.b($$1, fjs::e)), false);
      }

      return $$1.size();
   }

   private static int b(ek $$0, fjs $$1, xo $$2) {
      $$1.b($$2);
      $$0.a(() -> xo.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ek $$0, fjs $$1, xo $$2) {
      $$1.c($$2);
      $$0.a(() -> xo.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
